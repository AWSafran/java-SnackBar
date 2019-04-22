package snackBar;

public class Snack
{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int machineId;

	public Snack(String name, int quantity, double cost, int machineId)
	{
		maxId ++;
		id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.machineId = machineId;	
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

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public void setMachineId(int id)
	{
		this.id = id;
	}

	//getters

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public double getCost()
	{
		return cost;
	}

	public int getMachineId()
	{
		return machineId
	}

	public int getQuantity()
	{
		return quantity;
	}

	//Other methods

	public void addQuantity(int addedAmount)
	{
		quantity += addedAmount;
	}

	public void buySnack(int purchasedAmount)
	{
		quantity -+ purchasedAmount;
	}

	public double getTotalCost(int quantityPurchased)
	{
		return cost * quantityPurchased;
	}
}