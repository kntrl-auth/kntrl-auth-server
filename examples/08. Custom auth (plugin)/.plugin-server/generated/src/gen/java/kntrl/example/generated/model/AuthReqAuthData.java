package kntrl.example.generated.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Current session data. Null if auth wasn&#39;t enabled before. Otherwise, will contain current auth data during authenticate and previous data during update-auth request.
 **/

@JsonTypeName("AuthReq_authData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-22T00:20:30.250260+03:00[Europe/Kiev]")
public class AuthReqAuthData   {
  private Map<String, Object> _public = new HashMap<>();
  private Map<String, Object> _private = new HashMap<>();
  private String login;

  /**
   **/
  public AuthReqAuthData _public(Map<String, Object> _public) {
    this._public = _public;
    return this;
  }

  
  @JsonProperty("public")
  public Map<String, Object> getPublic() {
    return _public;
  }

  @JsonProperty("public")
  public void setPublic(Map<String, Object> _public) {
    this._public = _public;
  }

  public AuthReqAuthData putPublicItem(String key, Object _publicItem) {
    if (this._public == null) {
      this._public = new HashMap<>();
    }

    this._public.put(key, _publicItem);
    return this;
  }

  public AuthReqAuthData removePublicItem(Object _publicItem) {
    if (_publicItem != null && this._public != null) {
      this._public.remove(_publicItem);
    }

    return this;
  }
  /**
   **/
  public AuthReqAuthData _private(Map<String, Object> _private) {
    this._private = _private;
    return this;
  }

  
  @JsonProperty("private")
  public Map<String, Object> getPrivate() {
    return _private;
  }

  @JsonProperty("private")
  public void setPrivate(Map<String, Object> _private) {
    this._private = _private;
  }

  public AuthReqAuthData putPrivateItem(String key, Object _privateItem) {
    if (this._private == null) {
      this._private = new HashMap<>();
    }

    this._private.put(key, _privateItem);
    return this;
  }

  public AuthReqAuthData removePrivateItem(Object _privateItem) {
    if (_privateItem != null && this._private != null) {
      this._private.remove(_privateItem);
    }

    return this;
  }
  /**
   * If authenticator supports identification, it provides login here. This can be email, phone number, facebook account id, etc.
   **/
  public AuthReqAuthData login(String login) {
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
    AuthReqAuthData authReqAuthData = (AuthReqAuthData) o;
    return Objects.equals(this._public, authReqAuthData._public) &&
        Objects.equals(this._private, authReqAuthData._private) &&
        Objects.equals(this.login, authReqAuthData.login);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_public, _private, login);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthReqAuthData {\n");
    
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

