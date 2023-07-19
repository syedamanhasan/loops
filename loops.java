package JAVA;
import java.util.*;
public class loops {
    public static void main(Strings[] args){

        //for(initialisation; condition; updation){}
        //while(condition){do something then updation}
        //do{do something then updation} while(condition)

        /*Print Hi Aman 4 times
        for(int i=1; i<=4; i++){
            System.out.println("Hi Aman");
        }

        //print number from 1 to 10
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }*/

//----------------------------------------------------------------------------------------------------------------------

    /*above question with while

    int i=1;
    while(i<=10){
        System.out.println(i);
        i++;
    }*/

//----------------------------------------------------------------------------------------------------------------------

    /*above question with do while
    int i=32;
    do{
        System.out.println(i);
        i++;
    }while(i<=10);*/

//----------------------------------------------------------------------------------------------------------------------


    /*Print the sum of first n natural number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for sum");
        int n=sc.nextInt();
        int sum=0;

        for(int i=1; i<=n; i++){
            sum = sum+i;
        }
        System.out.println(sum);*/

//----------------------------------------------------------------------------------------------------------------------


        //Print the table of the number input by the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print the table");
        int n = sc.nextInt();
        int mul=0;

        for(int i=1; i<=10; i++){
            System.out.println(n + "*" + i + "=" + n*i);
        }
    }
}
