package resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.ArrayList;

@Api("/external/info/")
@Path("external/info/")
public class Resource653 {
    @ApiOperation(value = "test.")
    @GET
    public void getTest(@ApiParam(value = "test") ArrayList<String> tenantId) {
        return;
    }
}