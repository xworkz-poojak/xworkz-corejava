class Cosmetics
{
   
   //class members
   static double price;//static members always belongs to class name,instance variables /non static members alaways belongs to objects,static occupy less memory content;
   static String name; //static are always present inside class members
   static String color;
   static String brand;
   static int cosmeticId;
   static void makeOver()
  {
   System.out.println("party makeover");
  }
  
  public static void main(String a[])
  {
	  Cosmetic.price=250;
	  System.out.println(Cosmetic.price);
	  
   Cosmetics cos = new Cosmetics();
   cos.price= 150; //non static are always present inside the object
   cos.name="eyeliner";
   cos.color="black";
   cos.brand="lakme";
   cos.cosmeticId=123;
   
   System.out.println(cos.price);
   System.out.println(cos.name);
   System.out.println(cos.color);
   System.out.println(cos.brand);
   System.out.println(cos.cosmeticId);
  } 
}