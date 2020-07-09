// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.redacted_test.RedactedCycleB in redacted_test.proto
package com.squareup.wire.protos.kotlin.redacted

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
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

class RedactedCycleB(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.protos.kotlin.redacted.RedactedCycleA#ADAPTER"
  )
  val a: RedactedCycleA? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<RedactedCycleB, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Nothing = throw AssertionError()

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is RedactedCycleB) return false
    if (unknownFields != other.unknownFields) return false
    if (a != other.a) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + a.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (a != null) result += """a=$a"""
    return result.joinToString(prefix = "RedactedCycleB{", separator = ", ", postfix = "}")
  }

  fun copy(a: RedactedCycleA? = this.a, unknownFields: ByteString = this.unknownFields):
      RedactedCycleB = RedactedCycleB(a, unknownFields)

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<RedactedCycleB> = object : ProtoAdapter<RedactedCycleB>(
      FieldEncoding.LENGTH_DELIMITED, 
      RedactedCycleB::class, 
      "type.googleapis.com/squareup.protos.kotlin.redacted_test.RedactedCycleB", 
      PROTO_2
    ) {
      override fun encodedSize(value: RedactedCycleB): Int {
        var size = value.unknownFields.size
        size += RedactedCycleA.ADAPTER.encodedSizeWithTag(1, value.a)
        return size
      }

      override fun encode(writer: ProtoWriter, value: RedactedCycleB) {
        RedactedCycleA.ADAPTER.encodeWithTag(writer, 1, value.a)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): RedactedCycleB {
        var a: RedactedCycleA? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> a = RedactedCycleA.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return RedactedCycleB(
          a = a,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: RedactedCycleB): RedactedCycleB = value.copy(
        a = value.a?.let(RedactedCycleA.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }
  }
}
