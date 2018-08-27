package main;

public class Convert {
	public static double Convert(int tool, int sens, double val) { 
		double tauxMK=1.60934;
		if (tool == 1) { //Température
			if ((sens == 1) && (val<=500) && (val>=-100)) { //Celsius vers Fahrenheit
				return (1.8 * val) + 32;
			} 
			else if ((sens == 2) && (val<=500) && (val>=-100)) { //Fahrenheit vers Celsius
				return (val - 32) / 1.8;
			}
			else {
				return 0;
			}
		} 
		
		else if (tool == 2) { //Distance
			if (val>0) {
				if (sens == 1) { //Miles vers Km
					return val * tauxMK;
				} 
				else if (sens == 2) { //Km vers Miles
					return val / tauxMK;
				}
				else {
					return 0;
				}
			}
			else {
				return 0;
			}
		}
		else {
			return 0;
		}
}
}