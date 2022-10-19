package kntrl.example.generated.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets UnauthenticatedCode
 */
public enum UnauthenticatedCode {
  
  SESSION_EXPIRED("SESSION_EXPIRED"),
  
  ACCESS_DENIED("ACCESS_DENIED"),
  
  USER_NOT_FOUND("USER_NOT_FOUND"),
  
  TOKEN_EXPIRED("TOKEN_EXPIRED"),
  
  UNAUTHENTICATED("UNAUTHENTICATED");

  private String value;

  UnauthenticatedCode(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static UnauthenticatedCode fromString(String s) {
      for (UnauthenticatedCode b : UnauthenticatedCode.values()) {
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
  public static UnauthenticatedCode fromValue(String value) {
    for (UnauthenticatedCode b : UnauthenticatedCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


