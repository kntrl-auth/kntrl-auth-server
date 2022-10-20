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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T22:48:57.779152+03:00[Europe/Kiev]")
public class OAuthResData extends HashMap<String, Object>  {
  private @Valid String login;
  private @Valid Map<String, Object> extractedData = new HashMap<>();

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
  public OAuthResData extractedData(Map<String, Object> extractedData) {
    this.extractedData = extractedData;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("extractedData")
  @NotNull
  public Map<String, Object> getExtractedData() {
    return extractedData;
  }

  @JsonProperty("extractedData")
  public void setExtractedData(Map<String, Object> extractedData) {
    this.extractedData = extractedData;
  }

  public OAuthResData putExtractedDataItem(String key, Object extractedDataItem) {
    if (this.extractedData == null) {
      this.extractedData = new HashMap<>();
    }

    this.extractedData.put(key, extractedDataItem);
    return this;
  }

  public OAuthResData removeExtractedDataItem(Object extractedDataItem) {
    if (extractedDataItem != null && this.extractedData != null) {
      this.extractedData.remove(extractedDataItem);
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
        Objects.equals(this.extractedData, oauthResData.extractedData) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, extractedData, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthResData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    extractedData: ").append(toIndentedString(extractedData)).append("\n");
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

