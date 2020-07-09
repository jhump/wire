// Code generated by Wire protocol buffer compiler, do not edit.
// Source: google.protobuf.FileOptions in google/protobuf/descriptor.proto
package com.google.protobuf

import com.squareup.wire.EnumAdapter
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireEnum
import com.squareup.wire.WireField
import com.squareup.wire.internal.checkElementsNotNull
import com.squareup.wire.internal.redactElements
import com.squareup.wire.internal.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.hashCode
import kotlin.jvm.JvmField
import kotlin.jvm.JvmStatic
import okio.ByteString

/**
 * ===================================================================
 * Options
 * Each of the definitions above may have "options" attached.  These are
 * just annotations which may cause code to be generated slightly differently
 * or may contain hints for code that manipulates protocol messages.
 *
 * Clients may define custom options as extensions of the *Options messages.
 * These extensions may not yet be known at parsing time, so the parser cannot
 * store the values in them.  Instead it stores them in a field in the *Options
 * message called uninterpreted_option. This field must have the same name
 * across all *Options messages. We then use this field to populate the
 * extensions when we build a descriptor, at which point all protos have been
 * parsed and so all extensions are known.
 *
 * Extension numbers for custom options may be chosen as follows:
 * * For options which will only be used within a single application or
 *   organization, or for experimental options, use field numbers 50000
 *   through 99999.  It is up to you to ensure that you do not use the
 *   same number for multiple options.
 * * For options which will be published and used publicly by multiple
 *   independent entities, e-mail protobuf-global-extension-registry@google.com
 *   to reserve extension numbers. Simply provide your project name (e.g.
 *   Objective-C plugin) and your project website (if available) -- there's no
 *   need to explain how you intend to use them. Usually you only need one
 *   extension number. You can declare multiple options with only one extension
 *   number by putting them in a sub-message. See the Custom Options section of
 *   the docs for examples:
 *   https://developers.google.com/protocol-buffers/docs/proto#options
 *   If this turns out to be popular, a web service will be set up
 *   to automatically assign option numbers.
 */
class FileOptions(
  /**
   * Sets the Java package where classes generated from this .proto will be
   * placed.  By default, the proto package is used, but this is often
   * inappropriate because proto packages do not normally start with backwards
   * domain names.
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val java_package: String? = null,
  /**
   * If set, all the classes from the .proto file are wrapped in a single
   * outer class with the given name.  This applies to both Proto1
   * (equivalent to the old "--one_java_file" option) and Proto2 (where
   * a .proto always translates to a single class, but you may want to
   * explicitly choose the class name).
   */
  @field:WireField(
    tag = 8,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val java_outer_classname: String? = null,
  /**
   * If set true, then the Java code generator will generate a separate .java
   * file for each top-level message, enum, and service defined in the .proto
   * file.  Thus, these types will *not* be nested inside the outer class
   * named by java_outer_classname.  However, the outer class will still be
   * generated to contain the file's getDescriptor() method as well as any
   * top-level extensions defined in the file.
   */
  @field:WireField(
    tag = 10,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val java_multiple_files: Boolean? = null,
  /**
   * This option does nothing.
   */
  @Deprecated(message = "java_generate_equals_and_hash is deprecated")
  @field:WireField(
    tag = 20,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val java_generate_equals_and_hash: Boolean? = null,
  /**
   * If set true, then the Java2 code generator will generate code that
   * throws an exception whenever an attempt is made to assign a non-UTF-8
   * byte sequence to a string field.
   * Message reflection will do the same.
   * However, an extension field still accepts non-UTF-8 byte sequences.
   * This option has no effect on when used with the lite runtime.
   */
  @field:WireField(
    tag = 27,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val java_string_check_utf8: Boolean? = null,
  @field:WireField(
    tag = 9,
    adapter = "com.google.protobuf.FileOptions${'$'}OptimizeMode#ADAPTER"
  )
  @JvmField
  val optimize_for: OptimizeMode? = null,
  /**
   * Sets the Go package where structs generated from this .proto will be
   * placed. If omitted, the Go package will be derived from the following:
   *   - The basename of the package import path, if provided.
   *   - Otherwise, the package statement in the .proto file, if present.
   *   - Otherwise, the basename of the .proto file, without extension.
   */
  @field:WireField(
    tag = 11,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val go_package: String? = null,
  /**
   * Should generic services be generated in each language?  "Generic" services
   * are not specific to any particular RPC system.  They are generated by the
   * main code generators in each language (without additional plugins).
   * Generic services were the only kind of service generation supported by
   * early versions of google.protobuf.
   *
   * Generic services are now considered deprecated in favor of using plugins
   * that generate code specific to your particular RPC system.  Therefore,
   * these default to false.  Old code which depends on generic services should
   * explicitly set them to true.
   */
  @field:WireField(
    tag = 16,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val cc_generic_services: Boolean? = null,
  @field:WireField(
    tag = 17,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val java_generic_services: Boolean? = null,
  @field:WireField(
    tag = 18,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val py_generic_services: Boolean? = null,
  @field:WireField(
    tag = 42,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val php_generic_services: Boolean? = null,
  /**
   * Is this file deprecated?
   * Depending on the target platform, this can emit Deprecated annotations
   * for everything in the file, or it will be completely ignored; in the very
   * least, this is a formalization for deprecating files.
   */
  @field:WireField(
    tag = 23,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val deprecated: Boolean? = null,
  /**
   * Enables the use of arenas for the proto messages in this file. This applies
   * only to generated classes for C++.
   */
  @field:WireField(
    tag = 31,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val cc_enable_arenas: Boolean? = null,
  /**
   * Sets the objective c class prefix which is prepended to all objective c
   * generated classes from this .proto. There is no default.
   */
  @field:WireField(
    tag = 36,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val objc_class_prefix: String? = null,
  /**
   * Namespace for generated classes; defaults to the package.
   */
  @field:WireField(
    tag = 37,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val csharp_namespace: String? = null,
  /**
   * By default Swift generators will take the proto package and CamelCase it
   * replacing '.' with underscore and use that to prefix the types/symbols
   * defined. When this options is provided, they will use this value instead
   * to prefix the types/symbols defined.
   */
  @field:WireField(
    tag = 39,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val swift_prefix: String? = null,
  /**
   * Sets the php class prefix which is prepended to all php generated classes
   * from this .proto. Default is empty.
   */
  @field:WireField(
    tag = 40,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val php_class_prefix: String? = null,
  /**
   * Use this option to change the namespace of php generated classes. Default
   * is empty. When this option is empty, the package name will be used for
   * determining the namespace.
   */
  @field:WireField(
    tag = 41,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val php_namespace: String? = null,
  /**
   * Use this option to change the namespace of php generated metadata classes.
   * Default is empty. When this option is empty, the proto file name will be
   * used for determining the namespace.
   */
  @field:WireField(
    tag = 44,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val php_metadata_namespace: String? = null,
  /**
   * Use this option to change the package of ruby generated classes. Default
   * is empty. When this option is not set, the package name will be used for
   * determining the ruby package.
   */
  @field:WireField(
    tag = 45,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val ruby_package: String? = null,
  /**
   * The parser stores options it doesn't recognize here.
   * See the documentation for the "Options" section above.
   */
  @field:WireField(
    tag = 999,
    adapter = "com.google.protobuf.UninterpretedOption#ADAPTER",
    label = WireField.Label.REPEATED
  )
  @JvmField
  val uninterpreted_option: List<UninterpretedOption> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY
) : Message<FileOptions, FileOptions.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.java_package = java_package
    builder.java_outer_classname = java_outer_classname
    builder.java_multiple_files = java_multiple_files
    builder.java_generate_equals_and_hash = java_generate_equals_and_hash
    builder.java_string_check_utf8 = java_string_check_utf8
    builder.optimize_for = optimize_for
    builder.go_package = go_package
    builder.cc_generic_services = cc_generic_services
    builder.java_generic_services = java_generic_services
    builder.py_generic_services = py_generic_services
    builder.php_generic_services = php_generic_services
    builder.deprecated = deprecated
    builder.cc_enable_arenas = cc_enable_arenas
    builder.objc_class_prefix = objc_class_prefix
    builder.csharp_namespace = csharp_namespace
    builder.swift_prefix = swift_prefix
    builder.php_class_prefix = php_class_prefix
    builder.php_namespace = php_namespace
    builder.php_metadata_namespace = php_metadata_namespace
    builder.ruby_package = ruby_package
    builder.uninterpreted_option = uninterpreted_option
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is FileOptions) return false
    if (unknownFields != other.unknownFields) return false
    if (java_package != other.java_package) return false
    if (java_outer_classname != other.java_outer_classname) return false
    if (java_multiple_files != other.java_multiple_files) return false
    if (java_generate_equals_and_hash != other.java_generate_equals_and_hash) return false
    if (java_string_check_utf8 != other.java_string_check_utf8) return false
    if (optimize_for != other.optimize_for) return false
    if (go_package != other.go_package) return false
    if (cc_generic_services != other.cc_generic_services) return false
    if (java_generic_services != other.java_generic_services) return false
    if (py_generic_services != other.py_generic_services) return false
    if (php_generic_services != other.php_generic_services) return false
    if (deprecated != other.deprecated) return false
    if (cc_enable_arenas != other.cc_enable_arenas) return false
    if (objc_class_prefix != other.objc_class_prefix) return false
    if (csharp_namespace != other.csharp_namespace) return false
    if (swift_prefix != other.swift_prefix) return false
    if (php_class_prefix != other.php_class_prefix) return false
    if (php_namespace != other.php_namespace) return false
    if (php_metadata_namespace != other.php_metadata_namespace) return false
    if (ruby_package != other.ruby_package) return false
    if (uninterpreted_option != other.uninterpreted_option) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + java_package.hashCode()
      result = result * 37 + java_outer_classname.hashCode()
      result = result * 37 + java_multiple_files.hashCode()
      result = result * 37 + java_generate_equals_and_hash.hashCode()
      result = result * 37 + java_string_check_utf8.hashCode()
      result = result * 37 + optimize_for.hashCode()
      result = result * 37 + go_package.hashCode()
      result = result * 37 + cc_generic_services.hashCode()
      result = result * 37 + java_generic_services.hashCode()
      result = result * 37 + py_generic_services.hashCode()
      result = result * 37 + php_generic_services.hashCode()
      result = result * 37 + deprecated.hashCode()
      result = result * 37 + cc_enable_arenas.hashCode()
      result = result * 37 + objc_class_prefix.hashCode()
      result = result * 37 + csharp_namespace.hashCode()
      result = result * 37 + swift_prefix.hashCode()
      result = result * 37 + php_class_prefix.hashCode()
      result = result * 37 + php_namespace.hashCode()
      result = result * 37 + php_metadata_namespace.hashCode()
      result = result * 37 + ruby_package.hashCode()
      result = result * 37 + uninterpreted_option.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (java_package != null) result += """java_package=${sanitize(java_package)}"""
    if (java_outer_classname != null) result +=
        """java_outer_classname=${sanitize(java_outer_classname)}"""
    if (java_multiple_files != null) result += """java_multiple_files=$java_multiple_files"""
    if (java_generate_equals_and_hash != null) result +=
        """java_generate_equals_and_hash=$java_generate_equals_and_hash"""
    if (java_string_check_utf8 != null) result +=
        """java_string_check_utf8=$java_string_check_utf8"""
    if (optimize_for != null) result += """optimize_for=$optimize_for"""
    if (go_package != null) result += """go_package=${sanitize(go_package)}"""
    if (cc_generic_services != null) result += """cc_generic_services=$cc_generic_services"""
    if (java_generic_services != null) result += """java_generic_services=$java_generic_services"""
    if (py_generic_services != null) result += """py_generic_services=$py_generic_services"""
    if (php_generic_services != null) result += """php_generic_services=$php_generic_services"""
    if (deprecated != null) result += """deprecated=$deprecated"""
    if (cc_enable_arenas != null) result += """cc_enable_arenas=$cc_enable_arenas"""
    if (objc_class_prefix != null) result += """objc_class_prefix=${sanitize(objc_class_prefix)}"""
    if (csharp_namespace != null) result += """csharp_namespace=${sanitize(csharp_namespace)}"""
    if (swift_prefix != null) result += """swift_prefix=${sanitize(swift_prefix)}"""
    if (php_class_prefix != null) result += """php_class_prefix=${sanitize(php_class_prefix)}"""
    if (php_namespace != null) result += """php_namespace=${sanitize(php_namespace)}"""
    if (php_metadata_namespace != null) result +=
        """php_metadata_namespace=${sanitize(php_metadata_namespace)}"""
    if (ruby_package != null) result += """ruby_package=${sanitize(ruby_package)}"""
    if (uninterpreted_option.isNotEmpty()) result +=
        """uninterpreted_option=$uninterpreted_option"""
    return result.joinToString(prefix = "FileOptions{", separator = ", ", postfix = "}")
  }

  fun copy(
    java_package: String? = this.java_package,
    java_outer_classname: String? = this.java_outer_classname,
    java_multiple_files: Boolean? = this.java_multiple_files,
    java_generate_equals_and_hash: Boolean? = this.java_generate_equals_and_hash,
    java_string_check_utf8: Boolean? = this.java_string_check_utf8,
    optimize_for: OptimizeMode? = this.optimize_for,
    go_package: String? = this.go_package,
    cc_generic_services: Boolean? = this.cc_generic_services,
    java_generic_services: Boolean? = this.java_generic_services,
    py_generic_services: Boolean? = this.py_generic_services,
    php_generic_services: Boolean? = this.php_generic_services,
    deprecated: Boolean? = this.deprecated,
    cc_enable_arenas: Boolean? = this.cc_enable_arenas,
    objc_class_prefix: String? = this.objc_class_prefix,
    csharp_namespace: String? = this.csharp_namespace,
    swift_prefix: String? = this.swift_prefix,
    php_class_prefix: String? = this.php_class_prefix,
    php_namespace: String? = this.php_namespace,
    php_metadata_namespace: String? = this.php_metadata_namespace,
    ruby_package: String? = this.ruby_package,
    uninterpreted_option: List<UninterpretedOption> = this.uninterpreted_option,
    unknownFields: ByteString = this.unknownFields
  ): FileOptions = FileOptions(java_package, java_outer_classname, java_multiple_files,
      java_generate_equals_and_hash, java_string_check_utf8, optimize_for, go_package,
      cc_generic_services, java_generic_services, py_generic_services, php_generic_services,
      deprecated, cc_enable_arenas, objc_class_prefix, csharp_namespace, swift_prefix,
      php_class_prefix, php_namespace, php_metadata_namespace, ruby_package, uninterpreted_option,
      unknownFields)

  class Builder : Message.Builder<FileOptions, Builder>() {
    @JvmField
    var java_package: String? = null

    @JvmField
    var java_outer_classname: String? = null

    @JvmField
    var java_multiple_files: Boolean? = null

    @JvmField
    var java_generate_equals_and_hash: Boolean? = null

    @JvmField
    var java_string_check_utf8: Boolean? = null

    @JvmField
    var optimize_for: OptimizeMode? = null

    @JvmField
    var go_package: String? = null

    @JvmField
    var cc_generic_services: Boolean? = null

    @JvmField
    var java_generic_services: Boolean? = null

    @JvmField
    var py_generic_services: Boolean? = null

    @JvmField
    var php_generic_services: Boolean? = null

    @JvmField
    var deprecated: Boolean? = null

    @JvmField
    var cc_enable_arenas: Boolean? = null

    @JvmField
    var objc_class_prefix: String? = null

    @JvmField
    var csharp_namespace: String? = null

    @JvmField
    var swift_prefix: String? = null

    @JvmField
    var php_class_prefix: String? = null

    @JvmField
    var php_namespace: String? = null

    @JvmField
    var php_metadata_namespace: String? = null

    @JvmField
    var ruby_package: String? = null

    @JvmField
    var uninterpreted_option: List<UninterpretedOption> = emptyList()

    /**
     * Sets the Java package where classes generated from this .proto will be
     * placed.  By default, the proto package is used, but this is often
     * inappropriate because proto packages do not normally start with backwards
     * domain names.
     */
    fun java_package(java_package: String?): Builder {
      this.java_package = java_package
      return this
    }

    /**
     * If set, all the classes from the .proto file are wrapped in a single
     * outer class with the given name.  This applies to both Proto1
     * (equivalent to the old "--one_java_file" option) and Proto2 (where
     * a .proto always translates to a single class, but you may want to
     * explicitly choose the class name).
     */
    fun java_outer_classname(java_outer_classname: String?): Builder {
      this.java_outer_classname = java_outer_classname
      return this
    }

    /**
     * If set true, then the Java code generator will generate a separate .java
     * file for each top-level message, enum, and service defined in the .proto
     * file.  Thus, these types will *not* be nested inside the outer class
     * named by java_outer_classname.  However, the outer class will still be
     * generated to contain the file's getDescriptor() method as well as any
     * top-level extensions defined in the file.
     */
    fun java_multiple_files(java_multiple_files: Boolean?): Builder {
      this.java_multiple_files = java_multiple_files
      return this
    }

    /**
     * This option does nothing.
     */
    @Deprecated(message = "java_generate_equals_and_hash is deprecated")
    fun java_generate_equals_and_hash(java_generate_equals_and_hash: Boolean?): Builder {
      this.java_generate_equals_and_hash = java_generate_equals_and_hash
      return this
    }

    /**
     * If set true, then the Java2 code generator will generate code that
     * throws an exception whenever an attempt is made to assign a non-UTF-8
     * byte sequence to a string field.
     * Message reflection will do the same.
     * However, an extension field still accepts non-UTF-8 byte sequences.
     * This option has no effect on when used with the lite runtime.
     */
    fun java_string_check_utf8(java_string_check_utf8: Boolean?): Builder {
      this.java_string_check_utf8 = java_string_check_utf8
      return this
    }

    fun optimize_for(optimize_for: OptimizeMode?): Builder {
      this.optimize_for = optimize_for
      return this
    }

    /**
     * Sets the Go package where structs generated from this .proto will be
     * placed. If omitted, the Go package will be derived from the following:
     *   - The basename of the package import path, if provided.
     *   - Otherwise, the package statement in the .proto file, if present.
     *   - Otherwise, the basename of the .proto file, without extension.
     */
    fun go_package(go_package: String?): Builder {
      this.go_package = go_package
      return this
    }

    /**
     * Should generic services be generated in each language?  "Generic" services
     * are not specific to any particular RPC system.  They are generated by the
     * main code generators in each language (without additional plugins).
     * Generic services were the only kind of service generation supported by
     * early versions of google.protobuf.
     *
     * Generic services are now considered deprecated in favor of using plugins
     * that generate code specific to your particular RPC system.  Therefore,
     * these default to false.  Old code which depends on generic services should
     * explicitly set them to true.
     */
    fun cc_generic_services(cc_generic_services: Boolean?): Builder {
      this.cc_generic_services = cc_generic_services
      return this
    }

    fun java_generic_services(java_generic_services: Boolean?): Builder {
      this.java_generic_services = java_generic_services
      return this
    }

    fun py_generic_services(py_generic_services: Boolean?): Builder {
      this.py_generic_services = py_generic_services
      return this
    }

    fun php_generic_services(php_generic_services: Boolean?): Builder {
      this.php_generic_services = php_generic_services
      return this
    }

    /**
     * Is this file deprecated?
     * Depending on the target platform, this can emit Deprecated annotations
     * for everything in the file, or it will be completely ignored; in the very
     * least, this is a formalization for deprecating files.
     */
    fun deprecated(deprecated: Boolean?): Builder {
      this.deprecated = deprecated
      return this
    }

    /**
     * Enables the use of arenas for the proto messages in this file. This applies
     * only to generated classes for C++.
     */
    fun cc_enable_arenas(cc_enable_arenas: Boolean?): Builder {
      this.cc_enable_arenas = cc_enable_arenas
      return this
    }

    /**
     * Sets the objective c class prefix which is prepended to all objective c
     * generated classes from this .proto. There is no default.
     */
    fun objc_class_prefix(objc_class_prefix: String?): Builder {
      this.objc_class_prefix = objc_class_prefix
      return this
    }

    /**
     * Namespace for generated classes; defaults to the package.
     */
    fun csharp_namespace(csharp_namespace: String?): Builder {
      this.csharp_namespace = csharp_namespace
      return this
    }

    /**
     * By default Swift generators will take the proto package and CamelCase it
     * replacing '.' with underscore and use that to prefix the types/symbols
     * defined. When this options is provided, they will use this value instead
     * to prefix the types/symbols defined.
     */
    fun swift_prefix(swift_prefix: String?): Builder {
      this.swift_prefix = swift_prefix
      return this
    }

    /**
     * Sets the php class prefix which is prepended to all php generated classes
     * from this .proto. Default is empty.
     */
    fun php_class_prefix(php_class_prefix: String?): Builder {
      this.php_class_prefix = php_class_prefix
      return this
    }

    /**
     * Use this option to change the namespace of php generated classes. Default
     * is empty. When this option is empty, the package name will be used for
     * determining the namespace.
     */
    fun php_namespace(php_namespace: String?): Builder {
      this.php_namespace = php_namespace
      return this
    }

    /**
     * Use this option to change the namespace of php generated metadata classes.
     * Default is empty. When this option is empty, the proto file name will be
     * used for determining the namespace.
     */
    fun php_metadata_namespace(php_metadata_namespace: String?): Builder {
      this.php_metadata_namespace = php_metadata_namespace
      return this
    }

    /**
     * Use this option to change the package of ruby generated classes. Default
     * is empty. When this option is not set, the package name will be used for
     * determining the ruby package.
     */
    fun ruby_package(ruby_package: String?): Builder {
      this.ruby_package = ruby_package
      return this
    }

    /**
     * The parser stores options it doesn't recognize here.
     * See the documentation for the "Options" section above.
     */
    fun uninterpreted_option(uninterpreted_option: List<UninterpretedOption>): Builder {
      checkElementsNotNull(uninterpreted_option)
      this.uninterpreted_option = uninterpreted_option
      return this
    }

    override fun build(): FileOptions = FileOptions(
      java_package = java_package,
      java_outer_classname = java_outer_classname,
      java_multiple_files = java_multiple_files,
      java_generate_equals_and_hash = java_generate_equals_and_hash,
      java_string_check_utf8 = java_string_check_utf8,
      optimize_for = optimize_for,
      go_package = go_package,
      cc_generic_services = cc_generic_services,
      java_generic_services = java_generic_services,
      py_generic_services = py_generic_services,
      php_generic_services = php_generic_services,
      deprecated = deprecated,
      cc_enable_arenas = cc_enable_arenas,
      objc_class_prefix = objc_class_prefix,
      csharp_namespace = csharp_namespace,
      swift_prefix = swift_prefix,
      php_class_prefix = php_class_prefix,
      php_namespace = php_namespace,
      php_metadata_namespace = php_metadata_namespace,
      ruby_package = ruby_package,
      uninterpreted_option = uninterpreted_option,
      unknownFields = buildUnknownFields()
    )
  }

  companion object {
    const val DEFAULT_JAVA_MULTIPLE_FILES: Boolean = false

    const val DEFAULT_JAVA_STRING_CHECK_UTF8: Boolean = false

    @JvmField
    val DEFAULT_OPTIMIZE_FOR: OptimizeMode = OptimizeMode.SPEED

    const val DEFAULT_CC_GENERIC_SERVICES: Boolean = false

    const val DEFAULT_JAVA_GENERIC_SERVICES: Boolean = false

    const val DEFAULT_PY_GENERIC_SERVICES: Boolean = false

    const val DEFAULT_PHP_GENERIC_SERVICES: Boolean = false

    const val DEFAULT_DEPRECATED: Boolean = false

    const val DEFAULT_CC_ENABLE_ARENAS: Boolean = false

    @JvmField
    val ADAPTER: ProtoAdapter<FileOptions> = object : ProtoAdapter<FileOptions>(
      FieldEncoding.LENGTH_DELIMITED, 
      FileOptions::class, 
      "type.googleapis.com/google.protobuf.FileOptions", 
      PROTO_2
    ) {
      override fun encodedSize(value: FileOptions): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.java_package)
        size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.java_outer_classname)
        size += ProtoAdapter.BOOL.encodedSizeWithTag(10, value.java_multiple_files)
        size += ProtoAdapter.BOOL.encodedSizeWithTag(20, value.java_generate_equals_and_hash)
        size += ProtoAdapter.BOOL.encodedSizeWithTag(27, value.java_string_check_utf8)
        size += OptimizeMode.ADAPTER.encodedSizeWithTag(9, value.optimize_for)
        size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.go_package)
        size += ProtoAdapter.BOOL.encodedSizeWithTag(16, value.cc_generic_services)
        size += ProtoAdapter.BOOL.encodedSizeWithTag(17, value.java_generic_services)
        size += ProtoAdapter.BOOL.encodedSizeWithTag(18, value.py_generic_services)
        size += ProtoAdapter.BOOL.encodedSizeWithTag(42, value.php_generic_services)
        size += ProtoAdapter.BOOL.encodedSizeWithTag(23, value.deprecated)
        size += ProtoAdapter.BOOL.encodedSizeWithTag(31, value.cc_enable_arenas)
        size += ProtoAdapter.STRING.encodedSizeWithTag(36, value.objc_class_prefix)
        size += ProtoAdapter.STRING.encodedSizeWithTag(37, value.csharp_namespace)
        size += ProtoAdapter.STRING.encodedSizeWithTag(39, value.swift_prefix)
        size += ProtoAdapter.STRING.encodedSizeWithTag(40, value.php_class_prefix)
        size += ProtoAdapter.STRING.encodedSizeWithTag(41, value.php_namespace)
        size += ProtoAdapter.STRING.encodedSizeWithTag(44, value.php_metadata_namespace)
        size += ProtoAdapter.STRING.encodedSizeWithTag(45, value.ruby_package)
        size += UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999,
            value.uninterpreted_option)
        return size
      }

      override fun encode(writer: ProtoWriter, value: FileOptions) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.java_package)
        ProtoAdapter.STRING.encodeWithTag(writer, 8, value.java_outer_classname)
        ProtoAdapter.BOOL.encodeWithTag(writer, 10, value.java_multiple_files)
        ProtoAdapter.BOOL.encodeWithTag(writer, 20, value.java_generate_equals_and_hash)
        ProtoAdapter.BOOL.encodeWithTag(writer, 27, value.java_string_check_utf8)
        OptimizeMode.ADAPTER.encodeWithTag(writer, 9, value.optimize_for)
        ProtoAdapter.STRING.encodeWithTag(writer, 11, value.go_package)
        ProtoAdapter.BOOL.encodeWithTag(writer, 16, value.cc_generic_services)
        ProtoAdapter.BOOL.encodeWithTag(writer, 17, value.java_generic_services)
        ProtoAdapter.BOOL.encodeWithTag(writer, 18, value.py_generic_services)
        ProtoAdapter.BOOL.encodeWithTag(writer, 42, value.php_generic_services)
        ProtoAdapter.BOOL.encodeWithTag(writer, 23, value.deprecated)
        ProtoAdapter.BOOL.encodeWithTag(writer, 31, value.cc_enable_arenas)
        ProtoAdapter.STRING.encodeWithTag(writer, 36, value.objc_class_prefix)
        ProtoAdapter.STRING.encodeWithTag(writer, 37, value.csharp_namespace)
        ProtoAdapter.STRING.encodeWithTag(writer, 39, value.swift_prefix)
        ProtoAdapter.STRING.encodeWithTag(writer, 40, value.php_class_prefix)
        ProtoAdapter.STRING.encodeWithTag(writer, 41, value.php_namespace)
        ProtoAdapter.STRING.encodeWithTag(writer, 44, value.php_metadata_namespace)
        ProtoAdapter.STRING.encodeWithTag(writer, 45, value.ruby_package)
        UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999,
            value.uninterpreted_option)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): FileOptions {
        var java_package: String? = null
        var java_outer_classname: String? = null
        var java_multiple_files: Boolean? = null
        var java_generate_equals_and_hash: Boolean? = null
        var java_string_check_utf8: Boolean? = null
        var optimize_for: OptimizeMode? = null
        var go_package: String? = null
        var cc_generic_services: Boolean? = null
        var java_generic_services: Boolean? = null
        var py_generic_services: Boolean? = null
        var php_generic_services: Boolean? = null
        var deprecated: Boolean? = null
        var cc_enable_arenas: Boolean? = null
        var objc_class_prefix: String? = null
        var csharp_namespace: String? = null
        var swift_prefix: String? = null
        var php_class_prefix: String? = null
        var php_namespace: String? = null
        var php_metadata_namespace: String? = null
        var ruby_package: String? = null
        val uninterpreted_option = mutableListOf<UninterpretedOption>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> java_package = ProtoAdapter.STRING.decode(reader)
            8 -> java_outer_classname = ProtoAdapter.STRING.decode(reader)
            10 -> java_multiple_files = ProtoAdapter.BOOL.decode(reader)
            20 -> java_generate_equals_and_hash = ProtoAdapter.BOOL.decode(reader)
            27 -> java_string_check_utf8 = ProtoAdapter.BOOL.decode(reader)
            9 -> try {
              optimize_for = OptimizeMode.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            11 -> go_package = ProtoAdapter.STRING.decode(reader)
            16 -> cc_generic_services = ProtoAdapter.BOOL.decode(reader)
            17 -> java_generic_services = ProtoAdapter.BOOL.decode(reader)
            18 -> py_generic_services = ProtoAdapter.BOOL.decode(reader)
            42 -> php_generic_services = ProtoAdapter.BOOL.decode(reader)
            23 -> deprecated = ProtoAdapter.BOOL.decode(reader)
            31 -> cc_enable_arenas = ProtoAdapter.BOOL.decode(reader)
            36 -> objc_class_prefix = ProtoAdapter.STRING.decode(reader)
            37 -> csharp_namespace = ProtoAdapter.STRING.decode(reader)
            39 -> swift_prefix = ProtoAdapter.STRING.decode(reader)
            40 -> php_class_prefix = ProtoAdapter.STRING.decode(reader)
            41 -> php_namespace = ProtoAdapter.STRING.decode(reader)
            44 -> php_metadata_namespace = ProtoAdapter.STRING.decode(reader)
            45 -> ruby_package = ProtoAdapter.STRING.decode(reader)
            999 -> uninterpreted_option.add(UninterpretedOption.ADAPTER.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return FileOptions(
          java_package = java_package,
          java_outer_classname = java_outer_classname,
          java_multiple_files = java_multiple_files,
          java_generate_equals_and_hash = java_generate_equals_and_hash,
          java_string_check_utf8 = java_string_check_utf8,
          optimize_for = optimize_for,
          go_package = go_package,
          cc_generic_services = cc_generic_services,
          java_generic_services = java_generic_services,
          py_generic_services = py_generic_services,
          php_generic_services = php_generic_services,
          deprecated = deprecated,
          cc_enable_arenas = cc_enable_arenas,
          objc_class_prefix = objc_class_prefix,
          csharp_namespace = csharp_namespace,
          swift_prefix = swift_prefix,
          php_class_prefix = php_class_prefix,
          php_namespace = php_namespace,
          php_metadata_namespace = php_metadata_namespace,
          ruby_package = ruby_package,
          uninterpreted_option = uninterpreted_option,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: FileOptions): FileOptions = value.copy(
        uninterpreted_option =
            value.uninterpreted_option.redactElements(UninterpretedOption.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }
  }

  /**
   * Generated classes can be optimized for speed or code size.
   */
  enum class OptimizeMode(
    override val value: Int
  ) : WireEnum {
    /**
     * Generate complete code for parsing, serialization,
     */
    SPEED(1),

    /**
     * etc.
     * Use ReflectionOps to implement these methods.
     */
    CODE_SIZE(2),

    /**
     * Generate code using MessageLite and the lite runtime.
     */
    LITE_RUNTIME(3);

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<OptimizeMode> = object : EnumAdapter<OptimizeMode>(
        OptimizeMode::class, 
        PROTO_2
      ) {
        override fun fromValue(value: Int): OptimizeMode? = OptimizeMode.fromValue(value)
      }

      @JvmStatic
      fun fromValue(value: Int): OptimizeMode? = when (value) {
        1 -> SPEED
        2 -> CODE_SIZE
        3 -> LITE_RUNTIME
        else -> null
      }
    }
  }
}
