package securityTest2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import securityTest2.Entity.Msg;

@Controller
public class mainController {

	@RequestMapping("/")
	public String index(Model model) {
		Msg msg = new Msg("權限測試", "基本權限", "您具備管理者權限因此能看到此內容");
		model.addAttribute("msg", msg);
		return "index";
	}
}
