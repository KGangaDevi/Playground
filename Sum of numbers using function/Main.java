import java.util.Scanner;
class Main{
  	public static int sum(int m)
    {
      int count=0;
      for (int i=1;i<=m;i++)
      {
        count=count+i;
      }
      return count;
    }
  	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int result=sum(n);
      System.out.println(result);
	}
}