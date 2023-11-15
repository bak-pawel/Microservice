package com.bak.paw.endpoints;

import com.bak.paw.model.Users;
import com.bak.paw.service.UsersService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/users")
public class UsersEndpoint {

    @Inject
    UsersService usersService;

    @GET
    @Path("/getUsers")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Users> getAll() {
        return usersService.findAll();
    }

}
