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
import app.kntrl.client.openapi.model.EntryCfgAccessToken;
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
 * Configuration for app entry.
 */
@ApiModel(description = "Configuration for app entry.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EntryCfg {
  public static final String SERIALIZED_NAME_FACTORS_REQUIRED = "factorsRequired";
  @SerializedName(SERIALIZED_NAME_FACTORS_REQUIRED)
  private Map<String, List<String>> factorsRequired = null;

  public static final String SERIALIZED_NAME_FACTORS_OPTIONAL = "factorsOptional";
  @SerializedName(SERIALIZED_NAME_FACTORS_OPTIONAL)
  private Map<String, List<String>> factorsOptional = null;

  public static final String SERIALIZED_NAME_REQUIRES_ENTRY = "requiresEntry";
  @SerializedName(SERIALIZED_NAME_REQUIRES_ENTRY)
  private List<String> requiresEntry = null;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "accessToken";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private EntryCfgAccessToken accessToken;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private String ttl;

  public static final String SERIALIZED_NAME_EDIT_ACCOUNT = "editAccount";
  @SerializedName(SERIALIZED_NAME_EDIT_ACCOUNT)
  private Boolean editAccount = false;

  public EntryCfg() {
  }

  public EntryCfg factorsRequired(Map<String, List<String>> factorsRequired) {
    
    this.factorsRequired = factorsRequired;
    return this;
  }

  public EntryCfg putFactorsRequiredItem(String key, List<String> factorsRequiredItem) {
    if (this.factorsRequired == null) {
      this.factorsRequired = new HashMap<>();
    }
    this.factorsRequired.put(key, factorsRequiredItem);
    return this;
  }

   /**
   * Specifies factors that always required to be authenticated.  Usually it&#39;s main auth method (e.g. password) + social login (e.g. facebook) + reserve auth option in case of lost/forgotten main auth credentials (e.g. secret questions or email auth).  These factors are always required even when user hasn&#39;t enabled them explicitly.  
   * @return factorsRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"first\":[\"password\",\"facebook\",\"email\"]}", value = "Specifies factors that always required to be authenticated.  Usually it's main auth method (e.g. password) + social login (e.g. facebook) + reserve auth option in case of lost/forgotten main auth credentials (e.g. secret questions or email auth).  These factors are always required even when user hasn't enabled them explicitly.  ")

  public Map<String, List<String>> getFactorsRequired() {
    return factorsRequired;
  }


  public void setFactorsRequired(Map<String, List<String>> factorsRequired) {
    this.factorsRequired = factorsRequired;
  }


  public EntryCfg factorsOptional(Map<String, List<String>> factorsOptional) {
    
    this.factorsOptional = factorsOptional;
    return this;
  }

  public EntryCfg putFactorsOptionalItem(String key, List<String> factorsOptionalItem) {
    if (this.factorsOptional == null) {
      this.factorsOptional = new HashMap<>();
    }
    this.factorsOptional.put(key, factorsOptionalItem);
    return this;
  }

   /**
   * This factors can be skipped if user hasn&#39;t enabled them. Used for optional 2FA. E.g. If user added mobile phone -&gt; use it for 2FA otherwise skip 2FA. 
   * @return factorsOptional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"second\":[\"sms\"]}", value = "This factors can be skipped if user hasn't enabled them. Used for optional 2FA. E.g. If user added mobile phone -> use it for 2FA otherwise skip 2FA. ")

  public Map<String, List<String>> getFactorsOptional() {
    return factorsOptional;
  }


  public void setFactorsOptional(Map<String, List<String>> factorsOptional) {
    this.factorsOptional = factorsOptional;
  }


  public EntryCfg requiresEntry(List<String> requiresEntry) {
    
    this.requiresEntry = requiresEntry;
    return this;
  }

  public EntryCfg addRequiresEntryItem(String requiresEntryItem) {
    if (this.requiresEntry == null) {
      this.requiresEntry = new ArrayList<>();
    }
    this.requiresEntry.add(requiresEntryItem);
    return this;
  }

   /**
   * Require user to be already signed in by one of the listed entries. Usually it used for action confirmation, e.g. \&quot;payment\&quot; that requires confirmation by sms, requires user to be already signed in (e.g. with entry \&quot;app\&quot;.
   * @return requiresEntry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Require user to be already signed in by one of the listed entries. Usually it used for action confirmation, e.g. \"payment\" that requires confirmation by sms, requires user to be already signed in (e.g. with entry \"app\".")

  public List<String> getRequiresEntry() {
    return requiresEntry;
  }


  public void setRequiresEntry(List<String> requiresEntry) {
    this.requiresEntry = requiresEntry;
  }


  public EntryCfg accessToken(EntryCfgAccessToken accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntryCfgAccessToken getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(EntryCfgAccessToken accessToken) {
    this.accessToken = accessToken;
  }


  public EntryCfg ttl(String ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * Max lifetime of session. 
   * @return ttl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3M", value = "Max lifetime of session. ")

  public String getTtl() {
    return ttl;
  }


  public void setTtl(String ttl) {
    this.ttl = ttl;
  }


  public EntryCfg editAccount(Boolean editAccount) {
    
    this.editAccount = editAccount;
    return this;
  }

   /**
   * Is this session allowed to add/remove new auth, enable/disable factors, etc.?
   * @return editAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is this session allowed to add/remove new auth, enable/disable factors, etc.?")

  public Boolean getEditAccount() {
    return editAccount;
  }


  public void setEditAccount(Boolean editAccount) {
    this.editAccount = editAccount;
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
  public EntryCfg putAdditionalProperty(String key, Object value) {
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
    EntryCfg entryCfg = (EntryCfg) o;
    return Objects.equals(this.factorsRequired, entryCfg.factorsRequired) &&
        Objects.equals(this.factorsOptional, entryCfg.factorsOptional) &&
        Objects.equals(this.requiresEntry, entryCfg.requiresEntry) &&
        Objects.equals(this.accessToken, entryCfg.accessToken) &&
        Objects.equals(this.ttl, entryCfg.ttl) &&
        Objects.equals(this.editAccount, entryCfg.editAccount)&&
        Objects.equals(this.additionalProperties, entryCfg.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(factorsRequired, factorsOptional, requiresEntry, accessToken, ttl, editAccount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntryCfg {\n");
    sb.append("    factorsRequired: ").append(toIndentedString(factorsRequired)).append("\n");
    sb.append("    factorsOptional: ").append(toIndentedString(factorsOptional)).append("\n");
    sb.append("    requiresEntry: ").append(toIndentedString(requiresEntry)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    editAccount: ").append(toIndentedString(editAccount)).append("\n");
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
    openapiFields.add("factorsRequired");
    openapiFields.add("factorsOptional");
    openapiFields.add("requiresEntry");
    openapiFields.add("accessToken");
    openapiFields.add("ttl");
    openapiFields.add("editAccount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EntryCfg
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EntryCfg.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EntryCfg is not found in the empty JSON string", EntryCfg.openapiRequiredFields.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("requiresEntry") != null && !jsonObj.get("requiresEntry").isJsonNull()) && !jsonObj.get("requiresEntry").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `requiresEntry` to be an array in the JSON string but got `%s`", jsonObj.get("requiresEntry").toString()));
      }
      // validate the optional field `accessToken`
      if (jsonObj.get("accessToken") != null && !jsonObj.get("accessToken").isJsonNull()) {
        EntryCfgAccessToken.validateJsonObject(jsonObj.getAsJsonObject("accessToken"));
      }
      if ((jsonObj.get("ttl") != null && !jsonObj.get("ttl").isJsonNull()) && !jsonObj.get("ttl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ttl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ttl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EntryCfg.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EntryCfg' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EntryCfg> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EntryCfg.class));

       return (TypeAdapter<T>) new TypeAdapter<EntryCfg>() {
           @Override
           public void write(JsonWriter out, EntryCfg value) throws IOException {
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
           public EntryCfg read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EntryCfg instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EntryCfg given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EntryCfg
  * @throws IOException if the JSON string is invalid with respect to EntryCfg
  */
  public static EntryCfg fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EntryCfg.class);
  }

 /**
  * Convert an instance of EntryCfg to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

