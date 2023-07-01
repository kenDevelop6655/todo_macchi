package com.example.demo.app;

import com.example.demo.mybatis.domain.Actor;
import com.example.demo.mybatis.domain.ActorExample;
import com.example.demo.mybatis.mapper.ActorMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/demo")
public class testController {

    private final ActorMapper actorMapper;

    @Autowired
    public testController(ActorMapper actorMapper){
        this.actorMapper=actorMapper;
    };

    @GetMapping
    public String demo(
             Model model
    ){
        List<Actor> actorList = actorMapper.selectAll();
        model.addAttribute("test","test");
        model.addAttribute("actorList",actorList);
        return "index";
    }

    @GetMapping("/example")
    public void example(
            Model model
    ){
        Actor actor = new Actor();
        actor.setLast_name("test");
        ActorExample example = new ActorExample();
        example.createCriteria().andFirst_nameEqualTo("Ed");
        actorMapper.updateByExampleSelective(actor,example);
    }

}
