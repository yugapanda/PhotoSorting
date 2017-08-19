import processing.core.PApplet

/**
  * Created by yuga on 2017/08/19.
  */
class ScalaProcessing extends PApplet {
  override def settings() {
    fullScreen("processing.javafx.PGraphicsFX2D")

  }

  override def setup() {
    background(0)
    smooth()
  }

  override def draw() {
    stroke(255)
    if (mousePressed) {
      line(mouseX, mouseY, pmouseX, pmouseY)

    }
  }
}