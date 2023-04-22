package com.UrlHitCounter.demo.controller;

import com.UrlHitCounter.demo.model.urlHitterCount;
import com.UrlHitCounter.demo.service.urlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/visitor-count-app")
public class urlHittingControl {
@Autowired
     urlService urlservice;

    @GetMapping("/username/{userName}/Count")
    public urlHitterCount urlCount(@PathVariable String userName){
        return urlservice.getUserName(userName);
    }
}
