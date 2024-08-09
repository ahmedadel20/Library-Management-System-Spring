package com.ahmed.Library_Management_System.Book;

import com.ahmed.Library_Management_System.BorrowingRecord.BorrowingRecord;
import com.ahmed.Library_Management_System.Patron.Patron;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Transactional
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Validated
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private String ISBN;

    @OneToMany(mappedBy = "book")
    private List<BorrowingRecord> borrowingRecords;
}
