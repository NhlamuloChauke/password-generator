package password.generator.entity;

/**
 * 
 * @author NChauke
 * @since 06/12/2021
 *
 */
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
