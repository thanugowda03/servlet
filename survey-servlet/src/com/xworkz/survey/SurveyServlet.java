package com.xworkz.survey;

import com.xworkz.survey.DTO.SurveyDTO;
import com.xworkz.survey.Impl.SurveyServiceImpl;
import com.xworkz.survey.exception.DataInValidException;
import com.xworkz.survey.service.SurveyService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/survey", loadOnStartup = 1)
public class SurveyServlet extends HttpServlet {
    public SurveyServlet(){
        System.out.println("Survey servlet is created");
    }
    private SurveyService surveyService=new SurveyServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doPost in survey servlet");
        String name=req.getParameter("name");
        String occupation=req.getParameter("occupation");
        String education = req.getParameter("education");
        String nativePlace = req.getParameter("nativePlace");
        String bike = req.getParameter("bike");
        String car = req.getParameter("car");
        String mobile = req.getParameter("mobile");
        String aadhar = req.getParameter("aadhar");
        String pan = req.getParameter("pan");
        String vote = req.getParameter("vote");
        String passport = req.getParameter("passport");
        String ration = req.getParameter("ration");
        String income = req.getParameter("income");
        String bank = req.getParameter("bank");
        String fatherName = req.getParameter("fatherName");
        String motherName = req.getParameter("motherName");
        String status = req.getParameter("status");
        String whName = req.getParameter("whName");
        String children = req.getParameter("children");
        String cycle = req.getParameter("cycle");
        String familyMembers = req.getParameter("familyMembers");
        String insuranceCompany = req.getParameter("insuranceCompany");
        String insuranceNo = req.getParameter("insuranceNo");
        String laptopModel = req.getParameter("laptopModel");
        String tvModel = req.getParameter("tvModel");
        String landAcres = req.getParameter("landAcres");
        String totalSites = req.getParameter("totalSites");
        String rtcNo = req.getParameter("rtcNo");
        String taxesPaid = req.getParameter("taxesPaid");
        String govtEmployee = req.getParameter("govtEmployee");
        String disability = req.getParameter("disability");
        String caste = req.getParameter("caste");
        String religion = req.getParameter("religion");
        String motherTongue = req.getParameter("motherTongue");
        String age = req.getParameter("age");
        String dob = req.getParameter("dob");
        String diseases = req.getParameter("diseases");
        String height = req.getParameter("height");
        String weight = req.getParameter("weight");
        String complexion = req.getParameter("complexion");
        String bloodGroup = req.getParameter("bloodGroup");
        String shoeSize = req.getParameter("shoeSize");
        String noOfShoes = req.getParameter("noOfShoes");
        String friendsName = req.getParameter("friendsName");
        String electricityBillNo = req.getParameter("electricityBillNo");
        String waterBillNo = req.getParameter("waterBillNo");
        String buildingOwnerName = req.getParameter("buildingOwnerName");
        String crop = req.getParameter("crop");
        String loanNo = req.getParameter("loanNo");
        String loanBalance = req.getParameter("loanBalance");
        String loanType = req.getParameter("loanType");
        String gold = req.getParameter("gold");
        String silver = req.getParameter("silver");
        String petName = req.getParameter("petName");
        String noOfCows = req.getParameter("noOfCows");
        String shareHolding = req.getParameter("shareHolding");

        SurveyDTO surveyDTO=new SurveyDTO(name, occupation, education, nativePlace, bike, car, mobile, aadhar, pan, vote, passport, ration, income, bank, fatherName, motherName, status, whName, children, cycle, familyMembers, insuranceCompany, insuranceNo, laptopModel, tvModel, landAcres, totalSites, rtcNo, taxesPaid, govtEmployee, disability, caste, religion, motherTongue, age, dob, diseases, height, weight, complexion, bloodGroup, shoeSize, noOfShoes, friendsName, electricityBillNo, waterBillNo, buildingOwnerName, crop, loanNo, loanBalance, loanType, gold, silver, petName, noOfCows, shareHolding);
        System.out.println("SurveyDTO--->"+surveyDTO);
try {
    surveyService.surveyValidate(surveyDTO);
    req.setAttribute("name", name);
    req.setAttribute("occupation", occupation);
    req.setAttribute("education", education);
    req.setAttribute("nativePlace", nativePlace);
    req.setAttribute("bike", bike);
    req.setAttribute("car", car);
    req.setAttribute("mobile", mobile);
    req.setAttribute("aadhar", aadhar);
    req.setAttribute("pan", pan);
    req.setAttribute("vote", vote);
    req.setAttribute("passport", passport);
    req.setAttribute("ration", ration);
    req.setAttribute("income", income);
    req.setAttribute("bank", bank);
    req.setAttribute("fatherName", fatherName);
    req.setAttribute("motherName", motherName);
    req.setAttribute("status", status);
    req.setAttribute("whName", whName);
    req.setAttribute("children", children);
    req.setAttribute("cycle", cycle);
    req.setAttribute("familyMembers", familyMembers);
    req.setAttribute("insuranceCompany", insuranceCompany);
    req.setAttribute("insuranceNo", insuranceNo);
    req.setAttribute("laptopModel", laptopModel);
    req.setAttribute("tvModel", tvModel);
    req.setAttribute("landAcres", landAcres);
    req.setAttribute("totalSites", totalSites);
    req.setAttribute("rtcNo", rtcNo);
    req.setAttribute("taxesPaid", taxesPaid);
    req.setAttribute("govtEmployee", govtEmployee);
    req.setAttribute("disability", disability);
    req.setAttribute("caste", caste);
    req.setAttribute("religion", religion);
    req.setAttribute("motherTongue", motherTongue);
    req.setAttribute("age", age);
    req.setAttribute("dob", dob);
    req.setAttribute("diseases", diseases);
    req.setAttribute("height", height);
    req.setAttribute("weight", weight);
    req.setAttribute("complexion", complexion);
    req.setAttribute("bloodGroup", bloodGroup);
    req.setAttribute("shoeSize", shoeSize);
    req.setAttribute("noOfShoes", noOfShoes);
    req.setAttribute("friendsName", friendsName);
    req.setAttribute("electricityBillNo", electricityBillNo);
    req.setAttribute("waterBillNo", waterBillNo);
    req.setAttribute("buildingOwnerName", buildingOwnerName);
    req.setAttribute("crop", crop);
    req.setAttribute("loanNo", loanNo);
    req.setAttribute("loanBalance", loanBalance);
    req.setAttribute("loanType", loanType);
    req.setAttribute("gold", gold);
    req.setAttribute("silver", silver);
    req.setAttribute("petName", petName);
    req.setAttribute("noOfCows", noOfCows);
    req.setAttribute("shareHolding", shareHolding);
}catch (DataInValidException e){

    System.out.println("Data valid");
    req.setAttribute("successMessage","Data saved successfully");
    System.err.println("Data invalid");
    req.setAttribute("errorMessage","Data not saved successfully");
}

        req.getRequestDispatcher("SurveyResult.jsp").forward(req,resp);
        System.out.println("after request forward");
    }

    }

