
package cl.duoc.ejemplo.bff.services.impl;


import org.springframework.stereotype.Service;

import cl.duoc.ejemplo.bff.restclients.SenalRest;
import cl.duoc.ejemplo.bff.services.SenalService;

@Service
public class SenalServiceImpl implements SenalService {

	private final SenalRest senalRest;

	public SenalServiceImpl(SenalRest senalRest) {

		this.senalRest = senalRest;
	}


	public <List>String read() {
		return senalRest.read();
	}


}
