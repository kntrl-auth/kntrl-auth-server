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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
 * NextFactor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-23T23:42:03.192677+03:00[Europe/Kiev]")
public class NextFactor {
  public static final String SERIALIZED_NAME_FACTOR = "factor";
  @SerializedName(SERIALIZED_NAME_FACTOR)
  private String factor;

  public static final String SERIALIZED_NAME_SUPPORTED_AUTHS = "supportedAuths";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_AUTHS)
  private Set<String> supportedAuths = new LinkedHashSet<>();

  public NextFactor() { 
  }

  public NextFactor factor(String factor) {
    
    this.factor = factor;
    return this;
  }

   /**
   * Get factor
   * @return factor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFactor() {
    return factor;
  }


  public void setFactor(String factor) {
    this.factor = factor;
  }


  public NextFactor supportedAuths(Set<String> supportedAuths) {
    
    this.supportedAuths = supportedAuths;
    return this;
  }

  public NextFactor addSupportedAuthsItem(String supportedAuthsItem) {
    this.supportedAuths.add(supportedAuthsItem);
    return this;
  }

   /**
   * Get supportedAuths
   * @return supportedAuths
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Set<String> getSupportedAuths() {
    return supportedAuths;
  }


  public void setSupportedAuths(Set<String> supportedAuths) {
    this.supportedAuths = supportedAuths;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NextFactor nextFactor = (NextFactor) o;
    return Objects.equals(this.factor, nextFactor.factor) &&
        Objects.equals(this.supportedAuths, nextFactor.supportedAuths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(factor, supportedAuths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NextFactor {\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    supportedAuths: ").append(toIndentedString(supportedAuths)).append("\n");
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
    openapiFields.add("factor");
    openapiFields.add("supportedAuths");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("factor");
    openapiRequiredFields.add("supportedAuths");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NextFactor
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (NextFactor.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in NextFactor is not found in the empty JSON string", NextFactor.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NextFactor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NextFactor` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NextFactor.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("factor") != null && !jsonObj.get("factor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `factor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("factor").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("supportedAuths") != null && !jsonObj.get("supportedAuths").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supportedAuths` to be an array in the JSON string but got `%s`", jsonObj.get("supportedAuths").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NextFactor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NextFactor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NextFactor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NextFactor.class));

       return (TypeAdapter<T>) new TypeAdapter<NextFactor>() {
           @Override
           public void write(JsonWriter out, NextFactor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NextFactor read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NextFactor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NextFactor
  * @throws IOException if the JSON string is invalid with respect to NextFactor
  */
  public static NextFactor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NextFactor.class);
  }

 /**
  * Convert an instance of NextFactor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

