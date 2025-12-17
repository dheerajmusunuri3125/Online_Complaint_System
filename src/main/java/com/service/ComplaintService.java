package com.service;

import java.util.List;

import com.entity.Complaint;

public interface ComplaintService {
	Complaint createComplaint(Complaint complaint);
	List<Complaint> getAllComplaints();
	Complaint getComplaintById(Long id);
	Complaint updateStatus(Long id,String status);
	void deleteComplaint(Long id);

}
