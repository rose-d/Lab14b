//Lab14bv100stAvadhutaandDeterman
//Sravya Avadhuta and Rose Determan
//This file was given.
//The purpose of this lab is to write a program with proper Object Oriented Programming Features.


import java.awt.*;
import java.applet.*;
import java.util.ArrayList;


public class Lab14bv100stAvadhutaandDeterman extends Applet
	{
   	public void paint(Graphics g)
   	{
      	Train train = new Train(100,300);
      	train.addCar("Locomotive",Color.blue);
      	train.addCar("PassengerCar",Color.gray);
      	train.addCar("PassengerCar",Color.gray);
      	train.addCar("FreightCar",Color.green);
      	train.addCar(3,"PassengerCar",Color.gray);
      	train.addCar("FreightCar",Color.green);
      	train.addCar("Caboose",Color.red);
      	train.addCar(6,"FreightCar",Color.green);
      	train.showCars(g);
   	}
	}
