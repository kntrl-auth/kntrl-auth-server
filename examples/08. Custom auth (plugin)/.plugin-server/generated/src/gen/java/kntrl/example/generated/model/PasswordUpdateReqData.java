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



@JsonTypeName("PasswordUpdateReqData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T19:23:38.989036+03:00[Europe/Kiev]")
public class PasswordUpdateReqData extends HashMap<String, Object>  {
  private @Valid String password;
  private @Valid String confirmPassword;

  /**
   * New password to set. If null app generates password automatically.
   **/
  public PasswordUpdateReqData password(String password) {
    this.password = password;
    return this;
  }

  
  @ApiModelProperty(value = "New password to set. If null app generates password automatically.")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  @JsonProperty("password")
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Password confirmation. If null app doesn&#39;t perform this check.
   **/
  public PasswordUpdateReqData confirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
    return this;
  }

  
  @ApiModelProperty(value = "Password confirmation. If null app doesn't perform this check.")
  @JsonProperty("confirmPassword")
  public String getConfirmPassword() {
    return confirmPassword;
  }

  @JsonProperty("confirmPassword")
  public void setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordUpdateReqData passwordUpdateReqData = (PasswordUpdateReqData) o;
    return Objects.equals(this.password, passwordUpdateReqData.password) &&
        Objects.equals(this.confirmPassword, passwordUpdateReqData.confirmPassword) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, confirmPassword, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordUpdateReqData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    confirmPassword: ").append(toIndentedString(confirmPassword)).append("\n");
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

