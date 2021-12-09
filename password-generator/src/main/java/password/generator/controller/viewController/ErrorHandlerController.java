package password.generator.controller.viewController;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author NChauke
 * @since 09/12/2021
 */
@Controller
public class ErrorHandlerController implements ErrorController {
	
	@RequestMapping("/error")
	public String index() {
		return "index.html";
	}

	public String getErrorPath() {
		return "index.html";
	}

}
