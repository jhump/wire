FROM golang as builder
ENV GOOS=linux GOARCH=amd64 CGO_ENABLED=0
RUN bash -c 'find /go/bin/${GOOS}_${GOARCH}/ -mindepth 1 -maxdepth 1 -exec mv {} /go/bin \;'

FROM openjdk:8-jre-slim
COPY wire-protoc/build/libs/protoc-swift-4.5.0-SNAPSHOT-standalone.jar /protoc-swift.jar
COPY wire-protoc/protoc-gen-wire-swift /

ENTRYPOINT ["/protoc-gen-wire-swift"]
