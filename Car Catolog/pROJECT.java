/*
Author: Christina and Carson
Date: March-May

Car catalog
*/
import java.util.Scanner;

class pROGECT {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[][] carCatalog = {
			{"Porsche", 
			
				"911 Gt3-\n" +
			"\t\tMax power: 500 hp\n" +
			"\t\t0-60 mph: 3.8 sec\n" +
			"\t\tFuel tank: 16.9 gal\n" +
			"\t\tTop track speed: 198 mph\n" +
			"\t\tEngine: Flat-6\n" +
			"\t\tMSRP: From $143,600.00* \n", 
			
			"911 Carrera S- \n" +
			"\t\tMax power: 443 hp\n" +
			"\t\t0-60 mph: 3.5 sec\n" +
			"\t\tFuel tank: 16.9 gal\n" +
			"\t\tTop track speed: 191 mph\n" +
			"\t\tEngine: 3.0 L 6-cylinder\n" +
			"\t\tMSRP: From $113,300.00* \n", 
			
				"911 GT2RS-\n" +
			"\t\tMax power: 690 hp\n" +
			"\t\t0-60 mph: 2.7 sec\n" +
			"\t\tFuel tank: 23.7 gal\n" +
			"\t\tTop track speed: 211 mph\n" +
			"\t\tEngine: 3.8 L 6-cylinder\n" +
			"\t\tMSRP: From $293,200.00* \n",
			
				"Panamera-\n" +
			"\t\tMax power: 330 hp\n" +
			"\t\t0-60 mph: 5.4 sec\n" +
			"\t\tFuel tank: 23.7 gal\n" +
			"\t\tTop track speed: 164 mph\n" +
			"\t\tEngine: 2.9 L V6		\n" +	
			"\t\tMSRP: From $86,300.00* "},
			
		
			
			{"Rolls Royce", 
				"Phantom-\n" +
			"\t\tMax power: 563_hp\n" +
			"\t\t0-60 mph: 5.1 sec\n" +
			"\t\tFuel tank: 23.8 gal\n" +
			"\t\tTop track speed: 249 mph\n" +
			"\t\tEngine: 6.8 L V12\n" +
			"\t\tMSRP: From $452,750.00* \n",
			
				"Ghost-\n" +
			"\t\tMax power: 563 hp\n" +
			"\t\t0-60 mph: 4.8 sec\n" +
			"\t\tFuel tank: 21.8 gal\n" +
			"\t\tTop track speed: 155.3 mph\n" +
			"\t\tEngine: 6.6 L V12\n" +
			"\t\tMSRP: From $311,900.00* \n",
			
				"Cullinan-\n" +
			"\t\tMax power: 563 hp\n" +
			"\t\t0-60: 6.7 sec\n" +
			"\t\tFuel tank: 26.4 gal\n" +
			"\t\tTop track speed: 155 mph\n" +
			"\t\tEngine: 6.8 L V12\n" +
			"\t\tMSRP: From $325,000.00* \n",
			
				"Wraith-\n" +
			"\t\tMax power: 624 hp\n" +
			"\t\t0-60: 4.2 sec\n" +
			"\t\tFuel tank: 21.9 gal\n" +
			"\t\tTop track speed: 186 mph\n" +
			"\t\tEngine: 6.6 L V12\n" +
			"\t\tMSRP: From $320,500.00* "},
			
			{"Lamborghini", 
			
				"Aventador S-\n" +
			"\t\tMax power: 729 hp\n" +
			"\t\t0-60: 2.7 sec\n" +
			"\t\tFuel tank: 22.5 gal\n" +
			"\t\tTop track speed: 217 mph\n" +
			"\t\tEngine: 6.5 L V12\n" +
			"\t\tMSRP: From $417,650.00* \n",
			
				"Huracan Performante-\n" +
			"\t\tMax power: 630 hp\n" +
			"\t\t0-60: 2.4 sec\n" +
			"\t\tFuel tank: 21.1 gal\n" +
			"\t\tTop track speed: 202 mph\n" +
			"\t\tEngine: 5.2 L V10\n" +
			"\t\tMSRP: From $261,274.00* \n",
			
				"Urus-\n" +
			"\t\tMax power: 641 hp\n" +
			"\t\t0-60: 3.4 sec\n" +
			"\t\tFuel tank: 19.8 gal\n" +
			"\t\tTop track speed: 190 mph\n" +
			"\t\tEngine: 4.0 L V8\n" +
			"\t\tMSRP: From $200,00.00* \n",
			
				"Centenario-\n" +
			"\t\tMax power: 750 hp\n" +
			"\t\t0-60: 2.8 sec\n" +
			"\t\tFuel tank: 20.2 gal\n" +
			"\t\tTop track speed: 217 mph\n" +
			"\t\tEngine: V12\n" +
			"\t\tMSRP: From $1.75 million* "},
			
			{"Bently",
			
			"\t\tContiental GT-\n" +
			"\t\tMax power: 500-700 hp\n" +
			"\t\t0-60: 4.5 sec\n" +
			"\t\tFuel tank: 24 gal\n" +
			"\t\tTop track speed: 207 mph\n" +
			"\t\tEngine: 4.0 L V8, 6.0 L V12\n" +
			"\t\tMSRP: From $218,400.00* \n",
		
				"Flying Spur-\n" +
			"\t\tMax power: 616 hp\n" +
			"\t\t0-60: 4.3 sec\n" +
			"\t\tFuel tank: 23.8 gal\n" +
			"\t\tTop track speed: 199 mph\n" +
			"\t\tEngine: 4.0 L V8, 6.0 L V12\n" +
			"\t\tMSRP: From $205,00.00* \n",
			
				"Mulsanne-\n" +
			"\t\tMax power: 506 hp\n" +
			"\t\t0-60: 5.1 sec\n" +
			"\t\tFuel tank: 25.4 gal\n" +
			"\t\tTop track speed: 184 mph\n" +
			"\t\tEngine: 6.8 L V8\n" +
			"\t\tMSRP: From $304,670.00* \n",
			
				"Bentayaga-\n" +
			"\t\tMax power: 600 hp\n" +
			"\t\t0-60: 3.5 sec\n" +
			"\t\tFuel tank: 22.5 gal\n" +
			"\t\tTop track speed: 190 mph\n" +
			"\t\tEngine: 6.0 L V12\n" +
			"\t\tMSRP: From $167,725.00* "}};

		
		int size = 0;
		
		System.out.println("Brands:");
		
		for (int i = 0; i < carCatalog.length; i++) {
			System.out.print("\t" + (i+1) + ") " + carCatalog[i][0] + "\n");
		}
		
		System.out.print("Type the number for the brand above to get information: ");
		int carType = input.nextInt() - 1;
		
		for (int i = 1; i < carCatalog[carType].length; i++){
			System.out.print("\t" + i + ") " + carCatalog[carType][i] + "\n");
		}
	}
}