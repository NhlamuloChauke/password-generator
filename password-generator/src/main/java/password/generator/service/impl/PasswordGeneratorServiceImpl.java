package password.generator.service.impl;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import password.generator.properties.ApplicationProperties;
import password.generator.service.PasswordGeneratorService;

/**
 * 
 * @author NChauke
 * @since 06/12/2021
 *
 */
@Service
public class PasswordGeneratorServiceImpl implements PasswordGeneratorService {
	private static final Logger LOG = LoggerFactory.getLogger(PasswordGeneratorServiceImpl.class);

	@Autowired
	ApplicationProperties properties;
	
	String capitalCaseLetters;
	String lowerCaseLetters;
	String specialCharacters;
	String numbers; 
	
	@PostConstruct
	public void init() {
		LOG.info("init() Application Properties...");
		
		capitalCaseLetters = properties.getCapitalCaseLetters();
		lowerCaseLetters = properties.getLowerCaseLetters();
		specialCharacters = properties.getSpecialCharacters();
		numbers = properties.getNumbers();
		
		LOG.info("capital case letters : {}", capitalCaseLetters);
		LOG.info("lower case letters : {}", lowerCaseLetters);
		LOG.info("special characters : {}", specialCharacters);
		LOG.info("numbers : {}", numbers);
	}

	@Override
	public char[] generatePassword(int length) {
		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		Random random = new Random();
		char[] password = new char[length];

		password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		password[3] = numbers.charAt(random.nextInt(numbers.length()));

		for (int i = 4; i < length; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		return password;
	}
}
