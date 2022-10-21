package kntrl.example.generated.model;

import java.util.HashMap;
import java.util.Map;
import kntrl.example.generated.model.AuthResAuthData;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AuthRes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-22T00:20:30.250260+03:00[Europe/Kiev]")
public class AuthRes   {
  private AuthResAuthData authData;
  private Map<String, Object> resData = null;

  /**
   **/
  public AuthRes authData(AuthResAuthData authData) {
    this.authData = authData;
    return this;
  }

  
  @JsonProperty("authData")
  public AuthResAuthData getAuthData() {
    return authData;
  }

  @JsonProperty("authData")
  public void setAuthData(AuthResAuthData authData) {
    this.authData = authData;
  }

  /**
   * This data will be sent back to the client.
   **/
  public AuthRes resData(Map<String, Object> resData) {
    this.resData = resData;
    return this;
  }

  
  @JsonProperty("resData")
  public Map<String, Object> getResData() {
    return resData;
  }

  @JsonProperty("resData")
  public void setResData(Map<String, Object> resData) {
    this.resData = resData;
  }

  public AuthRes putResDataItem(String key, Object resDataItem) {
    if (this.resData == null) {
      this.resData = new HashMap<>();
    }

    this.resData.put(key, resDataItem);
    return this;
  }

  public AuthRes removeResDataItem(Object resDataItem) {
    if (resDataItem != null && this.resData != null) {
      this.resData.remove(resDataItem);
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

