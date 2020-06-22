/*
 * StandartLunch
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

public class StandartLunch implements ICountProfit {
    private int id;
    private String nameLunh;
    private double cost;
    private double primeCost;
    private int numberOfSold;
//CONSTRUCTORS
    public StandartLunch() {
    }

    public StandartLunch(int id, String nameLunh, double coast, int numberOfSold,double primeCost) {
        this.id = id;
        this.nameLunh = nameLunh;
        this.cost = coast;
        this.numberOfSold = numberOfSold;
        this.primeCost = primeCost;
    }
//GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameLunh() {
        return nameLunh;
    }

    public void setNameLunh(String nameLunh) {
        this.nameLunh = nameLunh;
    }

    public double getCoast() {
        return cost;
    }

    public void setCoast(double coast) {
        this.cost = coast;
    }

    public int getNumberOfSold() {
        return numberOfSold;
    }

    public void setNumberOfSold(int numberOfSold) {
        this.numberOfSold = numberOfSold;
    }
    public double getPrimeCost() {
        return primeCost;
    }

    public void setPrimeCost(double primeCost) {
        this.primeCost = primeCost;
    }

//Equals Method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StandartLunch)) return false;
        StandartLunch that = (StandartLunch) o;
        return getId() == that.getId();
    }
//HashCode Method
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
//TO STRING mETHOD
    @Override
    public String toString() {
        return "StandartLunch{" +
                "id=" + id +
                ", nameLunh='" + nameLunh + '\'' +
                ", coast=" + cost +
                ", numberOfSold=" + numberOfSold +
                '}';
    }
//IMPLEMENTED METHOD TO COUNT PROFIT
    @Override
    public double getProfitPerMonth() {
        return (this.cost - this.primeCost) * this.numberOfSold;
    }
}

