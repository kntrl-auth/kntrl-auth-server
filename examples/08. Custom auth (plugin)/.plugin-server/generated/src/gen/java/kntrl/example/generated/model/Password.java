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



@JsonTypeName("Password")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-21T17:10:42.806916+03:00[Europe/Kiev]")
public class Password   {
  private @Valid String hash;
  private @Valid Long createdAt;

  /**
   **/
  public Password hash(String hash) {
    this.hash = hash;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("hash")
  @NotNull
  public String getHash() {
    return hash;
  }

  @JsonProperty("hash")
  public void setHash(String hash) {
    this.hash = hash;
  }

  /**
   **/
  public Password createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("createdAt")
  @NotNull
  public Long getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("createdAt")
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Password password = (Password) o;
    return Objects.equals(this.hash, password.hash) &&
        Objects.equals(this.createdAt, password.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Password {\n");
    
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

