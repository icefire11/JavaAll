package facade;

public class LetterProcessImpl implements ILetterProcess {

	@Override
	public void writeContext(String context) {
		// TODO Auto-generated method stub
		System.out.println("�ŵ������ǣ�"+context);

	}

	@Override
	public void fillEnvelope(String address) {
		// TODO Auto-generated method stub
		System.out.println("��д�ŵĵ�ַ��"+address);

	}

	@Override
	public void letterIntoEnvelope() {
		// TODO Auto-generated method stub
		System.out.println("����װ���ŷ�..");

	}

	@Override
	public void sendLetter() {
		// TODO Auto-generated method stub
		System.out.println("�����ͳ�ȥ��������");

	}

}
