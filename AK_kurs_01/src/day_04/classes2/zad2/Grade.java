package day_04.classes2.zad2;

public class Grade {
	
	private int value;
	private Subject subject;

		
	public Grade(int value, Subject subject) {
		super();
		this.value = value;
		this.subject = subject;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Grade [value=" + value + ", subject=" + subject + "]";
	}
	
	
	
	

}
