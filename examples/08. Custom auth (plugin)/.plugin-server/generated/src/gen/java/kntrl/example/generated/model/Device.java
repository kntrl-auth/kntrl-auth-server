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



@JsonTypeName("Device")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T22:48:57.779152+03:00[Europe/Kiev]")
public class Device   {
  private @Valid Boolean mobile;
  private @Valid String type;
  private @Valid String browser;
  private @Valid String userAgent;

  /**
   **/
  public Device mobile(Boolean mobile) {
    this.mobile = mobile;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("mobile")
  @NotNull
  public Boolean getMobile() {
    return mobile;
  }

  @JsonProperty("mobile")
  public void setMobile(Boolean mobile) {
    this.mobile = mobile;
  }

  /**
   **/
  public Device type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  public Device browser(String browser) {
    this.browser = browser;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("browser")
  public String getBrowser() {
    return browser;
  }

  @JsonProperty("browser")
  public void setBrowser(String browser) {
    this.browser = browser;
  }

  /**
   **/
  public Device userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("userAgent")
  @NotNull
  public String getUserAgent() {
    return userAgent;
  }

  @JsonProperty("userAgent")
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Device device = (Device) o;
    return Objects.equals(this.mobile, device.mobile) &&
        Objects.equals(this.type, device.type) &&
        Objects.equals(this.browser, device.browser) &&
        Objects.equals(this.userAgent, device.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobile, type, browser, userAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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

