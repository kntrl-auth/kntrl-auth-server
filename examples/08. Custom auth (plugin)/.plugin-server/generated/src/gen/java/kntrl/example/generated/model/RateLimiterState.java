package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kntrl.example.generated.model.RateLimiterStateId;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("RateLimiterState")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-19T21:13:03.480932+03:00[Europe/Kiev]")
public class RateLimiterState   {
  private @Valid RateLimiterStateId id;
  private @Valid Double burntQuota;

  /**
   **/
  public RateLimiterState id(RateLimiterStateId id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public RateLimiterStateId getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(RateLimiterStateId id) {
    this.id = id;
  }

  /**
   **/
  public RateLimiterState burntQuota(Double burntQuota) {
    this.burntQuota = burntQuota;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("burntQuota")
  @NotNull
  public Double getBurntQuota() {
    return burntQuota;
  }

  @JsonProperty("burntQuota")
  public void setBurntQuota(Double burntQuota) {
    this.burntQuota = burntQuota;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateLimiterState rateLimiterState = (RateLimiterState) o;
    return Objects.equals(this.id, rateLimiterState.id) &&
        Objects.equals(this.burntQuota, rateLimiterState.burntQuota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, burntQuota);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateLimiterState {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    burntQuota: ").append(toIndentedString(burntQuota)).append("\n");
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

