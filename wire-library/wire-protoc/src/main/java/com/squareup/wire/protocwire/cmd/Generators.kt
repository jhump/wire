package com.squareup.wire.protocwire.cmd

import com.squareup.wire.protocwire.Plugin
import com.squareup.wire.protocwire.WireGenerator
import com.squareup.wire.schema.JavaTarget
import com.squareup.wire.schema.KotlinTarget
import com.squareup.wire.schema.SwiftTarget

class JavaGenerator {

  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val target = JavaTarget(outDirectory = "")
      Plugin.run(WireGenerator(target))
    }
  }
}

class KotlinGenerator {

  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val target = KotlinTarget(outDirectory = "")
      Plugin.run(WireGenerator(target))
    }
  }
}

class SwiftGenerator {

  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val target = SwiftTarget(outDirectory = "")
      Plugin.run(WireGenerator(target))
    }
  }
}
