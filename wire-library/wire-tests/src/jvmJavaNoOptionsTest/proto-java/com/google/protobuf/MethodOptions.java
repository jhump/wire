// Code generated by Wire protocol buffer compiler, do not edit.
// Source: google.protobuf.MethodOptions in google/protobuf/descriptor.proto
package com.google.protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class MethodOptions extends Message<MethodOptions, MethodOptions.Builder> {
  public static final ProtoAdapter<MethodOptions> ADAPTER = new ProtoAdapter_MethodOptions();

  private static final long serialVersionUID = 0L;

  public static final Boolean DEFAULT_DEPRECATED = false;

  /**
   * Note:  Field numbers 1 through 32 are reserved for Google's internal RPC
   *   framework.  We apologize for hoarding these numbers to ourselves, but
   *   we were already using them long before we decided to release Protocol
   *   Buffers.
   * Is this method deprecated?
   * Depending on the target platform, this can emit Deprecated annotations
   * for the method, or it will be completely ignored; in the very least,
   * this is a formalization for deprecating methods.
   */
  @WireField(
      tag = 33,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean deprecated;

  public MethodOptions(Boolean deprecated) {
    this(deprecated, ByteString.EMPTY);
  }

  public MethodOptions(Boolean deprecated, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.deprecated = deprecated;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.deprecated = deprecated;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof MethodOptions)) return false;
    MethodOptions o = (MethodOptions) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(deprecated, o.deprecated);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (deprecated != null ? deprecated.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (deprecated != null) builder.append(", deprecated=").append(deprecated);
    return builder.replace(0, 2, "MethodOptions{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<MethodOptions, Builder> {
    public Boolean deprecated;

    public Builder() {
    }

    /**
     * Note:  Field numbers 1 through 32 are reserved for Google's internal RPC
     *   framework.  We apologize for hoarding these numbers to ourselves, but
     *   we were already using them long before we decided to release Protocol
     *   Buffers.
     * Is this method deprecated?
     * Depending on the target platform, this can emit Deprecated annotations
     * for the method, or it will be completely ignored; in the very least,
     * this is a formalization for deprecating methods.
     */
    public Builder deprecated(Boolean deprecated) {
      this.deprecated = deprecated;
      return this;
    }

    @Override
    public MethodOptions build() {
      return new MethodOptions(deprecated, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_MethodOptions extends ProtoAdapter<MethodOptions> {
    public ProtoAdapter_MethodOptions() {
      super(FieldEncoding.LENGTH_DELIMITED, MethodOptions.class, "type.googleapis.com/google.protobuf.MethodOptions", Syntax.PROTO_2);
    }

    @Override
    public int encodedSize(MethodOptions value) {
      return ProtoAdapter.BOOL.encodedSizeWithTag(33, value.deprecated)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, MethodOptions value) throws IOException {
      ProtoAdapter.BOOL.encodeWithTag(writer, 33, value.deprecated);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public MethodOptions decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 33: builder.deprecated(ProtoAdapter.BOOL.decode(reader)); break;
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public MethodOptions redact(MethodOptions value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
