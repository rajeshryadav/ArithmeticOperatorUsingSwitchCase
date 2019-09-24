package com.company;

public class Main {

    public static void main(String[] args) {
	int a = 20;
	int b = 10;
	int result;
	String system = "+";

	switch (system)
    {
        case "-" : result= a-b;
            System.out.println(result);
            break;
        case "+" : result= a+b;
            System.out.println(result);
            break;
        case "*" : result= a*b;
            System.out.println(result);
            break;
        case "/" : result= a/b;
            System.out.println(result);
            break;
        default:
            System.out.println("invalid");
        break;





    }






    }
}
