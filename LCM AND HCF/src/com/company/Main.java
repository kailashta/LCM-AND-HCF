package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1");
        int number1 = sc.nextInt();
        System.out.println("Enter Number2");
        int number2 = sc.nextInt();
        int hcf=1;
        int lcm;
        int minimum = number1 < number2 ? number1 : number2;
        for (int k=1;k<minimum;k++){
            if(number1% k == 0 && number2%k ==0){
                hcf = k;
            }
        }
        lcm = (number1 * number2) / hcf;
        System.out.println("LCM AND HCF OF "+number1 +" , "+number2 +" : " + lcm +" , "+hcf);

            

    }
}
