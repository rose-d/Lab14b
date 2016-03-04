// Caboose.java
//a moveCar() method was added to this file to move the cars accordingly 


import java.awt.*;


public class Caboose extends RailCar
{
	private Color carColor;
	public int xPos;
	private int yPos;

	public Caboose(Color cC, int xPos, int yPos)
	{
		super(cC,xPos,yPos);
      carColor = cC;
      this.xPos = xPos;
      this.yPos = yPos;
   }

	public void drawCar(Graphics g)
	{
		super.drawCar(g);
		drawWindows(g);
		drawCupola(g);
	}

   public void moveCar() //added method
   {
      super.moveCar(); //calls the moveCar() method from the superclass (RailCar)
      this.xPos += 175; //moves the car 175 units to the right (in the x direction) to accomodate for the inserted car
   }

	private void drawWindows(Graphics g)
	{
	    g.setColor(Color.white);
	    g.fillRect(xPos+30,yPos+30,30,30);
	    g.fillRect(xPos+90,yPos+30,30,30);
	}

	private void drawCupola(Graphics g)
	{
	    g.setColor(Color.red);
	    g.fillRect(xPos+30,yPos-30,90,30);
	    g.setColor(Color.black);
	    g.fillRect(xPos+25,yPos-30,100,5);
	}
}
