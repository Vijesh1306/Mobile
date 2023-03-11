package com.spring.MobileCart.service;

import com.spring.MobileCart.exception.ItemNotFoundException;
import com.spring.MobileCart.model.Mobile;
import com.spring.MobileCart.repository.MobileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MobileServiceImpl implements MobileService{
    @Autowired
    MobileRepo mobilerepo;
    @Override
    public Mobile addMobile(Mobile mobile) {
        return mobilerepo.save(mobile);
    }

    @Override
    public Mobile getMobileById(Integer mobileId){
        return mobilerepo.findById(mobileId).orElseThrow(
                () -> new ItemNotFoundException("No such item ("+mobileId+") found")
        );
    }

    @Override
    public List<Mobile> getMobiles() {
        return mobilerepo.findAll();
    }

    @Override
    public Mobile updateMobile(Integer mobileId, Mobile mobile){
        Mobile mobile1=mobilerepo.findById(mobileId).orElseThrow(
                () -> new ItemNotFoundException("No such item ("+mobileId+") found")
        ) ;
        mobile1.setName(Objects.isNull(mobile.getName())?mobile1.getName():mobile.getName());
        mobile1.setModel(Objects.isNull(mobile.getModel())?mobile1.getModel():mobile.getModel());
        mobile1.setPrice(Objects.isNull(mobile.getPrice())?mobile1.getPrice():mobile.getPrice());
        mobile1.setRamSize(Objects.isNull(mobile.getRamSize())?mobile1.getRamSize():mobile.getRamSize());
        mobile1.setIsDuelSimSupported(Objects.isNull(mobile.isIsDuelSimSupported())?mobile1.isIsDuelSimSupported():mobile.isIsDuelSimSupported());
        mobile1.setIsFmSupported(Objects.isNull(mobile.isIsFmSupported())?mobile1.isIsFmSupported():mobile.isIsFmSupported());
        mobile1.setU_name(Objects.isNull(mobile.getU_name())?mobile1.getU_name():mobile.getU_name());
        mobile1.setDescription(Objects.isNull(mobile1.getDescription())?mobile1.getDescription():mobile.getDescription());
        return mobilerepo.save(mobile1);
    }

    @Override
    public void deleteMobile(Integer mobileId){
        Mobile mo=mobilerepo.findById(mobileId).orElseThrow(
                () -> new ItemNotFoundException("No such item ("+mobileId+") found")
        ) ;
        mobilerepo.delete(mo);
    }
}
