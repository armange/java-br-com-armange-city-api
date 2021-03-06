package br.com.armange.backend.api.ftc.rest.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.armange.backend.api.ftc.entity.Veicle;
import br.com.armange.backend.api.ftc.rest.service.VeicleService;
import br.com.armange.rest.resource.ResourceFindAll;
import br.com.armange.rest.resource.ResourceFindCountedPage;
import br.com.armange.rest.resource.ResourceFindOne;
import br.com.armange.rest.resource.ResourceFindPage;
import br.com.armange.rest.resource.ResourceInsert;
import br.com.armange.rest.resource.ResourceUpdate;

@Path("/veicle")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class VeicleResource implements 
    ResourceFindAll<Integer, Veicle, VeicleService>, 
    ResourceFindCountedPage<Integer, Veicle, VeicleService>, 
    ResourceFindOne<Integer, Veicle, VeicleService>, 
    ResourceFindPage<Integer, Veicle, VeicleService>, 
    ResourceInsert<Integer, Veicle, VeicleService>, 
    ResourceUpdate<Integer, Veicle, VeicleService> {

    @Override
    public VeicleService getService() {
        return new VeicleService();
    }
}
