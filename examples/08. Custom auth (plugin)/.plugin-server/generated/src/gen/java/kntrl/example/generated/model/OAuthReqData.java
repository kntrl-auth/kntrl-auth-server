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



@JsonTypeName("OAuthReqData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T22:48:57.779152+03:00[Europe/Kiev]")
public class OAuthReqData extends HashMap<String, Object>  {
  private @Valid String accessToken;
  private @Valid String authorizationCode;

  /**
   * If you have access-token - put it here.
   **/
  public OAuthReqData accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  
  @ApiModelProperty(value = "If you have access-token - put it here.")
  @JsonProperty("accessToken")
  public String getAccessToken() {
    return accessToken;
  }

  @JsonProperty("accessToken")
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   * If you have authorisation-code - app will exchange it for access-token.
   **/
  public OAuthReqData authorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
    return this;
  }

  
  @ApiModelProperty(value = "If you have authorisation-code - app will exchange it for access-token.")
  @JsonProperty("authorizationCode")
  public String getAuthorizationCode() {
    return authorizationCode;
  }

  @JsonProperty("authorizationCode")
  public void setAuthorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthReqData oauthReqData = (OAuthReqData) o;
    return Objects.equals(this.accessToken, oauthReqData.accessToken) &&
        Objects.equals(this.authorizationCode, oauthReqData.authorizationCode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, authorizationCode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthReqData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    authorizationCode: ").append(toIndentedString(authorizationCode)).append("\n");
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

