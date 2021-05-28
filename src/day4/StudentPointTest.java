package day4;

import java.util.Scanner;

public class StudentPointTest {
        public static void main(String[] args) {
            int result=0;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a grade value:" );
            result = input.nextInt();
          System.out.println(StudentPoints.qualityPoints(result));
        }


    }

