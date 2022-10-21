package ignored.kntrl.example.generated.api;

import kntrl.example.generated.model.AuthReq;
import kntrl.example.generated.model.AuthRes;
import kntrl.example.generated.model.BurnQuotaReq;
import kntrl.example.generated.model.DryRunAuthRes;
import kntrl.example.generated.model.FindSessionRes;
import kntrl.example.generated.model.FindSessionsRes;
import kntrl.example.generated.model.FindUserRes;
import java.util.Map;
import kntrl.example.generated.model.RateLimiterState;
import kntrl.example.generated.model.RateLimiterStateId;
import kntrl.example.generated.model.SaveSessionReq;
import kntrl.example.generated.model.SaveUserReq;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/plugin")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-22T00:20:30.250260+03:00[Europe/Kiev]")
public interface PluginApi {

    @POST
    @Path("/auth/authenticate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    AuthRes authenticate(AuthReq authReq);

    @POST
    @Path("/auth/authenticate/dry-run")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    DryRunAuthRes authenticateDryRun(AuthReq authReq);

    @POST
    @Path("/rate-limiter/{id}/burn-quota")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    RateLimiterState burnQuota(@PathParam("id") RateLimiterStateId id,BurnQuotaReq burnQuotaReq);

    @GET
    @Path("/repository/session/{id}")
    @Produces({ "application/json" })
    FindSessionRes findSession(@PathParam("id") String id);

    @GET
    @Path("/repository/session")
    @Produces({ "application/json" })
    FindSessionsRes findSessions(@QueryParam("userId")   String userId,@QueryParam("entry")   String entry);

    @GET
    @Path("/repository/user")
    @Produces({ "application/json" })
    FindUserRes findUser(@QueryParam("login-type")   String loginType,@QueryParam("login")   String login);

    @POST
    @Path("/repository/session")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    void saveSession(SaveSessionReq saveSessionReq);

    @POST
    @Path("/repository/user")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    void saveUser(SaveUserReq saveUserReq);

    @POST
    @Path("/auth/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    AuthRes updateAuth(AuthReq authReq);

    @POST
    @Path("/auth/update/dry-run")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    DryRunAuthRes updateAuthDryRun(AuthReq authReq);
}
