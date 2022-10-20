package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kntrl.example.generated.model.AuthDataPrivate;
import kntrl.example.generated.model.AuthDataPublic;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AuthData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T19:23:38.989036+03:00[Europe/Kiev]")
public class AuthData   {
  private @Valid AuthDataPublic _public;
  private @Valid AuthDataPrivate _private;
  private @Valid String login;

  /**
   **/
  public AuthData _public(AuthDataPublic _public) {
    this._public = _public;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("public")
  @NotNull
  public AuthDataPublic getPublic() {
    return _public;
  }

  @JsonProperty("public")
  public void setPublic(AuthDataPublic _public) {
    this._public = _public;
  }

  /**
   **/
  public AuthData _private(AuthDataPrivate _private) {
    this._private = _private;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("private")
  @NotNull
  public AuthDataPrivate getPrivate() {
    return _private;
  }

  @JsonProperty("private")
  public void setPrivate(AuthDataPrivate _private) {
    this._private = _private;
  }

  /**
   * If authenticator supports identification, it provides login here. This can be email, phone number, facebook account id, etc.
   **/
  public AuthData login(String login) {
    this.login = login;
    return this;
  }

  
  @ApiModelProperty(value = "If authenticator supports identification, it provides login here. This can be email, phone number, facebook account id, etc.")
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
    AuthData authData = (AuthData) o;
    return Objects.equals(this._public, authData._public) &&
        Objects.equals(this._private, authData._private) &&
        Objects.equals(this.login, authData.login);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_public, _private, login);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthData {\n");
    
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
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

