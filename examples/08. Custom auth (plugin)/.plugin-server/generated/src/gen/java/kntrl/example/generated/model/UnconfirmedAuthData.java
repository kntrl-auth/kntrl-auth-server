package kntrl.example.generated.model;

import kntrl.example.generated.model.AuthData;
import kntrl.example.generated.model.CodeVerifier;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("UnconfirmedAuthData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-22T00:20:30.250260+03:00[Europe/Kiev]")
public class UnconfirmedAuthData   {
  private AuthData data;
  private CodeVerifier code;

  /**
   **/
  public UnconfirmedAuthData data(AuthData data) {
    this.data = data;
    return this;
  }

  
  @JsonProperty("data")
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

  
  @JsonProperty("code")
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

