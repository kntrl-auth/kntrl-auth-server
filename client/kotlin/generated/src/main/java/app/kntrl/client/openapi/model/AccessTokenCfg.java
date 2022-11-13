/*
 * Kntrl API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.10.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package app.kntrl.client.openapi.model;

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

import app.kntrl.client.openapi.infra.JSON;

/**
 * Short-living token used for authentication.
 */
@ApiModel(description = "Short-living token used for authentication.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccessTokenCfg {
  public static final String SERIALIZED_NAME_COOKIE = "cookie";
  @SerializedName(SERIALIZED_NAME_COOKIE)
  private Boolean cookie = false;

  /**
   * If not null - access token contains signed session data, so it&#39;s not required to request session database for access check.
   */
  @JsonAdapter(CacheEnum.Adapter.class)
  public enum CacheEnum {
    JWT("JWT"),
    
    BINARY("BINARY");

    private String value;

    CacheEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CacheEnum fromValue(String value) {
      for (CacheEnum b : CacheEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CacheEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CacheEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CacheEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CacheEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CACHE = "cache";
  @SerializedName(SERIALIZED_NAME_CACHE)
  private CacheEnum cache;

  public static final String SERIALIZED_NAME_CACHE_UNAUTHENTICATED = "cacheUnauthenticated";
  @SerializedName(SERIALIZED_NAME_CACHE_UNAUTHENTICATED)
  private Boolean cacheUnauthenticated = false;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private String ttl = "1d";

  public AccessTokenCfg() {
  }

  public AccessTokenCfg cookie(Boolean cookie) {
    
    this.cookie = cookie;
    return this;
  }

   /**
   * Send token in &#x60;access_token&#x60; cookie
   * @return cookie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Send token in `access_token` cookie")

  public Boolean getCookie() {
    return cookie;
  }


  public void setCookie(Boolean cookie) {
    this.cookie = cookie;
  }


  public AccessTokenCfg cache(CacheEnum cache) {
    
    this.cache = cache;
    return this;
  }

   /**
   * If not null - access token contains signed session data, so it&#39;s not required to request session database for access check.
   * @return cache
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If not null - access token contains signed session data, so it's not required to request session database for access check.")

  public CacheEnum getCache() {
    return cache;
  }


  public void setCache(CacheEnum cache) {
    this.cache = cache;
  }


  public AccessTokenCfg cacheUnauthenticated(Boolean cacheUnauthenticated) {
    
    this.cacheUnauthenticated = cacheUnauthenticated;
    return this;
  }

   /**
   * By default, unauthenticated sessions can&#39;t be cached.
   * @return cacheUnauthenticated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "By default, unauthenticated sessions can't be cached.")

  public Boolean getCacheUnauthenticated() {
    return cacheUnauthenticated;
  }


  public void setCacheUnauthenticated(Boolean cacheUnauthenticated) {
    this.cacheUnauthenticated = cacheUnauthenticated;
  }


  public AccessTokenCfg ttl(String ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * Lifetime for access token. 1d, 30m, etc. 
   * @return ttl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1d", value = "Lifetime for access token. 1d, 30m, etc. ")

  public String getTtl() {
    return ttl;
  }


  public void setTtl(String ttl) {
    this.ttl = ttl;
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
  public AccessTokenCfg putAdditionalProperty(String key, Object value) {
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
    AccessTokenCfg accessTokenCfg = (AccessTokenCfg) o;
    return Objects.equals(this.cookie, accessTokenCfg.cookie) &&
        Objects.equals(this.cache, accessTokenCfg.cache) &&
        Objects.equals(this.cacheUnauthenticated, accessTokenCfg.cacheUnauthenticated) &&
        Objects.equals(this.ttl, accessTokenCfg.ttl)&&
        Objects.equals(this.additionalProperties, accessTokenCfg.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cookie, cache, cacheUnauthenticated, ttl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTokenCfg {\n");
    sb.append("    cookie: ").append(toIndentedString(cookie)).append("\n");
    sb.append("    cache: ").append(toIndentedString(cache)).append("\n");
    sb.append("    cacheUnauthenticated: ").append(toIndentedString(cacheUnauthenticated)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
    openapiFields.add("cookie");
    openapiFields.add("cache");
    openapiFields.add("cacheUnauthenticated");
    openapiFields.add("ttl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccessTokenCfg
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AccessTokenCfg.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessTokenCfg is not found in the empty JSON string", AccessTokenCfg.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("cache") != null && !jsonObj.get("cache").isJsonNull()) && !jsonObj.get("cache").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cache` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cache").toString()));
      }
      if ((jsonObj.get("ttl") != null && !jsonObj.get("ttl").isJsonNull()) && !jsonObj.get("ttl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ttl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ttl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessTokenCfg.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessTokenCfg' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessTokenCfg> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessTokenCfg.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessTokenCfg>() {
           @Override
           public void write(JsonWriter out, AccessTokenCfg value) throws IOException {
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
           public AccessTokenCfg read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AccessTokenCfg instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AccessTokenCfg given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessTokenCfg
  * @throws IOException if the JSON string is invalid with respect to AccessTokenCfg
  */
  public static AccessTokenCfg fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessTokenCfg.class);
  }

 /**
  * Convert an instance of AccessTokenCfg to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

