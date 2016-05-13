package prototype;

public class Mail implements Cloneable {
	
	private String receiver;
	
	@Override
	protected Mail clone(){
		// TODO Auto-generated method stub
		Mail mail=null;
		try {
			mail =(Mail) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mail;
	}

	private String subject;
	
	private String contex;
	
	private String appellation;
	
	private String tail;
	
	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContex() {
		return contex;
	}

	public void setContex(String contex) {
		this.contex = contex;
	}

	public String getAppellation() {
		return appellation;
	}

	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}

	public Mail(AdvTemplate adv){
		this.subject=adv.getSubject();
		this.contex=adv.getContex();
	}
	
	

}
