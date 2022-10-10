  //sub class
public class computer extends Mouse  {
   void doubleClick()
   {
	   System.out.println("overrided abstracted method");
   }

     public static void main(String[] args) {
		computer c=new computer();
		c.doubleClick();
	}
}
