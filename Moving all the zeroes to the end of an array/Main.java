import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      func(a,n);
      for(int i=0;i<n;i++)
      {
        System.out.print(a[i]+" ");
      }
    }
  public static void func(int a[], int n)
  {
    int count=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]!=0)
      {
        int temp=a[i];
        a[i]=a[count];
        a[count]=temp;
        count++;
      }
    }
  }
}