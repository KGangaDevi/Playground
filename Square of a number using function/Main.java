import java.util.Scanner;
class Main
{
	public static int square(int m)
    {
      return m*m;
    }
  	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner in=new Scanner (System.in);
      int n=in.nextInt();
      int result=square(n);
      System.out.println(result);
	} 
}