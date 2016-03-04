// RailCar.java


import java.awt.*;


public class RailCar
{
	private Color carColor;
	private  int xPos;
	private int yPos;

	public RailCar(Color cC, int xP, int yP)
	{
		carColor = cC;
		xPos = xP;
		yPos = yP;
	}

	public void drawCar(Graphics g)
	{
      drawContainer(g);
      drawRailWheels(g);
      drawLink(g);
	}
   
   public void moveCar() //added method: this method is called by all the subclasses
   {
      this.xPos += 175; //shifts the x position to the right by 175 units
   };
      
   private void drawContainer(Graphics g)
   {
   	g.setColor(carColor);
   	g.fillRect(xPos,yPos,150,100);
   }
   
   private void drawRailWheels(Graphics g)
   {
   	g.setColor(Color.black);
		g.fillOval(xPos+5,yPos+75,50,50);
		g.fillOval(xPos+95,yPos+75,50,50);  
	}
    
   private void drawLink(Graphics g)
   {
      g.setColor(Color.black);
      g.fillRect(xPos-25,yPos+80,25,5);
   } 
}
