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
 * If specified, app is able to handle authorizationCode from auth request; exchanges it for &#x60;access_token&#x60; or/and &#x60;id_token&#x60;
 */
@ApiModel(description = "If specified, app is able to handle authorizationCode from auth request; exchanges it for `access_token` or/and `id_token`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OAuthCfgExchangeAuthCode {
  public static final String SERIALIZED_NAME_TOKEN_URL = "tokenUrl";
  @SerializedName(SERIALIZED_NAME_TOKEN_URL)
  private String tokenUrl;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "clientSecret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public OAuthCfgExchangeAuthCode() {
  }

  public OAuthCfgExchangeAuthCode tokenUrl(String tokenUrl) {
    
    this.tokenUrl = tokenUrl;
    return this;
  }

   /**
   * Url to get access token by authorisation code. 
   * @return tokenUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://example.org/token", required = true, value = "Url to get access token by authorisation code. ")

  public String getTokenUrl() {
    return tokenUrl;
  }


  public void setTokenUrl(String tokenUrl) {
    this.tokenUrl = tokenUrl;
  }


  public OAuthCfgExchangeAuthCode clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * OAuth client id. Client must be registered on OAuth provider (e.g. facebook, google)
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OAuth client id. Client must be registered on OAuth provider (e.g. facebook, google)")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public OAuthCfgExchangeAuthCode clientSecret(String clientSecret) {
    
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * OAuth client secret.
   * @return clientSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OAuth client secret.")

  public String getClientSecret() {
    return clientSecret;
  }


  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
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
  public OAuthCfgExchangeAuthCode putAdditionalProperty(String key, Object value) {
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
    OAuthCfgExchangeAuthCode oauthCfgExchangeAuthCode = (OAuthCfgExchangeAuthCode) o;
    return Objects.equals(this.tokenUrl, oauthCfgExchangeAuthCode.tokenUrl) &&
        Objects.equals(this.clientId, oauthCfgExchangeAuthCode.clientId) &&
        Objects.equals(this.clientSecret, oauthCfgExchangeAuthCode.clientSecret)&&
        Objects.equals(this.additionalProperties, oauthCfgExchangeAuthCode.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenUrl, clientId, clientSecret, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthCfgExchangeAuthCode {\n");
    sb.append("    tokenUrl: ").append(toIndentedString(tokenUrl)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
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
    openapiFields.add("tokenUrl");
    openapiFields.add("clientId");
    openapiFields.add("clientSecret");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tokenUrl");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OAuthCfgExchangeAuthCode
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OAuthCfgExchangeAuthCode.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OAuthCfgExchangeAuthCode is not found in the empty JSON string", OAuthCfgExchangeAuthCode.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OAuthCfgExchangeAuthCode.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("tokenUrl") != null && !jsonObj.get("tokenUrl").isJsonNull()) && !jsonObj.get("tokenUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tokenUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tokenUrl").toString()));
      }
      if ((jsonObj.get("clientId") != null && !jsonObj.get("clientId").isJsonNull()) && !jsonObj.get("clientId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientId").toString()));
      }
      if ((jsonObj.get("clientSecret") != null && !jsonObj.get("clientSecret").isJsonNull()) && !jsonObj.get("clientSecret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientSecret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientSecret").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OAuthCfgExchangeAuthCode.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OAuthCfgExchangeAuthCode' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OAuthCfgExchangeAuthCode> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OAuthCfgExchangeAuthCode.class));

       return (TypeAdapter<T>) new TypeAdapter<OAuthCfgExchangeAuthCode>() {
           @Override
           public void write(JsonWriter out, OAuthCfgExchangeAuthCode value) throws IOException {
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
           public OAuthCfgExchangeAuthCode read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OAuthCfgExchangeAuthCode instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OAuthCfgExchangeAuthCode given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OAuthCfgExchangeAuthCode
  * @throws IOException if the JSON string is invalid with respect to OAuthCfgExchangeAuthCode
  */
  public static OAuthCfgExchangeAuthCode fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OAuthCfgExchangeAuthCode.class);
  }

 /**
  * Convert an instance of OAuthCfgExchangeAuthCode to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

