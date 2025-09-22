package kr.co.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
  @RequestMapping("/test.do")
  @ResponseBody
  public String test() {
    return "Spring MVC가 정상 작동합니다!";
  }

  @RequestMapping("/home.do")
  public String home(Model model) {
    model.addAttribute("message", "전자정부 프레임워크 테스트");
    return "home";
  }
}
