package command;

public class AddRequirementClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoker xiaosan=new Invoker();
		System.out.println("�ͻ�Ҫ������һ������");
		Command command=new AddRequirementCommand();
		
		xiaosan.setCommand(command);
		
		xiaosan.action();

	}

}
