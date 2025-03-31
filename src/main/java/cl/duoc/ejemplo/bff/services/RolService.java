package cl.duoc.ejemplo.bff.services;

import org.springframework.stereotype.Service;

import cl.duoc.ejemplo.bff.models.Rol;
import cl.duoc.ejemplo.bff.restclients.RolClient;

import java.util.List;

@Service
public class RolService {

    private final RolClient rolClient;

    public RolService(RolClient rolClient) {
        this.rolClient = rolClient;
    }

    public List<Rol> obtenerRoles() {
        return rolClient.read();
    }
    public Rol getById(int id) {
        return rolClient.readById(id);
    }

    public String crearRol(Rol rol) {
        return rolClient.create(rol);
    }
}
