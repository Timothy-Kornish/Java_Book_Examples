
public class Car {
	private int year;
	private String make, model;
	private boolean antique;

	public Car(String manufacturer, String carModel, int carYear, boolean isAntique){
		make =manufacturer;
		model = carModel;
		year=carYear;
		antique =isAntique;
	}
	
	//--------get---------
	public String getMake(){
		return make;
	}
	public String getModel(){
		return model;
	}
	public int getYear(){
		return year;
	}
	
	//---------set----------
	public void setMake(String newMake){
		make = newMake;
	}
	public void setModel(String newModel){
		model = newModel;
	}
	public void setYear(int newYear){
		year=newYear;
	}
	
	//---------isAntique-----
	public boolean isAntique(){
		
		return antique;
	}
	public String toString(){
		String description= year+"\t "+make+"\t "+model ;
		
		return description;
	}
	
	
}
