package cl.duoc.ejemplo.bff.restclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.duoc.ejemplo.bff.models.User;

import java.util.List;

@FeignClient(name = "AzureFunctionClientUser", url = "https://usuarios-app-rest.azurewebsites.net/")
public interface UserClient {

    @PostMapping("api/usuarios")
    String create(@RequestBody User user);

    @GetMapping("api/usuarios")
    List<User> read();

    @GetMapping("api/usuarios/{id}")
    User readById(@PathVariable("id") int id);

    @PutMapping("api/usuarios")
    User updateUser(@RequestBody User user);


    
}

