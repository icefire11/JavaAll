package prototype;

import java.util.Random;

public class Client {
	private static int MAX_COUNT = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("中国银行版权所有");

		while (i < MAX_COUNT) {
			Mail mailclone=mail.clone();
			mailclone.setAppellation(getRandString(5) + "  先生/女士");
			mailclone.setReceiver(getRandString(8) + "@" + getRandString(5));
			sendMail(mailclone);
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

}
