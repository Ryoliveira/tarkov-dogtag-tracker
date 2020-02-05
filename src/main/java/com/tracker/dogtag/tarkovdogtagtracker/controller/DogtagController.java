package com.tracker.dogtag.tarkovdogtagtracker.controller;

import com.tracker.dogtag.tarkovdogtagtracker.entity.Dogtag;
import com.tracker.dogtag.tarkovdogtagtracker.service.DogtagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/dogtags")
public class DogtagController {

    // Create DAO dogtag service and use it here

    private DogtagService dogtagService;

    @Autowired
    public DogtagController(DogtagService theDogtagService){
        dogtagService = theDogtagService;
    }

    // add mapping to get list
    @GetMapping("/list")
    public String getDogtagList(Model theModel){
       List<Dogtag> dogtags =  dogtagService.findAll();

       theModel.addAttribute("dogtags", dogtags);

       return "dogtags/list-dogtags";

    }

    // add mapping for /showAddForm
    @GetMapping("/showAddForm")
    public String showAddForm(Model theModel){

        // Create Dogtag Object
        Dogtag theDogtag = new Dogtag();

        // add object to model
        theModel.addAttribute("dogtag", theDogtag);

        return "dogtags/dogtag-form";
    }

    // add mapping for /showFormForUpdate
    @GetMapping("/showUpdateForm")
    public String showUpdateForm(@RequestParam("dogtagId") int theID, Model theModel){

        // Create Dogtag Object
        Dogtag theDogtag = dogtagService.findById(theID);

        // add object to model
        theModel.addAttribute("dogtag", theDogtag);

        return "dogtags/dogtag-form";
    }

    // add mapping for /save
    @PostMapping("/save")
    public String saveDogtag(@ModelAttribute("dogtag") Dogtag theDogtag){

        dogtagService.save(theDogtag);

        return "redirect:/dogtags/list";

    }

    // add mapping for /delete
    @GetMapping("/delete")
    public String deleteDogtag(@RequestParam("dogtagId") int theId){

        // delete dogtag from db
        dogtagService.deleteById(theId);

        // redirect back to list
        return "redirect:/dogtags/list";

    }


}
