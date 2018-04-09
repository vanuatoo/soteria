/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security.boundary;

import javax.json.Json;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author Vano.Beridze
 */
@Path("auth")
public class AuthResource {
    
    @GET
    public Response login() {
        return Response.ok(Json
                .createObjectBuilder()
                .add("token", "1234567890")
                .build())
                .build();
    }
    
}
