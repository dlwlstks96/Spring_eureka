package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class MainController {

    public void getServerA() {
        final String uri = "http://localhost:7070/serverA.html";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
    }

    public void getServerB() {
        final String uri = "http://localhost:9090/serverB.html";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
    }

    @GetMapping("loadBalancer")
    @ResponseBody
    public String serverA() {
        return "loadBalancer";
    }




}
