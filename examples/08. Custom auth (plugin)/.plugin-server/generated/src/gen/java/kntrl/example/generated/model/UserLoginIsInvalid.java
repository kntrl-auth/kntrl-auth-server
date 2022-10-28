package kntrl.example.generated.model;

import kntrl.example.generated.model.LoginId;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("UserLoginIsInvalid")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-22T00:20:30.250260+03:00[Europe/Kiev]")
public class UserLoginIsInvalid   {
  private String code;
  private String devMsg;
  private String msg;
  private LoginId loginId;

  /**
   **/
  public UserLoginIsInvalid code(String code) {
    this.code = code;
    return this;
  }

  
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Message for developers.
   **/
  public UserLoginIsInvalid devMsg(String devMsg) {
    this.devMsg = devMsg;
    return this;
  }

  
  @JsonProperty("devMsg")
  public String getDevMsg() {
    return devMsg;
  }

  @JsonProperty("devMsg")
  public void setDevMsg(String devMsg) {
    this.devMsg = devMsg;
  }

  /**
   * Localised message suitable for UI.
   **/
  public UserLoginIsInvalid msg(String msg) {
    this.msg = msg;
    return this;
  }

  
  @JsonProperty("msg")
  public String getMsg() {
    return msg;
  }

  @JsonProperty("msg")
  public void setMsg(String msg) {
    this.msg = msg;
  }

  /**
   **/
  public UserLoginIsInvalid loginId(LoginId loginId) {
    this.loginId = loginId;
    return this;
  }

  
  @JsonProperty("loginId")
  public LoginId getLoginId() {
    return loginId;
  }

  @JsonProperty("loginId")
  public void setLoginId(LoginId loginId) {
    this.loginId = loginId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLoginIsInvalid userLoginIsInvalid = (UserLoginIsInvalid) o;
    return Objects.equals(this.code, userLoginIsInvalid.code) &&
        Objects.equals(this.devMsg, userLoginIsInvalid.devMsg) &&
        Objects.equals(this.msg, userLoginIsInvalid.msg) &&
        Objects.equals(this.loginId, userLoginIsInvalid.loginId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, devMsg, msg, loginId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLoginIsInvalid {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    devMsg: ").append(toIndentedString(devMsg)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
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

