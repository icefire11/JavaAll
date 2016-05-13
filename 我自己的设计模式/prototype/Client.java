package prototype;

import java.util.Random;

public class Client {
	private static int MAX_COUNT = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("�й����а�Ȩ����");

		while (i < MAX_COUNT) {
			Mail mailclone=mail.clone();
			mailclone.setAppellation(getRandString(5) + "  ����/Ůʿ");
			mailclone.setReceiver(getRandString(8) + "@" + getRandString(5));
			sendMail(mailclone);
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

}
