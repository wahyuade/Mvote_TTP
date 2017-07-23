package mvote.server.controller;

import mvote.server.database_service.AdminService;
import mvote.server.model.AdminModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by wahyuade on 22/07/17.
 */

@Controller
public class WebController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/")
    private String index(Model model){
        return "redirect:/admin";
    }

    @GetMapping("/admin")
    private String getLogin(Model model){
        model.addAttribute("adminmodel", new AdminModel());
        return "login";
    }

    @PostMapping("/admin")
    public String postLoginAdmin(@ModelAttribute AdminModel adminmodel){
        AdminModel adminData = adminService.findByUsername(adminmodel.getUsername());
        if(adminData != null){
            if(adminData.getPassword().equals(adminmodel.getPassword())){
                return "index";
            }else{
                return "redirect:/admin";
            }
        }else{
            return "redirect:/admin";
        }
    }

}
