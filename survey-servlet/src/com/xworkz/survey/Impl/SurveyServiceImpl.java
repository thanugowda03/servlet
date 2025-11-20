package com.xworkz.survey.Impl;

import com.xworkz.survey.DTO.SurveyDTO;
import com.xworkz.survey.exception.DataInValidException;
import com.xworkz.survey.service.SurveyService;

public class SurveyServiceImpl implements SurveyService {
    @Override
    public void surveyValidate(SurveyDTO surveyDTO) throws DataInValidException {
        System.out.println("Running survey validation..");
        System.out.println("SurveyDto in service:"+surveyDTO);

        if (surveyDTO!=null){
            String name=surveyDTO.getName();
                String age=surveyDTO.getAge();
                String aadhar=surveyDTO.getAadhar();
                boolean validName=false;
                if (name!=null && name.length()>=3){
                    System.out.println("Valid name");
                }

        }
    }
}
