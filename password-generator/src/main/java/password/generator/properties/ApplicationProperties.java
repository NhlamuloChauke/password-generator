package password.generator.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 
 * @author NChauke
 * @since 06/12/2021
 *
 */
@ConfigurationProperties(prefix = "app") 
public class ApplicationProperties {
	
	private String capitalCaseLetters;
	private String lowerCaseLetters;
	private String specialCharacters;
	private String numbers;
	
	public String getCapitalCaseLetters() {
		return capitalCaseLetters;
	}
	public void setCapitalCaseLetters(String capitalCaseLetters) {
		this.capitalCaseLetters = capitalCaseLetters;
	}
	public String getLowerCaseLetters() {
		return lowerCaseLetters;
	}
	public void setLowerCaseLetters(String lowerCaseLetters) {
		this.lowerCaseLetters = lowerCaseLetters;
	}
	public String getSpecialCharacters() {
		return specialCharacters;
	}
	public void setSpecialCharacters(String specialCharacters) {
		this.specialCharacters = specialCharacters;
	}
	public String getNumbers() {
		return numbers;
	}
	public void setNumbers(String numbers) {
		this.numbers = numbers;
	}
}
