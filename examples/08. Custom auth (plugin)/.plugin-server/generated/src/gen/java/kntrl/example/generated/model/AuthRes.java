package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kntrl.example.generated.model.AuthResAuthData;
import kntrl.example.generated.model.AuthResResData;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AuthRes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T19:23:38.989036+03:00[Europe/Kiev]")
public class AuthRes   {
  private @Valid AuthResAuthData authData;
  private @Valid AuthResResData resData;

  /**
   **/
  public AuthRes authData(AuthResAuthData authData) {
    this.authData = authData;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("authData")
  @NotNull
  public AuthResAuthData getAuthData() {
    return authData;
  }

  @JsonProperty("authData")
  public void setAuthData(AuthResAuthData authData) {
    this.authData = authData;
  }

  /**
   **/
  public AuthRes resData(AuthResResData resData) {
    this.resData = resData;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resData")
  public AuthResResData getResData() {
    return resData;
  }

  @JsonProperty("resData")
  public void setResData(AuthResResData resData) {
    this.resData = resData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthRes authRes = (AuthRes) o;
    return Objects.equals(this.authData, authRes.authData) &&
        Objects.equals(this.resData, authRes.resData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authData, resData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthRes {\n");
    
    sb.append("    authData: ").append(toIndentedString(authData)).append("\n");
    sb.append("    resData: ").append(toIndentedString(resData)).append("\n");
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

