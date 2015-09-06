package br.com.binPackingProblem;

public class Item {
	private int weight;
	private String name;

	public Item(int weight, String name) {
		this.weight = weight;
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + " Weight: " + getWeight();
	}

	public String getName() {
		return name;
	}

}
