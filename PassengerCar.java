// PassengerCar.java
//a moveCar() method was added to this file to move the cars accordingly 


import java.awt.*;


class PassengerCar extends RailCar
{
	private Color carColor;
	public int xPos;
	private int yPos;

	public PassengerCar(Color cC, int xPos, int yPos)
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
      drawRoof(g);
	}

   public void moveCar() //added method
   {
      super.moveCar(); //calls the moveCar() method from the superclass (RailCar)
      this.xPos += 175; //moves the car 175 units to the right (in the x direction) to accomodate for the inserted car
   }

	private void drawWindows(Graphics g)
	{
	    g.setColor(Color.white);
	    g.fillRect(xPos+10,yPos+30,25,30);
       g.fillRect(xPos+45,yPos+30,25,30);
	    g.fillRect(xPos+80,yPos+30,25,30);
       g.fillRect(xPos+115,yPos+30,25,30);
	}
   
   private void drawRoof(Graphics g)
   {
      Polygon roof = new Polygon();
      roof.addPoint(xPos-15,yPos+20);
      roof.addPoint(xPos,yPos);
      roof.addPoint(xPos+150,yPos);
      roof.addPoint(xPos+165,yPos+20);
      g.setColor(carColor);
      g.fillPolygon(roof);
   }   
}
	
