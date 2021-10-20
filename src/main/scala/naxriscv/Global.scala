package naxriscv

import spinal.core.ScopeProperty
import naxriscv.pipeline.Stageable
import spinal.core._

object Global  extends Area{
  setName("Global")
  val PHYSICAL_WIDTH = ScopeProperty[Int]
  def VIRTUAL_WIDTH = PHYSICAL_WIDTH.get //for now

  val PC   = Stageable(UInt(Global.VIRTUAL_WIDTH bits))


}
