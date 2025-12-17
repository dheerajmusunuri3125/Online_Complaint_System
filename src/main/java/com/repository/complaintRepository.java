package com.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.entity.Complaint;
public interface complaintRepository extends JpaRepository<Complaint, Long> {

}
