package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kntrl.example.generated.model.AuthResResData;
import kntrl.example.generated.model.DryRunAuthResAuthData;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("DryRunAuthRes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-21T17:10:42.806916+03:00[Europe/Kiev]")
public class DryRunAuthRes   {
  private @Valid DryRunAuthResAuthData authData;
  private @Valid AuthResResData resData;

  /**
   **/
  public DryRunAuthRes authData(DryRunAuthResAuthData authData) {
    this.authData = authData;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("authData")
  public DryRunAuthResAuthData getAuthData() {
    return authData;
  }

  @JsonProperty("authData")
  public void setAuthData(DryRunAuthResAuthData authData) {
    this.authData = authData;
  }

  /**
   **/
  public DryRunAuthRes resData(AuthResResData resData) {
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
    DryRunAuthRes dryRunAuthRes = (DryRunAuthRes) o;
    return Objects.equals(this.authData, dryRunAuthRes.authData) &&
        Objects.equals(this.resData, dryRunAuthRes.resData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authData, resData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DryRunAuthRes {\n");
    
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

