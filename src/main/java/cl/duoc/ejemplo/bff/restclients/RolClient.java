package cl.duoc.ejemplo.bff.restclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.duoc.ejemplo.bff.models.Rol;

import java.util.List;

@FeignClient(name = "AzureFunctionClient", url = "http://localhost:7071/api")
public interface RolClient {

    @PostMapping("/rol")
    String create(@RequestBody Rol rol);

    @GetMapping("/rol")
    List<Rol> read();

   @GetMapping("/rol?id={id}")
    Rol readById(@PathVariable("id") int id);
}