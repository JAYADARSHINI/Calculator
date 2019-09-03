
public class Calculator {
 public void add(int x,int y) {
	 int result=x+y;
	 System.out.println("This common line to be changed");
	 System.out.println("int "+result);
 }
 public void add(float x,float y) { // add method is overloaded
	 float result=x+y;
	 System.out.println("float"+result);
 }
 public void add(double x,double y) { // add  method is overloaded
	 double result=x+y;
	 System.out.println("double"+result);
 }
 
}
