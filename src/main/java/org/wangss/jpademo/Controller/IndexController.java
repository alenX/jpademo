package org.wangss.jpademo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wangss.jpademo.Jpa.IStudentJpa;
import org.wangss.jpademo.Model.Student;

import java.util.List;

@RestController
public class IndexController {


    @Autowired
    private IStudentJpa jpa;

    @RequestMapping("/hi")
    public List<Student> hi(){
        return jpa.findAllStus("beijing");
    }
}