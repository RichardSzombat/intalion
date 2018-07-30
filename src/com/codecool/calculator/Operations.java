package com.codecool.calculator;
import javax.jws.WebMethod;
import javax.jws.WebService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/calculator")
@WebService
public class Operations {
  @GET
  @WebMethod
  @Path("/addition/{number1}/{number2}")
  public float addition(@PathParam("number1")float number1,
                         @PathParam("number2")float number2) {

    return number1+number2;
  }
}