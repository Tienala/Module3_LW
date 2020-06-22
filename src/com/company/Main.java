/*
 * Main
 *
 * Version 1
 *
 * @author Nataliia Zviertseva, KhPI
 * LW2
 * Choose a subject according to your number. Develop a service using all your best in OOP and Java collections.
 * Six methods must be written like in the following example. A point for each one.
 */
package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
     //Creating objects
	StandartLunch lunch1 = new StandartLunch(1,"Luxury lunch", 33.0, 26,30.0);
	StandartLunch lunch2 = new StandartLunch(2,"Poor lunch", 12.0, 56, 7.49);
	StandartLunch lunch3 = new StandartLunch(3,"Junk lunch", 16.0, 66,9.12);
	StandartLunch lunch4 = new StandartLunch(4,"Student lunch", 7.31, 12,3.0);
	StandartLunch lunch5 = new StandartLunch(5,"Business lunch", 50.16, 18,32.2);

	Ordering order1 = new Ordering(1,22.0,1,11.0);
	Ordering order2 = new Ordering(2,25.74,12, 12.7);
	Ordering order3 = new Ordering(3,125.86,18, 67.2);
	Ordering order4 = new Ordering(4,75.86,1,27.12);
	Ordering order5 = new Ordering(5,18.86,1, 8.6);
	//Creating ArrayList
        List<ICountProfit> allOrders = new ArrayList<>();
        allOrders.add(lunch1);
        allOrders.add(lunch2);
        allOrders.add(lunch3);
        allOrders.add(lunch4);
        allOrders.add(lunch5);
        allOrders.add(order1);
        allOrders.add(order2);
        allOrders.add(order3);
        allOrders.add(order4);
        allOrders.add(order5);
        //Calculating profit from all arders in this month
        double profitPerMonth = allOrders.stream().mapToDouble(ICountProfit::getProfitPerMonth).sum();
       //Calculating minimal profit from all orders
        ICountProfit minimumProfitOrder = allOrders.stream().
                min(Comparator.comparing(ICountProfit::getProfitPerMonth)).orElse(null);
       //Calculating maximal profit from all orders
        ICountProfit maximumProfitOrder = allOrders.stream().
                max(Comparator.comparing(ICountProfit::getProfitPerMonth)).orElse(null);
        //Calculating averege profit from all orders
        double avg  = allOrders.stream().mapToDouble(ICountProfit::getProfitPerMonth)
                .average().orElse(0);
        //Calculating profit only from standart lunches
        double profitStandartLunch = allOrders.stream().filter(el -> el instanceof StandartLunch)
                .mapToDouble(ICountProfit::getProfitPerMonth).sum();
        //Calculating profit only from ordering
        double profitOrders = allOrders.stream().filter(el -> el instanceof Ordering)
                .mapToDouble(ICountProfit::getProfitPerMonth).sum();
        //Comparing profits
        if( profitStandartLunch > profitOrders){
            System.out.println("Profit from standart lunches is higher than from orders in this month");
        }
        else {
            System.out.println("Profit from orders is higher than from standart lunches in this month");
        }
        System.out.println("In this month all profit is " + profitPerMonth +" USD");
        System.out.println("Minimum profit from all orders is " + minimumProfitOrder + " USD");
        System.out.println("Maximum profit from all orders is " + maximumProfitOrder + " USD");


    }
}
