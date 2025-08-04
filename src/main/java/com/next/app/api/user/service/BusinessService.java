package com.next.app.api.user.service;

import com.next.app.api.user.entity.Business;
import com.next.app.api.user.repository.BusinessRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BusinessService {

    @Autowired
    private BusinessRepository businessRepository;

    // 사업자 전체 조회
    public List<Business> getAllBusinesses() {
        return businessRepository.findAll();
    }
    // 사업자 단건 조회
    public Business getBusinessById(Long id) {
        return businessRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }
    public Business save(Business business) {
        return businessRepository.save(business);
    }
    public Business update(Long id, Business updatedBusiness) {
        Business existingBusiness = businessRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Business not found with id: " + id));
        existingBusiness.setBusinessNumber(updatedBusiness.getBusinessNumber());
        existingBusiness.setCompanyName(updatedBusiness.getCompanyName());
        existingBusiness.setRepresentativeName(updatedBusiness.getRepresentativeName());
        existingBusiness.setContactEmail(updatedBusiness.getContactEmail());
        existingBusiness.setContactPhone(updatedBusiness.getContactPhone());
        existingBusiness.setAddress(updatedBusiness.getAddress());
        existingBusiness.setRegisteredAt(updatedBusiness.getRegisteredAt());

        return businessRepository.save(existingBusiness);
    }

    public void delete(Long id) {
        businessRepository.deleteById(id);
    }
}
