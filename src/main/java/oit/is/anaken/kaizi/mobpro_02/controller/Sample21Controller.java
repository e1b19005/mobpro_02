package oit.is.anaken.kaizi.mobpro_02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class Sample21Controller {
  @GetMapping("/sample21")
  public String sample21() {
    return "sample21.html";
  }
}
