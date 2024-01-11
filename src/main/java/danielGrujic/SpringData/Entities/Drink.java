package danielGrujic.SpringData.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class Drink extends Item {
	@Id
	@GeneratedValue
	private long id;


	public Drink(String name, int calories, double price) {
		super(name, calories, price);

	}

	@Override
	public String toString() {
		return "Drink{" +
				"name='" + name + '\'' +
				", calories=" + calories +
				", price=" + price +
				'}';
	}
}
