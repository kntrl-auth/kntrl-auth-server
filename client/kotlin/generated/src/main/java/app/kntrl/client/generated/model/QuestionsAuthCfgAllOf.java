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
 * QuestionsAuthCfgAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T19:30:17.809690+03:00[Europe/Kiev]")
public class QuestionsAuthCfgAllOf {
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

  public QuestionsAuthCfgAllOf() { 
  }

  public QuestionsAuthCfgAllOf lowercase(Boolean lowercase) {
    
    this.lowercase = lowercase;
    return this;
  }

   /**
   * Transform user answer to lowercase letters. This allows user still pass a check when he wrote name or city with different cases. &#x60;false&#x60; means strict match, so \&quot;John\&quot; !&#x3D; \&quot;john\&quot;
   * @return lowercase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transform user answer to lowercase letters. This allows user still pass a check when he wrote name or city with different cases. `false` means strict match, so \"John\" != \"john\"")

  public Boolean getLowercase() {
    return lowercase;
  }


  public void setLowercase(Boolean lowercase) {
    this.lowercase = lowercase;
  }


  public QuestionsAuthCfgAllOf removeSymbols(Boolean removeSymbols) {
    
    this.removeSymbols = removeSymbols;
    return this;
  }

   /**
   * Remove all non-letters from user answer.
   * @return removeSymbols
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Remove all non-letters from user answer.")

  public Boolean getRemoveSymbols() {
    return removeSymbols;
  }


  public void setRemoveSymbols(Boolean removeSymbols) {
    this.removeSymbols = removeSymbols;
  }


  public QuestionsAuthCfgAllOf removeSpaces(Boolean removeSpaces) {
    
    this.removeSpaces = removeSpaces;
    return this;
  }

   /**
   * Remove all spaces from user answer.
   * @return removeSpaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Remove all spaces from user answer.")

  public Boolean getRemoveSpaces() {
    return removeSpaces;
  }


  public void setRemoveSpaces(Boolean removeSpaces) {
    this.removeSpaces = removeSpaces;
  }


  public QuestionsAuthCfgAllOf minLength(Integer minLength) {
    
    this.minLength = minLength;
    return this;
  }

   /**
   * Min length of answer. Length are checked after all answer transformation.
   * @return minLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Min length of answer. Length are checked after all answer transformation.")

  public Integer getMinLength() {
    return minLength;
  }


  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }


  public QuestionsAuthCfgAllOf maxLength(Integer maxLength) {
    
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Max length of answer.
   * @return maxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Max length of answer.")

  public Integer getMaxLength() {
    return maxLength;
  }


  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }


  public QuestionsAuthCfgAllOf answersRequired(Integer answersRequired) {
    
    this.answersRequired = answersRequired;
    return this;
  }

   /**
   * Min number of answers required to pass this check.
   * @return answersRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Min number of answers required to pass this check.")

  public Integer getAnswersRequired() {
    return answersRequired;
  }


  public void setAnswersRequired(Integer answersRequired) {
    this.answersRequired = answersRequired;
  }


  public QuestionsAuthCfgAllOf maxAnswers(Integer maxAnswers) {
    
    this.maxAnswers = maxAnswers;
    return this;
  }

   /**
   * Max answers that user can save.
   * @return maxAnswers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Max answers that user can save.")

  public Integer getMaxAnswers() {
    return maxAnswers;
  }


  public void setMaxAnswers(Integer maxAnswers) {
    this.maxAnswers = maxAnswers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionsAuthCfgAllOf questionsAuthCfgAllOf = (QuestionsAuthCfgAllOf) o;
    return Objects.equals(this.lowercase, questionsAuthCfgAllOf.lowercase) &&
        Objects.equals(this.removeSymbols, questionsAuthCfgAllOf.removeSymbols) &&
        Objects.equals(this.removeSpaces, questionsAuthCfgAllOf.removeSpaces) &&
        Objects.equals(this.minLength, questionsAuthCfgAllOf.minLength) &&
        Objects.equals(this.maxLength, questionsAuthCfgAllOf.maxLength) &&
        Objects.equals(this.answersRequired, questionsAuthCfgAllOf.answersRequired) &&
        Objects.equals(this.maxAnswers, questionsAuthCfgAllOf.maxAnswers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lowercase, removeSymbols, removeSpaces, minLength, maxLength, answersRequired, maxAnswers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionsAuthCfgAllOf {\n");
    sb.append("    lowercase: ").append(toIndentedString(lowercase)).append("\n");
    sb.append("    removeSymbols: ").append(toIndentedString(removeSymbols)).append("\n");
    sb.append("    removeSpaces: ").append(toIndentedString(removeSpaces)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    answersRequired: ").append(toIndentedString(answersRequired)).append("\n");
    sb.append("    maxAnswers: ").append(toIndentedString(maxAnswers)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QuestionsAuthCfgAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (QuestionsAuthCfgAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuestionsAuthCfgAllOf is not found in the empty JSON string", QuestionsAuthCfgAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!QuestionsAuthCfgAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuestionsAuthCfgAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuestionsAuthCfgAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuestionsAuthCfgAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuestionsAuthCfgAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuestionsAuthCfgAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<QuestionsAuthCfgAllOf>() {
           @Override
           public void write(JsonWriter out, QuestionsAuthCfgAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuestionsAuthCfgAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuestionsAuthCfgAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuestionsAuthCfgAllOf
  * @throws IOException if the JSON string is invalid with respect to QuestionsAuthCfgAllOf
  */
  public static QuestionsAuthCfgAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuestionsAuthCfgAllOf.class);
  }

 /**
  * Convert an instance of QuestionsAuthCfgAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

