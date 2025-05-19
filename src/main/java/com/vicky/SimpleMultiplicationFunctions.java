package com.vicky;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/simpleTwoTimesMultiply/{id}")
public class SimpleMultiplicationFunctions {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public int simpleTwoTimesMultiply(@PathParam("id") int userNumber) {
        try {
            var timesBy = 2;

            return userNumber * timesBy;
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }
        
    }

}
