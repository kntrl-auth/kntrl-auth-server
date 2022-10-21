package kntrl.example.generated.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("DryRunAuthData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-22T00:20:30.250260+03:00[Europe/Kiev]")
public class DryRunAuthData   {
  private String login;

  /**
   * If authenticator supports identification, it provides login here. This can be email, phone number, facebook account id, etc.
   **/
  public DryRunAuthData login(String login) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DryRunAuthData dryRunAuthData = (DryRunAuthData) o;
    return Objects.equals(this.login, dryRunAuthData.login);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DryRunAuthData {\n");
    
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
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

