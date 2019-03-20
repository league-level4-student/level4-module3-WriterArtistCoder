package _01_introduction;

@SuppressWarnings("serial")
public class CustomException extends Exception {
	public CustomException() {
		super();
	}
	
	public void terminate() {
		System.exit(0);
	}
}
