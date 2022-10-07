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
 * Forbids user to change password to the old one. Useful if you force user to change password regularly.
 */
@ApiModel(description = "Forbids user to change password to the old one. Useful if you force user to change password regularly.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T19:30:17.809690+03:00[Europe/Kiev]")
public class PasswordHistoryCfg {
  public static final String SERIALIZED_NAME_PASSWORD_HISTORY_SIZE = "passwordHistorySize";
  @SerializedName(SERIALIZED_NAME_PASSWORD_HISTORY_SIZE)
  private Integer passwordHistorySize;

  public static final String SERIALIZED_NAME_PASSWORD_HISTORY_TTL = "passwordHistoryTtl";
  @SerializedName(SERIALIZED_NAME_PASSWORD_HISTORY_TTL)
  private String passwordHistoryTtl;

  public PasswordHistoryCfg() { 
  }

  public PasswordHistoryCfg passwordHistorySize(Integer passwordHistorySize) {
    
    this.passwordHistorySize = passwordHistorySize;
    return this;
  }

   /**
   * Number of current user passwords to store in database.
   * @return passwordHistorySize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of current user passwords to store in database.")

  public Integer getPasswordHistorySize() {
    return passwordHistorySize;
  }


  public void setPasswordHistorySize(Integer passwordHistorySize) {
    this.passwordHistorySize = passwordHistorySize;
  }


  public PasswordHistoryCfg passwordHistoryTtl(String passwordHistoryTtl) {
    
    this.passwordHistoryTtl = passwordHistoryTtl;
    return this;
  }

   /**
   * Lifetime for the password. Accepts time string e.g. 1y, 3m, 2y 6m, etc.
   * @return passwordHistoryTtl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Lifetime for the password. Accepts time string e.g. 1y, 3m, 2y 6m, etc.")

  public String getPasswordHistoryTtl() {
    return passwordHistoryTtl;
  }


  public void setPasswordHistoryTtl(String passwordHistoryTtl) {
    this.passwordHistoryTtl = passwordHistoryTtl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordHistoryCfg passwordHistoryCfg = (PasswordHistoryCfg) o;
    return Objects.equals(this.passwordHistorySize, passwordHistoryCfg.passwordHistorySize) &&
        Objects.equals(this.passwordHistoryTtl, passwordHistoryCfg.passwordHistoryTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwordHistorySize, passwordHistoryTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordHistoryCfg {\n");
    sb.append("    passwordHistorySize: ").append(toIndentedString(passwordHistorySize)).append("\n");
    sb.append("    passwordHistoryTtl: ").append(toIndentedString(passwordHistoryTtl)).append("\n");
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
    openapiFields.add("passwordHistorySize");
    openapiFields.add("passwordHistoryTtl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PasswordHistoryCfg
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PasswordHistoryCfg.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PasswordHistoryCfg is not found in the empty JSON string", PasswordHistoryCfg.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PasswordHistoryCfg.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PasswordHistoryCfg` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("passwordHistoryTtl") != null && !jsonObj.get("passwordHistoryTtl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passwordHistoryTtl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passwordHistoryTtl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PasswordHistoryCfg.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PasswordHistoryCfg' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PasswordHistoryCfg> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PasswordHistoryCfg.class));

       return (TypeAdapter<T>) new TypeAdapter<PasswordHistoryCfg>() {
           @Override
           public void write(JsonWriter out, PasswordHistoryCfg value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PasswordHistoryCfg read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PasswordHistoryCfg given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PasswordHistoryCfg
  * @throws IOException if the JSON string is invalid with respect to PasswordHistoryCfg
  */
  public static PasswordHistoryCfg fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PasswordHistoryCfg.class);
  }

 /**
  * Convert an instance of PasswordHistoryCfg to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

