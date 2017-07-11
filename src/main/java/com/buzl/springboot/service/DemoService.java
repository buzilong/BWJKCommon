package com.buzl.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buzl.springboot.db.model.Demo;
import com.buzl.springboot.mapper.DemoMappper;

@Service
public class DemoService {
	@Autowired
	private DemoMappper demoMappper;

	public List<Demo> likeName(String name) {
		return demoMappper.likeName(name);
	}
}
