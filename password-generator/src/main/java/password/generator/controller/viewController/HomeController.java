package password.generator.controller.viewController;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import password.generator.entity.PasswordLength;
import password.generator.service.PasswordGeneratorService;

@Controller
public class HomeController {
	private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	PasswordGeneratorService passwordGeneratorService;
	
	List<String> lengthList;

	@ModelAttribute("length")
	public PasswordLength preLoad() {
		lengthList = new ArrayList<>();
		for(int i = 6; i <= 30; i ++) {
			lengthList.add(String.valueOf(i));
		}
		return new PasswordLength();
	}

	@GetMapping(path = "/password-generator")
	public String index(Model model) {
		//the length of the list attribute
		model.addAttribute("lengthList", lengthList);
		return "index";
	}

	@PostMapping(path = "/password-generator")
	public String generatePassword(@ModelAttribute("length") PasswordLength length, HttpServletRequest request,
			Model model) {
		LOG.info("Password Length : {}", length.getLength().replaceAll("[^a-zA-Z0-9]", ""));
		
	    String password = new String(passwordGeneratorService.generatePassword(Integer.parseInt(length.getLength().replaceAll("[^a-zA-Z0-9]", ""))));

		LOG.info("generated password : {}", password);
		
		model.addAttribute("message", password);
		
		//refreshing or reloading the length of the list.
		model.addAttribute("lengthList", lengthList);		
		return "index";
	}
}
