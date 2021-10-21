import java.util.Random;
import java.util.Scanner;

public class Lv3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        int num1[][] = new int[a][a];//创建n*n的矩阵1
        int num2[][] = new int[a][a];//创建n*n的矩阵2
        for (int i = 0; i < a; i++) {
            for (int j = i; j < a; j++) {
                num1[i][j] = new Random().nextInt(6);//为矩阵每个元素赋0至5的随机值
                num1[j][i] = num1[i][j];
                num2[i][j] = new Random().nextInt(6);//为矩阵每个元素赋0至5的随机值
                num2[j][i] = num2[i][j];
            }
        }

        System.out.println("矩阵1:");
        printMatrix(num1);//打印矩阵1
        System.out.println("矩阵2:");
        printMatrix(num2);//打印矩阵2

        int result[][] = multiply(num1,num2);//矩阵相乘得到结果

        System.out.println("2个随机产生的矩阵相乘后结果:");
        printMatrix(result);//打印矩阵1
        printResult(result);


    }

    //打印矩阵
    static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j != arr.length) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //矩阵相乘
    static int[][] multiply(int[][] arr1,int[][] arr2){
        int[][] result = new int[arr1.length][arr1.length];
        int a;//存放每个result里元素的结果

        for (int i = 0; i < result.length; i++) {//行
            for (int j = 0; j < result.length; j++) {//列
                a = 0;
                for (int k = 0; k < result.length; k++) {
                    a = a + arr1[i][k]*arr2[k][j];//矩阵相乘
                }
                result[i][j] = a;
            }
        }
        return result;
    }

    static void printResult(int[][] arr){
        int a = 0;//存放矩阵对角线元素之和
        for (int i = 0; i < arr.length; i++) {
            a = a + arr[i][i];//对角线元素累加
        }
        System.out.println("矩阵对角线之和"+a);
    }

}
