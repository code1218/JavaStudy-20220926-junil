package j07_배열.classArray;

public class Student {

	//code	int
	//name	String
	
	private int code;
	private String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

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
	public String toString() {
		return "Student [code=" + code + ", name=" + name + "]";
	}
}









