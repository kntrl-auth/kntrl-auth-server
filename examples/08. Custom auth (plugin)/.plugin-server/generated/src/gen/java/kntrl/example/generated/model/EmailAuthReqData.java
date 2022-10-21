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



@JsonTypeName("EmailAuthReqData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-21T17:10:42.806916+03:00[Europe/Kiev]")
public class EmailAuthReqData extends HashMap<String, Object>  {
  private @Valid String email;
  private @Valid String template;

  /**
   * User email. If email is not null - auth allow identification by email (email auth also must be listed in logins config). Otherwise, uses email of already identified user.
   **/
  public EmailAuthReqData email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(value = "User email. If email is not null - auth allow identification by email (email auth also must be listed in logins config). Otherwise, uses email of already identified user.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  @JsonProperty("email")
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Template to use.
   **/
  public EmailAuthReqData template(String template) {
    this.template = template;
    return this;
  }

  
  @ApiModelProperty(value = "Template to use.")
  @JsonProperty("template")
  public String getTemplate() {
    return template;
  }

  @JsonProperty("template")
  public void setTemplate(String template) {
    this.template = template;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailAuthReqData emailAuthReqData = (EmailAuthReqData) o;
    return Objects.equals(this.email, emailAuthReqData.email) &&
        Objects.equals(this.template, emailAuthReqData.template) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, template, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailAuthReqData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

