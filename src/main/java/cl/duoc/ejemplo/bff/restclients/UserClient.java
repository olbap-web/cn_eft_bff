package cl.duoc.ejemplo.bff.restclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.duoc.ejemplo.bff.models.User;

import java.util.List;

@FeignClient(name = "AzureFunctionClientUser", url = "http://localhost:8080/api")
public interface UserClient {

    @PostMapping("/usuarios")
    String create(@RequestBody User user);

    @GetMapping("/usuarios")
    List<User> read();

   @GetMapping("/usuarios/{id}")
    User readById(@PathVariable("id") int id);

    @PutMapping("/usuarios")
    User updateUser(@RequestBody User user);


    
}

