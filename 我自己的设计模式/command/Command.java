package command;

public abstract class Command {
	protected RequirementGroup rg=new RequirementGroup();
	protected PageGroup pg=new PageGroup();
	public abstract void execute();

}
