import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int arr_size = in.nextInt();
       int a[] = new int[arr_size];
       for(int i = 0; i <= arr_size - 1; i++){
           a[i] = in.nextInt();
       }
       subsets_of_size_3(arr_size, a);
    }
    public static void subsets_of_size_3(int arr_size, int a[])
    {
        for(int i = 0; i <= arr_size - 2; i++)
        {
            for(int j = i + 1; j <= arr_size - 1; j++)
            {
            for(int k = j + 1; k <= arr_size - 1; k++)
                {
     System.out.print("(" + a[i] + "," + " " + a[j] + "," + " " + a[k] + ")" + " ");
                }
            }
            System.out.println(); }
    }
}
