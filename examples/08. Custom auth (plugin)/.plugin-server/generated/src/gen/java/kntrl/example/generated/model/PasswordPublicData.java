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



@JsonTypeName("PasswordPublicData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-21T17:10:42.806916+03:00[Europe/Kiev]")
public class PasswordPublicData extends HashMap<String, Object>  {
  private @Valid Long updatedAt;

  /**
   * Time when password was updated last time.
   **/
  public PasswordPublicData updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Time when password was updated last time.")
  @JsonProperty("updatedAt")
  @NotNull
  public Long getUpdatedAt() {
    return updatedAt;
  }

  @JsonProperty("updatedAt")
  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordPublicData passwordPublicData = (PasswordPublicData) o;
    return Objects.equals(this.updatedAt, passwordPublicData.updatedAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updatedAt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPublicData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

