package com.ahmed.Library_Management_System.Patron;

import com.ahmed.Library_Management_System.BorrowingRecord.BorrowingRecord;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Getter
@Setter
@Transactional
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Validated
public class Patron {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String name;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "patron")
    private List<BorrowingRecord> borrowingRecords;
}
