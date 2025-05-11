package cl.duoc.ejemplo.bff.controllers;

import org.springframework.web.bind.annotation.*;

import cl.duoc.ejemplo.bff.models.Rol;
import cl.duoc.ejemplo.bff.services.RolService;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RolController {

    private final RolService rolService;

    public RolController(RolService rolService) {
        this.rolService = rolService;
    }

    @GetMapping
    public String obtenerRoles() {
        return rolService.obtenerRoles();
    }

    @GetMapping("/{id}")  
    public String obtenerRolById(@PathVariable("id") int id) {
        return rolService.getById(id);
    }

    @GetMapping("/{id}/usuarios")  
    public String obtenerUsersByRol(@PathVariable("id") int id) {
        return rolService.getUsersByRol(id);
    }

    @PostMapping
    public String crearRol(@RequestBody Rol rol) {
        return rolService.crearRol(rol);
    }

    @PutMapping
    public String actualizaRol(@RequestBody Rol rol) {
        return rolService.updateRol(rol);
    }
    @DeleteMapping("/{id}")
    public String deleteRol(@PathVariable("id") int id) {
        return rolService.deleteRol(id);
    }
}