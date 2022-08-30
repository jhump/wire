package com.squareup.wire.protocwire.cmd

import com.google.protobuf.compiler.PluginProtos
import com.squareup.wire.protocwire.Plugin
import com.squareup.wire.protocwire.WireGenerator
import com.squareup.wire.schema.KotlinTarget
import java.io.File
import java.io.InputStream

private val devPath = (System.getProperty("user.home") ?: ".") + "/development/"
// Absolute path is used because IJ and terminal has different home directories.
val stubbedRequestFile = "$devPath/wire/wire-library/request.binary"

class StubbedRequestDebugging {
  companion object {
    /**
     * Helper function used to capture code generation requests for debug/break point execution.
     */
    fun debug(request: PluginProtos.CodeGeneratorRequest) {
      val directory = File(devPath)
      if (!directory.exists()) {
        throw RuntimeException("no such directory \"${directory.path}\" change the devPath in this file.")
      }
      val f = File(stubbedRequestFile)
      val folder = File(f.parent)
      folder.mkdirs()
      f.createNewFile()
      f.writeBytes(request.toByteArray())
    }

    @JvmStatic
    fun main(args: Array<String>) {
      val target = KotlinTarget(outDirectory = "")
      Plugin.run(WireGenerator(target), StubbedTestEnvironment())
    }
  }
}

class StubbedTestEnvironment() : Plugin.DefaultEnvironment() {
  override fun getInputStream(): InputStream {
    return File(stubbedRequestFile).inputStream()
  }
}
