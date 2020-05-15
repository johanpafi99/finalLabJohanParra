package model;

public class Motorcycle extends Vehicle implements GasolineConsume{
	//-------------------------------------------------------
	//Atributes
	//-------------------------------------------------------
	private String type;
	private double tankCapacity;
	private double gasolineConsume;
	
	//-------------------------------------------------------
	//Methods
	//-------------------------------------------------------
	public Motorcycle(double basePrice, double totalPrice, String brand, String model, double displacement, int mileage, int new_use, String plate, int type, double tankCapacity){
		super(basePrice, totalPrice, brand, model, displacement, mileage, new_use, plate);
		this.type = assingType(type);
		this.tankCapacity = tankCapacity;
		this.gasolineComsume = assingGasolineComsume(displacement, tankCapacity);
	}
	
	public String assingType(int type){
		String typeMoto = "";
		if(type==1){ typeMoto = "standard";}
		else if(type==2){ typeMoto = "sport";}
		else if(type==3){ typeMoto = "scooter";}
		else if(type==4){ typeMoto = "cross";}
		else{ typeMoto = "Not especified";}
		return typeMoto;
	}
	
	public double assingGasolineComsume(double displacement, double tankCapacity){
		double gasolineComsume = tankCapacity*(displacement/90);
		return gasolineComsume;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return type;
	}
	
	public void setTankCapacity(double tankCapacity){
		this.tankCapacity = tankCapacity;
	}
	
	public double getTankCapacity(){
		return tankCapacity;
	}
	
	public void setGasolineConsume(double gasolineComsume){
		this.gasolineComsume = gasolineComsume;
	}
	
	public double getGasolineConsume(){
		return gasolineComsume;
	}
}