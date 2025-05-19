package com.edu.coffeshop.machine;

import com.edu.coffeshop.drink.*;
import java.util.Objects;

public class CoffeeMachine {
	private final String id;
	private int waterLevel;
	private int milkLevel;
	private int beans;
	
	public CoffeeMachine() {
		this.id = "0";
		this.waterLevel = 0;
		this.milkLevel = 0;
		this.beans = 0;
	}

	public CoffeeMachine(String id, int waterLevel, int milkLevel,int beans) {
		this.id = id;
		this.waterLevel = waterLevel;
		this.milkLevel = milkLevel;
		this.beans = beans;

	}

	public int getWaterLevel() {
		return waterLevel;
	}

	public void setWaterLevel(int waterLevel) {
		this.waterLevel = waterLevel;
	}

	public int getMilkLevel() {
		return milkLevel;
	}

	public void setMilkLevel(int milkLevel) {
		this.milkLevel = milkLevel;
	}

	public int getBeans() {
		return beans;
	}

	public void setBeans(int beans) {
		this.beans = beans;
	}

	public String getId() {
		return id;
	}
	
	public void fillWater(int amount) {
		waterLevel = waterLevel + amount;
	}
	
	public void fillMilk(int amount) {
		milkLevel = milkLevel + amount;
	}
	
	public void fillBeans(int amount) {
		beans = beans + amount;
	}
	
	public boolean isEmptyWater() {
		return waterLevel <= 0;
	}
	
	public boolean isEmptyMilk() {
		return milkLevel <= 0;
	}
	
	public boolean isEmptyBeans() {
		return beans <= 0;
	}
	
	public Drink makeCoffee(int milkAmount, int beans, int waterAmount, String DrinkType) {
		if (milkAmount > this.milkLevel)  {
			throw new RuntimeException("Not enough milk");
		} else if (beans > this.beans) {
			throw new RuntimeException("Not enough beans");
		} else if (waterAmount > this.waterLevel) {
			throw new RuntimeException("Not enough water");
		} else {
			this.waterLevel = this.waterLevel - waterAmount;
			this.milkLevel = this.milkLevel - milkAmount;
			this.beans = this.beans - beans;
			return new Drink(DrinkType);
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(beans, id, milkLevel, waterLevel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CoffeeMachine other = (CoffeeMachine) obj;
		return beans == other.beans && Objects.equals(id, other.id) && milkLevel == other.milkLevel
				&& waterLevel == other.waterLevel;
	}

	@Override
	public String toString() {
		return "CoffeeMachine [id=" + id + ", waterLevel=" + waterLevel + ", milkLevel=" + milkLevel + ", beans="
				+ beans + "]";
	}
	
	
}
