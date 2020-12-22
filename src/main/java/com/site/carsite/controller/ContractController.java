package com.site.carsite.controller;



import com.site.carsite.domain.Contract;
import com.site.carsite.domain.Role;
import com.site.carsite.domain.Tech;
import com.site.carsite.domain.User;
import com.site.carsite.repos.ContRepo;
import com.site.carsite.repos.TechRepo;
import com.site.carsite.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@Controller
public class ContractController {
    @Autowired
    private ContRepo contRepo;
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private TechRepo techRepo;

    @GetMapping("/contract/{id}")
    public String registration(@PathVariable long id , Map<String, Object> model) {
        Iterable <Tech> tech_contr = techRepo.findById(id);
        model.put("tech_contr" , tech_contr) ;
        return "contract";
    }
    @PostMapping("/contract1")
    public String addContract(@RequestParam Long t_id,
                              @RequestParam String u_name,
                              @RequestParam String tel,
                              @RequestParam String email,
                              Map<String, Object> model) {
        Contract contract = new Contract(t_id, u_name, tel, email);

        contRepo.save(contract);
        techRepo.deleteById(t_id);
        return "final";
    }

}
