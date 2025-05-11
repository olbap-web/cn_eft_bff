package cl.duoc.ejemplo.bff.services;

import org.springframework.stereotype.Service;

import cl.duoc.ejemplo.bff.models.GraphQLRequest;
import cl.duoc.ejemplo.bff.models.Rol;
import cl.duoc.ejemplo.bff.restclients.RolClient;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RolService {

    private final RolClient rolClient;

    public RolService(RolClient rolClient) {
        this.rolClient = rolClient;
    }

    public String obtenerRoles() {
         GraphQLRequest req = new GraphQLRequest();

        req.setQuery("query { listarRoles { id,  descripcion, estado } }");

        
        return rolClient.read(req);
    }
    public String getById(int id) {
        GraphQLRequest req = new GraphQLRequest();

        req.setQuery("query($id:Int!) { obtenerRol (id: $id) {  id, descripcion } }");

        Map<String, Object> variables = new HashMap<>();
        variables.put("id", id);


        req.setVariables(variables);

        return rolClient.readById(req);
    }

    public String getUsersByRol(int id) {
        GraphQLRequest req = new GraphQLRequest();

        req.setQuery("query ($id:Int!) { usuariosByRol (id: $id) {  id, nombre } }");

        Map<String, Object> variables = new HashMap<>();
        variables.put("id", id);


        req.setVariables(variables);

        return rolClient.readById(req);
    }

    public String crearRol(Rol rol) {

        GraphQLRequest req = new GraphQLRequest();

        req.setQuery("mutation($id: Int!, $descripcion: String!, $estado: String!) { crearRol(id: $id, descripcion: $descripcion, estado: $estado) { id descripcion estado } }");

        Map<String, Object> variables = new HashMap<>();
        variables.put("id", rol.getId());
        variables.put("descripcion", rol.getdescripcion());
        variables.put("estado", rol.getEstado());

        req.setVariables(variables);

        return rolClient.create(req);
    }

    public String updateRol(Rol rol){
        GraphQLRequest req = new GraphQLRequest();

        req.setQuery("mutation($id: Int!, $descripcion: String!, $estado: String!) { actualizarRol(id: $id, descripcion: $descripcion, estado: $estado) { id descripcion estado } }");

        Map<String, Object> variables = new HashMap<>();

        variables.put("id", rol.getId());
        variables.put("descripcion", rol.getdescripcion());
        variables.put("estado", rol.getEstado());

        req.setVariables(variables);    

        return rolClient.update(req);
    }
    public String deleteRol(int id){
        GraphQLRequest req = new GraphQLRequest();

        req.setQuery("mutation($id: Int!) { eliminarRol(id: $id) }");

        Map<String, Object> variables = new HashMap<>();

        variables.put("id", id);


        req.setVariables(variables);    

        return rolClient.delete(req);
    }
}
