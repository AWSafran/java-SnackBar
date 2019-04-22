package snackBar;

public class Machine
{
	private static int maxId = 0;
	private int id;
	private String name;

	public Machine(String name)
	{
		maxId++;
		id = maxId;
		this.name = name;
	}

	//setters

	public void setId(int id)
	{
		this.id = id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	//getters

	public int getId()
	{
		return this.id;
	}

	public String getName()
	{
		return this.name;
	}
}