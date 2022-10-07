/*
 * Kntrl API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package app.kntrl.client.generated.model;

import java.util.Objects;
import java.util.Arrays;
import app.kntrl.client.generated.model.AccessDenied;
import app.kntrl.client.generated.model.AuthIsNotConfirmed;
import app.kntrl.client.generated.model.AuthIsNotEnabled;
import app.kntrl.client.generated.model.AuthRequiresAnother;
import app.kntrl.client.generated.model.ClientErr;
import app.kntrl.client.generated.model.CodeIsExpired;
import app.kntrl.client.generated.model.CodeIsIncorrect;
import app.kntrl.client.generated.model.CodeTooManyAttempts;
import app.kntrl.client.generated.model.EmailIsIncorrect;
import app.kntrl.client.generated.model.IpNew;
import app.kntrl.client.generated.model.LoginId;
import app.kntrl.client.generated.model.PasswordIsIncorrect;
import app.kntrl.client.generated.model.PasswordIsInvalid;
import app.kntrl.client.generated.model.PasswordIsInvalidAllOf;
import app.kntrl.client.generated.model.PluginClientErr;
import app.kntrl.client.generated.model.QuestionsAnswersIncorrect;
import app.kntrl.client.generated.model.QuestionsAnswersInvalid;
import app.kntrl.client.generated.model.SessionExpired;
import app.kntrl.client.generated.model.SignatureIsIncorrect;
import app.kntrl.client.generated.model.TokenExpired;
import app.kntrl.client.generated.model.TooManyReqs;
import app.kntrl.client.generated.model.Unauthenticated;
import app.kntrl.client.generated.model.UserLoginAlreadyTaken;
import app.kntrl.client.generated.model.UserNotFound;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import app.kntrl.client.generated.infra.JSON;

/**
 * PasswordIsInvalid
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T19:30:17.809690+03:00[Europe/Kiev]")
public class PasswordIsInvalid extends ClientErr {
  public static final String SERIALIZED_NAME_TOO_LONG = "tooLong";
  @SerializedName(SERIALIZED_NAME_TOO_LONG)
  private Boolean tooLong;

  public static final String SERIALIZED_NAME_TOO_SHORT = "tooShort";
  @SerializedName(SERIALIZED_NAME_TOO_SHORT)
  private Boolean tooShort;

  public static final String SERIALIZED_NAME_MISSING_NUMBER = "missingNumber";
  @SerializedName(SERIALIZED_NAME_MISSING_NUMBER)
  private Boolean missingNumber;

  public static final String SERIALIZED_NAME_MISSING_SYMBOL = "missingSymbol";
  @SerializedName(SERIALIZED_NAME_MISSING_SYMBOL)
  private Boolean missingSymbol;

  public static final String SERIALIZED_NAME_MISSING_UPPER_CASE = "missingUpperCase";
  @SerializedName(SERIALIZED_NAME_MISSING_UPPER_CASE)
  private Boolean missingUpperCase;

  public static final String SERIALIZED_NAME_MISSING_LOWER_CASE = "missingLowerCase";
  @SerializedName(SERIALIZED_NAME_MISSING_LOWER_CASE)
  private Boolean missingLowerCase;

  public static final String SERIALIZED_NAME_COMMON_PASSWORD = "commonPassword";
  @SerializedName(SERIALIZED_NAME_COMMON_PASSWORD)
  private Boolean commonPassword;

  public static final String SERIALIZED_NAME_WAS_USED_BEFORE_AT = "wasUsedBeforeAt";
  @SerializedName(SERIALIZED_NAME_WAS_USED_BEFORE_AT)
  private Long wasUsedBeforeAt;

  public static final String SERIALIZED_NAME_MATCHES_LOGIN = "matchesLogin";
  @SerializedName(SERIALIZED_NAME_MATCHES_LOGIN)
  private LoginId matchesLogin;

  public static final String SERIALIZED_NAME_PASSWORDS_MISMATCH = "passwordsMismatch";
  @SerializedName(SERIALIZED_NAME_PASSWORDS_MISMATCH)
  private Boolean passwordsMismatch;

  public static final String SERIALIZED_NAME_STRENGTH = "strength";
  @SerializedName(SERIALIZED_NAME_STRENGTH)
  private String strength;

  public static final String SERIALIZED_NAME_WAS_USED_DAYS_AGO = "wasUsedDaysAgo";
  @SerializedName(SERIALIZED_NAME_WAS_USED_DAYS_AGO)
  private Long wasUsedDaysAgo;

  public PasswordIsInvalid() { 
    this.code = this.getClass().getSimpleName();
  }

  public PasswordIsInvalid tooLong(Boolean tooLong) {
    
    this.tooLong = tooLong;
    return this;
  }

   /**
   * Get tooLong
   * @return tooLong
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getTooLong() {
    return tooLong;
  }


  public void setTooLong(Boolean tooLong) {
    this.tooLong = tooLong;
  }


  public PasswordIsInvalid tooShort(Boolean tooShort) {
    
    this.tooShort = tooShort;
    return this;
  }

   /**
   * Get tooShort
   * @return tooShort
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getTooShort() {
    return tooShort;
  }


  public void setTooShort(Boolean tooShort) {
    this.tooShort = tooShort;
  }


  public PasswordIsInvalid missingNumber(Boolean missingNumber) {
    
    this.missingNumber = missingNumber;
    return this;
  }

   /**
   * Get missingNumber
   * @return missingNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getMissingNumber() {
    return missingNumber;
  }


  public void setMissingNumber(Boolean missingNumber) {
    this.missingNumber = missingNumber;
  }


  public PasswordIsInvalid missingSymbol(Boolean missingSymbol) {
    
    this.missingSymbol = missingSymbol;
    return this;
  }

   /**
   * Get missingSymbol
   * @return missingSymbol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getMissingSymbol() {
    return missingSymbol;
  }


  public void setMissingSymbol(Boolean missingSymbol) {
    this.missingSymbol = missingSymbol;
  }


  public PasswordIsInvalid missingUpperCase(Boolean missingUpperCase) {
    
    this.missingUpperCase = missingUpperCase;
    return this;
  }

   /**
   * Get missingUpperCase
   * @return missingUpperCase
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getMissingUpperCase() {
    return missingUpperCase;
  }


  public void setMissingUpperCase(Boolean missingUpperCase) {
    this.missingUpperCase = missingUpperCase;
  }


  public PasswordIsInvalid missingLowerCase(Boolean missingLowerCase) {
    
    this.missingLowerCase = missingLowerCase;
    return this;
  }

   /**
   * Get missingLowerCase
   * @return missingLowerCase
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getMissingLowerCase() {
    return missingLowerCase;
  }


  public void setMissingLowerCase(Boolean missingLowerCase) {
    this.missingLowerCase = missingLowerCase;
  }


  public PasswordIsInvalid commonPassword(Boolean commonPassword) {
    
    this.commonPassword = commonPassword;
    return this;
  }

   /**
   * Get commonPassword
   * @return commonPassword
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getCommonPassword() {
    return commonPassword;
  }


  public void setCommonPassword(Boolean commonPassword) {
    this.commonPassword = commonPassword;
  }


  public PasswordIsInvalid wasUsedBeforeAt(Long wasUsedBeforeAt) {
    
    this.wasUsedBeforeAt = wasUsedBeforeAt;
    return this;
  }

   /**
   * Get wasUsedBeforeAt
   * @return wasUsedBeforeAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getWasUsedBeforeAt() {
    return wasUsedBeforeAt;
  }


  public void setWasUsedBeforeAt(Long wasUsedBeforeAt) {
    this.wasUsedBeforeAt = wasUsedBeforeAt;
  }


  public PasswordIsInvalid matchesLogin(LoginId matchesLogin) {
    
    this.matchesLogin = matchesLogin;
    return this;
  }

   /**
   * Get matchesLogin
   * @return matchesLogin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LoginId getMatchesLogin() {
    return matchesLogin;
  }


  public void setMatchesLogin(LoginId matchesLogin) {
    this.matchesLogin = matchesLogin;
  }


  public PasswordIsInvalid passwordsMismatch(Boolean passwordsMismatch) {
    
    this.passwordsMismatch = passwordsMismatch;
    return this;
  }

   /**
   * Get passwordsMismatch
   * @return passwordsMismatch
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getPasswordsMismatch() {
    return passwordsMismatch;
  }


  public void setPasswordsMismatch(Boolean passwordsMismatch) {
    this.passwordsMismatch = passwordsMismatch;
  }


  public PasswordIsInvalid strength(String strength) {
    
    this.strength = strength;
    return this;
  }

   /**
   * Get strength
   * @return strength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStrength() {
    return strength;
  }


  public void setStrength(String strength) {
    this.strength = strength;
  }


  public PasswordIsInvalid wasUsedDaysAgo(Long wasUsedDaysAgo) {
    
    this.wasUsedDaysAgo = wasUsedDaysAgo;
    return this;
  }

   /**
   * Get wasUsedDaysAgo
   * @return wasUsedDaysAgo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getWasUsedDaysAgo() {
    return wasUsedDaysAgo;
  }


  public void setWasUsedDaysAgo(Long wasUsedDaysAgo) {
    this.wasUsedDaysAgo = wasUsedDaysAgo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordIsInvalid passwordIsInvalid = (PasswordIsInvalid) o;
    return Objects.equals(this.tooLong, passwordIsInvalid.tooLong) &&
        Objects.equals(this.tooShort, passwordIsInvalid.tooShort) &&
        Objects.equals(this.missingNumber, passwordIsInvalid.missingNumber) &&
        Objects.equals(this.missingSymbol, passwordIsInvalid.missingSymbol) &&
        Objects.equals(this.missingUpperCase, passwordIsInvalid.missingUpperCase) &&
        Objects.equals(this.missingLowerCase, passwordIsInvalid.missingLowerCase) &&
        Objects.equals(this.commonPassword, passwordIsInvalid.commonPassword) &&
        Objects.equals(this.wasUsedBeforeAt, passwordIsInvalid.wasUsedBeforeAt) &&
        Objects.equals(this.matchesLogin, passwordIsInvalid.matchesLogin) &&
        Objects.equals(this.passwordsMismatch, passwordIsInvalid.passwordsMismatch) &&
        Objects.equals(this.strength, passwordIsInvalid.strength) &&
        Objects.equals(this.wasUsedDaysAgo, passwordIsInvalid.wasUsedDaysAgo) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tooLong, tooShort, missingNumber, missingSymbol, missingUpperCase, missingLowerCase, commonPassword, wasUsedBeforeAt, matchesLogin, passwordsMismatch, strength, wasUsedDaysAgo, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordIsInvalid {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    tooLong: ").append(toIndentedString(tooLong)).append("\n");
    sb.append("    tooShort: ").append(toIndentedString(tooShort)).append("\n");
    sb.append("    missingNumber: ").append(toIndentedString(missingNumber)).append("\n");
    sb.append("    missingSymbol: ").append(toIndentedString(missingSymbol)).append("\n");
    sb.append("    missingUpperCase: ").append(toIndentedString(missingUpperCase)).append("\n");
    sb.append("    missingLowerCase: ").append(toIndentedString(missingLowerCase)).append("\n");
    sb.append("    commonPassword: ").append(toIndentedString(commonPassword)).append("\n");
    sb.append("    wasUsedBeforeAt: ").append(toIndentedString(wasUsedBeforeAt)).append("\n");
    sb.append("    matchesLogin: ").append(toIndentedString(matchesLogin)).append("\n");
    sb.append("    passwordsMismatch: ").append(toIndentedString(passwordsMismatch)).append("\n");
    sb.append("    strength: ").append(toIndentedString(strength)).append("\n");
    sb.append("    wasUsedDaysAgo: ").append(toIndentedString(wasUsedDaysAgo)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("code");
    openapiFields.add("devMsg");
    openapiFields.add("msg");
    openapiFields.add("tooLong");
    openapiFields.add("tooShort");
    openapiFields.add("missingNumber");
    openapiFields.add("missingSymbol");
    openapiFields.add("missingUpperCase");
    openapiFields.add("missingLowerCase");
    openapiFields.add("commonPassword");
    openapiFields.add("wasUsedBeforeAt");
    openapiFields.add("matchesLogin");
    openapiFields.add("passwordsMismatch");
    openapiFields.add("strength");
    openapiFields.add("wasUsedDaysAgo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tooLong");
    openapiRequiredFields.add("tooShort");
    openapiRequiredFields.add("missingNumber");
    openapiRequiredFields.add("missingSymbol");
    openapiRequiredFields.add("missingUpperCase");
    openapiRequiredFields.add("missingLowerCase");
    openapiRequiredFields.add("commonPassword");
    openapiRequiredFields.add("passwordsMismatch");
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("devMsg");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PasswordIsInvalid
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PasswordIsInvalid.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PasswordIsInvalid is not found in the empty JSON string", PasswordIsInvalid.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PasswordIsInvalid.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PasswordIsInvalid` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PasswordIsInvalid.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PasswordIsInvalid.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PasswordIsInvalid' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PasswordIsInvalid> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PasswordIsInvalid.class));

       return (TypeAdapter<T>) new TypeAdapter<PasswordIsInvalid>() {
           @Override
           public void write(JsonWriter out, PasswordIsInvalid value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PasswordIsInvalid read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PasswordIsInvalid given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PasswordIsInvalid
  * @throws IOException if the JSON string is invalid with respect to PasswordIsInvalid
  */
  public static PasswordIsInvalid fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PasswordIsInvalid.class);
  }

 /**
  * Convert an instance of PasswordIsInvalid to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

