package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import kntrl.example.generated.model.CodeVerifier;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("UnconfirmedAuth")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-19T21:13:03.480932+03:00[Europe/Kiev]")
public class UnconfirmedAuth   {
  private @Valid List<CodeVerifier> sentCodes = null;

  /**
   **/
  public UnconfirmedAuth sentCodes(List<CodeVerifier> sentCodes) {
    this.sentCodes = sentCodes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sentCodes")
  public List<CodeVerifier> getSentCodes() {
    return sentCodes;
  }

  @JsonProperty("sentCodes")
  public void setSentCodes(List<CodeVerifier> sentCodes) {
    this.sentCodes = sentCodes;
  }

  public UnconfirmedAuth addSentCodesItem(CodeVerifier sentCodesItem) {
    if (this.sentCodes == null) {
      this.sentCodes = new ArrayList<>();
    }

    this.sentCodes.add(sentCodesItem);
    return this;
  }

  public UnconfirmedAuth removeSentCodesItem(CodeVerifier sentCodesItem) {
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
    UnconfirmedAuth unconfirmedAuth = (UnconfirmedAuth) o;
    return Objects.equals(this.sentCodes, unconfirmedAuth.sentCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sentCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnconfirmedAuth {\n");
    
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

