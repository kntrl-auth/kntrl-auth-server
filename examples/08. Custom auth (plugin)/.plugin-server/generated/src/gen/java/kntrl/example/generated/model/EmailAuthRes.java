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



@JsonTypeName("EmailAuthRes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-19T21:13:03.480932+03:00[Europe/Kiev]")
public class EmailAuthRes   {
  private @Valid String emailSentTo;

  /**
   * Shows user email, that was used to send a code. Email will be partially hidden.
   **/
  public EmailAuthRes emailSentTo(String emailSentTo) {
    this.emailSentTo = emailSentTo;
    return this;
  }

  
  @ApiModelProperty(value = "Shows user email, that was used to send a code. Email will be partially hidden.")
  @JsonProperty("emailSentTo")
  public String getEmailSentTo() {
    return emailSentTo;
  }

  @JsonProperty("emailSentTo")
  public void setEmailSentTo(String emailSentTo) {
    this.emailSentTo = emailSentTo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailAuthRes emailAuthRes = (EmailAuthRes) o;
    return Objects.equals(this.emailSentTo, emailAuthRes.emailSentTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailSentTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailAuthRes {\n");
    
    sb.append("    emailSentTo: ").append(toIndentedString(emailSentTo)).append("\n");
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

