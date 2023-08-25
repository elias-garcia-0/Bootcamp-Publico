package com.elias.dojooverflow.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.elias.dojooverflow.models.QuestionTagModel;
import com.elias.dojooverflow.repositories.QuestionTagRepo;

@Service
public class QuestionTagService {
	
	//INYECCION DE DEPENDENCIAS
	private final QuestionTagRepo questionTagRepo;
	
	public QuestionTagService(QuestionTagRepo questionTagRepo) {
		this.questionTagRepo = questionTagRepo;
	}
	
	//CREAR QUESTIONTAG
	public QuestionTagModel guardarQuestionTag(QuestionTagModel questionTag) {
		return questionTagRepo.save(questionTag);
	}

    //OBTENER TODAS LAS IDEAS
    public List<QuestionTagModel> obtenerTodosLosQuestionTag() {
        return (List<QuestionTagModel>) questionTagRepo.findAll();
    }
}