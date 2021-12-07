package password.generator.entity;

public class PasswordLength {
	
	private String length;
	
	public PasswordLength() {}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "PasswordLength [length=" + length + "]";
	}	
}
