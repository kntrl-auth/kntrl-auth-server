/*
 * Kntrl API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package app.kntrl.client.generated.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ErrCode
 */
@JsonAdapter(ErrCode.Adapter.class)
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

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ErrCode fromValue(String value) {
    for (ErrCode b : ErrCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ErrCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ErrCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ErrCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ErrCode.fromValue(value);
    }
  }
}

