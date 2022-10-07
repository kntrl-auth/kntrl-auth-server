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
import app.kntrl.client.generated.model.AuthCfg;
import app.kntrl.client.generated.model.BuiltInAuthCfgAllOf;
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
 * Authentication implementation config
 */
@ApiModel(description = "Authentication implementation config")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T19:30:17.809690+03:00[Europe/Kiev]")
public class BuiltInAuthCfg {
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

  public BuiltInAuthCfg() { 
  }

  public BuiltInAuthCfg requiresAuth(List<List<String>> requiresAuth) {
    
    this.requiresAuth = requiresAuth;
    return this;
  }

  public BuiltInAuthCfg addRequiresAuthItem(List<String> requiresAuthItem) {
    if (this.requiresAuth == null) {
      this.requiresAuth = new ArrayList<>();
    }
    this.requiresAuth.add(requiresAuthItem);
    return this;
  }

   /**
   * If this is not null, app forbids to add this auth until listed auth enabled. - if this a string -&gt; require specified auth to be enabled before this. - array of strings -&gt; require any of listed auths to be enabled - array of arrays of strings -&gt; works as &#x60;[ [ \&quot;auth1\&quot; and \&quot;auth2\&quot; ] or [ \&quot;auth1\&quot; and \&quot;auth2\&quot; ] ]&#x60;
   * @return requiresAuth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If this is not null, app forbids to add this auth until listed auth enabled. - if this a string -> require specified auth to be enabled before this. - array of strings -> require any of listed auths to be enabled - array of arrays of strings -> works as `[ [ \"auth1\" and \"auth2\" ] or [ \"auth1\" and \"auth2\" ] ]`")

  public List<List<String>> getRequiresAuth() {
    return requiresAuth;
  }


  public void setRequiresAuth(List<List<String>> requiresAuth) {
    this.requiresAuth = requiresAuth;
  }


  public BuiltInAuthCfg skipOnFail(Boolean skipOnFail) {
    
    this.skipOnFail = skipOnFail;
    return this;
  }

   /**
   * When this is set to true app will attempt next auth in case of error on current. It&#39;s works good with IP auth. User can provide both IP auth request and SMS auth request. And SMS will be executed only when IP auth is failed. If set to false any error on this auth will stop the whole request execution.
   * @return skipOnFail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When this is set to true app will attempt next auth in case of error on current. It's works good with IP auth. User can provide both IP auth request and SMS auth request. And SMS will be executed only when IP auth is failed. If set to false any error on this auth will stop the whole request execution.")

  public Boolean getSkipOnFail() {
    return skipOnFail;
  }


  public void setSkipOnFail(Boolean skipOnFail) {
    this.skipOnFail = skipOnFail;
  }


  public BuiltInAuthCfg rateLimiter(String rateLimiter) {
    
    this.rateLimiter = rateLimiter;
    return this;
  }

   /**
   * Apply rate limiter for this auth.
   * @return rateLimiter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Apply rate limiter for this auth.")

  public String getRateLimiter() {
    return rateLimiter;
  }


  public void setRateLimiter(String rateLimiter) {
    this.rateLimiter = rateLimiter;
  }


  public BuiltInAuthCfg burnQuota(Double burnQuota) {
    
    this.burnQuota = burnQuota;
    return this;
  }

   /**
   * Every auth execution will burn this amount of quota. Takes place only when rate limiter is specified
   * @return burnQuota
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Every auth execution will burn this amount of quota. Takes place only when rate limiter is specified")

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
    BuiltInAuthCfg builtInAuthCfg = (BuiltInAuthCfg) o;
    return Objects.equals(this.requiresAuth, builtInAuthCfg.requiresAuth) &&
        Objects.equals(this.skipOnFail, builtInAuthCfg.skipOnFail) &&
        Objects.equals(this.rateLimiter, builtInAuthCfg.rateLimiter) &&
        Objects.equals(this.burnQuota, builtInAuthCfg.burnQuota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiresAuth, skipOnFail, rateLimiter, burnQuota);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuiltInAuthCfg {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to BuiltInAuthCfg
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BuiltInAuthCfg.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BuiltInAuthCfg is not found in the empty JSON string", BuiltInAuthCfg.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BuiltInAuthCfg.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BuiltInAuthCfg` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
       if (!BuiltInAuthCfg.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BuiltInAuthCfg' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BuiltInAuthCfg> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BuiltInAuthCfg.class));

       return (TypeAdapter<T>) new TypeAdapter<BuiltInAuthCfg>() {
           @Override
           public void write(JsonWriter out, BuiltInAuthCfg value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BuiltInAuthCfg read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BuiltInAuthCfg given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BuiltInAuthCfg
  * @throws IOException if the JSON string is invalid with respect to BuiltInAuthCfg
  */
  public static BuiltInAuthCfg fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BuiltInAuthCfg.class);
  }

 /**
  * Convert an instance of BuiltInAuthCfg to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

