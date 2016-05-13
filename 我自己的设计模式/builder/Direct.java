package builder;

import java.util.ArrayList;

public class Direct {

	ArrayList<String> sequence = new ArrayList<String>();

	public CarModel getABenzCar() {
		this.sequence.clear();

		sequence.add("start");

		sequence.add("alarm");

		sequence.add("engineBoom");

		sequence.add("stop");

		BenzBuilder benzbuiler = new BenzBuilder();
		benzbuiler.setSequence(sequence);

		return benzbuiler.benz;

	}

	public CarModel getBBenzCar() {
		this.sequence.clear();

		sequence.add("start");

		sequence.add("engineBoom");

		sequence.add("alarm");

		sequence.add("stop");

		BenzBuilder benzbuiler = new BenzBuilder();
		benzbuiler.setSequence(sequence);

		return benzbuiler.benz;

	}

	public CarModel getABMWCar() {
		this.sequence.clear();

		sequence.add("start");

		sequence.add("alarm");

		sequence.add("engineBoom");

		sequence.add("stop");

		BMWBuilder bmwbuiler = new BMWBuilder();
		bmwbuiler.setSequence(sequence);

		return bmwbuiler.bmw;

	}

	public CarModel getBBMWCar() {
		this.sequence.clear();

		sequence.add("start");

		sequence.add("engineBoom");

		sequence.add("alarm");

		sequence.add("stop");

		BMWBuilder bmwbuiler = new BMWBuilder();
		bmwbuiler.setSequence(sequence);

		return bmwbuiler.bmw;

	}

}
