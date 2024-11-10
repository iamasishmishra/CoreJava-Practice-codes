package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/helloPage")
	public String openHelloPage() {
		
		return "helloPage";
	}
	
	@GetMapping("/aboutUS")
	public String openAboutUsPage() {
		return "aboutUs";
	}

}
