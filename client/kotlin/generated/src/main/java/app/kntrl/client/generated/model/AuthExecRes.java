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
import app.kntrl.client.generated.model.Code;
import app.kntrl.client.generated.model.ErrAuthExecRes;
import app.kntrl.client.generated.model.OkAuthExecRes;
import app.kntrl.client.generated.model.SkippedAuthExecRes;
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

import app.kntrl.client.generated.infra.JSON;

/**
 * AuthExecRes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T19:30:17.809690+03:00[Europe/Kiev]")
public class AuthExecRes {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  protected String status;

  public static final String SERIALIZED_NAME_SENT_CODE = "sentCode";
  @SerializedName(SERIALIZED_NAME_SENT_CODE)
  private Code sentCode;

  public AuthExecRes() { 
    this.status = this.getClass().getSimpleName();
  }

  public AuthExecRes status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AuthExecRes sentCode(Code sentCode) {
    
    this.sentCode = sentCode;
    return this;
  }

   /**
   * Get sentCode
   * @return sentCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Code getSentCode() {
    return sentCode;
  }


  public void setSentCode(Code sentCode) {
    this.sentCode = sentCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthExecRes authExecRes = (AuthExecRes) o;
    return Objects.equals(this.status, authExecRes.status) &&
        Objects.equals(this.sentCode, authExecRes.sentCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, sentCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthExecRes {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sentCode: ").append(toIndentedString(sentCode)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("sentCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthExecRes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthExecRes.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthExecRes is not found in the empty JSON string", AuthExecRes.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonObj.get("status").getAsString();
      switch (discriminatorValue) {
        case "ERR":
          ErrAuthExecRes.validateJsonObject(jsonObj);
          break;
        case "ErrAuthExecRes":
          ErrAuthExecRes.validateJsonObject(jsonObj);
          break;
        case "OK":
          OkAuthExecRes.validateJsonObject(jsonObj);
          break;
        case "OkAuthExecRes":
          OkAuthExecRes.validateJsonObject(jsonObj);
          break;
        case "SKIPPED":
          SkippedAuthExecRes.validateJsonObject(jsonObj);
          break;
        case "SkippedAuthExecRes":
          SkippedAuthExecRes.validateJsonObject(jsonObj);
          break;
        default: 
          throw new IllegalArgumentException(String.format("The value of the `status` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


 /**
  * Create an instance of AuthExecRes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthExecRes
  * @throws IOException if the JSON string is invalid with respect to AuthExecRes
  */
  public static AuthExecRes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthExecRes.class);
  }

 /**
  * Convert an instance of AuthExecRes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

