package com.vicky;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/funWithNumbers")
public class FunWithNumbers {


    @GET
    @Path("/addFish")
    @Produces(MediaType.TEXT_PLAIN)
    public int funWithNumbersAddFish() {
        try {
            return 42;
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }
        
    }
    @GET
    @Path("/minusFish")
    @Produces(MediaType.TEXT_PLAIN)
    public int funWithNumbersMinusFish() {
        try {
            return -42;
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }

    }
}
