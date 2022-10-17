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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
 * AuthExecResResData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthExecResResData {
  public static final String SERIALIZED_NAME_EMAIL_SENT_TO = "emailSentTo";
  @SerializedName(SERIALIZED_NAME_EMAIL_SENT_TO)
  private String emailSentTo;

  public static final String SERIALIZED_NAME_IP_ENCODED = "ipEncoded";
  @SerializedName(SERIALIZED_NAME_IP_ENCODED)
  private String ipEncoded;

  public static final String SERIALIZED_NAME_LOGIN = "login";
  @SerializedName(SERIALIZED_NAME_LOGIN)
  private String login;

  public static final String SERIALIZED_NAME_PUBLIC_DATA = "publicData";
  @SerializedName(SERIALIZED_NAME_PUBLIC_DATA)
  private Map<String, Object> publicData = null;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_STRENGTH = "strength";
  @SerializedName(SERIALIZED_NAME_STRENGTH)
  private String strength;

  public static final String SERIALIZED_NAME_CORRECT = "correct";
  @SerializedName(SERIALIZED_NAME_CORRECT)
  private Map<String, Boolean> correct = null;

  public static final String SERIALIZED_NAME_ANSWERS_SAVED_AT = "answersSavedAt";
  @SerializedName(SERIALIZED_NAME_ANSWERS_SAVED_AT)
  private Map<String, Long> answersSavedAt = null;

  public AuthExecResResData() {
  }

  public AuthExecResResData emailSentTo(String emailSentTo) {
    
    this.emailSentTo = emailSentTo;
    return this;
  }

   /**
   * Shows user email, that was used to send a code. Email will be partially hidden.
   * @return emailSentTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows user email, that was used to send a code. Email will be partially hidden.")

  public String getEmailSentTo() {
    return emailSentTo;
  }


  public void setEmailSentTo(String emailSentTo) {
    this.emailSentTo = emailSentTo;
  }


  public AuthExecResResData ipEncoded(String ipEncoded) {
    
    this.ipEncoded = ipEncoded;
    return this;
  }

   /**
   * Get ipEncoded
   * @return ipEncoded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpEncoded() {
    return ipEncoded;
  }


  public void setIpEncoded(String ipEncoded) {
    this.ipEncoded = ipEncoded;
  }


  public AuthExecResResData login(String login) {
    
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogin() {
    return login;
  }


  public void setLogin(String login) {
    this.login = login;
  }


  public AuthExecResResData publicData(Map<String, Object> publicData) {
    
    this.publicData = publicData;
    return this;
  }

  public AuthExecResResData putPublicDataItem(String key, Object publicDataItem) {
    if (this.publicData == null) {
      this.publicData = new HashMap<>();
    }
    this.publicData.put(key, publicDataItem);
    return this;
  }

   /**
   * Get publicData
   * @return publicData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getPublicData() {
    return publicData;
  }


  public void setPublicData(Map<String, Object> publicData) {
    this.publicData = publicData;
  }


  public AuthExecResResData password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * If password was generated by app this field contains generated password.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If password was generated by app this field contains generated password.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public AuthExecResResData strength(String strength) {
    
    this.strength = strength;
    return this;
  }

   /**
   * Calculated strength of password. Null means that all checks failed.
   * @return strength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Calculated strength of password. Null means that all checks failed.")

  public String getStrength() {
    return strength;
  }


  public void setStrength(String strength) {
    this.strength = strength;
  }


  public AuthExecResResData correct(Map<String, Boolean> correct) {
    
    this.correct = correct;
    return this;
  }

  public AuthExecResResData putCorrectItem(String key, Boolean correctItem) {
    if (this.correct == null) {
      this.correct = new HashMap<>();
    }
    this.correct.put(key, correctItem);
    return this;
  }

   /**
   * Shows is answer was correct. 
   * @return correct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"HOME_CITY\":true,\"MOTHER_NAME\":false}", value = "Shows is answer was correct. ")

  public Map<String, Boolean> getCorrect() {
    return correct;
  }


  public void setCorrect(Map<String, Boolean> correct) {
    this.correct = correct;
  }


  public AuthExecResResData answersSavedAt(Map<String, Long> answersSavedAt) {
    
    this.answersSavedAt = answersSavedAt;
    return this;
  }

  public AuthExecResResData putAnswersSavedAtItem(String key, Long answersSavedAtItem) {
    if (this.answersSavedAt == null) {
      this.answersSavedAt = new HashMap<>();
    }
    this.answersSavedAt.put(key, answersSavedAtItem);
    return this;
  }

   /**
   * Date of last update
   * @return answersSavedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of last update")

  public Map<String, Long> getAnswersSavedAt() {
    return answersSavedAt;
  }


  public void setAnswersSavedAt(Map<String, Long> answersSavedAt) {
    this.answersSavedAt = answersSavedAt;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public AuthExecResResData putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthExecResResData authExecResResData = (AuthExecResResData) o;
    return Objects.equals(this.emailSentTo, authExecResResData.emailSentTo) &&
        Objects.equals(this.ipEncoded, authExecResResData.ipEncoded) &&
        Objects.equals(this.login, authExecResResData.login) &&
        Objects.equals(this.publicData, authExecResResData.publicData) &&
        Objects.equals(this.password, authExecResResData.password) &&
        Objects.equals(this.strength, authExecResResData.strength) &&
        Objects.equals(this.correct, authExecResResData.correct) &&
        Objects.equals(this.answersSavedAt, authExecResResData.answersSavedAt)&&
        Objects.equals(this.additionalProperties, authExecResResData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailSentTo, ipEncoded, login, publicData, password, strength, correct, answersSavedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthExecResResData {\n");
    sb.append("    emailSentTo: ").append(toIndentedString(emailSentTo)).append("\n");
    sb.append("    ipEncoded: ").append(toIndentedString(ipEncoded)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    publicData: ").append(toIndentedString(publicData)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    strength: ").append(toIndentedString(strength)).append("\n");
    sb.append("    correct: ").append(toIndentedString(correct)).append("\n");
    sb.append("    answersSavedAt: ").append(toIndentedString(answersSavedAt)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("emailSentTo");
    openapiFields.add("ipEncoded");
    openapiFields.add("login");
    openapiFields.add("publicData");
    openapiFields.add("password");
    openapiFields.add("strength");
    openapiFields.add("correct");
    openapiFields.add("answersSavedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthExecResResData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthExecResResData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthExecResResData is not found in the empty JSON string", AuthExecResResData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("emailSentTo") != null && !jsonObj.get("emailSentTo").isJsonNull()) && !jsonObj.get("emailSentTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailSentTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailSentTo").toString()));
      }
      if ((jsonObj.get("ipEncoded") != null && !jsonObj.get("ipEncoded").isJsonNull()) && !jsonObj.get("ipEncoded").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipEncoded` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipEncoded").toString()));
      }
      if ((jsonObj.get("login") != null && !jsonObj.get("login").isJsonNull()) && !jsonObj.get("login").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `login` to be a primitive type in the JSON string but got `%s`", jsonObj.get("login").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("strength") != null && !jsonObj.get("strength").isJsonNull()) && !jsonObj.get("strength").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `strength` to be a primitive type in the JSON string but got `%s`", jsonObj.get("strength").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthExecResResData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthExecResResData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthExecResResData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthExecResResData.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthExecResResData>() {
           @Override
           public void write(JsonWriter out, AuthExecResResData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthExecResResData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AuthExecResResData instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthExecResResData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthExecResResData
  * @throws IOException if the JSON string is invalid with respect to AuthExecResResData
  */
  public static AuthExecResResData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthExecResResData.class);
  }

 /**
  * Convert an instance of AuthExecResResData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

