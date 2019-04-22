package snackBar;

public class Main
{
	public static void main(String[] args)
	{
		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		Machine food = new Machine("Food");
		Machine drink = new Machine("Drink");
		Machine office = new Machine("Office");

		//public Snack(String name, int quantity, double cost, int machineId)
		Snack chips = new Snack("Chips", 36, 1.75, food.getId());
		Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
		Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

		Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
		Snack water = new Snack("Water", 20, 2.75, drink.getId());

		System.out.println("Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.");
		jane.spendCash(soda.getTotalCost(3));
		soda.buySnack(3);

		System.out.println(jane.getName() + " cash remaining: $" + jane.getCash());
		System.out.println(soda.getName() + " quantity remaining: " + soda.getQuantity() + "\n");

		System.out.println("Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.");
		jane.spendCash(pretzel.getTotalCost(1));
		pretzel.buySnack(1);

		System.out.println(jane.getName() + " cash remaining: $" + jane.getCash());
		System.out.println(pretzel.getName() + " quantity remaining: " + pretzel.getQuantity() + "\n");

		System.out.println("Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.");
		bob.spendCash(soda.getTotalCost(2));
		soda.buySnack(2);

		System.out.println(bob.getName() + " cash remaining: $" + bob.getCash());
		System.out.println(soda.getName() + " quantity remaining " + soda.getQuantity() + "\n");

		System.out.println("Customer 1 finds $10. Print Customer 1 Cash on Hand.");

		jane.addCash(10);
		System.out.println(jane.getName() + " cash remaining: $" + jane.getCash() + "\n");

		System.out.println("Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.");

		jane.spendCash(chocolateBar.getTotalCost(1));
		chocolateBar.buySnack(1);

		System.out.println(jane.getName() + " cash remaining: $" + jane.getCash() + "\n");
		System.out.println(chocolateBar.getName() + " quantity remaining " + chocolateBar.getQuantity());

		System.out.println("Add 12 more items to snack 3. Print quantity of snack 3");

		pretzel.addQuantity(12);
		System.out.println(pretzel.getName() + " quantity remaining: " + pretzel.getQuantity() + "\n");

		System.out.println("Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.");

		bob.spendCash(pretzel.getTotalCost(3));
		pretzel.buySnack(3);

		System.out.println(bob.getName() + " cash remaining: $" + bob.getCash());
		System.out.println(pretzel.getName() + " quantity remaining " + pretzel.getQuantity() + "\n");

		System.out.println(chips.toString());
		System.out.println(chocolateBar.toString());
		System.out.println(pretzel.toString());
		System.out.println(soda.toString());
		System.out.println(water.toString());



	}
}