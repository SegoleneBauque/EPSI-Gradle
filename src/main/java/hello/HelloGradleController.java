package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGradleController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String helloGradle() {
        return "Hello Gradle!";
    }

    @RequestMapping(path = "/Booba", method = RequestMethod.GET)
    public String helloBooba() {
        return "Booba est content de t'accueuillir dans la PIRATERIE!";
    }

    @RequestMapping(path = "/Booba/{yourName}", method = RequestMethod.GET)
    public String helloBooba(@PathVariable final String yourName) {
        return String.format("%s, Booba est content de t'accueuillir dans la PIRATERIE!" , yourName);
    }



}