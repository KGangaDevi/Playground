import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String s=in.nextLine();
      int len=s.length();
      boolean flag=true;
      for(int i=0;i<len;i++)
      {
        if(s.charAt(i)!=s.charAt(len-i-1))
        {
          flag=false;
        }
      }
      if(flag==true)
        System.out.print("Yes");
      else
        System.out.print("No");
    } 
}
