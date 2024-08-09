package com.ahmed.Library_Management_System.BorrowingRecord;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowingRepository extends JpaRepository<BorrowingRecord, Integer> {
}
