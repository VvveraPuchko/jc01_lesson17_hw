package com.edu.coffeshop.drink;

public class Drink {
	private final int milkAmountPerDrink;
	private final int beansAmountPerDrink;
	private final int waterAmountForDrink;
	private final String name;
	
	public Drink() {
		this.milkAmountPerDrink = 0;
		this.beansAmountPerDrink = 0;
		this.waterAmountForDrink = 0;
		this.name = "0";
	}

	public Drink(String drink) {
		DrinkType drinktype = DrinkType.valueOf(drink);
		this.milkAmountPerDrink = drinktype.getMilkAmountPerDrink();
		this.beansAmountPerDrink = drinktype.getBeansAmountPerDrink();
		this.waterAmountForDrink = drinktype.getWaterAmountForDrink();
		this.name = drinktype.getName();
	}
	
	public int getMilkAmountPerDrink() {
		return milkAmountPerDrink;
	}

	public int getBeansAmountPerDrink() {
		return beansAmountPerDrink;
	}

	public int getWaterAmountForDrink() {
		return waterAmountForDrink;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Drink [milkAmountPerDrink=" + milkAmountPerDrink + ", beansAmountPerDrink=" + beansAmountPerDrink
				+ ", waterAmountForDrink=" + waterAmountForDrink + ", name=" + name + "]";
	}

}
