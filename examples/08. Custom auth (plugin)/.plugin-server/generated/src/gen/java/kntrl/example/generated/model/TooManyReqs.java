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



@JsonTypeName("TooManyReqs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T19:23:38.989036+03:00[Europe/Kiev]")
public class TooManyReqs   {
  private @Valid String code;
  private @Valid String devMsg;
  private @Valid String msg;
  private @Valid Integer waitTimeMs;
  private @Valid Integer waitTimeSeconds;
  private @Valid Integer waitTimeMinutes;

  /**
   **/
  public TooManyReqs code(String code) {
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
  public TooManyReqs devMsg(String devMsg) {
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
  public TooManyReqs msg(String msg) {
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
  public TooManyReqs waitTimeMs(Integer waitTimeMs) {
    this.waitTimeMs = waitTimeMs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("waitTimeMs")
  public Integer getWaitTimeMs() {
    return waitTimeMs;
  }

  @JsonProperty("waitTimeMs")
  public void setWaitTimeMs(Integer waitTimeMs) {
    this.waitTimeMs = waitTimeMs;
  }

  /**
   **/
  public TooManyReqs waitTimeSeconds(Integer waitTimeSeconds) {
    this.waitTimeSeconds = waitTimeSeconds;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("waitTimeSeconds")
  public Integer getWaitTimeSeconds() {
    return waitTimeSeconds;
  }

  @JsonProperty("waitTimeSeconds")
  public void setWaitTimeSeconds(Integer waitTimeSeconds) {
    this.waitTimeSeconds = waitTimeSeconds;
  }

  /**
   **/
  public TooManyReqs waitTimeMinutes(Integer waitTimeMinutes) {
    this.waitTimeMinutes = waitTimeMinutes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("waitTimeMinutes")
  public Integer getWaitTimeMinutes() {
    return waitTimeMinutes;
  }

  @JsonProperty("waitTimeMinutes")
  public void setWaitTimeMinutes(Integer waitTimeMinutes) {
    this.waitTimeMinutes = waitTimeMinutes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TooManyReqs tooManyReqs = (TooManyReqs) o;
    return Objects.equals(this.code, tooManyReqs.code) &&
        Objects.equals(this.devMsg, tooManyReqs.devMsg) &&
        Objects.equals(this.msg, tooManyReqs.msg) &&
        Objects.equals(this.waitTimeMs, tooManyReqs.waitTimeMs) &&
        Objects.equals(this.waitTimeSeconds, tooManyReqs.waitTimeSeconds) &&
        Objects.equals(this.waitTimeMinutes, tooManyReqs.waitTimeMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, devMsg, msg, waitTimeMs, waitTimeSeconds, waitTimeMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TooManyReqs {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    devMsg: ").append(toIndentedString(devMsg)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    waitTimeMs: ").append(toIndentedString(waitTimeMs)).append("\n");
    sb.append("    waitTimeSeconds: ").append(toIndentedString(waitTimeSeconds)).append("\n");
    sb.append("    waitTimeMinutes: ").append(toIndentedString(waitTimeMinutes)).append("\n");
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

