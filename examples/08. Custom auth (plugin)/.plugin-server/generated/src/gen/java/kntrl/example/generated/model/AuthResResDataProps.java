package kntrl.example.generated.model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AuthResResDataProps
 */
public enum AuthResResDataProps {
  
  EMAILSENTTO("emailSentTo"),
  
  IPENCODED("ipEncoded"),
  
  LOGIN("login"),
  
  EXTRACTEDDATA("extractedData"),
  
  PASSWORD("password"),
  
  STRENGTH("strength"),
  
  CORRECT("correct"),
  
  ANSWERSSAVEDAT("answersSavedAt");

  private String value;

  AuthResResDataProps(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static AuthResResDataProps fromString(String s) {
      for (AuthResResDataProps b : AuthResResDataProps.values()) {
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
  public static AuthResResDataProps fromValue(String value) {
    for (AuthResResDataProps b : AuthResResDataProps.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


