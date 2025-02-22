package cl.duoc.ejemplo.bff.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.ejemplo.bff.services.BffService;
import cl.duoc.ejemplo.bff.services.SenalService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
// @RequestMapping("/bff")
public class BffController {

	// private final BffService bffService;

	// public BffController(BffService bffService) {
	// 	this.bffService = bffService;
	// }


	@Autowired
	private BffService bffService ;
	@Autowired
	private SenalService senalService ;

	// @GetMapping("senales/")
	// public ResponseEntity<List<String>> readsenales() {
	// 	return ResponseEntity.ok(bffService.read());
	// }
	@GetMapping("alertas/")
	public ResponseEntity<String> readalertas() {
		return ResponseEntity.ok(bffService.read());
	}

	@GetMapping("senales/")
	public ResponseEntity<String> readSenales() {
		return ResponseEntity.ok(senalService.read());
	}

	
}
