package br.com.binPackingProblem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultiKnapsackProblemSolver {
	private int capacityOfTheBins;
	private List<Item> items;

	public static void main(String[] args) {
	}

	public MultiKnapsackProblemSolver(int capacityOfTheBin, List<Item> items) {
		this.capacityOfTheBins = capacityOfTheBin;
		this.items = items;
	}

	public List<Knapsack> solve() {
		List<Knapsack> knapsacksList = new ArrayList<Knapsack>();
		knapsacksList.add(new Knapsack(capacityOfTheBins));

		int index = 0;
		for (Iterator<Item> iterator = items.iterator(); iterator.hasNext();) {
			Item item = (Item) iterator.next();
			if (!knapsacksList.get(index).addItem(item)) {
				Knapsack knapsack = new Knapsack(capacityOfTheBins);
				knapsack.addItem(item);
				knapsacksList.add(knapsack);
				++index;
			}
		}
		return knapsacksList;
	}

}
