import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int arr_size = in.nextInt();
       int arr[] = new int[arr_size];
       for(int i = 0; i <= arr_size - 1; i++){
           arr[i] = in.nextInt();
       }
      int val=in.nextInt();
       sum(arr_size, arr,val);
    }
    public static void sum(int arr_size, int arr[], int val)
    {
        for(int i = 0; i <= arr_size - 2; i++)
        {
            for(int j = i + 1; j <= arr_size - 1; j++)
            {
            if(val==(arr[i]+arr[j]))
                {
     System.out.println(arr[i] + "," + " " + arr[j]);
                }
            }
             
               }
    }
}
       