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


package kntrl.client.generated.model;

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
import kntrl.client.generated.model.AccessTokenCfg;
import kntrl.client.generated.model.RefreshTokenCfg;

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

import kntrl.client.generated.infra.JSON;

/**
 * TokenCfg
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-23T23:42:03.192677+03:00[Europe/Kiev]")
public class TokenCfg {
  public static final String SERIALIZED_NAME_ACCESS = "access";
  @SerializedName(SERIALIZED_NAME_ACCESS)
  private AccessTokenCfg access;

  public static final String SERIALIZED_NAME_REFRESH = "refresh";
  @SerializedName(SERIALIZED_NAME_REFRESH)
  private RefreshTokenCfg refresh;

  public static final String SERIALIZED_NAME_SAME_USER_AGENT = "sameUserAgent";
  @SerializedName(SERIALIZED_NAME_SAME_USER_AGENT)
  private Boolean sameUserAgent;

  public TokenCfg() { 
  }

  public TokenCfg access(AccessTokenCfg access) {
    
    this.access = access;
    return this;
  }

   /**
   * Get access
   * @return access
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccessTokenCfg getAccess() {
    return access;
  }


  public void setAccess(AccessTokenCfg access) {
    this.access = access;
  }


  public TokenCfg refresh(RefreshTokenCfg refresh) {
    
    this.refresh = refresh;
    return this;
  }

   /**
   * Get refresh
   * @return refresh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RefreshTokenCfg getRefresh() {
    return refresh;
  }


  public void setRefresh(RefreshTokenCfg refresh) {
    this.refresh = refresh;
  }


  public TokenCfg sameUserAgent(Boolean sameUserAgent) {
    
    this.sameUserAgent = sameUserAgent;
    return this;
  }

   /**
   * Get sameUserAgent
   * @return sameUserAgent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSameUserAgent() {
    return sameUserAgent;
  }


  public void setSameUserAgent(Boolean sameUserAgent) {
    this.sameUserAgent = sameUserAgent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenCfg tokenCfg = (TokenCfg) o;
    return Objects.equals(this.access, tokenCfg.access) &&
        Objects.equals(this.refresh, tokenCfg.refresh) &&
        Objects.equals(this.sameUserAgent, tokenCfg.sameUserAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, refresh, sameUserAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenCfg {\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    refresh: ").append(toIndentedString(refresh)).append("\n");
    sb.append("    sameUserAgent: ").append(toIndentedString(sameUserAgent)).append("\n");
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
    openapiFields.add("access");
    openapiFields.add("refresh");
    openapiFields.add("sameUserAgent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TokenCfg
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TokenCfg.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenCfg is not found in the empty JSON string", TokenCfg.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TokenCfg.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TokenCfg` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `access`
      if (jsonObj.getAsJsonObject("access") != null) {
        AccessTokenCfg.validateJsonObject(jsonObj.getAsJsonObject("access"));
      }
      // validate the optional field `refresh`
      if (jsonObj.getAsJsonObject("refresh") != null) {
        RefreshTokenCfg.validateJsonObject(jsonObj.getAsJsonObject("refresh"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenCfg.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenCfg' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenCfg> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenCfg.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenCfg>() {
           @Override
           public void write(JsonWriter out, TokenCfg value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokenCfg read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TokenCfg given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenCfg
  * @throws IOException if the JSON string is invalid with respect to TokenCfg
  */
  public static TokenCfg fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenCfg.class);
  }

 /**
  * Convert an instance of TokenCfg to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
