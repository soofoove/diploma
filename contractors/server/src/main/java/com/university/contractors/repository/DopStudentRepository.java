package com.university.contractors.repository;

import com.university.contractors.model.DopStudent;
import org.springframework.data.repository.CrudRepository;

public interface DopStudentRepository extends CrudRepository<DopStudent, Long> {
    DopStudent findByContractId(Long contractId);
}
