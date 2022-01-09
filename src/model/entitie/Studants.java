package model.entitie;

import java.util.Objects;

public class Studants {
	
	private Integer number;
	private String name;
	
	public Studants(Integer number, String name) {
		this.number = number;
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studants other = (Studants) obj;
		return Objects.equals(number, other.number);
	}

	@Override
	public String toString() {
		return "Studants [number=" + number + ", name=" + name + "]";


	}

}
