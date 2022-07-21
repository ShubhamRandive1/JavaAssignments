package com.masai.c3.Problem2;


import java.util.Scanner;

public class Main {
    double calculateAverage(int[] employee){
        double  sum=0;

        for(int i:employee){
            sum+=i;
        }
        return sum/employee.length;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The No of Employee ");
        int numberOfEmployee=sc.nextInt();

        if(numberOfEmployee >1){

            int[] employee =new int[numberOfEmployee];

            System.out.println("Enter the age of "+numberOfEmployee+" Employees");

            for(int i=0;i<numberOfEmployee;i++){
                employee[i]=sc.nextInt();
            }

            Main main=new Main();
            double averageAge=main.calculateAverage(employee);
            System.out.println("The average age is "+averageAge);
        }
        else{
            System.out.println("Please enter a valid employee count");
        }
    }
}