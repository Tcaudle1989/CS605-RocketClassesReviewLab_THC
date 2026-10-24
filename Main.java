/**
 * @author Nathan Johnson,2024
 *
 */

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int fuelWeight;
		int fuelUsePSec;
		
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter Fuel Weight in Pounds:");
		fuelWeight=scnr.nextInt();
		System.out.println("Enter Fuel Use Per Second in Pounds:");
		fuelUsePSec=scnr.nextInt();
		scnr.nextLine();
		System.out.println("Enter Captain's name:");
		String capName=scnr.nextLine();
		System.out.println("Enter Navigator's name:");
		String navName=scnr.nextLine();
		System.out.println("Enter Engineer's name:");
		String engName=scnr.nextLine();
        
        //The following steps will help you write and test the
        //Engine and FuelTank classes.
        //After you test the classes, comment the code out again.

		//STEP 1: Write FuelTank Class to spec. Uncomment following line to test:
        //FuelTank ft=new FuelTank(100000);
        //The first two unit tests can complete
		
        //STEP 2: Write Engine Class to spec. Test with following:
        //Engine eng=new Engine(10000);
        //The next two unit tests can complete

        //STEP 3: When the first two steps pass tests uncomment the
        //following and write your Rocket Class
        
        Rocket rk=new Rocket(fuelWeight,fuelUsePSec,capName,navName,engName);
		System.out.print("\n");
		System.out.print(rk.toString());
		System.out.print("\n\n");
		System.out.print("Rocket Status"+"\n");
		System.out.print(rk.getEng().toString()+"\n");
		System.out.print(rk.getfTank().toString()+"\n");
		
		int burnTime=rk.launch();
		if (burnTime == -1) {
			System.out.println("Launch aborted!");
		}
		
		else {
			System.out.println("\nLaunch!\n\n" + "Houston, we predict MICO in " 
		+ burnTime + " seconds" + "\n\n");
			System.out.println("Rocket Status");
			System.out.println(rk.getEng().toString());
			System.out.println(rk.getfTank().toString());
		}
		
        /*****

        //STEP 4: READ THE FOLLOWING INSTRUCTIONS

		/**********************************************************
        Student should write code here for the following:
        If launch returns an error code as specified, print:
        Launch aborted!
        Otherwise print the following: (I have coded the first line for you)
        \nLaunch!\n\n"+ "Houston, we predict MICO in "+ burnTime +" seconds"+"\n\n"
        Rocket Status
        <Engine toString()>
        <fTank toString()>
        ***********************************************************/
		
	}

}
