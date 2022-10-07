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
import app.kntrl.client.generated.model.EntryAccessTokenCfg;
import app.kntrl.client.generated.model.EntryCfg;
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

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import app.kntrl.client.generated.infra.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T19:30:17.809690+03:00[Europe/Kiev]")
public class SHAppCfgEntriesValue extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SHAppCfgEntriesValue.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SHAppCfgEntriesValue.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SHAppCfgEntriesValue' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<EntryCfg> adapterEntryCfg = gson.getDelegateAdapter(this, TypeToken.get(EntryCfg.class));

            return (TypeAdapter<T>) new TypeAdapter<SHAppCfgEntriesValue>() {
                @Override
                public void write(JsonWriter out, SHAppCfgEntriesValue value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `EntryCfg`
                    if (value.getActualInstance() instanceof EntryCfg) {
                        JsonObject obj = adapterEntryCfg.toJsonTree((EntryCfg)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: EntryCfg");
                }

                @Override
                public SHAppCfgEntriesValue read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize EntryCfg
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EntryCfg.validateJsonObject(jsonObject);
                        actualAdapter = adapterEntryCfg;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'EntryCfg'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for EntryCfg failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'EntryCfg'", e);
                    }

                    if (match == 1) {
                        SHAppCfgEntriesValue ret = new SHAppCfgEntriesValue();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for SHAppCfgEntriesValue: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public SHAppCfgEntriesValue() {
        super("oneOf", Boolean.FALSE);
    }

    public SHAppCfgEntriesValue(EntryCfg o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("EntryCfg", new GenericType<EntryCfg>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return SHAppCfgEntriesValue.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * EntryCfg
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof EntryCfg) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be EntryCfg");
    }

    /**
     * Get the actual instance, which can be the following:
     * EntryCfg
     *
     * @return The actual instance (EntryCfg)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `EntryCfg`. If the actual instance is not `EntryCfg`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EntryCfg`
     * @throws ClassCastException if the instance is not `EntryCfg`
     */
    public EntryCfg getEntryCfg() throws ClassCastException {
        return (EntryCfg)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SHAppCfgEntriesValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with EntryCfg
    try {
      EntryCfg.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for EntryCfg failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for SHAppCfgEntriesValue with oneOf schemas: EntryCfg. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of SHAppCfgEntriesValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SHAppCfgEntriesValue
  * @throws IOException if the JSON string is invalid with respect to SHAppCfgEntriesValue
  */
  public static SHAppCfgEntriesValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SHAppCfgEntriesValue.class);
  }

 /**
  * Convert an instance of SHAppCfgEntriesValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

