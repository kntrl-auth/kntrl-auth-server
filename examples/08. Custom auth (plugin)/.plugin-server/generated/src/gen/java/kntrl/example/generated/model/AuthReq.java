package kntrl.example.generated.model;

import java.util.HashMap;
import java.util.Map;
import kntrl.example.generated.model.AuthReqAuthData;
import kntrl.example.generated.model.AuthReqCodeToSend;
import kntrl.example.generated.model.AuthReqSession;
import kntrl.example.generated.model.AuthReqUser;
import kntrl.example.generated.model.ReqCtx;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AuthReq")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-22T00:20:30.250260+03:00[Europe/Kiev]")
public class AuthReq   {
  private Map<String, Object> dryRunAuthResData = null;
  private AuthReqUser user;
  private AuthReqSession session;
  private AuthReqAuthData authData;
  private AuthReqCodeToSend codeToSend;
  private Map<String, Object> reqData = new HashMap<>();
  private ReqCtx ctx;

  /**
   * Response provided by dry-run execution
   **/
  public AuthReq dryRunAuthResData(Map<String, Object> dryRunAuthResData) {
    this.dryRunAuthResData = dryRunAuthResData;
    return this;
  }

  
  @JsonProperty("dryRunAuthResData")
  public Map<String, Object> getDryRunAuthResData() {
    return dryRunAuthResData;
  }

  @JsonProperty("dryRunAuthResData")
  public void setDryRunAuthResData(Map<String, Object> dryRunAuthResData) {
    this.dryRunAuthResData = dryRunAuthResData;
  }

  public AuthReq putDryRunAuthResDataItem(String key, Object dryRunAuthResDataItem) {
    if (this.dryRunAuthResData == null) {
      this.dryRunAuthResData = new HashMap<>();
    }

    this.dryRunAuthResData.put(key, dryRunAuthResDataItem);
    return this;
  }

  public AuthReq removeDryRunAuthResDataItem(Object dryRunAuthResDataItem) {
    if (dryRunAuthResDataItem != null && this.dryRunAuthResData != null) {
      this.dryRunAuthResData.remove(dryRunAuthResDataItem);
    }

    return this;
  }
  /**
   **/
  public AuthReq user(AuthReqUser user) {
    this.user = user;
    return this;
  }

  
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

  
  @JsonProperty("codeToSend")
  public AuthReqCodeToSend getCodeToSend() {
    return codeToSend;
  }

  @JsonProperty("codeToSend")
  public void setCodeToSend(AuthReqCodeToSend codeToSend) {
    this.codeToSend = codeToSend;
  }

  /**
   **/
  public AuthReq reqData(Map<String, Object> reqData) {
    this.reqData = reqData;
    return this;
  }

  
  @JsonProperty("reqData")
  public Map<String, Object> getReqData() {
    return reqData;
  }

  @JsonProperty("reqData")
  public void setReqData(Map<String, Object> reqData) {
    this.reqData = reqData;
  }

  public AuthReq putReqDataItem(String key, Object reqDataItem) {
    if (this.reqData == null) {
      this.reqData = new HashMap<>();
    }

    this.reqData.put(key, reqDataItem);
    return this;
  }

  public AuthReq removeReqDataItem(Object reqDataItem) {
    if (reqDataItem != null && this.reqData != null) {
      this.reqData.remove(reqDataItem);
    }

    return this;
  }
  /**
   **/
  public AuthReq ctx(ReqCtx ctx) {
    this.ctx = ctx;
    return this;
  }

  
  @JsonProperty("ctx")
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

