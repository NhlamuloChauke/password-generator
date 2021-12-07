package password.generator.controller.apiController;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import password.generator.entity.PasswordLength;
import password.generator.service.PasswordGeneratorService;

@RestController
public class PasswordGeneratorController {
	private static final Logger LOG = LoggerFactory.getLogger(PasswordGeneratorController.class);

	
	@Autowired 
	PasswordGeneratorService passwordGeneratorService;
	
	@PostMapping(path = "/generatePassword")
	public String generatePassword(@RequestBody PasswordLength length, HttpServletRequest request) {		
	    String password = new String(passwordGeneratorService.generatePassword(Integer.parseInt(length.getLength())));
		LOG.info("generated password : {}", password);
		return password;
	}
}
