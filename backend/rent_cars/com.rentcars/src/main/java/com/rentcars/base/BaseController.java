package com.rentcars.base;

import jakarta.persistence.MappedSuperclass;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@MappedSuperclass
@RequestMapping("/rest")
public abstract class BaseController {
}
