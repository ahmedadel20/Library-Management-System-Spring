package com.ahmed.Library_Management_System.Patron;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Service
public class PatronService {

    private final PatronRepository patronRepository;

    public PatronService(PatronRepository patronRepository) {
        this.patronRepository = patronRepository;
    }

    public Iterable<Patron> findAll() {
        return patronRepository.findAll();
    }

    public Optional<Patron> findById(@PathVariable Integer id) {
        return patronRepository.findById(id);
    }

    public Patron save(@RequestBody Patron patron) {
        return patronRepository.save(patron);
    }

//    public Patron update(@PathVariable Integer id, @RequestBody Patron patron) {
//        if(patronRepository.findById(id).isEmpty()) {
//            return null;
//        }
//        return patronRepository.save(id, patron);
//    }
//
//    public void delete(@PathVariable Integer id) {
//        patronRepository.delete(patronRepository.findById(id));
//    }
}
