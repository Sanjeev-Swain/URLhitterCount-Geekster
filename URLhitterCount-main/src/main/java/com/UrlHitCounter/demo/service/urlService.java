package com.UrlHitCounter.demo.service;

import com.UrlHitCounter.demo.model.urlHitterCount;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.Map;

@Service
public class urlService {

    static Map<String, Integer> map = new HashMap<>();
    public urlHitterCount getUserName(String userName){
        int count = map.getOrDefault(userName, 0)+1;
        map.put(userName, count);
        return new urlHitterCount(userName, count);
    }
}
