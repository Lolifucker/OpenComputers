package li.cil.oc.client.renderer.markdown.segment

import li.cil.oc.client.renderer.markdown.MarkupFormat
import net.minecraft.util.text.TextFormatting

private[markdown] class BoldSegment(parent: Segment, text: String) extends TextSegment(parent, text) {
  override protected def format = TextFormatting.BOLD.toString

  override def toString(format: MarkupFormat.Value): String = format match {
    case MarkupFormat.Markdown => s"**$text**"
    case MarkupFormat.IGWMod => s"[prefix{l}]$text [prefix{}]"
  }
}
