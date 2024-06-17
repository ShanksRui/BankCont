package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Money;

public class program {

	public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    Money money;
    System.out.print("Enter account number :");
    int number = sc.nextInt();
    System.out.print("Enter account Holder :");
    sc.nextLine();
    String name = sc.nextLine();
    System.out.print("is there initial deposit value :(y/n)");
    char response = sc.next().charAt(0);
    
    if(response == 'y') {
    	System.out.print("enter initial deposit value:");
    	double intitial = sc.nextDouble();
        money = new Money(name, number, intitial);
    }else {
    	money = new Money(name, number);
    }

    System.out.println();
    System.out.println("account data:");
    System.out.println("account "+money.toString());
    System.out.println();
    
    System.out.print("Enter a deposit value :");
    double in = sc.nextDouble();
    System.out.println("Updated a account data");
    money.in(in);
    System.out.println("account "+money.toString());
    System.out.println();
    
    System.out.print("Enter a withdrwa value :");
    double out = sc.nextDouble();
    System.out.println("Updated a account data");
    money.out(out);
    System.out.println("account "+money.toString());
    
    sc.close();
	}

}
