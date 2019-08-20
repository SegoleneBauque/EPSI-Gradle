package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LapinGradleController {

    @RequestMapping(path = "/lapin", method = RequestMethod.GET)
    public String killLapin() {
        return "Le lapin est mort!";
    }
}
