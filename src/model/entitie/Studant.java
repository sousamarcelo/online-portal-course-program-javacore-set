package model.entitie;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Studant {
	
	private Integer number;
	private String name;
	private String teachersName;
	
	Set<Studant> studants = new HashSet<Studant>();
	
	public Studant(Integer number, String name, String teacheName) {
		this.number = number;
		this.name = name;
		this.teachersName = teacheName;
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
	
	public String getTEachersName() {
		return teachersName;
	}
	
	public void setTeachersName(String teachersName) {
		this.teachersName = teachersName;
	}
	
	public Set<Studant> getStudant(){
		return studants;
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
		Studant other = (Studant) obj;
		return Objects.equals(number, other.number);
	}

	@Override
	public String toString() {
		return "Studants [number=" + number + ", name=" + name + "]";


	}

}
