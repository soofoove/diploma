package com.university.contractors.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DopStudent implements IdEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dops_tudent")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ref_contract")
    private Contract contract;

    private String englishName;
    private String sex;
    private String pasportNum;
    private String datePasport;
    private String agePasport;
    private String registryNum;
    private String dateRegistry;
    private String placeRegistry;
    private String visaNum;
    private String whereRegVisa;

    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Date dateOfVisa;

    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Date ageOfVisa;

    private String borderPlace;
    private String adress;
    private String room;

    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Date dateOfArive;

    private String invitation;
    private String passport;
    private String otherInfo;
    private String healthInsuranceNum;

    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Date ageHealthInsurance;

    private String migrationInsuranceNum;

    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Date ageMigrationInsurance;

    private String kodPoLisenzii;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPasportNum() {
        return pasportNum;
    }

    public void setPasportNum(String pasportNum) {
        this.pasportNum = pasportNum;
    }

    public String getDatePasport() {
        return datePasport;
    }

    public void setDatePasport(String datePasport) {
        this.datePasport = datePasport;
    }

    public String getAgePasport() {
        return agePasport;
    }

    public void setAgePasport(String agePasport) {
        this.agePasport = agePasport;
    }

    public String getRegistryNum() {
        return registryNum;
    }

    public void setRegistryNum(String registryNum) {
        this.registryNum = registryNum;
    }

    public String getDateRegistry() {
        return dateRegistry;
    }

    public void setDateRegistry(String dateRegistry) {
        this.dateRegistry = dateRegistry;
    }

    public String getPlaceRegistry() {
        return placeRegistry;
    }

    public void setPlaceRegistry(String placeRegistry) {
        this.placeRegistry = placeRegistry;
    }

    public String getVisaNum() {
        return visaNum;
    }

    public void setVisaNum(String visaNum) {
        this.visaNum = visaNum;
    }

    public String getWhereRegVisa() {
        return whereRegVisa;
    }

    public void setWhereRegVisa(String whereRegVisa) {
        this.whereRegVisa = whereRegVisa;
    }

    public Date getDateOfVisa() {
        return dateOfVisa;
    }

    public void setDateOfVisa(Date dateOfVisa) {
        this.dateOfVisa = dateOfVisa;
    }

    public Date getAgeOfVisa() {
        return ageOfVisa;
    }

    public void setAgeOfVisa(Date ageOfVisa) {
        this.ageOfVisa = ageOfVisa;
    }

    public String getBorderPlace() {
        return borderPlace;
    }

    public void setBorderPlace(String borderPlace) {
        this.borderPlace = borderPlace;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Date getDateOfArive() {
        return dateOfArive;
    }

    public void setDateOfArive(Date dateOfArive) {
        this.dateOfArive = dateOfArive;
    }

    public String getInvitation() {
        return invitation;
    }

    public void setInvitation(String invitation) {
        this.invitation = invitation;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    public String getHealthInsuranceNum() {
        return healthInsuranceNum;
    }

    public void setHealthInsuranceNum(String healthInsuranceNum) {
        this.healthInsuranceNum = healthInsuranceNum;
    }

    public Date getAgeHealthInsurance() {
        return ageHealthInsurance;
    }

    public void setAgeHealthInsurance(Date ageHealthInsurance) {
        this.ageHealthInsurance = ageHealthInsurance;
    }

    public String getMigrationInsuranceNum() {
        return migrationInsuranceNum;
    }

    public void setMigrationInsuranceNum(String migrationInsuranceNum) {
        this.migrationInsuranceNum = migrationInsuranceNum;
    }

    public Date getAgeMigrationInsurance() {
        return ageMigrationInsurance;
    }

    public void setAgeMigrationInsurance(Date ageMigrationInsurance) {
        this.ageMigrationInsurance = ageMigrationInsurance;
    }

    public String getKodPoLisenzii() {
        return kodPoLisenzii;
    }

    public void setKodPoLisenzii(String kodPoLisenzii) {
        this.kodPoLisenzii = kodPoLisenzii;
    }
}
