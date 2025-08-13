
public class Calculator {
	public int add (int a,int b) {
		int c=a+b;
		return c;
		}
	public int sub(int a,int b) {
		int c2=a-b;
		return c2;
	}
	public int multi(int a,int b) {
		int c4=a*b;
		return c4;
	}
	public int div(int a,int b) {
		int c6=a/b;
		return c6;
	}
 public static void main(String[] args) {
	 Calculator c1=new Calculator();
	 Calculator c3=new Calculator();
	 Calculator c5=new Calculator();
	 Calculator c7=new Calculator();
	 int res =c1.add(2,3);
	 int res1=c3.sub(3,2);
	 int res2=c5.multi(2, 3);
	 int res3=c7.div(4,2);
	 System.out.println(res);
	 System.out.println(res1);
	 System.out.println(res2);
	 System.out.println(res3);
		

	}

}