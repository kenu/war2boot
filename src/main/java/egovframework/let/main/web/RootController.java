package egovframework.let.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 루트 경로("/") 요청을 받아 메인 페이지로 리다이렉트하는 컨트롤러
 */
@Controller
public class RootController {

    /**
     * 루트 URL을 메인 페이지 URL로 리다이렉트한다.
     * @return redirect to main page
     */
    @RequestMapping("/")
    public String root() {
        return "redirect:/cmm/main/mainPage.do";
    }
}
