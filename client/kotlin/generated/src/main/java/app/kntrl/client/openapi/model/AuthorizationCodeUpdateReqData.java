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
import app.kntrl.client.openapi.model.LoginId;
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

import app.kntrl.client.openapi.infra.JSON;

/**
 * AuthorizationCodeUpdateReqData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthorizationCodeUpdateReqData {
  public static final String SERIALIZED_NAME_AGENT_LOGINS = "agentLogins";
  @SerializedName(SERIALIZED_NAME_AGENT_LOGINS)
  private List<LoginId> agentLogins = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private List<String> scopes = null;

  public AuthorizationCodeUpdateReqData() {
  }

  public AuthorizationCodeUpdateReqData agentLogins(List<LoginId> agentLogins) {
    
    this.agentLogins = agentLogins;
    return this;
  }

  public AuthorizationCodeUpdateReqData addAgentLoginsItem(LoginId agentLoginsItem) {
    this.agentLogins.add(agentLoginsItem);
    return this;
  }

   /**
   * Login or logins of the user that will get access-token and be able to act of behalf of current user.
   * @return agentLogins
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Login or logins of the user that will get access-token and be able to act of behalf of current user.")

  public List<LoginId> getAgentLogins() {
    return agentLogins;
  }


  public void setAgentLogins(List<LoginId> agentLogins) {
    this.agentLogins = agentLogins;
  }


  public AuthorizationCodeUpdateReqData scopes(List<String> scopes) {
    
    this.scopes = scopes;
    return this;
  }

  public AuthorizationCodeUpdateReqData addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getScopes() {
    return scopes;
  }


  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
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
  public AuthorizationCodeUpdateReqData putAdditionalProperty(String key, Object value) {
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
    AuthorizationCodeUpdateReqData authorizationCodeUpdateReqData = (AuthorizationCodeUpdateReqData) o;
    return Objects.equals(this.agentLogins, authorizationCodeUpdateReqData.agentLogins) &&
        Objects.equals(this.scopes, authorizationCodeUpdateReqData.scopes)&&
        Objects.equals(this.additionalProperties, authorizationCodeUpdateReqData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentLogins, scopes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationCodeUpdateReqData {\n");
    sb.append("    agentLogins: ").append(toIndentedString(agentLogins)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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
    openapiFields.add("agentLogins");
    openapiFields.add("scopes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("agentLogins");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthorizationCodeUpdateReqData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthorizationCodeUpdateReqData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthorizationCodeUpdateReqData is not found in the empty JSON string", AuthorizationCodeUpdateReqData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AuthorizationCodeUpdateReqData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("agentLogins") != null && !jsonObj.get("agentLogins").isJsonNull()) {
        JsonArray jsonArrayagentLogins = jsonObj.getAsJsonArray("agentLogins");
        if (jsonArrayagentLogins != null) {
          // ensure the json data is an array
          if (!jsonObj.get("agentLogins").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `agentLogins` to be an array in the JSON string but got `%s`", jsonObj.get("agentLogins").toString()));
          }

          // validate the optional field `agentLogins` (array)
          for (int i = 0; i < jsonArrayagentLogins.size(); i++) {
            LoginId.validateJsonObject(jsonArrayagentLogins.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("scopes") != null && !jsonObj.get("scopes").isJsonNull()) && !jsonObj.get("scopes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scopes` to be an array in the JSON string but got `%s`", jsonObj.get("scopes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthorizationCodeUpdateReqData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthorizationCodeUpdateReqData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthorizationCodeUpdateReqData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthorizationCodeUpdateReqData.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthorizationCodeUpdateReqData>() {
           @Override
           public void write(JsonWriter out, AuthorizationCodeUpdateReqData value) throws IOException {
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
           public AuthorizationCodeUpdateReqData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AuthorizationCodeUpdateReqData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AuthorizationCodeUpdateReqData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthorizationCodeUpdateReqData
  * @throws IOException if the JSON string is invalid with respect to AuthorizationCodeUpdateReqData
  */
  public static AuthorizationCodeUpdateReqData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthorizationCodeUpdateReqData.class);
  }

 /**
  * Convert an instance of AuthorizationCodeUpdateReqData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

