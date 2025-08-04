package com.next.app.api.user.entity;

import jakarta.persistence.*;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "business_dong")
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(nullable = false)
    private String businessNumber;

    @Column
    private String companyName;

    @Column
    private String representativeName;

    @Column
    private String contactEmail;

    @Column
    private String contactPhone;

    @Column
    private String address;

    @Column
    private String registeredAt;

    // Constructors
    public Business() {}
    public Business(String name, String businessNumber, String companyName, String representativeName, String contactEmail, String contactPhone, String address, String registeredAt) {
        this.businessNumber = businessNumber;
        this.companyName = companyName;
        this.address = address;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
        this.address = address;
        this.registeredAt = registeredAt;
    }
    // Getters and Setters
    public Long getId() {
        return id;
    }
    public String getBusinessNumber() {
        return businessNumber;
    }
    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getRepresentativeName() {
        return representativeName;
    }
    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }
    public String getContactEmail() {
        return contactEmail;
    }
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
    public String getContactPhone() {
        return contactPhone;
    }
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getRegisteredAt() {
        return registeredAt;
    }
    public void setRegisteredAt(String registeredAt) {
        this.registeredAt = registeredAt;
    }
}
