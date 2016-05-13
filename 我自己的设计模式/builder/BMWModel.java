package builder;

public class BMWModel extends CarModel {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("宝马启动了");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("宝马的喇叭是这个样子的");

	}

	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		System.out.println("宝马响铃了");

	}

	@Override
	public void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("宝马的发动机响了");

	}
}
