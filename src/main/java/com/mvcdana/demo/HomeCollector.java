package com.mvcdana.demo;


import model.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeCollector
{
    @ModelAttribute
    public void modelData(ModelMap m)
    {
      m.addAttribute("name","Aliens")  ;
    }

    @RequestMapping("/")
    public String code()
    {
        return "index";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1") int i,@RequestParam("num2") int j, ModelMap m)
    {
//        ModelAndView mv =new ModelAndView("result");
//        mv.setViewName("result");

     int num3 =i + j;

      m.addAttribute("num3",num3);

        return "result";
    }

    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute Alien a)
    {

        return "result";
    }

}
