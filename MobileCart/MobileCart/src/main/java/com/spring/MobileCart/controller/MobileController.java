package com.spring.MobileCart.controller;

import com.spring.MobileCart.model.Mobile;
import com.spring.MobileCart.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/a1")
public class MobileController {
    @Autowired
    MobileService mobileService;
    @PostMapping("/mobiles")
    public ResponseEntity<Object> createMobile(@RequestBody Mobile mobile){
        return new ResponseEntity<>(mobileService.addMobile(mobile), HttpStatus.CREATED);
    }
    @GetMapping("/mobiles/{id}")
    public ResponseEntity<Mobile> getMobile(@PathVariable("id") Integer mobileId){
        return ResponseEntity.ok().body(mobileService.getMobileById(mobileId));
    }
    @GetMapping("/mobiles")
    public List<Mobile> getMobile(){
        return mobileService.getMobiles();
    }

    @PutMapping("/mobiles/{id}")
    public ResponseEntity<Mobile> updateMobile(@PathVariable("id") Integer mobileId, @RequestBody Mobile mobile){
        return ResponseEntity.ok((mobileService.updateMobile(mobileId,mobile)));
    }
    @DeleteMapping("mobiles/{id}")
    public ResponseEntity<Object> deleteMobile(@PathVariable("id") int mobileId){
        mobileService.deleteMobile(mobileId);
        return new ResponseEntity<>("",HttpStatus.NO_CONTENT);
    }
}

