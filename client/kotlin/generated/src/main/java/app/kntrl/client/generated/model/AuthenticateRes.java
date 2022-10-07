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
import app.kntrl.client.generated.model.AuthExecRes;
import app.kntrl.client.generated.model.Session;
import app.kntrl.client.generated.model.Tokens;
import app.kntrl.client.generated.model.User;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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

import app.kntrl.client.generated.infra.JSON;

/**
 * AuthenticateRes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T14:36:53.211699+03:00[Europe/Kiev]")
public class AuthenticateRes {
  public static final String SERIALIZED_NAME_TOKENS = "tokens";
  @SerializedName(SERIALIZED_NAME_TOKENS)
  private Tokens tokens;

  public static final String SERIALIZED_NAME_SESSION = "session";
  @SerializedName(SERIALIZED_NAME_SESSION)
  private Session session;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User user;

  public static final String SERIALIZED_NAME_AUTH_RES = "authRes";
  @SerializedName(SERIALIZED_NAME_AUTH_RES)
  private Map<String, AuthExecRes> authRes = new HashMap<>();

  public AuthenticateRes() { 
  }

  public AuthenticateRes tokens(Tokens tokens) {
    
    this.tokens = tokens;
    return this;
  }

   /**
   * Get tokens
   * @return tokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Tokens getTokens() {
    return tokens;
  }


  public void setTokens(Tokens tokens) {
    this.tokens = tokens;
  }


  public AuthenticateRes session(Session session) {
    
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Session getSession() {
    return session;
  }


  public void setSession(Session session) {
    this.session = session;
  }


  public AuthenticateRes user(User user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public User getUser() {
    return user;
  }


  public void setUser(User user) {
    this.user = user;
  }


  public AuthenticateRes authRes(Map<String, AuthExecRes> authRes) {
    
    this.authRes = authRes;
    return this;
  }

  public AuthenticateRes putAuthResItem(String key, AuthExecRes authResItem) {
    this.authRes.put(key, authResItem);
    return this;
  }

   /**
   * Get authRes
   * @return authRes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Map<String, AuthExecRes> getAuthRes() {
    return authRes;
  }


  public void setAuthRes(Map<String, AuthExecRes> authRes) {
    this.authRes = authRes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticateRes authenticateRes = (AuthenticateRes) o;
    return Objects.equals(this.tokens, authenticateRes.tokens) &&
        Objects.equals(this.session, authenticateRes.session) &&
        Objects.equals(this.user, authenticateRes.user) &&
        Objects.equals(this.authRes, authenticateRes.authRes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokens, session, user, authRes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticateRes {\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    authRes: ").append(toIndentedString(authRes)).append("\n");
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
    openapiFields.add("tokens");
    openapiFields.add("session");
    openapiFields.add("user");
    openapiFields.add("authRes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("authRes");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthenticateRes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthenticateRes.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthenticateRes is not found in the empty JSON string", AuthenticateRes.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuthenticateRes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthenticateRes` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AuthenticateRes.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `tokens`
      if (jsonObj.getAsJsonObject("tokens") != null) {
        Tokens.validateJsonObject(jsonObj.getAsJsonObject("tokens"));
      }
      // validate the optional field `session`
      if (jsonObj.getAsJsonObject("session") != null) {
        Session.validateJsonObject(jsonObj.getAsJsonObject("session"));
      }
      // validate the optional field `user`
      if (jsonObj.getAsJsonObject("user") != null) {
        User.validateJsonObject(jsonObj.getAsJsonObject("user"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthenticateRes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthenticateRes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthenticateRes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthenticateRes.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthenticateRes>() {
           @Override
           public void write(JsonWriter out, AuthenticateRes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthenticateRes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthenticateRes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthenticateRes
  * @throws IOException if the JSON string is invalid with respect to AuthenticateRes
  */
  public static AuthenticateRes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthenticateRes.class);
  }

 /**
  * Convert an instance of AuthenticateRes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
