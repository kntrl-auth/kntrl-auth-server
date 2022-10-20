package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("IpPrivateData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T22:48:57.779152+03:00[Europe/Kiev]")
public class IpPrivateData extends HashMap<String, Object>  {
  private @Valid Map<String, Long> encodedIps = null;

  /**
   **/
  public IpPrivateData encodedIps(Map<String, Long> encodedIps) {
    this.encodedIps = encodedIps;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("encodedIps")
  public Map<String, Long> getEncodedIps() {
    return encodedIps;
  }

  @JsonProperty("encodedIps")
  public void setEncodedIps(Map<String, Long> encodedIps) {
    this.encodedIps = encodedIps;
  }

  public IpPrivateData putEncodedIpsItem(String key, Long encodedIpsItem) {
    if (this.encodedIps == null) {
      this.encodedIps = new HashMap<>();
    }

    this.encodedIps.put(key, encodedIpsItem);
    return this;
  }

  public IpPrivateData removeEncodedIpsItem(Long encodedIpsItem) {
    if (encodedIpsItem != null && this.encodedIps != null) {
      this.encodedIps.remove(encodedIpsItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpPrivateData ipPrivateData = (IpPrivateData) o;
    return Objects.equals(this.encodedIps, ipPrivateData.encodedIps) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodedIps, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpPrivateData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    encodedIps: ").append(toIndentedString(encodedIps)).append("\n");
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

