package cl.duoc.ejemplo.bff.services;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.duoc.ejemplo.bff.models.User;
import cl.duoc.ejemplo.bff.restclients.UserClient;

@Service
public class UsuarioService {
    private final UserClient usrClient;

    public UsuarioService(UserClient usrClient) {
        this.usrClient = usrClient;
    }

    public List<User> obtenerUsuarios() {
        return usrClient.read();
    }
    public User getById(int id) {
        return usrClient.readById(id);
    }

    public String crearUser(User usr) {
        return usrClient.create(usr);
    }

    public User updateUser(User usr) {
        return usrClient.updateUser(usr);
    }
    // public User deletUser(User usr) {
    //     return usrClient.delte(usr);
    // }

}
