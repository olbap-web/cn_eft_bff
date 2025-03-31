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
    public List<Rol> obtenerRoles() {
        return rolService.obtenerRoles();
    }

    @GetMapping("/{id}")  // Se agrega el ID en la ruta
    public Rol obtenerRolById(@PathVariable("id") int id) {
        return rolService.getById(id);
    }

    @PostMapping
    public String crearRol(@RequestBody Rol rol) {
        return rolService.crearRol(rol);
    }
}