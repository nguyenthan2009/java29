import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] Array = {
                {2,3,4,5},{2,4,6,7},{4,6,8,2},{2,4,5,6}
        };
        Scanner sc= new Scanner(System.in);
        System.out.println("NHẬP cột muốn tính tổng");
        int so = sc.nextInt();
        int total=0;
        for(int i=0;i<Array.length;i++){
            for(int j=0;j<Array.length;j++){
                total+= Array[i][so];
                break;
            }
        }
        System.out.println( "tổng của cột vừa nhập là"+total);
        System.out.println("mời bạn nhập số cột của mảng");
        int row = sc.nextInt();
        System.out.println("mời bạn nhập số hang của mảng");
        int column = sc.nextInt();
        int[][] matrix= new int[row][column];
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("nhập cột bạn muốn tính tổng");
        int so1= sc.nextInt();
       int total1 =0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                total1 += matrix[i][so1];
                break;
            }
        }
        System.out.println("tổng của cột vừa nhập là" +total1);
    }
}
