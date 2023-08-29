
public class Bottle {
   String color;
   int size;
   int price;
   String shop;
  
  
  
public Bottle(String color, int size, int price, String shop)
  {
	 this.color=color;
	 this.size=size;
	 this.price=price;
	 this.shop=shop;
	 
	 System.out.println(color);
  }


  public boolean fillWater(int watersize)
  {
	  if(watersize >size)
		 return false;
	  else
		  return true;
  }
}
	

