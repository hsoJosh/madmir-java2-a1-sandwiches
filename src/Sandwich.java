
public class Sandwich {

	/* 
	 * This is the Sandwich class.
	 * This is an object class.
	 * There will be no main() method here
	 * Instead, you will declare variables to create
	 * the object's "fields", and then add methods 
	 * to retrieve or change the value of each field.
	 * 
	 */
	
	//declaring variables 
	static String mainIngred;
	static String breadType;
	static Double price;
	
	public String getMainIngred() {
		return mainIngred;
	}
	
	public String getBreadType() {
		return breadType;
	}

	public Double getPrice() {
		return price;
	}
	
	public void setMainIngred(String newMainIngred) {
		mainIngred = newMainIngred;
	}
	
	public void setBreadType(String newBreadType) {
		breadType = newBreadType;		
	}
	
	public void setprice(Double newPrice){
		price = newPrice;
	}
	
}
