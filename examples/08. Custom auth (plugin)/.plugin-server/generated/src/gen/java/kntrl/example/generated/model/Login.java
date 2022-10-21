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



@JsonTypeName("Login")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-21T17:10:42.806916+03:00[Europe/Kiev]")
public class Login   {
  private @Valid String type;
  private @Valid String login;
  private @Valid String unconfirmedLogin;

  /**
   * Type of login
   **/
  public Login type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Type of login")
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  /**
   * User unique identifier, email, username, etc.
   **/
  public Login login(String login) {
    this.login = login;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "User unique identifier, email, username, etc.")
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
  public Login unconfirmedLogin(String unconfirmedLogin) {
    this.unconfirmedLogin = unconfirmedLogin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("unconfirmedLogin")
  public String getUnconfirmedLogin() {
    return unconfirmedLogin;
  }

  @JsonProperty("unconfirmedLogin")
  public void setUnconfirmedLogin(String unconfirmedLogin) {
    this.unconfirmedLogin = unconfirmedLogin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Login login = (Login) o;
    return Objects.equals(this.type, login.type) &&
        Objects.equals(this.login, login.login) &&
        Objects.equals(this.unconfirmedLogin, login.unconfirmedLogin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, login, unconfirmedLogin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Login {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    unconfirmedLogin: ").append(toIndentedString(unconfirmedLogin)).append("\n");
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

