package com.back.sante.controller;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.back.sante.print.ReportService;

import net.sf.jasperreports.engine.JRException;

public class ReportController {
	@Autowired
	ReportService service;
	
	@GetMapping("/print/{format}")
	public String generateReport(@PathVariable String format) throws FileNotFoundException, JRException{
		return service.exportsReport(format);
	}
}
