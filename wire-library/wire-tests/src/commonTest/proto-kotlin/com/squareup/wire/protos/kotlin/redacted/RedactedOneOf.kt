// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.redacted_test.RedactedOneOf in redacted_one_of.proto
package com.squareup.wire.protos.kotlin.redacted

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.internal.countNonNull
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Nothing
import kotlin.String
import kotlin.hashCode
import kotlin.jvm.JvmField
import okio.ByteString

class RedactedOneOf(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  val b: Int? = null,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    redacted = true
  )
  val c: String? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<RedactedOneOf, Nothing>(ADAPTER, unknownFields) {
  init {
    require(countNonNull(b, c) <= 1) {
      "At most one of b, c may be non-null"
    }
  }

  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Nothing = throw AssertionError()

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is RedactedOneOf) return false
    if (unknownFields != other.unknownFields) return false
    if (b != other.b) return false
    if (c != other.c) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + b.hashCode()
      result = result * 37 + c.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (b != null) result += """b=$b"""
    if (c != null) result += """c=██"""
    return result.joinToString(prefix = "RedactedOneOf{", separator = ", ", postfix = "}")
  }

  fun copy(
    b: Int? = this.b,
    c: String? = this.c,
    unknownFields: ByteString = this.unknownFields
  ): RedactedOneOf = RedactedOneOf(b, c, unknownFields)

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<RedactedOneOf> = object : ProtoAdapter<RedactedOneOf>(
      FieldEncoding.LENGTH_DELIMITED, 
      RedactedOneOf::class, 
      "type.googleapis.com/squareup.protos.kotlin.redacted_test.RedactedOneOf", 
      PROTO_2
    ) {
      override fun encodedSize(value: RedactedOneOf): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.INT32.encodedSizeWithTag(1, value.b)
        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.c)
        return size
      }

      override fun encode(writer: ProtoWriter, value: RedactedOneOf) {
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.b)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.c)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): RedactedOneOf {
        var b: Int? = null
        var c: String? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> b = ProtoAdapter.INT32.decode(reader)
            2 -> c = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return RedactedOneOf(
          b = b,
          c = c,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: RedactedOneOf): RedactedOneOf = value.copy(
        c = null,
        unknownFields = ByteString.EMPTY
      )
    }
  }
}
