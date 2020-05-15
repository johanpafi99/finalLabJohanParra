package model;

import ui.*;
import java.util.ArrayList;

public class Company{
	//-------------------------------------------------------
	//Constants
	//-------------------------------------------------------
	public final static int NUMSELLERS = 10;
	
	//-------------------------------------------------------
	//Atributes
	//-------------------------------------------------------
	private String name;
	private String nit;
	private double profits;
	private int sales;
	
	//-------------------------------------------------------
	//Relations
	//-------------------------------------------------------
	private Seller[] sellers;
	private ArrayList<Vehicle> catalogue;
	
	//-------------------------------------------------------
	//Methods
	//-------------------------------------------------------
	public Company(String name, String nit){
		this.name = name;
		this.nit = nit;
		profits = 0;
		sales = 0;
		sellers = new Seller[NUMSELLERS];
		catalogue = new ArrayList<Vehicle>();
	}
	
	public String addVehicle(){
		String message = "";
		
		return message;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setNit(String nit){
		this.nit = nit;
	}
	
	public String getNit(){
		return nit;
	}
	
	public void setProfits(double profits){
		this.profits = profits;
	}
	
	public double getProfits(){
		return profits;
	}
	
	public void setSales(int sales){
		this.sales = sales;
	}
	
	public int getSales(){
		return sales;
	}
}