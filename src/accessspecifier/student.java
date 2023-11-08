package accessspecifier;

public  class student {
 private String name;
 private int age;
  private student(String name,int age) {
	  this.name=name;
	  this.age=age;
  }	  
public void display()
  {
	  System.out.println(name);
	  System.out.println(age=44);
	 
  }
  public static void main (String[]args) {
	 student s=new student("ravi",33);
	  s.display();
	  
  }
  }
