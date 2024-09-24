package com.company;
import java.util.*;
// currency exchanger program
class Currency{
    double userInput, exchangedCurrency;
    Scanner sc = new Scanner(System.in);

    public void USD(){
        System.out.println("How much amount to convert into US Dollars? (INR -> USD) ");
        userInput=sc.nextDouble();
        System.out.println("Exchanging currency......");
        exchangedCurrency = userInput*0.012;
        System.out.println("Here is your Exchanged Currency");
        System.out.println("Received $" + exchangedCurrency + " into your GPay Account");
    }

    public void Pound(){
        System.out.println("How much amount to convert into England's Pound? (INR -> GBP) ");
        userInput=sc.nextDouble();
        System.out.println("Exchanging currency......");
        exchangedCurrency = userInput*0.0090;
        System.out.println("Here is your Exchanged Currency");
        System.out.println("Received £" + exchangedCurrency + " into your GPay Account");
    }

    public void Dirham(){
        System.out.println("How much amount to convert into UAE's Dirham? (INR -> AED) ");
        userInput=sc.nextDouble();
        System.out.println("Exchanging currency......");
        exchangedCurrency = userInput*0.044;
        System.out.println("Here is your Exchanged Currency");
        System.out.println("Received د.إ" + exchangedCurrency + " into your GPay Account");
    }

    public void SwissFranc(){
        System.out.println("How much amount to convert into Switzerland's Franc? (INR -> CHF) ");
        userInput=sc.nextDouble();
        System.out.println("Exchanging currency......");
        exchangedCurrency = userInput*0.010;
        System.out.println("Here is your Exchanged Currency");
        System.out.println("Received Fr." + exchangedCurrency + " into your GPay Account");
    }

    public void SingaporeDollar(){
        System.out.println("How much amount to convert into Singapore Dollars? (INR -> SGD) ");
        userInput=sc.nextDouble();
        System.out.println("Exchanging currency......");
        exchangedCurrency = userInput*0.015;
        System.out.println("Here is your Exchanged Currency");
        System.out.println("Received S$" + exchangedCurrency + " into your GPay Account");
    }
}
public class CurrencyExchanger {
    public static void main(String[] args) {
        Currency ch = new Currency();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Bank of Baniya to exchange your currency.Into which currency would you like to exchange your Rupees");
        System.out.println("Choose your desired currency by entering its serial number");
        System.out.println("1.USD");
        System.out.println("2.Pounds");
        System.out.println("3.Dirham");
        System.out.println("4.Swiss Franc");
        System.out.println("5.Singapore Dollar");
        int a = scan.nextInt();

        switch (a) {
            case 1 -> ch.USD();
            case 2 -> ch.Pound();
            case 3 -> ch.Dirham();
            case 4 -> ch.SwissFranc();
            case 5 -> ch.SingaporeDollar();
            default -> System.out.println("Server Error! Lunch break ke baad aana.");
        }

    }
}
