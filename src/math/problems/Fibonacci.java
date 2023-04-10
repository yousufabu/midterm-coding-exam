package math.problems;



import org.junit.Assert;


import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {


        int f1=0, f2=1,sum=0;


        Scanner scan = new Scanner(System.in);
        int fibo;
        System.out.println("I love java");


        fibo= scan.nextInt();
        for(int i=2;i<fibo;i++){


            sum=f1+f2;


            System.out.print(" "+sum);
            f1=f2;
            f2=sum;










        }
        int expectedNum=40;
        Assert.assertEquals(expectedNum,fibo);






    }
}
