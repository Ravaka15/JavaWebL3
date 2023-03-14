package com.back.sante.print;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.back.sante.model.Dossierpatient;
import com.back.sante.model.Ordonnance;
import com.back.sante.repository.OrdonnanceRepository;
import com.back.sante.repository.ReportRepository;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class ReportService {

	@Autowired
	private ReportRepository reportRepository;

	@Autowired
	private OrdonnanceRepository ordonnanceRepository;

	public String exportsReport(String reportFormat) throws FileNotFoundException, JRException {
		List<Ordonnance> dossierpatient = ordonnanceRepository.findAll();
		
		String path = "D:\\Bossy\\L3\\sante\\PrintSpring";
		
		File file = ResourceUtils.getFile("classpath:Listesp.jrxml");
		
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(dossierpatient);
		
		Map<String, Object> parameters = new HashMap<>();
			parameters.put("createdBy", "Java Techie");
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
	
		if(reportFormat.equalsIgnoreCase("html")) {
			JasperExportManager.exportReportToHtmlFile(jasperPrint,path+"\\Listesp.html");
		}
		
		if(reportFormat.equalsIgnoreCase("pdf")) {
			JasperExportManager.exportReportToPdfFile(jasperPrint,path+"\\Listesp.pdf");
		}
		
		return "report generated in path : "+path;
	}
}
