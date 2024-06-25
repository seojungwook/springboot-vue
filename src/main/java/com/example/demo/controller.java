package com.example.demo;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class controller {
private final Logger log =LoggerFactory.getLogger(this.getClass().getSimpleName());

    @ResponseBody
    @GetMapping("/data")
    public Map<String,Object> getData() {
        Map<String,Object> dummy = new HashMap<String,Object>();
        log.info("시작 로그 확인 테스트 !");
        dummy.put("key", "나의 데이터 ");
        return dummy;
    }
    
}
