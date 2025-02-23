package cl.duoc.ejemplo.bff.services.impl;


import org.springframework.stereotype.Service;

import cl.duoc.ejemplo.bff.restclients.AlertasRest;
import cl.duoc.ejemplo.bff.services.BffService;

@Service
public class BffServiceImpl implements BffService {

	private final AlertasRest alertaRest;

	public BffServiceImpl(AlertasRest alertaRest) {

		this.alertaRest = alertaRest;
	}


	public <List>String read() {
		return alertaRest.read();
	}

	
}
