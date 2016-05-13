package facade;

public class LetterProcessImpl implements ILetterProcess {

	@Override
	public void writeContext(String context) {
		// TODO Auto-generated method stub
		System.out.println("信的内容是："+context);

	}

	@Override
	public void fillEnvelope(String address) {
		// TODO Auto-generated method stub
		System.out.println("填写信的地址："+address);

	}

	@Override
	public void letterIntoEnvelope() {
		// TODO Auto-generated method stub
		System.out.println("把信装到信封..");

	}

	@Override
	public void sendLetter() {
		// TODO Auto-generated method stub
		System.out.println("把信送出去。、、。");

	}

}
