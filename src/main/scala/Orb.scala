/**
  * Created by yuga on 2017/08/18.
  */
case class Orb(startX: Float, startY: Float,xPos: Float, yPos: Float) {



  def initMove: Orb = Orb(startX,startY,xPos,yPos + 1)




}
