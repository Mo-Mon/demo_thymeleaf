package com.example.demo_thymeleaf;

import com.example.demo_thymeleaf.models.Nationality;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

@Controller
public class NationalityController {
    @Autowired
    private NationalityService nationalityService;

    @GetMapping("/nationalities")
    public String getNationalities(Model model){
        model.addAttribute("nationalities", nationalityService.getNationalities());
        model.addAttribute("nationality",new Nationality());
        return "nationalities";
    }

    @GetMapping("/onenationality")
    @ResponseBody
    public Optional<Nationality> getNationalityById(Integer id, Model model){
        Optional<Nationality> nationality = nationalityService.getNationalityById(id);
//        model.addAttribute("onenationality", nationality);
        return nationality;
    }

    @PostMapping(value="/save")
    public String updateNationality(Nationality nationality){
        nationalityService.updateNationality(nationality);
        return "redirect:/nationalities";
    }

    @PostMapping(value = "/addNew")
    public String addNationality(@ModelAttribute("nationality") Nationality nationality){
        Date current = new Date();
        nationality.setUpdatedOn(current);
        nationalityService.addNationality(nationality);
        return "redirect:/nationalities";
    }

    @PostMapping("/delete")
    public String deleteNationality(Integer id){
        nationalityService.deleteNationalityById(id);
        return "redirect:/nationalities";
    }
}
