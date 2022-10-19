package kntrl.example.generated.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ErrCode
 */
public enum ErrCode {
  
  PLUGIN_ERR("PLUGIN_ERR"),
  
  PLUGIN_CLIENT_ERR("PLUGIN_CLIENT_ERR"),
  
  PASSWORD_IS_INCORRECT("PASSWORD_IS_INCORRECT"),
  
  PASSWORD_IS_INVALID("PASSWORD_IS_INVALID"),
  
  EMAIL_IS_INCORRECT("EMAIL_IS_INCORRECT"),
  
  IP_NEW("IP_NEW"),
  
  QUESTIONS_ANSWERS_INCORRECT("QUESTIONS_ANSWERS_INCORRECT"),
  
  QUESTIONS_ANSWERS_INVALID("QUESTIONS_ANSWERS_INVALID"),
  
  SESSION_EXPIRED("SESSION_EXPIRED"),
  
  ACCESS_DENIED("ACCESS_DENIED"),
  
  USER_NOT_FOUND("USER_NOT_FOUND"),
  
  SIGNATURE_IS_INCORRECT("SIGNATURE_IS_INCORRECT"),
  
  USER_LOGIN_IS_INVALID("USER_LOGIN_IS_INVALID"),
  
  USER_LOGIN_ALREADY_TAKEN("USER_LOGIN_ALREADY_TAKEN"),
  
  TOKEN_EXPIRED("TOKEN_EXPIRED"),
  
  TOO_MANY_REQS("TOO_MANY_REQS"),
  
  AUTH_IS_NOT_ENABLED("AUTH_IS_NOT_ENABLED"),
  
  AUTH_IS_NOT_CONFIRMED("AUTH_IS_NOT_CONFIRMED"),
  
  NO_AUTH_AVAILABLE_FOR_FACTOR("NO_AUTH_AVAILABLE_FOR_FACTOR"),
  
  AUTH_REQUIRES_ANOTHER("AUTH_REQUIRES_ANOTHER"),
  
  CODE_IS_EXPIRED("CODE_IS_EXPIRED"),
  
  CODE_TOO_MANY_ATTEMPTS("CODE_TOO_MANY_ATTEMPTS"),
  
  CODE_IS_INCORRECT("CODE_IS_INCORRECT"),
  
  UNAUTHENTICATED("UNAUTHENTICATED"),
  
  SERVER_ERR("SERVER_ERR"),
  
  INTEGRATION_ERR("INTEGRATION_ERR"),
  
  ANY_ERR("ANY_ERR");

  private String value;

  ErrCode(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static ErrCode fromString(String s) {
      for (ErrCode b : ErrCode.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
	}
	
  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ErrCode fromValue(String value) {
    for (ErrCode b : ErrCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


