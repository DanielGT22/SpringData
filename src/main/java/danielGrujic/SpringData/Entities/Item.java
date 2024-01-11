// Item.java
package danielGrujic.SpringData.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table
@NoArgsConstructor
public abstract class Item {

	@Id
	@GeneratedValue
	private long id;

	protected String name; // Adding name attribute

	protected int calories;
	protected double price;

	public Item(String name, int calories, double price) {
		this.name = name;
		this.calories = calories;
		this.price = price;
	}

	public String getName() {
		return name;
	}
}
