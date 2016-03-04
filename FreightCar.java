// FreightCar.java
//a moveCar() method was added to this file to move the cars accordingly 



import java.awt.*;


public class FreightCar extends RailCar
{
	private Color carColor;
	public int xPos;
	private int yPos;

	public FreightCar(Color cC, int xPos, int yPos)
	{
		super(cC,xPos,yPos);
      carColor = cC;
      this.xPos = xPos;
      this.yPos = yPos;
   }

	public void drawCar(Graphics g)
	{
		super.drawCar(g);
		drawFreightDoors(g);
	}
   
   public void moveCar() //added method
   {
      super.moveCar(); //calls the moveCar() method from the superclass (RailCar)
      this.xPos += 175; //moves the car 175 units to the right (in the x direction) to accomodate for the inserted car
   }

	private void drawFreightDoors(Graphics g)
	{
		g.setColor(Color.black);
		g.drawRect(xPos+30,yPos+10,90,60);
      g.drawLine(xPos+75,yPos+10,xPos+75,yPos+70);
      g.drawLine(xPos+30,yPos+10,xPos+75,yPos+70);
      g.drawLine(xPos+30,yPos+70,xPos+75,yPos+10);
      g.drawLine(xPos+75,yPos+10,xPos+120,yPos+70);
      g.drawLine(xPos+75,yPos+70,xPos+120,yPos+10);
      g.fillRect(xPos+66,yPos+35,5,15);
      g.fillRect(xPos+80,yPos+35,5,15);
	}
 }
