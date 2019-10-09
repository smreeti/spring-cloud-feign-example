package com.smriti.fiegnclient.controller;

import com.smriti.fiegnclient.model.response.Billionaire;
import com.smriti.fiegnclient.proxy.UserServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping
public class ProxyController {
    @Autowired
    private UserServiceProxy proxy;

    @GetMapping("/proxy/list")
    public List<Billionaire> list(){
        return proxy.listBillionaires();
    }

    @PostMapping
    public void test(@RequestPart("file")MultipartFile[] file){
        proxy.uploadFiles(file);
        System.out.println("done");
    }
}
