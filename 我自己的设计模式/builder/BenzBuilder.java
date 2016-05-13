package builder;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
	
	BenzModel benz=new BenzModel();

	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.benz.setSequence(sequence);

	}

	@Override
	public CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.benz;
	}

}
