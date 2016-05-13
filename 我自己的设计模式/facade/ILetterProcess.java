package facade;

public interface ILetterProcess {
	
	public void writeContext(String context);
	
	public void fillEnvelope(String address);
	
	public void letterIntoEnvelope();
	
	public void sendLetter();

}
