package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kntrl.example.generated.model.AuthReqAuthData;
import kntrl.example.generated.model.AuthReqCodeToSend;
import kntrl.example.generated.model.AuthReqSession;
import kntrl.example.generated.model.AuthReqUser;
import kntrl.example.generated.model.ReqCtx;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AuthReq")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-19T21:13:03.480932+03:00[Europe/Kiev]")
public class AuthReq   {
  private @Valid Object dryRunAuthResData;
  private @Valid AuthReqUser user;
  private @Valid AuthReqSession session;
  private @Valid AuthReqAuthData authData;
  private @Valid AuthReqCodeToSend codeToSend;
  private @Valid Object reqData;
  private @Valid ReqCtx ctx;

  /**
   * Response provided by dry-run execution
   **/
  public AuthReq dryRunAuthResData(Object dryRunAuthResData) {
    this.dryRunAuthResData = dryRunAuthResData;
    return this;
  }

  
  @ApiModelProperty(value = "Response provided by dry-run execution")
  @JsonProperty("dryRunAuthResData")
  public Object getDryRunAuthResData() {
    return dryRunAuthResData;
  }

  @JsonProperty("dryRunAuthResData")
  public void setDryRunAuthResData(Object dryRunAuthResData) {
    this.dryRunAuthResData = dryRunAuthResData;
  }

  /**
   **/
  public AuthReq user(AuthReqUser user) {
    this.user = user;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user")
  public AuthReqUser getUser() {
    return user;
  }

  @JsonProperty("user")
  public void setUser(AuthReqUser user) {
    this.user = user;
  }

  /**
   **/
  public AuthReq session(AuthReqSession session) {
    this.session = session;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("session")
  public AuthReqSession getSession() {
    return session;
  }

  @JsonProperty("session")
  public void setSession(AuthReqSession session) {
    this.session = session;
  }

  /**
   **/
  public AuthReq authData(AuthReqAuthData authData) {
    this.authData = authData;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("authData")
  public AuthReqAuthData getAuthData() {
    return authData;
  }

  @JsonProperty("authData")
  public void setAuthData(AuthReqAuthData authData) {
    this.authData = authData;
  }

  /**
   **/
  public AuthReq codeToSend(AuthReqCodeToSend codeToSend) {
    this.codeToSend = codeToSend;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("codeToSend")
  public AuthReqCodeToSend getCodeToSend() {
    return codeToSend;
  }

  @JsonProperty("codeToSend")
  public void setCodeToSend(AuthReqCodeToSend codeToSend) {
    this.codeToSend = codeToSend;
  }

  /**
   * Request data provided by client.
   **/
  public AuthReq reqData(Object reqData) {
    this.reqData = reqData;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Request data provided by client.")
  @JsonProperty("reqData")
  @NotNull
  public Object getReqData() {
    return reqData;
  }

  @JsonProperty("reqData")
  public void setReqData(Object reqData) {
    this.reqData = reqData;
  }

  /**
   **/
  public AuthReq ctx(ReqCtx ctx) {
    this.ctx = ctx;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("ctx")
  @NotNull
  public ReqCtx getCtx() {
    return ctx;
  }

  @JsonProperty("ctx")
  public void setCtx(ReqCtx ctx) {
    this.ctx = ctx;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthReq authReq = (AuthReq) o;
    return Objects.equals(this.dryRunAuthResData, authReq.dryRunAuthResData) &&
        Objects.equals(this.user, authReq.user) &&
        Objects.equals(this.session, authReq.session) &&
        Objects.equals(this.authData, authReq.authData) &&
        Objects.equals(this.codeToSend, authReq.codeToSend) &&
        Objects.equals(this.reqData, authReq.reqData) &&
        Objects.equals(this.ctx, authReq.ctx);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRunAuthResData, user, session, authData, codeToSend, reqData, ctx);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthReq {\n");
    
    sb.append("    dryRunAuthResData: ").append(toIndentedString(dryRunAuthResData)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    authData: ").append(toIndentedString(authData)).append("\n");
    sb.append("    codeToSend: ").append(toIndentedString(codeToSend)).append("\n");
    sb.append("    reqData: ").append(toIndentedString(reqData)).append("\n");
    sb.append("    ctx: ").append(toIndentedString(ctx)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

