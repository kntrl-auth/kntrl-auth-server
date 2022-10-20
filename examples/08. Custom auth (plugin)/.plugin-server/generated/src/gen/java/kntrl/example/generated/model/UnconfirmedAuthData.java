package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kntrl.example.generated.model.AuthData;
import kntrl.example.generated.model.CodeVerifier;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("UnconfirmedAuthData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T22:48:57.779152+03:00[Europe/Kiev]")
public class UnconfirmedAuthData   {
  private @Valid AuthData data;
  private @Valid CodeVerifier code;

  /**
   **/
  public UnconfirmedAuthData data(AuthData data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  @NotNull
  public AuthData getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(AuthData data) {
    this.data = data;
  }

  /**
   **/
  public UnconfirmedAuthData code(CodeVerifier code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("code")
  @NotNull
  public CodeVerifier getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(CodeVerifier code) {
    this.code = code;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnconfirmedAuthData unconfirmedAuthData = (UnconfirmedAuthData) o;
    return Objects.equals(this.data, unconfirmedAuthData.data) &&
        Objects.equals(this.code, unconfirmedAuthData.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnconfirmedAuthData {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

