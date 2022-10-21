package kntrl.example.generated.model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AuthReqReqDataProps
 */
public enum AuthReqReqDataProps {
  
  SECRET("secret"),
  
  EMAIL("email"),
  
  TEMPLATE("template"),
  
  ACCESSTOKEN("accessToken"),
  
  AUTHORIZATIONCODE("authorizationCode"),
  
  PASSWORD("password"),
  
  CONFIRMPASSWORD("confirmPassword"),
  
  ANSWERS("answers");

  private String value;

  AuthReqReqDataProps(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static AuthReqReqDataProps fromString(String s) {
      for (AuthReqReqDataProps b : AuthReqReqDataProps.values()) {
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
  public static AuthReqReqDataProps fromValue(String value) {
    for (AuthReqReqDataProps b : AuthReqReqDataProps.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


