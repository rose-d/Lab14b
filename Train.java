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
           car.drawCar(g); 
        }
    }


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
