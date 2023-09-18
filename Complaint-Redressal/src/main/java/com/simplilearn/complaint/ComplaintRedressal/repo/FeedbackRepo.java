package com.simplilearn.complaint.ComplaintRedressal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.complaint.ComplaintRedressal.entities.Feedback;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, Integer> {
	
	public Feedback findByCid(int cid);


}
