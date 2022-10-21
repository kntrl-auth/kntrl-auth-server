package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kntrl.example.generated.model.LoginId;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("UserLoginIsInvalid")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-21T17:10:42.806916+03:00[Europe/Kiev]")
public class UserLoginIsInvalid   {
  private @Valid String code;
  private @Valid String devMsg;
  private @Valid String msg;
  private @Valid LoginId loginId;

  /**
   **/
  public UserLoginIsInvalid code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("code")
  @NotNull
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

  
  @ApiModelProperty(required = true, value = "Message for developers.")
  @JsonProperty("devMsg")
  @NotNull
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

  
  @ApiModelProperty(value = "Localised message suitable for UI.")
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

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("loginId")
  @NotNull
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

