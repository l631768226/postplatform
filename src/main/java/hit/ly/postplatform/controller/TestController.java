package hit.ly.postplatform.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/1", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String processTest(){
        return "OK";
    }

}
