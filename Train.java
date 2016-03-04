/*
The Train class has an addCar method that adds a new RailCar object to a railCars dynamic array and places it at the end of the train. 
The 100-Point version also has a second addCar method, which places a new RailCar object at a sequence number in the train. The first position, occupied by the locomotive is position 0.
The Train class has a showCars method, which displays the car in the sequence that the cars were added. 
The very first car added to the Train object is displayed at the (x,y) coordinates. -> (100,300)
*/




import java.util.*;
import java.awt.*;
import java.applet.*;

public class Train
{
   ArrayList <RailCar> railCars = new ArrayList<RailCar> (); //creates a railCars dynamic array 
   //data attributes
   private int x; 
   private int y;
   private int carNumber;
   private int xPos;
   private int newxPos;
   
   public Train (int x, int y)      // int x = 100, int y = 300 (coordinates of first car)
   {
   
      this.x = x; //this.x references to get to the "x" attribute.
      this.y = y; //this.y references to get to the "y" attribute.
   }
   
    public void addCar(String type, Color color)  
    { 
     
      if (type.indexOf("Locomotive")== 0) //if the car is a locomotive, go through the following statements (statements within the if statement)
      {
       RailCar locomotive = new Locomotive (color, x,y); //creates a new RailCar called locomotive with parameters (color, x, and y) 
       x+=175; //moves 175 units to the right to accomodate for the inserted car
       railCars.add(locomotive); //adds the car to the dynamic array
      }
      
       if (type.indexOf("PassengerCar")== 0)//if the car is a passenger car, go through the following statements (statements within the if statement)
      {
       RailCar passenger = new PassengerCar (color, x,y); //creates a new RailCar called passenger with parameters (color, x, and y) 
       x+=175; //moves 175 units to the right to accomodate for the inserted car
       railCars.add(passenger); //adds the car to the dynamic array
      }
         
       if (type.indexOf("FreightCar")== 0)//if the car is a freight car, go through the following statements (statements within the if statement)
      {
       RailCar freight = new FreightCar (color, x,y); //creates a new RailCar called freight with parameters (color, x, and y) 
       x+=175; //moves 175 units to the right to accomodate for the inserted car
       railCars.add(freight); //adds the car to the dynamic array
      }
      
       if (type.indexOf("Caboose")== 0)//if the car is a caboose, go through the following statements (statements within the if statement)
      {
       RailCar caboose = new Caboose (color, x,y); //creates a new RailCar called caboose with parameters (color, x, and y) 
       x+=175; //moves 175 units to the right to accomodate for the inserted car
       railCars.add(caboose); //adds the car to the dynamic array
      }
    }
 

    public void addCar(int location,String type, Color color)  //2nd add car (overloaded) method with three parameters (location, type, and color)
    { 
      x = 100+(175*(location-1)); //calculated x position of each car based on its location
      
      if (type.indexOf("Locomotive")== 0)//if the car is a locomotive, go through the following statements (statements within the if statement)
      {
      
       RailCar locomotive = new Locomotive (color, x,y); //creates a new RailCar called locomotive with parameters (color, x, and y) 
       railCars.add(location-1,locomotive); //adds the car at location-1 (because the first car starts at position 0)
      }
      
       if (type.indexOf("PassengerCar")== 0)//if the car is a passenger car, go through the following statements (statements within the if statement)
      {
       RailCar passenger = new PassengerCar (color, x,y); //creates a new RailCar called passenger with parameters (color, x, and y) 
       railCars.add(location-1,passenger);//adds the car at location-1 (because the first car starts at position 0)
      }
         
       if (type.indexOf("FreightCar")== 0)//if the car is a freight car, go through the following statements (statements within the if statement)
      {
       RailCar freight = new FreightCar (color, x,y); //creates a new RailCar called frieght with parameters (color, x, and y) 
       railCars.add(location-1,freight);//adds the car at location-1 (because the first car starts at position 0)
      }
      
       if (type.indexOf("Caboose")== 0)//if the car is a caboose, go through the following statements (statements within the if statement)
      {
       RailCar caboose = new Caboose (color, x,y); //creates a new RailCar called caboose with parameters (color, x, and y) 
       railCars.add(location-1,caboose);//adds the car at location-1 (because the first car starts at position 0)
      }
      
      for (int i=location; i<railCars.size(); i++) //the for loop starts at location and goes until the size of the dynamic array (the number of cars in the array)
      {
         
          railCars.get(i).moveCar(); //gets the car in the location and moves the car 175 units to the right (using the moveCar method)
           x +=175; //moves the car 175 units to the right
      }
      
       x += 175; //moves the car 175 units to the right
      }
      
      public void showCars(Graphics g)
      {
         for (RailCar railCar : railCars) //draws the car for each railCar
         {
            railCar.drawCar(g);
         }
      }
}
