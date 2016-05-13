package facade;

public class Facade {
	private LetterProcessImpl letterProcess=new LetterProcessImpl();
	CheckLetter checkLetter=new CheckLetter();
	
	public void sendLetter(String context,String address){
		letterProcess.writeContext(context);
		
		letterProcess.fillEnvelope(address);
		checkLetter.checkLetter(letterProcess);
		
		letterProcess.letterIntoEnvelope();
		
		letterProcess.sendLetter();
		
	}

}
