/*
 * Kntrl API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9
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

import app.kntrl.client.generated.infra.JSON;

/**
 * AuthenticateReqAuthReqsValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthenticateReqAuthReqsValue {
  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public static final String SERIALIZED_NAME_TEMPLATE_PARAMS = "templateParams";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_PARAMS)
  private Map<String, Object> templateParams = null;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "accessToken";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_AUTHORIZATION_CODE = "authorizationCode";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_CODE)
  private String authorizationCode;

  public static final String SERIALIZED_NAME_REDIRECT_URI = "redirectUri";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URI)
  private String redirectUri;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_CONFIRM_PASSWORD = "confirmPassword";
  @SerializedName(SERIALIZED_NAME_CONFIRM_PASSWORD)
  private String confirmPassword;

  public static final String SERIALIZED_NAME_ANSWERS = "answers";
  @SerializedName(SERIALIZED_NAME_ANSWERS)
  private Map<String, String> answers = null;

  public AuthenticateReqAuthReqsValue() {
  }

  public AuthenticateReqAuthReqsValue secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public AuthenticateReqAuthReqsValue email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * New email to set.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "New email to set.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public AuthenticateReqAuthReqsValue template(String template) {
    
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


  public AuthenticateReqAuthReqsValue templateParams(Map<String, Object> templateParams) {
    
    this.templateParams = templateParams;
    return this;
  }

  public AuthenticateReqAuthReqsValue putTemplateParamsItem(String key, Object templateParamsItem) {
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


  public AuthenticateReqAuthReqsValue accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * If you have access-token - put it here.
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If you have access-token - put it here.")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public AuthenticateReqAuthReqsValue authorizationCode(String authorizationCode) {
    
    this.authorizationCode = authorizationCode;
    return this;
  }

   /**
   * If you have authorisation-code - app will exchange it for access-token.
   * @return authorizationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If you have authorisation-code - app will exchange it for access-token.")

  public String getAuthorizationCode() {
    return authorizationCode;
  }


  public void setAuthorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
  }


  public AuthenticateReqAuthReqsValue redirectUri(String redirectUri) {
    
    this.redirectUri = redirectUri;
    return this;
  }

   /**
   * Redirect uri used when requested user login.
   * @return redirectUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Redirect uri used when requested user login.")

  public String getRedirectUri() {
    return redirectUri;
  }


  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }


  public AuthenticateReqAuthReqsValue password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * New password to set. If null app generates password automatically.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "New password to set. If null app generates password automatically.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public AuthenticateReqAuthReqsValue confirmPassword(String confirmPassword) {
    
    this.confirmPassword = confirmPassword;
    return this;
  }

   /**
   * Password confirmation. If null app doesn&#39;t perform this check.
   * @return confirmPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Password confirmation. If null app doesn't perform this check.")

  public String getConfirmPassword() {
    return confirmPassword;
  }


  public void setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
  }


  public AuthenticateReqAuthReqsValue answers(Map<String, String> answers) {
    
    this.answers = answers;
    return this;
  }

  public AuthenticateReqAuthReqsValue putAnswersItem(String key, String answersItem) {
    if (this.answers == null) {
      this.answers = new HashMap<>();
    }
    this.answers.put(key, answersItem);
    return this;
  }

   /**
   * Answers to save. &#x60;null&#x60; as value removes answer 
   * @return answers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"HOMETOWN\":\"London\",\"MOTHER_NAME\":null}", value = "Answers to save. `null` as value removes answer ")

  public Map<String, String> getAnswers() {
    return answers;
  }


  public void setAnswers(Map<String, String> answers) {
    this.answers = answers;
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
  public AuthenticateReqAuthReqsValue putAdditionalProperty(String key, Object value) {
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
    AuthenticateReqAuthReqsValue authenticateReqAuthReqsValue = (AuthenticateReqAuthReqsValue) o;
    return Objects.equals(this.secret, authenticateReqAuthReqsValue.secret) &&
        Objects.equals(this.email, authenticateReqAuthReqsValue.email) &&
        Objects.equals(this.template, authenticateReqAuthReqsValue.template) &&
        Objects.equals(this.templateParams, authenticateReqAuthReqsValue.templateParams) &&
        Objects.equals(this.accessToken, authenticateReqAuthReqsValue.accessToken) &&
        Objects.equals(this.authorizationCode, authenticateReqAuthReqsValue.authorizationCode) &&
        Objects.equals(this.redirectUri, authenticateReqAuthReqsValue.redirectUri) &&
        Objects.equals(this.password, authenticateReqAuthReqsValue.password) &&
        Objects.equals(this.confirmPassword, authenticateReqAuthReqsValue.confirmPassword) &&
        Objects.equals(this.answers, authenticateReqAuthReqsValue.answers)&&
        Objects.equals(this.additionalProperties, authenticateReqAuthReqsValue.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secret, email, template, templateParams, accessToken, authorizationCode, redirectUri, password, confirmPassword, answers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticateReqAuthReqsValue {\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateParams: ").append(toIndentedString(templateParams)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    authorizationCode: ").append(toIndentedString(authorizationCode)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    confirmPassword: ").append(toIndentedString(confirmPassword)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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
    openapiFields.add("secret");
    openapiFields.add("email");
    openapiFields.add("template");
    openapiFields.add("templateParams");
    openapiFields.add("accessToken");
    openapiFields.add("authorizationCode");
    openapiFields.add("redirectUri");
    openapiFields.add("password");
    openapiFields.add("confirmPassword");
    openapiFields.add("answers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthenticateReqAuthReqsValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthenticateReqAuthReqsValue.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthenticateReqAuthReqsValue is not found in the empty JSON string", AuthenticateReqAuthReqsValue.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("secret") != null && !jsonObj.get("secret").isJsonNull()) && !jsonObj.get("secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("template") != null && !jsonObj.get("template").isJsonNull()) && !jsonObj.get("template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template").toString()));
      }
      if ((jsonObj.get("accessToken") != null && !jsonObj.get("accessToken").isJsonNull()) && !jsonObj.get("accessToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accessToken").toString()));
      }
      if ((jsonObj.get("authorizationCode") != null && !jsonObj.get("authorizationCode").isJsonNull()) && !jsonObj.get("authorizationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorizationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorizationCode").toString()));
      }
      if ((jsonObj.get("redirectUri") != null && !jsonObj.get("redirectUri").isJsonNull()) && !jsonObj.get("redirectUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirectUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirectUri").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("confirmPassword") != null && !jsonObj.get("confirmPassword").isJsonNull()) && !jsonObj.get("confirmPassword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confirmPassword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confirmPassword").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthenticateReqAuthReqsValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthenticateReqAuthReqsValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthenticateReqAuthReqsValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthenticateReqAuthReqsValue.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthenticateReqAuthReqsValue>() {
           @Override
           public void write(JsonWriter out, AuthenticateReqAuthReqsValue value) throws IOException {
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
           public AuthenticateReqAuthReqsValue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AuthenticateReqAuthReqsValue instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AuthenticateReqAuthReqsValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthenticateReqAuthReqsValue
  * @throws IOException if the JSON string is invalid with respect to AuthenticateReqAuthReqsValue
  */
  public static AuthenticateReqAuthReqsValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthenticateReqAuthReqsValue.class);
  }

 /**
  * Convert an instance of AuthenticateReqAuthReqsValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

