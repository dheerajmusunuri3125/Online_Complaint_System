package com.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.Complaint;
import com.entity.Status;
import com.repository.complaintRepository;
@Service
public class ComplaintImplementation implements ComplaintService {
	private complaintRepository complaintRepository;

	public ComplaintImplementation(complaintRepository complaintRepository) {
		this.complaintRepository = complaintRepository; // ✅ assignment
	}

	@Override
	public Complaint createComplaint(Complaint complaint) {
		complaint.setStatus(Status.OPEN);
		complaint.setCreatedAt(LocalDateTime.now());
		return complaintRepository.save(complaint);
	}

	@Override
	public List<Complaint> getAllComplaints() {
		return complaintRepository.findAll();

	}

	@Override
	public Complaint getComplaintById(Long id) {
		return complaintRepository.findById(id).orElseThrow(() -> new RuntimeException("Complaint not Found : "));
	}

	@Override
	public Complaint updateStatus(Long id, String status) {
		Complaint com = getComplaintById(id);
		com.setStatus(Status.valueOf(status));
		return complaintRepository.save(com);
	}

	@Override
	public void deleteComplaint(Long id) {
		complaintRepository.deleteById(id);
	}

}
