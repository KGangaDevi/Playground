import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // Get the array size
        int size = in.nextInt();
        int arr[] = new int[size];
        // Get the array elements
        for(int i= 0; i<size; i++)
        {
            arr[i] = in.nextInt();
        }
        // Get the searching element 1
        int se1 = in.nextInt();
        int se2 = in.nextInt();
        int elem_1_idx = -1;
        int elem_2_idx = -1;
        for(int i = 0; i<size; i++)
        {
            if(se1 == arr[i])
            {
                elem_1_idx = i;
            }
            if(se2 == arr[i]){
                elem_2_idx = i;
            }
        }
        System.out.println(elem_1_idx);
        System.out.println(elem_2_idx);
    }
}