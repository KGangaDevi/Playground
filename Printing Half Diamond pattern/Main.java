import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int row=1;row<=n;row=row+1)
      {
        for(int space=1;space<=(n-row);space++)
          {
          System.out.print(" ");
        }
        for(int col=1;col<=((2*row)-1);col++)
        {
          System.out.print("*");
        }
	    System.out.print("\n");
      }  	}	}