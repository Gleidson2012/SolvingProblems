package br.com.binPackingProblem;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ItemTest {

	@Test
	public void test() {
		Item item = new Item(1, "Item A");
		Assertions.assertThat(item.getWeight()).isEqualTo(1);
	}

}
