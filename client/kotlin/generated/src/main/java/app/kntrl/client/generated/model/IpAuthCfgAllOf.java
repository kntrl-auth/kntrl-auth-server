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
 * IpAuthCfgAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T19:30:17.809690+03:00[Europe/Kiev]")
public class IpAuthCfgAllOf {
  public static final String SERIALIZED_NAME_IP_BYTES_TO_IGNORE = "ipBytesToIgnore";
  @SerializedName(SERIALIZED_NAME_IP_BYTES_TO_IGNORE)
  private Integer ipBytesToIgnore;

  public static final String SERIALIZED_NAME_HISTORY_SIZE = "historySize";
  @SerializedName(SERIALIZED_NAME_HISTORY_SIZE)
  private Integer historySize;

  public IpAuthCfgAllOf() { 
  }

  public IpAuthCfgAllOf ipBytesToIgnore(Integer ipBytesToIgnore) {
    
    this.ipBytesToIgnore = ipBytesToIgnore;
    return this;
  }

   /**
   * This allows to drop last bytes of IP. So it allows to authenticate factor when ip has rough match, e.g. the same country, same city, or same internet provider.
   * @return ipBytesToIgnore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This allows to drop last bytes of IP. So it allows to authenticate factor when ip has rough match, e.g. the same country, same city, or same internet provider.")

  public Integer getIpBytesToIgnore() {
    return ipBytesToIgnore;
  }


  public void setIpBytesToIgnore(Integer ipBytesToIgnore) {
    this.ipBytesToIgnore = ipBytesToIgnore;
  }


  public IpAuthCfgAllOf historySize(Integer historySize) {
    
    this.historySize = historySize;
    return this;
  }

   /**
   * History of IP addresses user used to sign-in. Authenticated when user attempts to sign in with one of stored IPs.
   * @return historySize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "History of IP addresses user used to sign-in. Authenticated when user attempts to sign in with one of stored IPs.")

  public Integer getHistorySize() {
    return historySize;
  }


  public void setHistorySize(Integer historySize) {
    this.historySize = historySize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAuthCfgAllOf ipAuthCfgAllOf = (IpAuthCfgAllOf) o;
    return Objects.equals(this.ipBytesToIgnore, ipAuthCfgAllOf.ipBytesToIgnore) &&
        Objects.equals(this.historySize, ipAuthCfgAllOf.historySize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipBytesToIgnore, historySize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAuthCfgAllOf {\n");
    sb.append("    ipBytesToIgnore: ").append(toIndentedString(ipBytesToIgnore)).append("\n");
    sb.append("    historySize: ").append(toIndentedString(historySize)).append("\n");
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
    openapiFields.add("ipBytesToIgnore");
    openapiFields.add("historySize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IpAuthCfgAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IpAuthCfgAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IpAuthCfgAllOf is not found in the empty JSON string", IpAuthCfgAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IpAuthCfgAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IpAuthCfgAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IpAuthCfgAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IpAuthCfgAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IpAuthCfgAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IpAuthCfgAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<IpAuthCfgAllOf>() {
           @Override
           public void write(JsonWriter out, IpAuthCfgAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IpAuthCfgAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IpAuthCfgAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IpAuthCfgAllOf
  * @throws IOException if the JSON string is invalid with respect to IpAuthCfgAllOf
  */
  public static IpAuthCfgAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IpAuthCfgAllOf.class);
  }

 /**
  * Convert an instance of IpAuthCfgAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

