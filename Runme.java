/*
 * Advance Programming, Asset Exercise 1, 2019
 * 
 * Simulation of Trains and Tracks
 * by Professor Simon Rogers
 * 
 * Student: Adamos Stavrinos
 */
public class Runme {

	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.start();
		try {
			controller.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}// End of try/catch
	}// End of main

}// End of RunMe
