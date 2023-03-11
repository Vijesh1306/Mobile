package com.spring.MobileCart.service;

import com.spring.MobileCart.exception.ItemNotFoundException;
import com.spring.MobileCart.model.Mobile;

import java.util.List;

public interface MobileService {
    Mobile addMobile(Mobile mobile) ;
    Mobile getMobileById(Integer mobileId) throws ItemNotFoundException;
    List<Mobile> getMobiles();
    Mobile updateMobile(Integer mobileId,Mobile mobile) throws ItemNotFoundException;
    void deleteMobile(Integer mobileId) throws ItemNotFoundException;
}
