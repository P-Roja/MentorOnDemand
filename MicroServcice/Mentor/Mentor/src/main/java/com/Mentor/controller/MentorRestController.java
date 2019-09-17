package com.Mentor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Mentor.model.Mentor;
import com.Mentor.repository.MentorDao;


@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class MentorRestController {
	@Autowired
	MentorDao mentorDao;
	
	
	@PostMapping("/mentor/register")
	public Mentor insertMentor(@RequestBody Mentor mentor)
	{
		Mentor insertMentor=mentorDao.save(mentor);
	//	Login insertLogin=loginDao.save(new Login(mentor));
		return insertMentor;
		
		
	}

}
