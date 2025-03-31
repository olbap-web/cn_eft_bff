package cl.duoc.ejemplo.bff.services;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.duoc.ejemplo.bff.models.Producto;
import cl.duoc.ejemplo.bff.restclients.ProductoClient;

@Service
public class ProductoService {
    private final ProductoClient prodClient;

    public ProductoService(ProductoClient prodClient) {
        this.prodClient = prodClient;
    }

    public List<Producto> obtenerProductos() {
        return prodClient.read();
    }
    public Producto getById(int id) {
        return prodClient.readById(id);
    }

    public String createProduct(Producto prod) {
        return prodClient.create(prod);
    }
}
