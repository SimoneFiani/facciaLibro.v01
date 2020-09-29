package it.fiani.facciaLibro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.fiani.facciaLibro.service.StatisticheService;

@Controller
@RequestMapping("/statistiche")

public class StatisticheController {
	@Autowired
	StatisticheService statisticheService;

	@GetMapping("/")
	public String indexStatistiche() {

		return "index-statistiche";
	}

}
