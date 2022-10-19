package kntrl.example.generated.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
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

/**
 * New auth data to save
 **/
@ApiModel(description = "New auth data to save")
@JsonTypeName("AuthRes_authData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-19T21:13:03.480932+03:00[Europe/Kiev]")
public class AuthResAuthData   {
  private @Valid Object _public;
  private @Valid Object _private;
  private @Valid String login;

  /**
   * Data that are available for API.
   **/
  public AuthResAuthData _public(Object _public) {
    this._public = _public;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Data that are available for API.")
  @JsonProperty("public")
  @NotNull
  public Object getPublic() {
    return _public;
  }

  @JsonProperty("public")
  public void setPublic(Object _public) {
    this._public = _public;
  }

  /**
   * Data available only for authenticator.
   **/
  public AuthResAuthData _private(Object _private) {
    this._private = _private;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Data available only for authenticator.")
  @JsonProperty("private")
  @NotNull
  public Object getPrivate() {
    return _private;
  }

  @JsonProperty("private")
  public void setPrivate(Object _private) {
    this._private = _private;
  }

  /**
   * If authenticator supports identification, it provides login here. This can be email, phone number, facebook account id, etc.
   **/
  public AuthResAuthData login(String login) {
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
    AuthResAuthData authResAuthData = (AuthResAuthData) o;
    return Objects.equals(this._public, authResAuthData._public) &&
        Objects.equals(this._private, authResAuthData._private) &&
        Objects.equals(this.login, authResAuthData.login);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_public, _private, login);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthResAuthData {\n");
    
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

