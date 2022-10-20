package ignored.kntrl.example.generated.api;

import kntrl.example.generated.model.AuthReq;
import kntrl.example.generated.model.AuthRes;
import kntrl.example.generated.model.BurnQuotaReq;
import kntrl.example.generated.model.ClientErr;
import kntrl.example.generated.model.DryRunAuthRes;
import kntrl.example.generated.model.FindSessionRes;
import kntrl.example.generated.model.FindSessionsRes;
import kntrl.example.generated.model.FindUserRes;
import kntrl.example.generated.model.IntegrationErr;
import kntrl.example.generated.model.RateLimiterState;
import kntrl.example.generated.model.RateLimiterStateId;
import kntrl.example.generated.model.SaveSessionReq;
import kntrl.example.generated.model.SaveUserReq;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/plugin")
@Api(description = "the plugin API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T22:48:57.779152+03:00[Europe/Kiev]")
public interface PluginApi {

    @POST
    @Path("/auth/authenticate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Authenticate", notes = "Called during sign-in (or sign-up if user isn't identified). ", tags={ "plugin/auth" })
    @ApiResponses(value = { 
        @ApiResponse(code = 4XX, message = "Client error", response = ClientErr.class),
        @ApiResponse(code = 5XX, message = "Server error", response = IntegrationErr.class),
        @ApiResponse(code = 200, message = "Success", response = AuthRes.class) })
    AuthRes authenticate(@Valid @NotNull AuthReq authReq);

    @POST
    @Path("/auth/authenticate/dry-run")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Authenticate dry-run", notes = "This is called before sign-in (or sign-up if user isn't identified). Performs validation of request. ", tags={ "plugin/auth" })
    @ApiResponses(value = { 
        @ApiResponse(code = 4XX, message = "Client error", response = ClientErr.class),
        @ApiResponse(code = 5XX, message = "Server error", response = IntegrationErr.class),
        @ApiResponse(code = 200, message = "Success", response = DryRunAuthRes.class) })
    DryRunAuthRes authenticateDryRun(@Valid @NotNull AuthReq authReq);

    @POST
    @Path("/rate-limiter/{id}/burn-quota")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "Performs INCREMENT and GET operation. Adds `quota` amount to stored rate-limiter by limiter-id and returns it.", tags={ "plugin/rate-limiter" })
    @ApiResponses(value = { 
        @ApiResponse(code = 4XX, message = "Client error", response = ClientErr.class),
        @ApiResponse(code = 5XX, message = "Server error", response = IntegrationErr.class),
        @ApiResponse(code = 200, message = "Success", response = RateLimiterState.class) })
    RateLimiterState burnQuota(@PathParam("id") RateLimiterStateId id,@Valid @NotNull BurnQuotaReq burnQuotaReq);

    @GET
    @Path("/repository/session/{id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Find session by id", notes = "Find single session ", tags={ "plugin/repo/session" })
    @ApiResponses(value = { 
        @ApiResponse(code = 4XX, message = "Client error", response = ClientErr.class),
        @ApiResponse(code = 5XX, message = "Server error", response = IntegrationErr.class),
        @ApiResponse(code = 200, message = "Success", response = FindSessionRes.class) })
    FindSessionRes findSession(@PathParam("id") String id);

    @GET
    @Path("/repository/session")
    @Produces({ "application/json" })
    @ApiOperation(value = "Find sessions", notes = "Find all user sessions ", tags={ "plugin/repo/session" })
    @ApiResponses(value = { 
        @ApiResponse(code = 4XX, message = "Client error", response = ClientErr.class),
        @ApiResponse(code = 5XX, message = "Server error", response = IntegrationErr.class),
        @ApiResponse(code = 200, message = "Success", response = FindSessionsRes.class) })
    FindSessionsRes findSessions(@QueryParam("userId") @NotNull   String userId,@QueryParam("entry")   String entry);

    @GET
    @Path("/repository/user")
    @Produces({ "application/json" })
    @ApiOperation(value = "Find user", notes = "Finds user by login. ", tags={ "plugin/repo/user" })
    @ApiResponses(value = { 
        @ApiResponse(code = 4XX, message = "Client error", response = ClientErr.class),
        @ApiResponse(code = 5XX, message = "Server error", response = IntegrationErr.class),
        @ApiResponse(code = 200, message = "Success", response = FindUserRes.class) })
    FindUserRes findUser(@QueryParam("login-type") @NotNull   String loginType,@QueryParam("login") @NotNull   String login);

    @POST
    @Path("/repository/session")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Save sessions", notes = "Save/update/remove sessions ", tags={ "plugin/repo/session" })
    @ApiResponses(value = { 
        @ApiResponse(code = 4XX, message = "Client error", response = ClientErr.class),
        @ApiResponse(code = 5XX, message = "Server error", response = IntegrationErr.class),
        @ApiResponse(code = 200, message = "Success", response = Void.class) })
    void saveSession(@Valid @NotNull SaveSessionReq saveSessionReq);

    @POST
    @Path("/repository/user")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Find user", notes = "Saves users. Be careful with order. To avoid potential \"duplicated entry\" problem, remove operation goes firs, then update, then insert. ", tags={ "plugin/repo/user" })
    @ApiResponses(value = { 
        @ApiResponse(code = 4XX, message = "Client error", response = ClientErr.class),
        @ApiResponse(code = 5XX, message = "Server error", response = IntegrationErr.class),
        @ApiResponse(code = 200, message = "Success", response = Void.class) })
    void saveUser(@Valid @NotNull SaveUserReq saveUserReq);

    @POST
    @Path("/auth/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update auth", notes = "This is called during sign-up or auth enabling. ", tags={ "plugin/auth" })
    @ApiResponses(value = { 
        @ApiResponse(code = 4XX, message = "Client error", response = ClientErr.class),
        @ApiResponse(code = 5XX, message = "Server error", response = IntegrationErr.class),
        @ApiResponse(code = 200, message = "Success", response = AuthRes.class) })
    AuthRes updateAuth(@Valid @NotNull AuthReq authReq);

    @POST
    @Path("/auth/update/dry-run")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update auth dry-run", notes = "This is called before sign-up or auth enabling. Performs validation of request. ", tags={ "plugin/auth" })
    @ApiResponses(value = { 
        @ApiResponse(code = 4XX, message = "Client error", response = ClientErr.class),
        @ApiResponse(code = 5XX, message = "Server error", response = IntegrationErr.class),
        @ApiResponse(code = 200, message = "Success", response = DryRunAuthRes.class) })
    DryRunAuthRes updateAuthDryRun(@Valid @NotNull AuthReq authReq);
}
