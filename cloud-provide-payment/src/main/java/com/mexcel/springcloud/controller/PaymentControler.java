package com.mexcel.springcloud.controller;

import com.mexcel.pojo.CommonResult;
import com.mexcel.pojo.Payment;
import com.mexcel.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.cloud.client.ServiceInstance;

@RestController
@Slf4j
public class PaymentControler {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/index")
    public ModelAndView home(){
        ModelAndView mv=new ModelAndView("index.html");
        return mv;
    }

//    @GetMapping("/index")
//    public String home(){
//        return "index";
//    }

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment dept){
        int i = paymentService.create(dept);
        log.info("***************插入成功*******"+i);
        if(i>0){
            return new CommonResult(200,"插入数据库成功",i);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }
    @GetMapping("/payment/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id){
        Payment payment = paymentService.queryById(id);
        log.info("***************查询成功*********"+payment);
        if(payment!=null){
            return new CommonResult(200,"查询成功",payment);
        }else{
            return new CommonResult(444,"查询失败",null);
        }
    }
}
