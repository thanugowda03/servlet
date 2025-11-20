package com.xworkz.survey.service;

import com.xworkz.survey.DTO.SurveyDTO;
import com.xworkz.survey.exception.DataInValidException;

public interface SurveyService {

    void surveyValidate(SurveyDTO surveyDTO) throws DataInValidException;
}
