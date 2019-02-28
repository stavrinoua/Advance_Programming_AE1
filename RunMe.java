//import java.util.ArrayList;

/*
 * Adamos Stavrinos
 * Advance Programming, Asset Exercise 1, 2019
 * 
 * Simulation of Trains and Tracks
 */
public class RunMe {
	static Railway[] route = new Railway[7];

	public static void main(String[] args) {

		route[0] = new Station("Glasgow", 3);
		route[1] = new Track("Track", 1);
		route[2] = new Station("Stirling", 2);
		route[3] = new Track("Track", 1);
		route[4] = new Station("Perth", 2);
		route[5] = new Track("Track", 1);
		route[6] = new Station("Inverness", 2);
		Train.route = route;

		Controller controller = new Controller();
		Thread t = new Thread(controller);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Railway[] getRoute() {
		return route;
	}

	public void setRoute(Railway[] route) {
		RunMe.route = route;
	}

}
