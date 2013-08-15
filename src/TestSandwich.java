import javax.swing.JOptionPane;

public class TestSandwich {

	public static void main(String[] args) {
		/*
		 * This class is a program class.
		 * It WILL include a main() method.
		 * This program should create two instances of
		 * Sandwich, and it should demonstrate the
		 * use of all of the methods encapsulated
		 * in the Sandwich class.
		 * 
		 * Finish off this program by displaying the
		 * values of each of the fields for each 
		 * Sandwich instance.
		 * 
		 */
		
	 //Instanitate 
		Sandwich joshSandwich = new Sandwich();
		Sandwich carolSandwich = new Sandwich();
		
		
	//Set fields
		// My sandwich
		String meatType = JOptionPane.showInputDialog(null, "Josh, what type of meats? ");
		joshSandwich.setMainIngred(meatType);
		
		String breadIge = JOptionPane.showInputDialog(null, "Josh, What kind of bread would you like? ");
		joshSandwich.setBreadType(breadIge);
		
		double totalPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the price of Josh's sandwich? "));
		joshSandwich.setprice(totalPrice);
		
		
		//output the sandwich meat, the bread, and the price
		JOptionPane.showMessageDialog(null, "Josh is having a " + joshSandwich.getMainIngred() + " sandwich on " + joshSandwich.getBreadType()
				+ " bread. It will cost $ " + joshSandwich.getPrice());
		
	
		
		
		
		
		
		
		
		
		//Carols Sandwich
		meatType = JOptionPane.showInputDialog(null, "Carol, what type of meats? ");
		carolSandwich.setMainIngred(meatType);
		
		 breadIge = JOptionPane.showInputDialog(null, "Carol, What kind of bread would you like? ");
		carolSandwich.setBreadType(breadIge);
		
		 totalPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the price Carol's the sandwich? "));
		carolSandwich.setprice(totalPrice);
		
		//output the sandwich meat, bread, and price
		JOptionPane.showMessageDialog(null, "Carol is having a " + carolSandwich.getMainIngred() + " sandwich on " + carolSandwich.getBreadType()
				+ " bread. It will cost $ " + carolSandwich.getPrice());

	
		}
		
		
	
	}


