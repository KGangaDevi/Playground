import java.util.Scanner;
class Main{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
      int base=in.nextInt();
    int  exponent=in.nextInt();
    int res=power(base,exponent);
    System.out.print(res);
  }
  public static int power(int a, int b)
  {
    int res=1;
    for(int i=1;i<=b;i++)
    {
      res=res*a;
    }
    return res;
  }
}
