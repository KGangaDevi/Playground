import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int matrix[][] = new int[r][c];
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrix[i][j] = in.nextInt();
      }
    }
    int t[][]=new int[c][r];
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
       t[i][j]=matrix[j][i];
      }
    }
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        System.out.print(t[i][j]+" ");
      }
    System.out.println();
    }
  }
}