package com.edu.coffeshop.service;

import java.util.Collection;

import com.edu.coffeshop.cafe.*;
import com.edu.coffeshop.machine.*;
import com.edu.coffeshop.drink.*;

public class CoffeeShopService {
	private final CoffeeShop coffeeshop;
	
	public CoffeeShopService(CoffeeShop coffeeshop) {
		this.coffeeshop = coffeeshop;
	}
	
	public void addCoffeeMachine(String id, int waterLevel, int milkLevel,int beans) {
		CoffeeMachine coffeemachine = new CoffeeMachine(id, waterLevel, milkLevel, beans);
		coffeeshop.add(coffeemachine);
	}
	
	public boolean deleteCoffeeMachine(String Id) {
		if(coffeeshop.get(Id) != null) {
			coffeeshop.remove(Id);
			return true;
		}
		return false;
	}
	
	public Drink makeCoffee(String drinkType) {

		Drink drink = new Drink(drinkType);
		String filledMachineId = coffeeshop.findFilledCoffeeMachine(drink.getWaterAmountForDrink(), 
				drink.getBeansAmountPerDrink(), drink.getMilkAmountPerDrink());
		CoffeeMachine coffeeMachine = coffeeshop.get(filledMachineId);
		

		Drink madeDrink = coffeeMachine.makeCoffee(drink.getMilkAmountPerDrink(), drink.getBeansAmountPerDrink(),
				drink.getWaterAmountForDrink(), drinkType);
		return madeDrink;
	}
	
	public void fillWater(int amount, String Id) {
		if(coffeeshop.get(Id) != null) {
			CoffeeMachine coffeeMachine = coffeeshop.get(Id);
			coffeeMachine.fillWater(amount);
		}
	}
	
	public void fillMilk(int amount, String Id) {
		if(coffeeshop.get(Id) != null) {
			CoffeeMachine coffeeMachine = coffeeshop.get(Id);
			coffeeMachine.fillMilk(amount);
		}
	}
	
	public void fillBeans(int amount, String Id) {
		if(coffeeshop.get(Id) != null) {
			CoffeeMachine coffeeMachine = coffeeshop.get(Id);
			coffeeMachine.fillBeans(amount);
		}
	}
	
	public Collection<CoffeeMachine> getAll() {
		return coffeeshop.getAll();
	}
	
	public CoffeeMachine getCoffeeMachine(String id) {
		return coffeeshop.get(id);
	}
}
