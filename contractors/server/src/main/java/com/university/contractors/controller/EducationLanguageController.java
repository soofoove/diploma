package com.university.contractors.controller;

import com.university.contractors.config.Endpoints;
import com.university.contractors.model.EducationLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducationLanguageController extends AbstractCrudControllerBase<Long, EducationLanguage> {

    @Autowired
    public EducationLanguageController(CrudRepository<EducationLanguage, Long> crudRepository) {
        super(crudRepository);
    }

    @Override
    @GetMapping(path = Endpoints.EDUCATION_LANGUAGE)
    public Iterable<EducationLanguage> getAll() {
        return super.getAll();
    }
}