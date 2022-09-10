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


package kntrl.client.generated.model;

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
import java.util.ArrayList;
import java.util.List;

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

import kntrl.client.generated.infra.JSON;

/**
 * QuestionsAuthCfg
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-23T23:42:03.192677+03:00[Europe/Kiev]")
public class QuestionsAuthCfg {
  public static final String SERIALIZED_NAME_LOWERCASE = "lowercase";
  @SerializedName(SERIALIZED_NAME_LOWERCASE)
  private Boolean lowercase;

  public static final String SERIALIZED_NAME_REMOVE_SYMBOLS = "removeSymbols";
  @SerializedName(SERIALIZED_NAME_REMOVE_SYMBOLS)
  private Boolean removeSymbols;

  public static final String SERIALIZED_NAME_REMOVE_SPACES = "removeSpaces";
  @SerializedName(SERIALIZED_NAME_REMOVE_SPACES)
  private Boolean removeSpaces;

  public static final String SERIALIZED_NAME_MIN_LENGTH = "minLength";
  @SerializedName(SERIALIZED_NAME_MIN_LENGTH)
  private Integer minLength;

  public static final String SERIALIZED_NAME_MAX_LENGTH = "maxLength";
  @SerializedName(SERIALIZED_NAME_MAX_LENGTH)
  private Integer maxLength;

  public static final String SERIALIZED_NAME_ANSWERS_REQUIRED = "answersRequired";
  @SerializedName(SERIALIZED_NAME_ANSWERS_REQUIRED)
  private Integer answersRequired;

  public static final String SERIALIZED_NAME_MAX_ANSWERS = "maxAnswers";
  @SerializedName(SERIALIZED_NAME_MAX_ANSWERS)
  private Integer maxAnswers;

  public static final String SERIALIZED_NAME_REQUIRES_AUTH = "requiresAuth";
  @SerializedName(SERIALIZED_NAME_REQUIRES_AUTH)
  private List<List<String>> requiresAuth = null;

  public static final String SERIALIZED_NAME_SKIP_ON_FAIL = "skipOnFail";
  @SerializedName(SERIALIZED_NAME_SKIP_ON_FAIL)
  private Boolean skipOnFail;

  public static final String SERIALIZED_NAME_RATE_LIMITER = "rateLimiter";
  @SerializedName(SERIALIZED_NAME_RATE_LIMITER)
  private String rateLimiter;

  public static final String SERIALIZED_NAME_BURN_QUOTA = "burnQuota";
  @SerializedName(SERIALIZED_NAME_BURN_QUOTA)
  private Double burnQuota;

  public QuestionsAuthCfg() { 
  }

  public QuestionsAuthCfg lowercase(Boolean lowercase) {
    
    this.lowercase = lowercase;
    return this;
  }

   /**
   * Get lowercase
   * @return lowercase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLowercase() {
    return lowercase;
  }


  public void setLowercase(Boolean lowercase) {
    this.lowercase = lowercase;
  }


  public QuestionsAuthCfg removeSymbols(Boolean removeSymbols) {
    
    this.removeSymbols = removeSymbols;
    return this;
  }

   /**
   * Get removeSymbols
   * @return removeSymbols
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRemoveSymbols() {
    return removeSymbols;
  }


  public void setRemoveSymbols(Boolean removeSymbols) {
    this.removeSymbols = removeSymbols;
  }


  public QuestionsAuthCfg removeSpaces(Boolean removeSpaces) {
    
    this.removeSpaces = removeSpaces;
    return this;
  }

   /**
   * Get removeSpaces
   * @return removeSpaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRemoveSpaces() {
    return removeSpaces;
  }


  public void setRemoveSpaces(Boolean removeSpaces) {
    this.removeSpaces = removeSpaces;
  }


  public QuestionsAuthCfg minLength(Integer minLength) {
    
    this.minLength = minLength;
    return this;
  }

   /**
   * Get minLength
   * @return minLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMinLength() {
    return minLength;
  }


  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }


  public QuestionsAuthCfg maxLength(Integer maxLength) {
    
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Get maxLength
   * @return maxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxLength() {
    return maxLength;
  }


  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }


  public QuestionsAuthCfg answersRequired(Integer answersRequired) {
    
    this.answersRequired = answersRequired;
    return this;
  }

   /**
   * Get answersRequired
   * @return answersRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAnswersRequired() {
    return answersRequired;
  }


  public void setAnswersRequired(Integer answersRequired) {
    this.answersRequired = answersRequired;
  }


  public QuestionsAuthCfg maxAnswers(Integer maxAnswers) {
    
    this.maxAnswers = maxAnswers;
    return this;
  }

   /**
   * Get maxAnswers
   * @return maxAnswers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxAnswers() {
    return maxAnswers;
  }


  public void setMaxAnswers(Integer maxAnswers) {
    this.maxAnswers = maxAnswers;
  }


  public QuestionsAuthCfg requiresAuth(List<List<String>> requiresAuth) {
    
    this.requiresAuth = requiresAuth;
    return this;
  }

  public QuestionsAuthCfg addRequiresAuthItem(List<String> requiresAuthItem) {
    if (this.requiresAuth == null) {
      this.requiresAuth = new ArrayList<>();
    }
    this.requiresAuth.add(requiresAuthItem);
    return this;
  }

   /**
   * Get requiresAuth
   * @return requiresAuth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<List<String>> getRequiresAuth() {
    return requiresAuth;
  }


  public void setRequiresAuth(List<List<String>> requiresAuth) {
    this.requiresAuth = requiresAuth;
  }


  public QuestionsAuthCfg skipOnFail(Boolean skipOnFail) {
    
    this.skipOnFail = skipOnFail;
    return this;
  }

   /**
   * Get skipOnFail
   * @return skipOnFail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSkipOnFail() {
    return skipOnFail;
  }


  public void setSkipOnFail(Boolean skipOnFail) {
    this.skipOnFail = skipOnFail;
  }


  public QuestionsAuthCfg rateLimiter(String rateLimiter) {
    
    this.rateLimiter = rateLimiter;
    return this;
  }

   /**
   * Get rateLimiter
   * @return rateLimiter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRateLimiter() {
    return rateLimiter;
  }


  public void setRateLimiter(String rateLimiter) {
    this.rateLimiter = rateLimiter;
  }


  public QuestionsAuthCfg burnQuota(Double burnQuota) {
    
    this.burnQuota = burnQuota;
    return this;
  }

   /**
   * Get burnQuota
   * @return burnQuota
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBurnQuota() {
    return burnQuota;
  }


  public void setBurnQuota(Double burnQuota) {
    this.burnQuota = burnQuota;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionsAuthCfg questionsAuthCfg = (QuestionsAuthCfg) o;
    return Objects.equals(this.lowercase, questionsAuthCfg.lowercase) &&
        Objects.equals(this.removeSymbols, questionsAuthCfg.removeSymbols) &&
        Objects.equals(this.removeSpaces, questionsAuthCfg.removeSpaces) &&
        Objects.equals(this.minLength, questionsAuthCfg.minLength) &&
        Objects.equals(this.maxLength, questionsAuthCfg.maxLength) &&
        Objects.equals(this.answersRequired, questionsAuthCfg.answersRequired) &&
        Objects.equals(this.maxAnswers, questionsAuthCfg.maxAnswers) &&
        Objects.equals(this.requiresAuth, questionsAuthCfg.requiresAuth) &&
        Objects.equals(this.skipOnFail, questionsAuthCfg.skipOnFail) &&
        Objects.equals(this.rateLimiter, questionsAuthCfg.rateLimiter) &&
        Objects.equals(this.burnQuota, questionsAuthCfg.burnQuota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lowercase, removeSymbols, removeSpaces, minLength, maxLength, answersRequired, maxAnswers, requiresAuth, skipOnFail, rateLimiter, burnQuota);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionsAuthCfg {\n");
    sb.append("    lowercase: ").append(toIndentedString(lowercase)).append("\n");
    sb.append("    removeSymbols: ").append(toIndentedString(removeSymbols)).append("\n");
    sb.append("    removeSpaces: ").append(toIndentedString(removeSpaces)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    answersRequired: ").append(toIndentedString(answersRequired)).append("\n");
    sb.append("    maxAnswers: ").append(toIndentedString(maxAnswers)).append("\n");
    sb.append("    requiresAuth: ").append(toIndentedString(requiresAuth)).append("\n");
    sb.append("    skipOnFail: ").append(toIndentedString(skipOnFail)).append("\n");
    sb.append("    rateLimiter: ").append(toIndentedString(rateLimiter)).append("\n");
    sb.append("    burnQuota: ").append(toIndentedString(burnQuota)).append("\n");
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
    openapiFields.add("lowercase");
    openapiFields.add("removeSymbols");
    openapiFields.add("removeSpaces");
    openapiFields.add("minLength");
    openapiFields.add("maxLength");
    openapiFields.add("answersRequired");
    openapiFields.add("maxAnswers");
    openapiFields.add("requiresAuth");
    openapiFields.add("skipOnFail");
    openapiFields.add("rateLimiter");
    openapiFields.add("burnQuota");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QuestionsAuthCfg
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (QuestionsAuthCfg.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuestionsAuthCfg is not found in the empty JSON string", QuestionsAuthCfg.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!QuestionsAuthCfg.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuestionsAuthCfg` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("requiresAuth") != null && !jsonObj.get("requiresAuth").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `requiresAuth` to be an array in the JSON string but got `%s`", jsonObj.get("requiresAuth").toString()));
      }
      if (jsonObj.get("rateLimiter") != null && !jsonObj.get("rateLimiter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rateLimiter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rateLimiter").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuestionsAuthCfg.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuestionsAuthCfg' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuestionsAuthCfg> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuestionsAuthCfg.class));

       return (TypeAdapter<T>) new TypeAdapter<QuestionsAuthCfg>() {
           @Override
           public void write(JsonWriter out, QuestionsAuthCfg value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuestionsAuthCfg read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuestionsAuthCfg given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuestionsAuthCfg
  * @throws IOException if the JSON string is invalid with respect to QuestionsAuthCfg
  */
  public static QuestionsAuthCfg fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuestionsAuthCfg.class);
  }

 /**
  * Convert an instance of QuestionsAuthCfg to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
