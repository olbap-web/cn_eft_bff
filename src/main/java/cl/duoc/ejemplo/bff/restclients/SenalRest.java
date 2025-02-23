package cl.duoc.ejemplo.bff.restclients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "SenalRest", url = "http://localhost:8182/")
public interface SenalRest {



	@GetMapping("senales/")
	<List>String read();

	
}
