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



@JsonTypeName("OAuthResData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T19:23:38.989036+03:00[Europe/Kiev]")
public class OAuthResData extends HashMap<String, Object>  {
  private @Valid String login;
  private @Valid Map<String, Object> publicData = new HashMap<>();

  /**
   **/
  public OAuthResData login(String login) {
    this.login = login;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("login")
  @NotNull
  public String getLogin() {
    return login;
  }

  @JsonProperty("login")
  public void setLogin(String login) {
    this.login = login;
  }

  /**
   **/
  public OAuthResData publicData(Map<String, Object> publicData) {
    this.publicData = publicData;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("publicData")
  @NotNull
  public Map<String, Object> getPublicData() {
    return publicData;
  }

  @JsonProperty("publicData")
  public void setPublicData(Map<String, Object> publicData) {
    this.publicData = publicData;
  }

  public OAuthResData putPublicDataItem(String key, Object publicDataItem) {
    if (this.publicData == null) {
      this.publicData = new HashMap<>();
    }

    this.publicData.put(key, publicDataItem);
    return this;
  }

  public OAuthResData removePublicDataItem(Object publicDataItem) {
    if (publicDataItem != null && this.publicData != null) {
      this.publicData.remove(publicDataItem);
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
    OAuthResData oauthResData = (OAuthResData) o;
    return Objects.equals(this.login, oauthResData.login) &&
        Objects.equals(this.publicData, oauthResData.publicData) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, publicData, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthResData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    publicData: ").append(toIndentedString(publicData)).append("\n");
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

