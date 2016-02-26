/*
The Train class requires an addCar method that 

adds a new RailCar object to a railCars dynamic array and places it at the end of the train. 

The 100-Point version also has a second addCar method, which places a new RailCar object at a sequence number in the train. The first position, occupied by the locomotive is position 0.

The Train class also needs a showCars method, 
which displays the car in the sequence that the cars were added. 
The very first car added to the Train object is displayed at the (x,y) coordinate that was provided with the instantiation of the new Train object.
*/




import java.util.*;
import java.awt.*;
import java.applet.*;
public class Train
{
   ArrayList <RailCar> railCars = new ArrayList<RailCar> ();
   private int x;
   private int y;
   
   public Train (int x, int y)      // int x = 100, int y = 300
   {
      this.x = x;
      this.y = y;
   }
   
    public void addCar(String type, Color color)  
    { 
      
      if (type.indexOf("Locomotive")== 0)
      {
       RailCar locomotive = new Locomotive (color, x,y);   
       x+=175;
       railCars.add(locomotive);
      }
      
       if (type.indexOf("PassengerCar")== 0)
      {
       RailCar passenger = new PassengerCar (color, x,y);   
       x+=175;
       railCars.add(passenger);
      }
      
       if (type.indexOf("FreightCar")== 0)
      {
       RailCar freight = new FreightCar (color, x,y);   
       x+=175;
       railCars.add(freight);
      }
      
       if (type.indexOf("Caboose")== 0)
      {
       RailCar caboose = new Caboose (color, x,y);   
       x+=175;
       railCars.add(caboose);
      }
    }
 
    public void addCar(int location, String type, Color color)
    {
        //Use a counter to label each car with a number
        // if (carNumber >= location)
        //     x+=175;
        //set an x value for the new car because it's different than the regular x value
        // maybe xInsert = 
        
        
   if (type.indexOf("Locomotive")== 0)
      {
       RailCar locomotive = new Locomotive (color, x,y);   
       x+=175;
       railCars.add(locomotive);
      }
      
       if (type.indexOf("PassengerCar")== 0)
      {
       RailCar passenger = new PassengerCar (color, x,y);   
       x+=175;
       railCars.add(passenger);
      }
      
       if (type.indexOf("FreightCar")== 0)
      {
       RailCar freight = new FreightCar (color, x,y);   
       x+=175;
       railCars.add(freight);
      }
      
       if (type.indexOf("Caboose")== 0)
      {
       RailCar caboose = new Caboose (color, x,y);   
       x+=175;
       railCars.add(caboose);
      }
    }

   public void showCars(Graphics g)
    {
     for(RailCar car: railCars)
        {
           car.drawCar(g); 
        }
    }


}
