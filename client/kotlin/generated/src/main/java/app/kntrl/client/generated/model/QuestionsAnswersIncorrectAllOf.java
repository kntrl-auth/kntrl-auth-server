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

import app.kntrl.client.generated.infra.JSON;

/**
 * QuestionsAnswersIncorrectAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T19:30:17.809690+03:00[Europe/Kiev]")
public class QuestionsAnswersIncorrectAllOf {
  public static final String SERIALIZED_NAME_INCORRECT_ANSWERS = "incorrectAnswers";
  @SerializedName(SERIALIZED_NAME_INCORRECT_ANSWERS)
  private List<String> incorrectAnswers = null;

  public static final String SERIALIZED_NAME_REQUIRES_MORE_ANSWERS = "requiresMoreAnswers";
  @SerializedName(SERIALIZED_NAME_REQUIRES_MORE_ANSWERS)
  private Boolean requiresMoreAnswers;

  public static final String SERIALIZED_NAME_QUESTIONS_NOT_FOUND = "questionsNotFound";
  @SerializedName(SERIALIZED_NAME_QUESTIONS_NOT_FOUND)
  private List<String> questionsNotFound = null;

  public QuestionsAnswersIncorrectAllOf() { 
  }

  public QuestionsAnswersIncorrectAllOf incorrectAnswers(List<String> incorrectAnswers) {
    
    this.incorrectAnswers = incorrectAnswers;
    return this;
  }

  public QuestionsAnswersIncorrectAllOf addIncorrectAnswersItem(String incorrectAnswersItem) {
    if (this.incorrectAnswers == null) {
      this.incorrectAnswers = new ArrayList<>();
    }
    this.incorrectAnswers.add(incorrectAnswersItem);
    return this;
  }

   /**
   * Get incorrectAnswers
   * @return incorrectAnswers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIncorrectAnswers() {
    return incorrectAnswers;
  }


  public void setIncorrectAnswers(List<String> incorrectAnswers) {
    this.incorrectAnswers = incorrectAnswers;
  }


  public QuestionsAnswersIncorrectAllOf requiresMoreAnswers(Boolean requiresMoreAnswers) {
    
    this.requiresMoreAnswers = requiresMoreAnswers;
    return this;
  }

   /**
   * Get requiresMoreAnswers
   * @return requiresMoreAnswers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequiresMoreAnswers() {
    return requiresMoreAnswers;
  }


  public void setRequiresMoreAnswers(Boolean requiresMoreAnswers) {
    this.requiresMoreAnswers = requiresMoreAnswers;
  }


  public QuestionsAnswersIncorrectAllOf questionsNotFound(List<String> questionsNotFound) {
    
    this.questionsNotFound = questionsNotFound;
    return this;
  }

  public QuestionsAnswersIncorrectAllOf addQuestionsNotFoundItem(String questionsNotFoundItem) {
    if (this.questionsNotFound == null) {
      this.questionsNotFound = new ArrayList<>();
    }
    this.questionsNotFound.add(questionsNotFoundItem);
    return this;
  }

   /**
   * Get questionsNotFound
   * @return questionsNotFound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getQuestionsNotFound() {
    return questionsNotFound;
  }


  public void setQuestionsNotFound(List<String> questionsNotFound) {
    this.questionsNotFound = questionsNotFound;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionsAnswersIncorrectAllOf questionsAnswersIncorrectAllOf = (QuestionsAnswersIncorrectAllOf) o;
    return Objects.equals(this.incorrectAnswers, questionsAnswersIncorrectAllOf.incorrectAnswers) &&
        Objects.equals(this.requiresMoreAnswers, questionsAnswersIncorrectAllOf.requiresMoreAnswers) &&
        Objects.equals(this.questionsNotFound, questionsAnswersIncorrectAllOf.questionsNotFound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incorrectAnswers, requiresMoreAnswers, questionsNotFound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionsAnswersIncorrectAllOf {\n");
    sb.append("    incorrectAnswers: ").append(toIndentedString(incorrectAnswers)).append("\n");
    sb.append("    requiresMoreAnswers: ").append(toIndentedString(requiresMoreAnswers)).append("\n");
    sb.append("    questionsNotFound: ").append(toIndentedString(questionsNotFound)).append("\n");
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
    openapiFields.add("incorrectAnswers");
    openapiFields.add("requiresMoreAnswers");
    openapiFields.add("questionsNotFound");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QuestionsAnswersIncorrectAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (QuestionsAnswersIncorrectAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuestionsAnswersIncorrectAllOf is not found in the empty JSON string", QuestionsAnswersIncorrectAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!QuestionsAnswersIncorrectAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuestionsAnswersIncorrectAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("incorrectAnswers") != null && !jsonObj.get("incorrectAnswers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `incorrectAnswers` to be an array in the JSON string but got `%s`", jsonObj.get("incorrectAnswers").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("questionsNotFound") != null && !jsonObj.get("questionsNotFound").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `questionsNotFound` to be an array in the JSON string but got `%s`", jsonObj.get("questionsNotFound").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuestionsAnswersIncorrectAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuestionsAnswersIncorrectAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuestionsAnswersIncorrectAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuestionsAnswersIncorrectAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<QuestionsAnswersIncorrectAllOf>() {
           @Override
           public void write(JsonWriter out, QuestionsAnswersIncorrectAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuestionsAnswersIncorrectAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuestionsAnswersIncorrectAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuestionsAnswersIncorrectAllOf
  * @throws IOException if the JSON string is invalid with respect to QuestionsAnswersIncorrectAllOf
  */
  public static QuestionsAnswersIncorrectAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuestionsAnswersIncorrectAllOf.class);
  }

 /**
  * Convert an instance of QuestionsAnswersIncorrectAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
