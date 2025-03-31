package cl.duoc.ejemplo.bff.controllers;

import org.springframework.web.bind.annotation.*;

import cl.duoc.ejemplo.bff.models.User;
import cl.duoc.ejemplo.bff.services.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usrService;

    public UsuarioController(UsuarioService usrService) {
        this.usrService = usrService;
    }

    @GetMapping
    public List<User> obtenerRoles() {
        return usrService.obtenerUsuarios();
    }

    @GetMapping("/{id}")  
    public User obtenerRolById(@PathVariable("id") int id) {
        return usrService.getById(id);
    }

    @PostMapping
    public String crearUser(@RequestBody User usr) {
        return usrService.crearUser(usr);
    }

    @PutMapping
    public User updateUser( @RequestBody User usr) {
        return usrService.updateUser(usr);
    }
}