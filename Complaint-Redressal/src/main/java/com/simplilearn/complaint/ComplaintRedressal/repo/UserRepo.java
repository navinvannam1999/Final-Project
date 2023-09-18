package com.simplilearn.complaint.ComplaintRedressal.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.complaint.ComplaintRedressal.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	public User findByUsername(String username);
	public List<User> findByRoleName(String roleName);

}
