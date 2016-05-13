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
			mailclone.setTail("中国银行版权所有");
			mailclone.setAppellation(getRandString(5) + "  先生/女士");
			mailclone.setReceiver(getRandString(8) + "@" + getRandString(5));
			sendMail(mailclone);
			System.out.println(i);
			i++;
			
		}

	}


	public static void sendMail(Mail mail) {
		System.out.println("标题：" + mail.getSubject() + "\t收件人" + mail.getReceiver() + ".com" + "\t发送成功！！");
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
