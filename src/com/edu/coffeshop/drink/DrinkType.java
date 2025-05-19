package com.edu.coffeshop.drink;

public enum DrinkType {

	CAPPUCCINO(120, 8, 25, "Cappuccino"), LATTE(250, 8, 25,"Latte"), ESPRESSO(0, 8, 25, "Espresso");

	private final int milkAmountPerDrink;
	private final int beansAmountPerDrink;
	private final int waterAmountForDrink;
	private final String name;

	DrinkType(int milkAmountPerDrink, int beansAmountPerDrink, int waterAmountForDrink, String name) {
		this.milkAmountPerDrink = milkAmountPerDrink;
		this.beansAmountPerDrink = beansAmountPerDrink;
		this.waterAmountForDrink = waterAmountForDrink;
		this.name = name;
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
	
	

}
