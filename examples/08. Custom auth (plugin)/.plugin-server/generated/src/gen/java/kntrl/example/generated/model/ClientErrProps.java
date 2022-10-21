package kntrl.example.generated.model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ClientErrProps
 */
public enum ClientErrProps {
  
  CODE("code"),
  
  DEVMSG("devMsg"),
  
  MSG("msg"),
  
  CHANGEDAT("changedAt"),
  
  CHANGEDDAYSAGO("changedDaysAgo"),
  
  TOOLONG("tooLong"),
  
  TOOSHORT("tooShort"),
  
  MISSINGNUMBER("missingNumber"),
  
  MISSINGSYMBOL("missingSymbol"),
  
  MISSINGUPPERCASE("missingUpperCase"),
  
  MISSINGLOWERCASE("missingLowerCase"),
  
  COMMONPASSWORD("commonPassword"),
  
  WASUSEDBEFOREAT("wasUsedBeforeAt"),
  
  MATCHESLOGIN("matchesLogin"),
  
  PASSWORDSMISMATCH("passwordsMismatch"),
  
  STRENGTH("strength"),
  
  WASUSEDDAYSAGO("wasUsedDaysAgo"),
  
  INCORRECTANSWERS("incorrectAnswers"),
  
  REQUIRESMOREANSWERS("requiresMoreAnswers"),
  
  QUESTIONSNOTFOUND("questionsNotFound"),
  
  INVALIDANSWERS("invalidAnswers"),
  
  TOOMANYANSWERS("tooManyAnswers"),
  
  WAITTIMEMS("waitTimeMs"),
  
  WAITTIMESECONDS("waitTimeSeconds"),
  
  WAITTIMEMINUTES("waitTimeMinutes"),
  
  EXPIREDAT("expiredAt"),
  
  LOGINID("loginId");

  private String value;

  ClientErrProps(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static ClientErrProps fromString(String s) {
      for (ClientErrProps b : ClientErrProps.values()) {
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
  public static ClientErrProps fromValue(String value) {
    for (ClientErrProps b : ClientErrProps.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


