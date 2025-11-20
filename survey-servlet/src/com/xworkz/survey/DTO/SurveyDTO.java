package com.xworkz.survey.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;
@Getter
@Setter
@NoArgsConstructor

public class SurveyDTO implements Serializable,Comparable<String> {
    private String name;
    private String occupation;
    private String education;
    private String nativePlace;
    private String bike;
    private String car;
    private String mobile;
    private String aadhar;
    private String pan;
    private String vote;
    private String passport;
    private String ration;
    private String income;
    private String bank;
    private String fatherName;
    private String motherName;
    private String status;
    private String whName;
    private String children;
    private String cycle;
    private String familyMembers;
    private String insuranceCompany;
    private String insuranceNo;
    private String laptopModel;
    private String tvModel;
    private String landAcres;
    private String totalSites;
    private String rtcNo;
    private String taxesPaid;
    private String govtEmployee;
    private String disability;
    private String caste;
    private String religion;
    private String motherTongue;
    private String age;
    private String dob;
    private String diseases;
    private String height;
    private String weight;
    private String complexion;
    private String bloodGroup;
    private String shoeSize;
    private String noOfShoes;
    private String friendsName;
    private String electricityBillNo;
    private String waterBillNo;
    private String buildingOwnerName;
    private String crop;
    private String loanNo;
    private String loanBalance;
    private String loanType;
    private String gold;
    private String silver;
    private String petName;
    private String noOfCows;
    private String shareHolding;

    public SurveyDTO(String name, String occupation, String education, String nativePlace, String bike, String car,
                     String mobile, String aadhar, String pan, String vote, String passport, String ration, String income,
                     String bank, String fatherName, String motherName, String status, String whName, String children,
                     String cycle, String familyMembers, String insuranceCompany, String insuranceNo, String laptopModel,
                     String tvModel, String landAcres, String totalSites, String rtcNo, String taxesPaid,
                     String govtEmployee, String disability, String caste, String religion, String motherTongue,
                     String age, String dob, String diseases, String height, String weight, String complexion,
                     String bloodGroup, String shoeSize, String noOfShoes, String friendsName, String electricityBillNo,
                     String waterBillNo, String buildingOwnerName, String crop, String loanNo, String loanBalance,
                     String loanType, String gold, String silver, String petName, String noOfCows, String shareHolding) {

        this.name = name;
        this.occupation = occupation;
        this.education = education;
        this.nativePlace = nativePlace;
        this.bike = bike;
        this.car = car;
        this.mobile = mobile;
        this.aadhar = aadhar;
        this.pan = pan;
        this.vote = vote;
        this.passport = passport;
        this.ration = ration;
        this.income = income;
        this.bank = bank;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.status = status;
        this.whName = whName;
        this.children = children;
        this.cycle = cycle;
        this.familyMembers = familyMembers;
        this.insuranceCompany = insuranceCompany;
        this.insuranceNo = insuranceNo;
        this.laptopModel = laptopModel;
        this.tvModel = tvModel;
        this.landAcres = landAcres;
        this.totalSites = totalSites;
        this.rtcNo = rtcNo;
        this.taxesPaid = taxesPaid;
        this.govtEmployee = govtEmployee;
        this.disability = disability;
        this.caste = caste;
        this.religion = religion;
        this.motherTongue = motherTongue;
        this.age = age;
        this.dob = dob;
        this.diseases = diseases;
        this.height = height;
        this.weight = weight;
        this.complexion = complexion;
        this.bloodGroup = bloodGroup;
        this.shoeSize = shoeSize;
        this.noOfShoes = noOfShoes;
        this.friendsName = friendsName;
        this.electricityBillNo = electricityBillNo;
        this.waterBillNo = waterBillNo;
        this.buildingOwnerName = buildingOwnerName;
        this.crop = crop;
        this.loanNo = loanNo;
        this.loanBalance = loanBalance;
        this.loanType = loanType;
        this.gold = gold;
        this.silver = silver;
        this.petName = petName;
        this.noOfCows = noOfCows;
        this.shareHolding = shareHolding;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SurveyDTO surveyDTO = (SurveyDTO) o;
        return Objects.equals(name, surveyDTO.name) && Objects.equals(occupation, surveyDTO.occupation) && Objects.equals(education, surveyDTO.education) && Objects.equals(nativePlace, surveyDTO.nativePlace) && Objects.equals(bike, surveyDTO.bike) && Objects.equals(car, surveyDTO.car) && Objects.equals(mobile, surveyDTO.mobile) && Objects.equals(aadhar, surveyDTO.aadhar) && Objects.equals(pan, surveyDTO.pan) && Objects.equals(vote, surveyDTO.vote) && Objects.equals(passport, surveyDTO.passport) && Objects.equals(ration, surveyDTO.ration) && Objects.equals(income, surveyDTO.income) && Objects.equals(bank, surveyDTO.bank) && Objects.equals(fatherName, surveyDTO.fatherName) && Objects.equals(motherName, surveyDTO.motherName) && Objects.equals(status, surveyDTO.status) && Objects.equals(whName, surveyDTO.whName) && Objects.equals(children, surveyDTO.children) && Objects.equals(cycle, surveyDTO.cycle) && Objects.equals(familyMembers, surveyDTO.familyMembers) && Objects.equals(insuranceCompany, surveyDTO.insuranceCompany) && Objects.equals(insuranceNo, surveyDTO.insuranceNo) && Objects.equals(laptopModel, surveyDTO.laptopModel) && Objects.equals(tvModel, surveyDTO.tvModel) && Objects.equals(landAcres, surveyDTO.landAcres) && Objects.equals(totalSites, surveyDTO.totalSites) && Objects.equals(rtcNo, surveyDTO.rtcNo) && Objects.equals(taxesPaid, surveyDTO.taxesPaid) && Objects.equals(govtEmployee, surveyDTO.govtEmployee) && Objects.equals(disability, surveyDTO.disability) && Objects.equals(caste, surveyDTO.caste) && Objects.equals(religion, surveyDTO.religion) && Objects.equals(motherTongue, surveyDTO.motherTongue) && Objects.equals(age, surveyDTO.age) && Objects.equals(dob, surveyDTO.dob) && Objects.equals(diseases, surveyDTO.diseases) && Objects.equals(height, surveyDTO.height) && Objects.equals(weight, surveyDTO.weight) && Objects.equals(complexion, surveyDTO.complexion) && Objects.equals(bloodGroup, surveyDTO.bloodGroup) && Objects.equals(shoeSize, surveyDTO.shoeSize) && Objects.equals(noOfShoes, surveyDTO.noOfShoes) && Objects.equals(friendsName, surveyDTO.friendsName) && Objects.equals(electricityBillNo, surveyDTO.electricityBillNo) && Objects.equals(waterBillNo, surveyDTO.waterBillNo) && Objects.equals(buildingOwnerName, surveyDTO.buildingOwnerName) && Objects.equals(crop, surveyDTO.crop) && Objects.equals(loanNo, surveyDTO.loanNo) && Objects.equals(loanBalance, surveyDTO.loanBalance) && Objects.equals(loanType, surveyDTO.loanType) && Objects.equals(gold, surveyDTO.gold) && Objects.equals(silver, surveyDTO.silver) && Objects.equals(petName, surveyDTO.petName) && Objects.equals(noOfCows, surveyDTO.noOfCows) && Objects.equals(shareHolding, surveyDTO.shareHolding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, occupation, education, nativePlace, bike, car, mobile, aadhar, pan, vote, passport, ration, income, bank, fatherName, motherName, status, whName, children, cycle, familyMembers, insuranceCompany, insuranceNo, laptopModel, tvModel, landAcres, totalSites, rtcNo, taxesPaid, govtEmployee, disability, caste, religion, motherTongue, age, dob, diseases, height, weight, complexion, bloodGroup, shoeSize, noOfShoes, friendsName, electricityBillNo, waterBillNo, buildingOwnerName, crop, loanNo, loanBalance, loanType, gold, silver, petName, noOfCows, shareHolding);
    }

    @Override
    public String toString() {
        return "SurveyDTO{" +
                "name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", education='" + education + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                ", bike='" + bike + '\'' +
                ", car='" + car + '\'' +
                ", mobile='" + mobile + '\'' +
                ", aadhar='" + aadhar + '\'' +
                ", pan='" + pan + '\'' +
                ", vote='" + vote + '\'' +
                ", passport='" + passport + '\'' +
                ", ration='" + ration + '\'' +
                ", income='" + income + '\'' +
                ", bank='" + bank + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", status='" + status + '\'' +
                ", whName='" + whName + '\'' +
                ", children='" + children + '\'' +
                ", cycle='" + cycle + '\'' +
                ", familyMembers='" + familyMembers + '\'' +
                ", insuranceCompany='" + insuranceCompany + '\'' +
                ", insuranceNo='" + insuranceNo + '\'' +
                ", laptopModel='" + laptopModel + '\'' +
                ", tvModel='" + tvModel + '\'' +
                ", landAcres='" + landAcres + '\'' +
                ", totalSites='" + totalSites + '\'' +
                ", rtcNo='" + rtcNo + '\'' +
                ", taxesPaid='" + taxesPaid + '\'' +
                ", govtEmployee='" + govtEmployee + '\'' +
                ", disability='" + disability + '\'' +
                ", caste='" + caste + '\'' +
                ", religion='" + religion + '\'' +
                ", motherTongue='" + motherTongue + '\'' +
                ", age='" + age + '\'' +
                ", dob='" + dob + '\'' +
                ", diseases='" + diseases + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", complexion='" + complexion + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", shoeSize='" + shoeSize + '\'' +
                ", noOfShoes='" + noOfShoes + '\'' +
                ", friendsName='" + friendsName + '\'' +
                ", electricityBillNo='" + electricityBillNo + '\'' +
                ", waterBillNo='" + waterBillNo + '\'' +
                ", buildingOwnerName='" + buildingOwnerName + '\'' +
                ", crop='" + crop + '\'' +
                ", loanNo='" + loanNo + '\'' +
                ", loanBalance='" + loanBalance + '\'' +
                ", loanType='" + loanType + '\'' +
                ", gold='" + gold + '\'' +
                ", silver='" + silver + '\'' +
                ", petName='" + petName + '\'' +
                ", noOfCows='" + noOfCows + '\'' +
                ", shareHolding='" + shareHolding + '\'' +
                '}';
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
