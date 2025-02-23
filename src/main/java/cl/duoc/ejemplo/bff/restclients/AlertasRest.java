package cl.duoc.ejemplo.bff.restclients;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "AlertasRest", url = "http://localhost:8181/")
public interface AlertasRest {

	@PostMapping
	String create(@RequestBody Map<String, String> body);

	@GetMapping("alertas/")
	<List>String read();


}
