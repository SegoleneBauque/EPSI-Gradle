package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvierMetalGradleController {

    @RequestMapping(path = "/evier", method = RequestMethod.GET)
    public String helloEvierMetal() {
        return "Evier Metal!";
    }

}