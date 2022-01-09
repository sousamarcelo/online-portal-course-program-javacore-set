package model.entitie;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
	
	private Integer number;
	private String name;
	private String teachersName;
	private Character course;
	
	Set<Student> studants = new HashSet<Student>();
	
	public Student() {
		
	}
	
	public Student(Integer number, String name, String teacheName, Character course) {
		this.number = number;
		this.name = name;
		this.teachersName = teacheName;
		this.course = course;
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
	
	public Set<Student> getStudant(){
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
		Student other = (Student) obj;
		return Objects.equals(number, other.number);
	}

	@Override
	public String toString() {
		return "Studants [number=" + number + ", name=" + name + "]";


	}

}
