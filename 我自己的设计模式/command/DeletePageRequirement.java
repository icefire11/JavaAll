package command;

public class DeletePageRequirement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoker xiaosan=new Invoker();
		System.out.println("客户要求增加一项需求");
		Command command=new DeletePageCommand();
		
		xiaosan.setCommand(command);
		
		xiaosan.action();


	}

}
