package com.martin.app.view.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @since       2022.09.06
 * @author      martin
 * @description main controller
 **********************************************************************************************************************/
@Controller
public class MainController {

	@GetMapping
	public String main() {
		return "";
	}
}
