/*
The Train class requires an addCar method that 

adds a new RailCar object to a railCars dynamic array and places it at the end of the train. 

The 100-Point version also has a second addCar method, which places a new RailCar object at a sequence number in the train. The first position, occupied by the locomotive is position 0.

The Train class also needs a showCars method, 
which displays the car in the sequence that the cars were added. 
The very first car added to the Train object is displayed at the (x,y) coordinate that was provided with the instantiation of the new Train object.
*/




import java.util.*;
public class Train
{
   ArrayList <RailCar> railCars = new ArrayList<RailCar> ();

   
   public Train (int x, int y)      // int x = 100, int y = 300
   {
      // railCar(Cc,100,300);
      
   }
   
public void addCar(String type, Color color)  // 100 point version
    {
      
    }
 
public void addCar(int location, String type, Color color)
{
   
   
}

   public void showCars(Graphics g)
    {
     for(RailCar car: railCars)
        {
           drawCar(g); 
        }
    }


}
