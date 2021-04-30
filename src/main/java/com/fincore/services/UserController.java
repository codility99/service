package com.fincore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping("/")
    public String home() {
        return "ultron app services";

    }


}
