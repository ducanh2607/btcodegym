package com.example.bai1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/owners/{ownerID}")
public class TestController {
//    @GetMapping("/owners/{ownerId}/pets/{petID}")
//    public void find(@PathVariable Long ownerId, @PathVariable Long petID){}

//    @GetMapping("/{name;[a-z-]+}-{version:\\d\\.\\d\\.\\d}{ext:\\.[a-z]+}")
//    public void handle(@PathVariable String version, @PathVariable String ext){}

    @PostMapping(path = "/pets", consumes = "application/json")
    public void addPet(@RequestBody String abc){}
    @PostMapping(path = "/pets", consumes = "!text/plain")
    public void addPet1(@RequestBody String abc){}
    @GetMapping(path = "/pets/{petId}",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public void getPet(@PathVariable String petID){}
    @GetMapping(path = "/pets/{petId}", params = "myParam=myValue")
    public void findPet(@PathVariable String petId){}
    @GetMapping(path = "/pets", headers = "myHeader=myValue")
    public void findPet1(@PathVariable String petId){}
}
