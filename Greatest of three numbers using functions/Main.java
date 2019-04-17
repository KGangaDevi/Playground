import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
        Scanner in=new Scanner(System.in);
      	 int n1=in.nextInt();
         int n2=in.nextInt();
         int n3=in.nextInt();
      //int res=0;
      int res=big(n1,n2,n3);
      System.out.println(res);
	}
  public static int big(int a, int b, int c)
  {
    int res;
    if((a>b)&&(a>c))
      res=a;
    else if(b>c)
      res=b;
    else
      res=c;
    return res;
  }    
}