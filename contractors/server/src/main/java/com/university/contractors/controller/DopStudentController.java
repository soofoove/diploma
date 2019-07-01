package com.university.contractors.controller;

import com.university.contractors.config.Endpoints;
import com.university.contractors.model.Direction;
import com.university.contractors.model.DopStudent;
import com.university.contractors.repository.DopStudentRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class DopStudentController extends AbstractCrudControllerBase<Long, DopStudent> {

    private final DopStudentRepository dopStudentRepository;

    public DopStudentController(DopStudentRepository dopStudentRepository) {
        super(dopStudentRepository);

        this.dopStudentRepository = dopStudentRepository;
    }

    @Override
    @GetMapping(path = Endpoints.DOP_STUDENT_BY_ID)
    public DopStudent getById(@PathVariable Long id) {
        return super.getById(id);
    }

    @GetMapping(path = Endpoints.DOP_STUDENTS, params = {"contract_id"})
    public DopStudent getDopStudentByContractId(@RequestParam(name = "contract_id") Long contractId) {
        return dopStudentRepository.findByContractId(contractId);

        // throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Dop students with ID '%s' was not found", contractId));
    }

    @Override
    @GetMapping(path = Endpoints.DOP_STUDENTS)
    public Iterable<DopStudent> getAll() {
        return super.getAll();
    }

    @Override
    @PostMapping(path = Endpoints.DOP_STUDENTS)
    public DopStudent create(@RequestBody DopStudent entityToCreate) {
        return super.create(entityToCreate);
    }

    @Override
    @PutMapping(path = Endpoints.DOP_STUDENT_BY_ID)
    public DopStudent update(@PathVariable Long id, @RequestBody DopStudent entityToUpdateWith) {
        return super.update(id, entityToUpdateWith);
    }

    @Override
    @DeleteMapping(path = Endpoints.DOP_STUDENT_BY_ID)
    public void delete(@PathVariable Long id) {
        super.delete(id);
    }
}
