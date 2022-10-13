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
import app.kntrl.client.generated.model.AuthExecResResData;
import app.kntrl.client.generated.model.Code;
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
 * OkAuthExecRes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OkAuthExecRes {
  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    OK("OK"),
    
    ERR("ERR"),
    
    SKIPPED("SKIPPED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_SENT_CODE = "sentCode";
  @SerializedName(SERIALIZED_NAME_SENT_CODE)
  private Code sentCode;

  public static final String SERIALIZED_NAME_RES_DATA = "resData";
  @SerializedName(SERIALIZED_NAME_RES_DATA)
  private AuthExecResResData resData;

  public OkAuthExecRes() { 
  }

  public OkAuthExecRes status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public OkAuthExecRes sentCode(Code sentCode) {
    
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


  public OkAuthExecRes resData(AuthExecResResData resData) {
    
    this.resData = resData;
    return this;
  }

   /**
   * Get resData
   * @return resData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthExecResResData getResData() {
    return resData;
  }


  public void setResData(AuthExecResResData resData) {
    this.resData = resData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OkAuthExecRes okAuthExecRes = (OkAuthExecRes) o;
    return Objects.equals(this.status, okAuthExecRes.status) &&
        Objects.equals(this.sentCode, okAuthExecRes.sentCode) &&
        Objects.equals(this.resData, okAuthExecRes.resData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, sentCode, resData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OkAuthExecRes {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sentCode: ").append(toIndentedString(sentCode)).append("\n");
    sb.append("    resData: ").append(toIndentedString(resData)).append("\n");
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
    openapiFields.add("resData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OkAuthExecRes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OkAuthExecRes.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OkAuthExecRes is not found in the empty JSON string", OkAuthExecRes.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OkAuthExecRes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OkAuthExecRes` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OkAuthExecRes.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `sentCode`
      if (jsonObj.getAsJsonObject("sentCode") != null) {
        Code.validateJsonObject(jsonObj.getAsJsonObject("sentCode"));
      }
      // validate the optional field `resData`
      if (jsonObj.getAsJsonObject("resData") != null) {
        AuthExecResResData.validateJsonObject(jsonObj.getAsJsonObject("resData"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OkAuthExecRes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OkAuthExecRes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OkAuthExecRes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OkAuthExecRes.class));

       return (TypeAdapter<T>) new TypeAdapter<OkAuthExecRes>() {
           @Override
           public void write(JsonWriter out, OkAuthExecRes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OkAuthExecRes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OkAuthExecRes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OkAuthExecRes
  * @throws IOException if the JSON string is invalid with respect to OkAuthExecRes
  */
  public static OkAuthExecRes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OkAuthExecRes.class);
  }

 /**
  * Convert an instance of OkAuthExecRes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

