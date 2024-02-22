package com.worldline.quarkus;

import com.worldline.quarkus.crypto.CryptoImplementation;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("cipher")
public class CipherResource {


    @Inject
    CryptoImplementation cipher;

    @GET
    @Path("encrypt/{input}")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public String encryptService(@PathParam("input") String data){
        char[] inputData = data.toCharArray();
        return cipher.encrypt(inputData);
    }

    @GET
    @Path("decrypt/{input}")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public String decryptService(@PathParam("input") String data){
        char[] inputData = data.toCharArray();
        return cipher.decrypt(inputData);
    }
}
