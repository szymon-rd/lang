package pl.jaca.lang.compiler.bytecode

import org.objectweb.asm.tree.{InsnNode, VarInsnNode}
import pl.jaca.lang.compiler.`type`.Type
import pl.jaca.lang.compiler.bytecode.Opcode

/**
  * @author Jaca777
  *         Created 2016-03-25 at 21
  */
case class JavaVariable(name: String, id: Int, scope: Scope, t: Type) {
  def pushInsn = new VarInsnNode(t.opcode.Load, id)

  def popInsn = new InsnNode(t.opcode.Pop)
}
