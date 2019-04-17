import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      sum(n);
      System.out.print(sum(n));
    }
  public static int sum(int n)
  {
    if(n!=0)
    return n+sum(n-1);
    else 
      return n;
  }
}