package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LapinGradleController {

    @RequestMapping("/lapin")
    public String killLapin() {
        return "Le lapin est mort!";
    }
}
