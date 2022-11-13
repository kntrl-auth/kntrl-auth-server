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
import java.util.HashMap;
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
 * EmailAuthReqData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EmailAuthReqData {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public static final String SERIALIZED_NAME_TEMPLATE_PARAMS = "templateParams";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_PARAMS)
  private Map<String, Object> templateParams = null;

  public EmailAuthReqData() {
  }

  public EmailAuthReqData email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * User email. If email is not null - auth allow identification by email (email auth also must be listed in logins config). Otherwise, uses email of already identified user.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User email. If email is not null - auth allow identification by email (email auth also must be listed in logins config). Otherwise, uses email of already identified user.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public EmailAuthReqData template(String template) {
    
    this.template = template;
    return this;
  }

   /**
   * Template to use.
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template to use.")

  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    this.template = template;
  }


  public EmailAuthReqData templateParams(Map<String, Object> templateParams) {
    
    this.templateParams = templateParams;
    return this;
  }

  public EmailAuthReqData putTemplateParamsItem(String key, Object templateParamsItem) {
    if (this.templateParams == null) {
      this.templateParams = new HashMap<>();
    }
    this.templateParams.put(key, templateParamsItem);
    return this;
  }

   /**
   * Template params
   * @return templateParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template params")

  public Map<String, Object> getTemplateParams() {
    return templateParams;
  }


  public void setTemplateParams(Map<String, Object> templateParams) {
    this.templateParams = templateParams;
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
  public EmailAuthReqData putAdditionalProperty(String key, Object value) {
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
    EmailAuthReqData emailAuthReqData = (EmailAuthReqData) o;
    return Objects.equals(this.email, emailAuthReqData.email) &&
        Objects.equals(this.template, emailAuthReqData.template) &&
        Objects.equals(this.templateParams, emailAuthReqData.templateParams)&&
        Objects.equals(this.additionalProperties, emailAuthReqData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, template, templateParams, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailAuthReqData {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateParams: ").append(toIndentedString(templateParams)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("template");
    openapiFields.add("templateParams");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmailAuthReqData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EmailAuthReqData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailAuthReqData is not found in the empty JSON string", EmailAuthReqData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("template") != null && !jsonObj.get("template").isJsonNull()) && !jsonObj.get("template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmailAuthReqData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailAuthReqData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailAuthReqData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailAuthReqData.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailAuthReqData>() {
           @Override
           public void write(JsonWriter out, EmailAuthReqData value) throws IOException {
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
           public EmailAuthReqData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmailAuthReqData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmailAuthReqData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmailAuthReqData
  * @throws IOException if the JSON string is invalid with respect to EmailAuthReqData
  */
  public static EmailAuthReqData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailAuthReqData.class);
  }

 /**
  * Convert an instance of EmailAuthReqData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

