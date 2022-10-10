
public class Check extends Keyboard {
	void click(){
	
	 System.out.println("concrete method overrided");
	}
	
	
	
  void typing() {
	  
	  System.out.println("abstract method overrided");
	  
  }
  public static void main(String[] args) {
	

  Check c=new Check();
  c.click();
   c.typing();
   
  }
}
