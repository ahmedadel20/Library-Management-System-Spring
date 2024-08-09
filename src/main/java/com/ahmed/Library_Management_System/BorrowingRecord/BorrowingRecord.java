package com.ahmed.Library_Management_System.BorrowingRecord;

import com.ahmed.Library_Management_System.Book.Book;
import com.ahmed.Library_Management_System.Patron.Patron;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Transactional
@Entity
public class BorrowingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "patron_id")
    private Patron patron;

    private String bookName;
    private String patronName;
    private Date borrowDate;
    private Date returnDate;
}
