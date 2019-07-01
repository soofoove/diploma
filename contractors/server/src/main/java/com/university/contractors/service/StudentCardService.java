package com.university.contractors.service;

import com.google.common.collect.Lists;
import com.university.contractors.model.Contract;
import com.university.contractors.model.Order;
import com.university.contractors.model.Student;
import com.university.contractors.model.StudentCard;
import com.university.contractors.repository.ContractRepository;
import com.university.contractors.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentCardService {

    private final StudentRepository studentRepository;
    private final ContractRepository contractRepository;

    @Autowired
    public StudentCardService(StudentRepository studentRepository,
                              ContractRepository contractRepository) {
        this.studentRepository = studentRepository;
        this.contractRepository = contractRepository;
    }

    public Optional<StudentCard> findStudentCard(Long studentId) {
        final Optional<Student> studentOptional = studentRepository.findById(studentId);

        if (!studentOptional.isPresent()) {
            return Optional.empty();
        }


        final StudentCard studentCard = new StudentCard();
        studentCard.setStudent(studentOptional.get());

        final Optional<List<Contract>> studentContracts = contractRepository.findByStudentId(studentId);

        studentContracts.ifPresent((studentCard::setContracts)); // set all contracts

        studentContracts.orElse(Lists.newArrayList()).stream() // set current contract
                .filter(Contract::getIsActive)
                .findFirst()
                .ifPresent(studentCard::setCurrentContract);

        final List<Order> orders = studentContracts.orElse(Lists.newArrayList())
                .stream()
                .map(Contract::getOrders)
                .flatMap(List::stream)
                .collect(Collectors.toList());

        studentCard.setOrders(orders);

        return Optional.of(studentCard);
    }
}
