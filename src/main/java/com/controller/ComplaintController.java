package com.controller;
import java.util.List;
import org.springframework.web.bind.annotation.*;

import com.entity.Complaint;
import com.service.ComplaintService;
import lombok.RequiredArgsConstructor;
@RestController
@RequestMapping("/api/complaints")


public class ComplaintController {
    private final ComplaintService service;
    
    public ComplaintController(ComplaintService service) {
		this.service = service;
	}

	@PostMapping
    public Complaint create(@RequestBody Complaint complaint) {
        return service.createComplaint(complaint);
    }

    @GetMapping
    public List<Complaint> getAll() {
        return service.getAllComplaints();
    }

    @GetMapping("/{id}")
    public Complaint getById(@PathVariable Long id) {
        return service.getComplaintById(id);
    }

    @PutMapping("/{id}/status")
    public Complaint updateStatus(@PathVariable Long id,
                                  @RequestParam String status) {
        return service.updateStatus(id, status);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteComplaint(id);
        return "Complaint deleted successfully";
    }
}
