package br.com.binPackingProblem;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class KnapsackTest {

	@Test
	public void getCapacityMethod() {
		Knapsack knapsack = new Knapsack(20);
		Assertions.assertThat(knapsack.getCapacity()).isEqualTo(20);
	}

	@Test
	public void getItemsMethod() throws Exception {
		Knapsack knapsack = new Knapsack(50);
		Assertions.assertThat(knapsack.getItems()).hasSize(0);
	}

	@Test
	public void addItemMethod() {
		Knapsack knapsack = new Knapsack(50);
		Assertions.assertThat(knapsack.addItem(new Item(25, "Item A"))).isTrue();
		Assertions.assertThat(knapsack.addItem(new Item(25, "Item B"))).isTrue();
		Assertions.assertThat(knapsack.addItem(new Item(1, "Item C"))).isFalse();
		Assertions.assertThat(knapsack.getItems()).hasSize(2);
	}

}
