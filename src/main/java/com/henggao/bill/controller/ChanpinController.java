package com.henggao.bill.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author songsm
 * @data 2019/3/31 下午10:10
 * @desc 用一句话描述此类的作用
 */

@RestController
public class ChanpinController {


    @GetMapping("/hellos")
    public String hello(){

        return "hello";
    }
}
