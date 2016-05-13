package observ;

import java.util.ArrayList;

public class HanFeiZi implements IHanFei, Observable {
	ArrayList<Observer> observerList=new ArrayList<Observer>();
	

	@Override
	public void addObserver(Observer observer) {
		this.observerList.add(observer);

	}

	@Override
	public void deleteObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.observerList.remove(observer);

	}

	@Override
	public void notifyObservers(String context) {
		// TODO Auto-generated method stub
		for(Observer observer:observerList){
			observer.update(context);
		}

	}

	@Override
	public void havaBreakfast() {
		// TODO Auto-generated method stub
		System.out.println("韩非子在吃饭。、。。");
		this.notifyObservers("韩非子在吃饭。、。。");

	}

	@Override
	public void haveFun() {
		// TODO Auto-generated method stub
		System.out.println("韩非子在玩。、。。");
		this.notifyObservers("韩非子在玩。、。。");

	}

}
