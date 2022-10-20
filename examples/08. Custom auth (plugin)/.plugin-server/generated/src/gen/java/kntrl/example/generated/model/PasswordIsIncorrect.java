package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PasswordIsIncorrect")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T19:23:38.989036+03:00[Europe/Kiev]")
public class PasswordIsIncorrect   {
  private @Valid String code;
  private @Valid String devMsg;
  private @Valid String msg;
  private @Valid Long changedAt;
  private @Valid Long changedDaysAgo;

  /**
   **/
  public PasswordIsIncorrect code(String code) {
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
  public PasswordIsIncorrect devMsg(String devMsg) {
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
  public PasswordIsIncorrect msg(String msg) {
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
  public PasswordIsIncorrect changedAt(Long changedAt) {
    this.changedAt = changedAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("changedAt")
  public Long getChangedAt() {
    return changedAt;
  }

  @JsonProperty("changedAt")
  public void setChangedAt(Long changedAt) {
    this.changedAt = changedAt;
  }

  /**
   **/
  public PasswordIsIncorrect changedDaysAgo(Long changedDaysAgo) {
    this.changedDaysAgo = changedDaysAgo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("changedDaysAgo")
  public Long getChangedDaysAgo() {
    return changedDaysAgo;
  }

  @JsonProperty("changedDaysAgo")
  public void setChangedDaysAgo(Long changedDaysAgo) {
    this.changedDaysAgo = changedDaysAgo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordIsIncorrect passwordIsIncorrect = (PasswordIsIncorrect) o;
    return Objects.equals(this.code, passwordIsIncorrect.code) &&
        Objects.equals(this.devMsg, passwordIsIncorrect.devMsg) &&
        Objects.equals(this.msg, passwordIsIncorrect.msg) &&
        Objects.equals(this.changedAt, passwordIsIncorrect.changedAt) &&
        Objects.equals(this.changedDaysAgo, passwordIsIncorrect.changedDaysAgo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, devMsg, msg, changedAt, changedDaysAgo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordIsIncorrect {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    devMsg: ").append(toIndentedString(devMsg)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    changedAt: ").append(toIndentedString(changedAt)).append("\n");
    sb.append("    changedDaysAgo: ").append(toIndentedString(changedDaysAgo)).append("\n");
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

