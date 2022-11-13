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
import app.kntrl.client.openapi.model.OAuthCfgExchangeAuthCode;
import app.kntrl.client.openapi.model.OAuthCfgUserInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

import app.kntrl.client.openapi.infra.JSON;

/**
 * OAuthCfg
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OAuthCfg {
  public static final String SERIALIZED_NAME_REQUIRES_AUTH = "requiresAuth";
  @SerializedName(SERIALIZED_NAME_REQUIRES_AUTH)
  private List<List<String>> requiresAuth = null;

  public static final String SERIALIZED_NAME_SKIP_ON_FAIL = "skipOnFail";
  @SerializedName(SERIALIZED_NAME_SKIP_ON_FAIL)
  private Boolean skipOnFail = false;

  public static final String SERIALIZED_NAME_RATE_LIMITER = "rateLimiter";
  @SerializedName(SERIALIZED_NAME_RATE_LIMITER)
  private String rateLimiter;

  public static final String SERIALIZED_NAME_BURN_QUOTA = "burnQuota";
  @SerializedName(SERIALIZED_NAME_BURN_QUOTA)
  private Double burnQuota = 0.0d;

  public static final String SERIALIZED_NAME_EXCHANGE_AUTH_CODE = "exchangeAuthCode";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_AUTH_CODE)
  private OAuthCfgExchangeAuthCode exchangeAuthCode;

  public static final String SERIALIZED_NAME_USER_INFO = "userInfo";
  @SerializedName(SERIALIZED_NAME_USER_INFO)
  private OAuthCfgUserInfo userInfo;

  public static final String SERIALIZED_NAME_EXTRACT_LOGIN = "extractLogin";
  @SerializedName(SERIALIZED_NAME_EXTRACT_LOGIN)
  private String extractLogin;

  public static final String SERIALIZED_NAME_EXTRACT_PUBLIC_DATA = "extractPublicData";
  @SerializedName(SERIALIZED_NAME_EXTRACT_PUBLIC_DATA)
  private Map<String, String> extractPublicData = null;

  public OAuthCfg() {
  }

  public OAuthCfg requiresAuth(List<List<String>> requiresAuth) {
    
    this.requiresAuth = requiresAuth;
    return this;
  }

  public OAuthCfg addRequiresAuthItem(List<String> requiresAuthItem) {
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


  public OAuthCfg skipOnFail(Boolean skipOnFail) {
    
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


  public OAuthCfg rateLimiter(String rateLimiter) {
    
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


  public OAuthCfg burnQuota(Double burnQuota) {
    
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


  public OAuthCfg exchangeAuthCode(OAuthCfgExchangeAuthCode exchangeAuthCode) {
    
    this.exchangeAuthCode = exchangeAuthCode;
    return this;
  }

   /**
   * Get exchangeAuthCode
   * @return exchangeAuthCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OAuthCfgExchangeAuthCode getExchangeAuthCode() {
    return exchangeAuthCode;
  }


  public void setExchangeAuthCode(OAuthCfgExchangeAuthCode exchangeAuthCode) {
    this.exchangeAuthCode = exchangeAuthCode;
  }


  public OAuthCfg userInfo(OAuthCfgUserInfo userInfo) {
    
    this.userInfo = userInfo;
    return this;
  }

   /**
   * Get userInfo
   * @return userInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OAuthCfgUserInfo getUserInfo() {
    return userInfo;
  }


  public void setUserInfo(OAuthCfgUserInfo userInfo) {
    this.userInfo = userInfo;
  }


  public OAuthCfg extractLogin(String extractLogin) {
    
    this.extractLogin = extractLogin;
    return this;
  }

   /**
   * Json path for login in the exchangeAuthCode or userInfo endpoint response. e.g. &#x60;access_token.user.id&#x60; extracts user login from &#x60;{ \&quot;access_token\&quot;: { \&quot;user\&quot;: { \&quot;id\&quot;: \&quot;...\&quot; } } }&#x60; 
   * @return extractLogin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "access_token.user_id", required = true, value = "Json path for login in the exchangeAuthCode or userInfo endpoint response. e.g. `access_token.user.id` extracts user login from `{ \"access_token\": { \"user\": { \"id\": \"...\" } } }` ")

  public String getExtractLogin() {
    return extractLogin;
  }


  public void setExtractLogin(String extractLogin) {
    this.extractLogin = extractLogin;
  }


  public OAuthCfg extractPublicData(Map<String, String> extractPublicData) {
    
    this.extractPublicData = extractPublicData;
    return this;
  }

  public OAuthCfg putExtractPublicDataItem(String key, String extractPublicDataItem) {
    if (this.extractPublicData == null) {
      this.extractPublicData = new HashMap<>();
    }
    this.extractPublicData.put(key, extractPublicDataItem);
    return this;
  }

   /**
   * Can fill public data from the exchangeAuthCode or userInfo endpoint response. 
   * @return extractPublicData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"photoUrl:\":\"access_token.user_photo_url\",\"name\":\"access_token.full_name\"}", value = "Can fill public data from the exchangeAuthCode or userInfo endpoint response. ")

  public Map<String, String> getExtractPublicData() {
    return extractPublicData;
  }


  public void setExtractPublicData(Map<String, String> extractPublicData) {
    this.extractPublicData = extractPublicData;
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
  public OAuthCfg putAdditionalProperty(String key, Object value) {
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
    OAuthCfg oauthCfg = (OAuthCfg) o;
    return Objects.equals(this.requiresAuth, oauthCfg.requiresAuth) &&
        Objects.equals(this.skipOnFail, oauthCfg.skipOnFail) &&
        Objects.equals(this.rateLimiter, oauthCfg.rateLimiter) &&
        Objects.equals(this.burnQuota, oauthCfg.burnQuota) &&
        Objects.equals(this.exchangeAuthCode, oauthCfg.exchangeAuthCode) &&
        Objects.equals(this.userInfo, oauthCfg.userInfo) &&
        Objects.equals(this.extractLogin, oauthCfg.extractLogin) &&
        Objects.equals(this.extractPublicData, oauthCfg.extractPublicData)&&
        Objects.equals(this.additionalProperties, oauthCfg.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiresAuth, skipOnFail, rateLimiter, burnQuota, exchangeAuthCode, userInfo, extractLogin, extractPublicData, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthCfg {\n");
    sb.append("    requiresAuth: ").append(toIndentedString(requiresAuth)).append("\n");
    sb.append("    skipOnFail: ").append(toIndentedString(skipOnFail)).append("\n");
    sb.append("    rateLimiter: ").append(toIndentedString(rateLimiter)).append("\n");
    sb.append("    burnQuota: ").append(toIndentedString(burnQuota)).append("\n");
    sb.append("    exchangeAuthCode: ").append(toIndentedString(exchangeAuthCode)).append("\n");
    sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
    sb.append("    extractLogin: ").append(toIndentedString(extractLogin)).append("\n");
    sb.append("    extractPublicData: ").append(toIndentedString(extractPublicData)).append("\n");
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
    openapiFields.add("requiresAuth");
    openapiFields.add("skipOnFail");
    openapiFields.add("rateLimiter");
    openapiFields.add("burnQuota");
    openapiFields.add("exchangeAuthCode");
    openapiFields.add("userInfo");
    openapiFields.add("extractLogin");
    openapiFields.add("extractPublicData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("extractLogin");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OAuthCfg
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OAuthCfg.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OAuthCfg is not found in the empty JSON string", OAuthCfg.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OAuthCfg.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("requiresAuth") != null && !jsonObj.get("requiresAuth").isJsonNull()) && !jsonObj.get("requiresAuth").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `requiresAuth` to be an array in the JSON string but got `%s`", jsonObj.get("requiresAuth").toString()));
      }
      if ((jsonObj.get("rateLimiter") != null && !jsonObj.get("rateLimiter").isJsonNull()) && !jsonObj.get("rateLimiter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rateLimiter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rateLimiter").toString()));
      }
      // validate the optional field `exchangeAuthCode`
      if (jsonObj.get("exchangeAuthCode") != null && !jsonObj.get("exchangeAuthCode").isJsonNull()) {
        OAuthCfgExchangeAuthCode.validateJsonObject(jsonObj.getAsJsonObject("exchangeAuthCode"));
      }
      // validate the optional field `userInfo`
      if (jsonObj.get("userInfo") != null && !jsonObj.get("userInfo").isJsonNull()) {
        OAuthCfgUserInfo.validateJsonObject(jsonObj.getAsJsonObject("userInfo"));
      }
      if ((jsonObj.get("extractLogin") != null && !jsonObj.get("extractLogin").isJsonNull()) && !jsonObj.get("extractLogin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extractLogin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extractLogin").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OAuthCfg.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OAuthCfg' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OAuthCfg> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OAuthCfg.class));

       return (TypeAdapter<T>) new TypeAdapter<OAuthCfg>() {
           @Override
           public void write(JsonWriter out, OAuthCfg value) throws IOException {
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
           public OAuthCfg read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OAuthCfg instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OAuthCfg given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OAuthCfg
  * @throws IOException if the JSON string is invalid with respect to OAuthCfg
  */
  public static OAuthCfg fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OAuthCfg.class);
  }

 /**
  * Convert an instance of OAuthCfg to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

