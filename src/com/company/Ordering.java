/*
 * Ordering
 *
 * Version 1
 *
 * @author Nataliia Zviertseva, KhPI
 * LW2
 * Choose a subject according to your number. Develop a service using all your best in OOP and Java collections.
 * Six methods must be written like in the following example. A point for each one.
 */
package com.company;

import java.util.Objects;

public class Ordering implements ICountProfit {
    private int idOrder;
    private double sumOfOrder;
    private double sumOfPrimeCost;
    private int countOfOrder;
//CONSTRUCTORS
    public Ordering() {
    }

    public Ordering(int idOrder, double sumOfOrder, int countOfOrder, double sumOfPriceCost) {
        this.idOrder = idOrder;
        this.sumOfOrder = sumOfOrder;
        this.countOfOrder = countOfOrder;
        this.sumOfPrimeCost =  sumOfPriceCost;
    }
//GETTERS AND SETTERS
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public double getSumOfOrder() {
        return sumOfOrder;
    }

    public void setSumOfOrder(double sumOfOrder) {
        this.sumOfOrder = sumOfOrder;
    }

    public int getCountOfOrder() {
        return countOfOrder;
    }

    public void setCountOfOrder(int countOfOrder) {
        this.countOfOrder = countOfOrder;
    }

    public double getSumOfPriceCost() {
        return sumOfPrimeCost;
    }

    public void setSumOfPrimeCost(double sumOfPrimeCost) {
        this.sumOfPrimeCost = sumOfPrimeCost;
    }
//TO STRING METHOD
    @Override
    public String toString() {
        return "Ordering{" +
                "idOrder=" + idOrder +
                ", sumOfOrder=" + sumOfOrder +
                ", countOfOrder=" + countOfOrder +
                '}';
    }
//EQUALS METHOD
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ordering)) return false;
        Ordering ordering = (Ordering) o;
        return getIdOrder() == ordering.getIdOrder();
    }
//HASHCODE METHOD
    @Override
    public int hashCode() {
        return Objects.hash(getIdOrder());
    }
//IMLEMENTED METHOD TO COUNT PROFIT
    @Override
    public double getProfitPerMonth() {
        return (this.countOfOrder - this.sumOfPrimeCost) * this.countOfOrder;
    }
}