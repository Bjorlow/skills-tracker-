package org.launchcode.skillstracker.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ResponseBody

public class SkillsController {

    //Handler that corresponds to local host : 8080
    @GetMapping("/")
    public String displayHomePage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>TypeScript</li>" +
                "<li>Python</li>" +
                "<li>Ruby</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public String displaySkillsForm() {
        return "<html>" +
                "<body>" +
                "<form action= '/form' method='POST'>" +
                "<label>Name:</label>" +
                "<input type='text' name='userName' /><br />"+
                "<label>My favorite language:< /label>" +
                "<select name = 'fave1>" +
                "<option value= 'Java'>Java</option>" +
                "<option value= 'JavaScript'>JavaScript</option>" +
                "<option value= 'TypeScript'>TypeScript</option>" +
                "<option value= 'Python'>Python</option>" +
                "<option value= 'Ruby'>Ruby</option>" +
                "</select><br />" +
                "<label>My second favorite language:< /label>" +
                "<select name = 'fave2>" +
                "<option value= 'Java'>Java</option>" +
                "<option value= 'JavaScript'>JavaScript</option>" +
                "<option value= 'TypeScript'>TypeScript</option>" +
                "<option value= 'Python'>Python</option>" +
                "<option value= 'Ruby'>Ruby</option>" +
                "</select><br />" +
                "<label>My third favorite language:< /label>" +
                "<select name = 'fave3>" +
                "<option value= 'Java'>Java</option>" +
                "<option value= 'JavaScript'>JavaScript</option>" +
                "<option value= 'TypeScript'>TypeScript</option>" +
                "<option value= 'Python'>Python</option>" +
                "<option value= 'Ruby'>Ruby</option>" +
                "</select><br />" +
                "<input type='submit' value='Submit' />" +
                "</form>" +
                "</body>" +
                "</html";
    }


    //Handler that corresponds to localhots:8080/form to process the form AND display results
    @PostMapping("/form")
    public String processSkillForm(@RequestParam String userName, String fave1, String fave2, String fave3) {
        return "<html>" +
                "<body>" +
                "<h1>" + userName + "</h1>" +
                "<h3>Favorite Language</h3>" +
                "<ol>" +
                "<li>" + fave1 + "</li>" +
                "<li>" + fave2 + "</li>" +
                "<li>" + fave3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
