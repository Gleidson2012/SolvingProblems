package br.com.binPackingProblem;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MultiKnapsackProblemSolverTest {

	@Test
	public void solveProblemWithThreeItemsTotalingWeightEqualsCapacityOfAKnapsack() {
		int capacityOfTheKnapsacks = 20;
		List<Item> items = new ArrayList<Item>();
		items.add(new Item(1, "Item A"));
		items.add(new Item(9, "Item B"));
		items.add(new Item(10, "Item C"));
		MultiKnapsackProblemSolver multiKnapsackProblemSolver = new MultiKnapsackProblemSolver(capacityOfTheKnapsacks,
				items);
		Assertions.assertThat(multiKnapsackProblemSolver.solve()).hasSize(1);
	}

	@Test
	public void solveProblemWithThreeItemsExceedingCapacity() {
		int capacityOfTheKnapsacks = 20;
		List<Item> items = new ArrayList<Item>();
		items.add(new Item(10, "Item A"));
		items.add(new Item(10, "Item B"));
		items.add(new Item(10, "Item C"));
		MultiKnapsackProblemSolver multiKnapsackProblemSolver = new MultiKnapsackProblemSolver(capacityOfTheKnapsacks,
				items);
		List<Knapsack> knapsackList = multiKnapsackProblemSolver.solve();
		Assertions.assertThat(knapsackList).hasSize(2);
	}

	@Test
	public void solveProblemWithFiveItemsExceedingCapacityOfTwoKnapsacks() {
		int capacityOfTheKnapsacks = 20;
		List<Item> items = new ArrayList<>();
		items.add(new Item(20, "Item A"));
		items.add(new Item(19, "Item B"));
		items.add(new Item(2, "Item C"));
		items.add(new Item(1, "Item D"));
		items.add(new Item(5, "Item E"));
		MultiKnapsackProblemSolver multiKnapsackProblemSolver = new MultiKnapsackProblemSolver(capacityOfTheKnapsacks,
				items);
		Assertions.assertThat(multiKnapsackProblemSolver.solve()).hasSize(3);
	}
}
