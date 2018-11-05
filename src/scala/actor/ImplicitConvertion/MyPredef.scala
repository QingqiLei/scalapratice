package actor.ImplicitConvertion

object MyPredef {
  implicit def fileToRichFile(file:String) = new RichFile(file)

}
