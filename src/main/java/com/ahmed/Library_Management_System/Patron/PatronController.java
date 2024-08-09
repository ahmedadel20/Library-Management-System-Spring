package com.ahmed.Library_Management_System.Patron;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PatronController {

    private PatronService patronService;

    public PatronController(PatronService patronService) {
        this.patronService = patronService;
    }

    @GetMapping("/api/patron")
    public Iterable<Patron> getPatron() {
        return patronService.findAll();
    }

    @GetMapping("/api/patron/{id}")
    public Optional<Patron> getPatronById(@PathVariable Integer id) {
        return patronService.findById(id);
    }

    @PostMapping("/api/patrons")
    public Patron createPatron(@RequestBody Patron patron) {
        return patronService.save(patron);
    }

//    @PutMapping("/api/patron/{id}")
//    public Patron updatePatron(@PathVariable Integer id, @RequestBody Patron patron) {
//        return patronService.update(id, patron);
//    }
//
//    @DeleteMapping("/api/patron/{id}")
//    public void deletePatron(@PathVariable Integer id) {
//        patronService.delete(id);
//    }
}
