package kntrl.example.generated.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Login")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-22T00:20:30.250260+03:00[Europe/Kiev]")
public class Login   {
  private String type;
  private String login;
  private String unconfirmedLogin;

  /**
   * Type of login
   **/
  public Login type(String type) {
    this.type = type;
    return this;
  }

  
  @JsonProperty("type")
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

  
  @JsonProperty("login")
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

