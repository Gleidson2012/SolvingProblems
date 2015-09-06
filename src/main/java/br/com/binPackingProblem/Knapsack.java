package br.com.binPackingProblem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Knapsack {

	private int capacity;
	private List<Item> items;

	public Knapsack(int capacity) {
		this.capacity = capacity;
		items = new ArrayList<>();
	}

	public int getCapacity() {
		return capacity;
	}

	public List<Item> getItems() {
		return items;
	}

	public boolean addItem(Item item) {
		if (fits(item)) {
			return items.add(item);
		}
		return false;
	}

	private boolean fits(Item newItem) {
		int weightOfTheItems = newItem.getWeight();
		for (Iterator<Item> iterator = items.iterator(); iterator.hasNext();) {
			Item item = (Item) iterator.next();
			weightOfTheItems += item.getWeight();
		}
		return weightOfTheItems <= capacity;
	}

	@Override
	public String toString() {
		return "capacity: " + capacity + " " + getItems() + " ";
	}
}
