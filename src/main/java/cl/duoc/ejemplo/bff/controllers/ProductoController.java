package cl.duoc.ejemplo.bff.controllers;

import org.springframework.web.bind.annotation.*;

import cl.duoc.ejemplo.bff.models.Producto;
import cl.duoc.ejemplo.bff.services.ProductoService;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService prodService;

    public ProductoController(ProductoService prodService) {
        this.prodService = prodService;
    }

    @GetMapping
    public List<Producto> obtenerRoles() {
        return prodService.obtenerProductos();
    }

    @GetMapping("/{id}")  
    public Producto obtenerRolById(@PathVariable("id") int id) {
        return prodService.getById(id);
    }

    @PostMapping
    public String crearRol(@RequestBody Producto prod) {
        return prodService.createProduct(prod);
    }
}