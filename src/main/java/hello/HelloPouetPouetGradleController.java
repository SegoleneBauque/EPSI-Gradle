package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloPouetPouetGradleController {

    @RequestMapping(path = "pouet", method = RequestMethod.GET)
    public String pouetPouetGradle() {
        return "Hello PouetPouet!";
    }
}
