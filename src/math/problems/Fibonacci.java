package math.problems;

import java.util.LinkedList;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        System.out.println(getFibonacci( 40));

    }
    public static LinkedList<Integer> getFibonacci (int number){
        int numb1 = 0;
        int numb2 = 1;
        int start = 0;
        LinkedList<Integer> fibo = new LinkedList<>();
        while (start < number ){
            fibo.add(numb1);
            int numb3 = numb1+ numb2;
            numb1 = numb2;
            numb2=numb3;
            start++;

        } return fibo;



    }
}
