package j11_최상위클래스;

import java.util.Objects;

public class Student {
	private int code;
	private String name;
	
	public Student() {}
	
	public Student(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, name);
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
		return code == other.code && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [code=" + code + ", name=" + name + "]";
	}
	
	 

	
}















