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
 * TooManyReqsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T19:30:17.809690+03:00[Europe/Kiev]")
public class TooManyReqsAllOf {
  public static final String SERIALIZED_NAME_WAIT_TIME_MS = "waitTimeMs";
  @SerializedName(SERIALIZED_NAME_WAIT_TIME_MS)
  private Integer waitTimeMs;

  public static final String SERIALIZED_NAME_WAIT_TIME_SECONDS = "waitTimeSeconds";
  @SerializedName(SERIALIZED_NAME_WAIT_TIME_SECONDS)
  private Integer waitTimeSeconds;

  public static final String SERIALIZED_NAME_WAIT_TIME_MINUTES = "waitTimeMinutes";
  @SerializedName(SERIALIZED_NAME_WAIT_TIME_MINUTES)
  private Integer waitTimeMinutes;

  public TooManyReqsAllOf() { 
  }

  public TooManyReqsAllOf waitTimeMs(Integer waitTimeMs) {
    
    this.waitTimeMs = waitTimeMs;
    return this;
  }

   /**
   * Get waitTimeMs
   * @return waitTimeMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWaitTimeMs() {
    return waitTimeMs;
  }


  public void setWaitTimeMs(Integer waitTimeMs) {
    this.waitTimeMs = waitTimeMs;
  }


  public TooManyReqsAllOf waitTimeSeconds(Integer waitTimeSeconds) {
    
    this.waitTimeSeconds = waitTimeSeconds;
    return this;
  }

   /**
   * Get waitTimeSeconds
   * @return waitTimeSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWaitTimeSeconds() {
    return waitTimeSeconds;
  }


  public void setWaitTimeSeconds(Integer waitTimeSeconds) {
    this.waitTimeSeconds = waitTimeSeconds;
  }


  public TooManyReqsAllOf waitTimeMinutes(Integer waitTimeMinutes) {
    
    this.waitTimeMinutes = waitTimeMinutes;
    return this;
  }

   /**
   * Get waitTimeMinutes
   * @return waitTimeMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWaitTimeMinutes() {
    return waitTimeMinutes;
  }


  public void setWaitTimeMinutes(Integer waitTimeMinutes) {
    this.waitTimeMinutes = waitTimeMinutes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TooManyReqsAllOf tooManyReqsAllOf = (TooManyReqsAllOf) o;
    return Objects.equals(this.waitTimeMs, tooManyReqsAllOf.waitTimeMs) &&
        Objects.equals(this.waitTimeSeconds, tooManyReqsAllOf.waitTimeSeconds) &&
        Objects.equals(this.waitTimeMinutes, tooManyReqsAllOf.waitTimeMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(waitTimeMs, waitTimeSeconds, waitTimeMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TooManyReqsAllOf {\n");
    sb.append("    waitTimeMs: ").append(toIndentedString(waitTimeMs)).append("\n");
    sb.append("    waitTimeSeconds: ").append(toIndentedString(waitTimeSeconds)).append("\n");
    sb.append("    waitTimeMinutes: ").append(toIndentedString(waitTimeMinutes)).append("\n");
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
    openapiFields.add("waitTimeMs");
    openapiFields.add("waitTimeSeconds");
    openapiFields.add("waitTimeMinutes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TooManyReqsAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TooManyReqsAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TooManyReqsAllOf is not found in the empty JSON string", TooManyReqsAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TooManyReqsAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TooManyReqsAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TooManyReqsAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TooManyReqsAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TooManyReqsAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TooManyReqsAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<TooManyReqsAllOf>() {
           @Override
           public void write(JsonWriter out, TooManyReqsAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TooManyReqsAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TooManyReqsAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TooManyReqsAllOf
  * @throws IOException if the JSON string is invalid with respect to TooManyReqsAllOf
  */
  public static TooManyReqsAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TooManyReqsAllOf.class);
  }

 /**
  * Convert an instance of TooManyReqsAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

