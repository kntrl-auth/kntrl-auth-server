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



@JsonTypeName("BurnQuotaReq")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T22:48:57.779152+03:00[Europe/Kiev]")
public class BurnQuotaReq   {
  private @Valid Double quota;

  /**
   **/
  public BurnQuotaReq quota(Double quota) {
    this.quota = quota;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("quota")
  @NotNull
  public Double getQuota() {
    return quota;
  }

  @JsonProperty("quota")
  public void setQuota(Double quota) {
    this.quota = quota;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BurnQuotaReq burnQuotaReq = (BurnQuotaReq) o;
    return Objects.equals(this.quota, burnQuotaReq.quota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quota);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BurnQuotaReq {\n");
    
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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

