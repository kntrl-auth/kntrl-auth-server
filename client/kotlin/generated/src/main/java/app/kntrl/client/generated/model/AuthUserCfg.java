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
import app.kntrl.client.generated.model.AuthData;
import app.kntrl.client.generated.model.UnconfirmedAuthData;
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
 * AuthUserCfg
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthUserCfg {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private AuthData data;

  public static final String SERIALIZED_NAME_SENT_CODES = "sentCodes";
  @SerializedName(SERIALIZED_NAME_SENT_CODES)
  private List<UnconfirmedAuthData> sentCodes = null;

  public static final String SERIALIZED_NAME_CONFIRMED = "confirmed";
  @SerializedName(SERIALIZED_NAME_CONFIRMED)
  private Boolean confirmed;

  public AuthUserCfg() {
  }

  public AuthUserCfg data(AuthData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthData getData() {
    return data;
  }


  public void setData(AuthData data) {
    this.data = data;
  }


  public AuthUserCfg sentCodes(List<UnconfirmedAuthData> sentCodes) {
    
    this.sentCodes = sentCodes;
    return this;
  }

  public AuthUserCfg addSentCodesItem(UnconfirmedAuthData sentCodesItem) {
    if (this.sentCodes == null) {
      this.sentCodes = new ArrayList<>();
    }
    this.sentCodes.add(sentCodesItem);
    return this;
  }

   /**
   * List of auths that wait for confirmation. 
   * @return sentCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of auths that wait for confirmation. ")

  public List<UnconfirmedAuthData> getSentCodes() {
    return sentCodes;
  }


  public void setSentCodes(List<UnconfirmedAuthData> sentCodes) {
    this.sentCodes = sentCodes;
  }


  public AuthUserCfg confirmed(Boolean confirmed) {
    
    this.confirmed = confirmed;
    return this;
  }

   /**
   * Get confirmed
   * @return confirmed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getConfirmed() {
    return confirmed;
  }


  public void setConfirmed(Boolean confirmed) {
    this.confirmed = confirmed;
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
  public AuthUserCfg putAdditionalProperty(String key, Object value) {
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
    AuthUserCfg authUserCfg = (AuthUserCfg) o;
    return Objects.equals(this.data, authUserCfg.data) &&
        Objects.equals(this.sentCodes, authUserCfg.sentCodes) &&
        Objects.equals(this.confirmed, authUserCfg.confirmed)&&
        Objects.equals(this.additionalProperties, authUserCfg.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, sentCodes, confirmed, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthUserCfg {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    sentCodes: ").append(toIndentedString(sentCodes)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("sentCodes");
    openapiFields.add("confirmed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthUserCfg
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthUserCfg.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthUserCfg is not found in the empty JSON string", AuthUserCfg.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        AuthData.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
      if (jsonObj.get("sentCodes") != null && !jsonObj.get("sentCodes").isJsonNull()) {
        JsonArray jsonArraysentCodes = jsonObj.getAsJsonArray("sentCodes");
        if (jsonArraysentCodes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sentCodes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sentCodes` to be an array in the JSON string but got `%s`", jsonObj.get("sentCodes").toString()));
          }

          // validate the optional field `sentCodes` (array)
          for (int i = 0; i < jsonArraysentCodes.size(); i++) {
            UnconfirmedAuthData.validateJsonObject(jsonArraysentCodes.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthUserCfg.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthUserCfg' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthUserCfg> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthUserCfg.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthUserCfg>() {
           @Override
           public void write(JsonWriter out, AuthUserCfg value) throws IOException {
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
           public AuthUserCfg read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AuthUserCfg instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AuthUserCfg given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthUserCfg
  * @throws IOException if the JSON string is invalid with respect to AuthUserCfg
  */
  public static AuthUserCfg fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthUserCfg.class);
  }

 /**
  * Convert an instance of AuthUserCfg to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

