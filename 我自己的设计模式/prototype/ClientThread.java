package prototype;

import java.util.Random;

public class ClientThread implements Runnable {
	
	private static int MAX_COUNT = 1000;
	private static int COUNT=0;
	Mail mail = new Mail(new AdvTemplate());
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while (i < MAX_COUNT) {
			Mail mailclone=mail.clone();
			mailclone.setTail("�й����а�Ȩ����");
			mailclone.setAppellation(getRandString(5) + "  ����/Ůʿ");
			mailclone.setReceiver(getRandString(8) + "@" + getRandString(5));
			sendMail(mailclone);
			System.out.println(i);
			i++;
			
		}

	}


	public static void sendMail(Mail mail) {
		System.out.println("���⣺" + mail.getSubject() + "\t�ռ���" + mail.getReceiver() + ".com" + "\t���ͳɹ�����");
	}

	public static String getRandString(int StringLength) {
		String source = "abcdefghijklmnopqrstABCDEFGHIJKLMNOPQRST";
		StringBuffer sb = new StringBuffer();
		Random random = new Random();

		for (int i = 0; i < StringLength; i++) {
			sb.append(source.charAt(random.nextInt(source.length())));
		}

		return sb.toString();

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientThread client1=new ClientThread();
		ClientThread client2=new ClientThread();
		
		Thread clientThread1=new Thread(client1);
		Thread clientThread2=new Thread(client2);
		
		clientThread1.start();
		clientThread2.start();
		
		
		

	}
	


}
