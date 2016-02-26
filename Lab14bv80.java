// Lab14bvst.java
// This is one of the student starting files
// of the Lab14b lab assignment.
// This file tests all the classes together.
// and draws a train without proper OOP design.


import java.awt.*;
import java.applet.*;
import java.util.ArrayList;


public class Lab14bv80 extends Applet
	{
   	public void paint(Graphics g)
   	{
     		Train train = new Train(100,300);
      	train.addCar("Locomotive",Color.blue);
      	train.addCar("PassengerCar",Color.gray);
      	train.addCar("PassengerCar",Color.gray);
      	train.addCar("FreightCar",Color.green);
      	train.addCar("PassengerCar",Color.gray);
      	train.addCar("FreightCar",Color.green);
      	train.addCar("Caboose",Color.red);
      	train.addCar("FreightCar",Color.green);
      	train.showCars(g);
   	}
	}



/*    public class Lab14bvst extends Applet       //100 pt version
    {
    public void paint(Graphics g)
    {
        Train train = new Train(100,300);
            // we need to make a constructor that accepts the parameters 100,300 to begin drawing the train at those points
        train.addCar("Locomotive",Color.blue);
        train.addCar("PassengerCar",Color.gray);
        train.addCar("PassengerCar",Color.gray);
        train.addCar("FreightCar",Color.green);
        train.addCar(3,"PassengerCar",Color.gray);
        train.addCar("FreightCar",Color.green);
        train.addCar("Caboose",Color.red);
        train.addCar(6,"FreightCar",Color.green );
        train.showCars(g);
    }
    }

*/

