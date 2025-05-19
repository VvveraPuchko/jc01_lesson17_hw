package com.edu.coffeshop.cafe;


import java.util.Collection;

import java.util.HashMap;
import java.util.Map;

import com.edu.coffeshop.machine.CoffeeMachine;

public class CoffeeShop {
	private final Map<String, CoffeeMachine> coffeeMachines = new HashMap<>();
	
	public String findFilledCoffeeMachine(int water, int beans, int milk) {
	    for (CoffeeMachine coffeeMachine : coffeeMachines.values()) {
	        if (coffeeMachine.getWaterLevel() >= water &&
	            coffeeMachine.getBeans() >= beans &&
	            coffeeMachine.getMilkLevel() >= milk) {
	            
	            return coffeeMachine.getId(); 
	        }
	    }

	    throw new RuntimeException("There is no filled coffee machine.");
	}

	
	public void add(CoffeeMachine machine) {
		coffeeMachines.put(machine.getId(), machine);
	}
	
	public void remove(String Id) {
		coffeeMachines.remove(Id);
	}
	
	public CoffeeMachine get(String Id) {
		return coffeeMachines.get(Id);
	}
	
	public Collection<CoffeeMachine> getAll(){
		return coffeeMachines.values();
	}

}
