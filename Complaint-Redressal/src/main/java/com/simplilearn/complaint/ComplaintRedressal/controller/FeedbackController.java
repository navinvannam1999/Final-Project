package com.simplilearn.complaint.ComplaintRedressal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.complaint.ComplaintRedressal.entities.Feedback;
import com.simplilearn.complaint.ComplaintRedressal.service.ComplaintService;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/feedback")
public class FeedbackController {
	
	@Autowired
	private ComplaintService complaintService;
	
	@GetMapping("/get-feedback")
	public ResponseEntity<?> getFeedback(){
		List<Feedback> feedbacks = this.complaintService.findAllFeedback();
		if(feedbacks.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}else {
			return ResponseEntity.ok(feedbacks);
		}
	}

}
