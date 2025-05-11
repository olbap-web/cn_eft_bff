package cl.duoc.ejemplo.bff.restclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.duoc.ejemplo.bff.models.GraphQLRequest;
import cl.duoc.ejemplo.bff.models.Rol;

import java.util.List;

@FeignClient(name = "AzureFunctionClient", url = "https://rol1function.azurewebsites.net")
public interface RolClient {

    //______________ GRAPHQL

    @PostMapping("/api/rol")
    String create(@RequestBody GraphQLRequest obj);
    
    @PostMapping("/api/rol")
    String update(@RequestBody GraphQLRequest obj);

    @PostMapping("/api/rol")
    String delete(@RequestBody GraphQLRequest obj);

    @PostMapping("/api/rol")
    String read(@RequestBody GraphQLRequest obj);

    @PostMapping("/api/rol")
    String readById(@RequestBody GraphQLRequest obj);

    @PostMapping("/api/rol")
    String userByRol(@RequestBody GraphQLRequest obj);
}