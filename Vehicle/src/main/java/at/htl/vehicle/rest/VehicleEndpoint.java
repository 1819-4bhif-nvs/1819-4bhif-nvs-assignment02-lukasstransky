package at.htl.vehicle.rest;

import at.htl.vehicle.model.Vehicle;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.ArrayList;
import java.util.List;

@Path("vehicle") //keine Groß und Kleinschreibung (Linux empfindlich)
public class VehicleEndpoint {
    @GET
    @Path("{id}")
    public Vehicle find(@PathParam("id") long id){
        return new Vehicle("Opel " + id, "Commodore");
    }

    @GET
    public List<Vehicle> findAll() {
        List<Vehicle> all = new ArrayList<>();
        all.add(find(42));
        return all;
    }
}
