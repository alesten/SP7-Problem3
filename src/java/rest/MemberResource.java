/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.DataFactory;

/**
 * REST Web Service
 *
 * @author Alexander
 */
@Path("member")
public class MemberResource {

    @Context
    private UriInfo context;
    private DataFactory df;
    public MemberResource() {
        df = new DataFactory();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMembers(){
        return Response.ok(df.getMembersAsJson()).build();
    }
}
