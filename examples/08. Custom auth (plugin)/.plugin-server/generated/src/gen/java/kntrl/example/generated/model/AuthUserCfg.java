package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import kntrl.example.generated.model.AuthData;
import kntrl.example.generated.model.UnconfirmedAuthData;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AuthUserCfg")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-19T21:13:03.480932+03:00[Europe/Kiev]")
public class AuthUserCfg   {
  private @Valid AuthData data;
  private @Valid List<UnconfirmedAuthData> sentCodes = null;

  /**
   **/
  public AuthUserCfg data(AuthData data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public AuthData getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(AuthData data) {
    this.data = data;
  }

  /**
   * List of auths that wait for confirmation. 
   **/
  public AuthUserCfg sentCodes(List<UnconfirmedAuthData> sentCodes) {
    this.sentCodes = sentCodes;
    return this;
  }

  
  @ApiModelProperty(value = "List of auths that wait for confirmation. ")
  @JsonProperty("sentCodes")
  public List<UnconfirmedAuthData> getSentCodes() {
    return sentCodes;
  }

  @JsonProperty("sentCodes")
  public void setSentCodes(List<UnconfirmedAuthData> sentCodes) {
    this.sentCodes = sentCodes;
  }

  public AuthUserCfg addSentCodesItem(UnconfirmedAuthData sentCodesItem) {
    if (this.sentCodes == null) {
      this.sentCodes = new ArrayList<>();
    }

    this.sentCodes.add(sentCodesItem);
    return this;
  }

  public AuthUserCfg removeSentCodesItem(UnconfirmedAuthData sentCodesItem) {
    if (sentCodesItem != null && this.sentCodes != null) {
      this.sentCodes.remove(sentCodesItem);
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
    AuthUserCfg authUserCfg = (AuthUserCfg) o;
    return Objects.equals(this.data, authUserCfg.data) &&
        Objects.equals(this.sentCodes, authUserCfg.sentCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, sentCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthUserCfg {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    sentCodes: ").append(toIndentedString(sentCodes)).append("\n");
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

