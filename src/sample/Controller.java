
package com.company;
public class    Merket{
    private String Name;
    private String Location;
    private int NrStaff;
    private double  ProfitPerYear;
}
Market(String Name,String Location, int NrStaff,double ProfitPerYear){
    this.Name=Name;
    this.Location=Location;
    this.NrStaff=NrStaff;
    this.ProfitPerYear=ProfitPerYear;
}
public getName(){return this.Name;}
public getLocation(){return this.Location;}
public getNrStaff(){return this.NrStaff;}
public getProfitPerYear(){return this.ProfitPerYear;}

public void setName(String Name){this.Name=Name;}
public void setLocation(String Location){this.Location=Location;}
public void setNrStaff(int NrStaff){this.NrStaff;}
public void setProfitPerYear(double ProfitPerYear){this.ProfitPerYear=ProfitPerYear;}