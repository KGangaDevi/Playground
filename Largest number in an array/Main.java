import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int a[]=new int[size];
      for(int i=0;i<size;i++)
      {
        a[i]=in.nextInt();
      }
      int max=a[0];
      for(int i=1;i<size;i++)
      {
        if(a[i]>max)
        {
          max=a[i];
        }
      }
      System.out.println(max);
    }
}
