// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.redacted_test.Redacted in redacted_test.proto
package com.squareup.wire.protos.redacted;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class Redacted extends Message<Redacted, Redacted.Builder> {
  public static final ProtoAdapter<Redacted> ADAPTER = new ProtoAdapter_Redacted();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_A = "";

  public static final String DEFAULT_B = "";

  public static final String DEFAULT_C = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      redacted = true
  )
  public final String a;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String b;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String c;

  /**
   * Extension source: redacted_test.proto
   */
  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.protos.redacted.RedactedExtension#ADAPTER"
  )
  public final RedactedExtension extension;

  public Redacted(String a, String b, String c, RedactedExtension extension) {
    this(a, b, c, extension, ByteString.EMPTY);
  }

  public Redacted(String a, String b, String c, RedactedExtension extension,
      ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.a = a;
    this.b = b;
    this.c = c;
    this.extension = extension;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.a = a;
    builder.b = b;
    builder.c = c;
    builder.extension = extension;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Redacted)) return false;
    Redacted o = (Redacted) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(a, o.a)
        && Internal.equals(b, o.b)
        && Internal.equals(c, o.c)
        && Internal.equals(extension, o.extension);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (a != null ? a.hashCode() : 0);
      result = result * 37 + (b != null ? b.hashCode() : 0);
      result = result * 37 + (c != null ? c.hashCode() : 0);
      result = result * 37 + (extension != null ? extension.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (a != null) builder.append(", a=██");
    if (b != null) builder.append(", b=").append(Internal.sanitize(b));
    if (c != null) builder.append(", c=").append(Internal.sanitize(c));
    if (extension != null) builder.append(", extension=").append(extension);
    return builder.replace(0, 2, "Redacted{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Redacted, Builder> {
    public String a;

    public String b;

    public String c;

    public RedactedExtension extension;

    public Builder() {
    }

    public Builder a(String a) {
      this.a = a;
      return this;
    }

    public Builder b(String b) {
      this.b = b;
      return this;
    }

    public Builder c(String c) {
      this.c = c;
      return this;
    }

    public Builder extension(RedactedExtension extension) {
      this.extension = extension;
      return this;
    }

    @Override
    public Redacted build() {
      return new Redacted(a, b, c, extension, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_Redacted extends ProtoAdapter<Redacted> {
    public ProtoAdapter_Redacted() {
      super(FieldEncoding.LENGTH_DELIMITED, Redacted.class, "type.googleapis.com/squareup.protos.redacted_test.Redacted", Syntax.PROTO_2);
    }

    @Override
    public int encodedSize(Redacted value) {
      return ProtoAdapter.STRING.encodedSizeWithTag(1, value.a)
          + ProtoAdapter.STRING.encodedSizeWithTag(2, value.b)
          + ProtoAdapter.STRING.encodedSizeWithTag(3, value.c)
          + RedactedExtension.ADAPTER.encodedSizeWithTag(10, value.extension)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Redacted value) throws IOException {
      ProtoAdapter.STRING.encodeWithTag(writer, 1, value.a);
      ProtoAdapter.STRING.encodeWithTag(writer, 2, value.b);
      ProtoAdapter.STRING.encodeWithTag(writer, 3, value.c);
      RedactedExtension.ADAPTER.encodeWithTag(writer, 10, value.extension);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Redacted decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.a(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.b(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.c(ProtoAdapter.STRING.decode(reader)); break;
          case 10: builder.extension(RedactedExtension.ADAPTER.decode(reader)); break;
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public Redacted redact(Redacted value) {
      Builder builder = value.newBuilder();
      builder.a = null;
      if (builder.extension != null) builder.extension = RedactedExtension.ADAPTER.redact(builder.extension);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
