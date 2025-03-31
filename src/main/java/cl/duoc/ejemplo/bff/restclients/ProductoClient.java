package cl.duoc.ejemplo.bff.restclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.duoc.ejemplo.bff.models.Producto;

import java.util.List;

@FeignClient(name = "ProductoMS", url = "http://localhost:8181")
public interface ProductoClient {

    @PostMapping("/producto")
    String create(@RequestBody Producto prod);

    @GetMapping("/producto")
    List<Producto> read();

   @GetMapping("/producto/{id}")
    Producto readById(@PathVariable("id") int id);
}