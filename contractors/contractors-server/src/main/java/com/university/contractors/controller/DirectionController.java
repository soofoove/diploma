package com.university.contractors.controller;

import com.university.contractors.config.Endpoints;
import com.university.contractors.model.Direction;
import com.university.contractors.repository.DirectionRepository;
import com.university.contractors.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class DirectionController extends AbstractCrudControllerBase<Long, Direction> {

    private final DirectionRepository directionRepository;
    private final FacultyRepository facultyRepository;

    @Autowired
    public DirectionController(DirectionRepository directionRepository, FacultyRepository facultyRepository) {
        super(directionRepository);
        this.directionRepository = directionRepository;
        this.facultyRepository = facultyRepository;
    }

    @Override
    @GetMapping(path = Endpoints.DIRECTION_BY_ID)
    public Direction getById(@PathVariable Long id) {
        return super.getById(id);
    }

    @Override
    @GetMapping(path = Endpoints.DIRECTIONS)
    public Iterable<Direction> getAll() {
        return super.getAll();
    }

    @GetMapping(path = Endpoints.DIRECTIONS, params = {"faculty_id"})
    public Iterable<Direction> getDirectionByFacultyId(@RequestParam(name = "faculty_id") Long facultyId) {
        if (facultyRepository.existsById(facultyId)) {
            return directionRepository.findByFacultyId(facultyId);
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Faculty with ID '%s' was not found", facultyId));
    }

    @Override
    @PostMapping(path = Endpoints.DIRECTIONS)
    public Direction create(@RequestBody Direction entityToCreate) {
        return super.create(entityToCreate);
    }

    @Override
    @PutMapping(path = Endpoints.DIRECTION_BY_ID)
    public Direction update(@PathVariable Long id, @RequestBody Direction entityToUpdateWith) {
        return super.update(id, entityToUpdateWith);
    }

    @Override
    @DeleteMapping(path = Endpoints.DIRECTION_BY_ID)
    public void delete(@PathVariable Long id) {
        super.delete(id);
    }
}
