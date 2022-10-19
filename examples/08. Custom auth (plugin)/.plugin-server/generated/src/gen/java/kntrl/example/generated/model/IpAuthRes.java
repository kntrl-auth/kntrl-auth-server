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



@JsonTypeName("IpAuthRes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-19T21:13:03.480932+03:00[Europe/Kiev]")
public class IpAuthRes   {
  private @Valid String ipEncoded;

  /**
   **/
  public IpAuthRes ipEncoded(String ipEncoded) {
    this.ipEncoded = ipEncoded;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("ipEncoded")
  @NotNull
  public String getIpEncoded() {
    return ipEncoded;
  }

  @JsonProperty("ipEncoded")
  public void setIpEncoded(String ipEncoded) {
    this.ipEncoded = ipEncoded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAuthRes ipAuthRes = (IpAuthRes) o;
    return Objects.equals(this.ipEncoded, ipAuthRes.ipEncoded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipEncoded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAuthRes {\n");
    
    sb.append("    ipEncoded: ").append(toIndentedString(ipEncoded)).append("\n");
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

