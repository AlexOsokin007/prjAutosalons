package com.site.carsite.controller;

import com.site.carsite.domain.Brand;
import com.site.carsite.domain.Color;
import com.site.carsite.domain.Contract;
import com.site.carsite.domain.Tech;
import com.site.carsite.repos.BrandRepo;
import com.site.carsite.repos.ColorRepo;
import com.site.carsite.repos.ContRepo;
import com.site.carsite.repos.TechRepo;
import javassist.compiler.ast.Variable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@PreAuthorize("hasAuthority('ADMIN')")
public class AdminController {
    @Autowired
    private TechRepo techRepo;
    @Autowired
    private ContRepo contRepo;
    @Autowired
    private BrandRepo brandRepo;
    @Autowired
    private ColorRepo colorRepo;

    @GetMapping("/admin")
    public String admin(Map<String, Object> model){
        Iterable<Tech> message = techRepo.findAll();
        Iterable<Brand> message_brand = brandRepo.findAll();
        Iterable<Color> message_color = colorRepo.findAll();
        model.put("messages", message);
        model.put("message_brand", message_brand);
        model.put("message_color", message_color);
        return "admin";
    }

    @GetMapping("/contract_adm")
    public String about(Map<String, Object> model) {
        Iterable<Contract> cont = contRepo.findAll();
        model.put("messages1", cont);
        return "contract_adm";
    }
    @PostMapping("/admin")
    public String add(@RequestParam String type,
                      @RequestParam String name,
                      @RequestParam String cond,
                      @RequestParam String old,
                      @RequestParam Integer price,
                      @RequestParam String transmission,
                      @RequestParam String drive,
                      @RequestParam String engine,
                      @RequestParam String color,
                      @RequestParam String vin,
                      Map<String, Object> model) {
        Tech message = new Tech(type, name, cond, old, price, transmission, drive, engine, color, vin);
        techRepo.save(message);
        Iterable<Tech> messages = techRepo.findAll();
        model.put("messages", messages);
        return "admin";
    }

    @GetMapping("/update/{id}")
    public String getById(@PathVariable long id , Map<String, Object> model){

        Iterable <Tech> autos = techRepo.findById(id);
        model.put("autos" , autos) ;
        return "update";
    }

    @PostMapping("/updateAuto")
    public String updateAuto (@ModelAttribute("autos") Tech auto){
        techRepo.save(auto) ;
        return "redirect:/admin" ;
    }

    @GetMapping("/delete1/{id}")
    public String del1(@PathVariable("id") int id){
        techRepo.deleteById(id);;
        return "redirect:/main1" ;
    }

    @GetMapping("/delete/{id}")
    public String del(@PathVariable("id") int id){
        techRepo.deleteById(id);
        //return "redirect:/admin" ;
        return "redirect:/main";
    }
}
