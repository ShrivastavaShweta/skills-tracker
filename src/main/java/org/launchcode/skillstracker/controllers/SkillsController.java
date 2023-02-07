package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String displayHomePage(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!<h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "<p>Click <a href='/form'> to select your favorite</p>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String displaySkillsForm(){
        return "<html>" +
                "<body>" +
                "<form method='post'>" +
                "<label>Name:</label>" +
                "<input type='text' name='name' placeholder='enter name'>" +
                "<p>My favorite language:</p>"+
                "<select name='one'>" +
                "<option>Java</option>" +
                "<option>JavaScript</option>" +
                "<option>Python</option>" +
                "</select>" +
                "<p>Please select your second favorite language </p>" +
                "<select name='two'>" +
                "<option>Java</option>" +
                "<option>JavaScript</option>" +
                "<option>Python</option>" +
                "</select>" +
                "<p>Please select your third favorite language </p>" +
                "<select name='three'>" +
                "<option>Java</option>" +
                "<option>JavaScript</option>" +
                "<option>Python</option>" +
                "</select> <br>" +
                "<input type='submit' value='submit form'>" +
                "</form>" +
                "</body>" +
                "</html>";

    }

    @PostMapping("form")
    @ResponseBody
    public String responseOfPage(@RequestParam String name, String one, String two, String three){
        return "<html>" +
                "<body>" +
                "<h1>"+ name + "</h1>" +
                "<p>" + one + "</p>" +
                "<p>" + two + "</p>" +
                "<p>" + three + "</p>" +
                "</body>" +
                "</html>";
    }

}
