package builder;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Direct direct = new Direct();

		for (int i = 0; i < 1000; i++) {
			direct.getABenzCar().run();
		}
		for (int i = 0; i < 1000; i++) {
			direct.getBBenzCar().run();
		}
		for (int i = 0; i < 1000; i++) {
			direct.getABMWCar().run();
		}
		for (int i = 0; i < 1000; i++) {
			direct.getBBMWCar().run();
		}

	}

}
