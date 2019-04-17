import java.util.Scanner;
class Faculty
{
  public void salary(int baseSalary)
  {
    System.out.println("Base Salary: "+baseSalary);
  }
}
class CSE extends Faculty
{
  public void salary(int baseSalary)
  {
    System.out.println("CSE Faculty: "+(baseSalary+3000));
  }
}
class IT extends CSE
{
  public void salary(int baseSalary)
  {
     System.out.println("IT Faculty: "+(baseSalary+5000));
  }
}
class ECE extends IT
{
  public void salary(int baseSalary)
  {
    System.out.println("ECE Faculty: "+(baseSalary+4500));
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int baseSalary=in.nextInt();
    Faculty ob=new Faculty();
    ob.salary(baseSalary);
    CSE obj2 = new CSE();
    obj2.salary(baseSalary);
    IT obj1 = new IT();
    obj1.salary(baseSalary);
    ECE obj = new ECE();
    obj.salary(baseSalary);
    //implement your required concept here
  }
}