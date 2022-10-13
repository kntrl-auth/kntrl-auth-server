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
import app.kntrl.client.generated.model.AppSecretReq;
import app.kntrl.client.generated.model.AuthReqDataJson;
import app.kntrl.client.generated.model.EmailAuthenticateReq;
import app.kntrl.client.generated.model.EmailUpdateReq;
import app.kntrl.client.generated.model.OAuthReq;
import app.kntrl.client.generated.model.PasswordAuthenticateReq;
import app.kntrl.client.generated.model.PasswordUpdateReq;
import app.kntrl.client.generated.model.QuestionsAuthenticateReq;
import app.kntrl.client.generated.model.QuestionsUpdateReq;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthenticateReqAuthReqsValue extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AuthenticateReqAuthReqsValue.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AuthenticateReqAuthReqsValue.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AuthenticateReqAuthReqsValue' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AppSecretReq> adapterAppSecretReq = gson.getDelegateAdapter(this, TypeToken.get(AppSecretReq.class));
            final TypeAdapter<AuthReqDataJson> adapterAuthReqDataJson = gson.getDelegateAdapter(this, TypeToken.get(AuthReqDataJson.class));
            final TypeAdapter<EmailAuthenticateReq> adapterEmailAuthenticateReq = gson.getDelegateAdapter(this, TypeToken.get(EmailAuthenticateReq.class));
            final TypeAdapter<EmailUpdateReq> adapterEmailUpdateReq = gson.getDelegateAdapter(this, TypeToken.get(EmailUpdateReq.class));
            final TypeAdapter<OAuthReq> adapterOAuthReq = gson.getDelegateAdapter(this, TypeToken.get(OAuthReq.class));
            final TypeAdapter<PasswordAuthenticateReq> adapterPasswordAuthenticateReq = gson.getDelegateAdapter(this, TypeToken.get(PasswordAuthenticateReq.class));
            final TypeAdapter<PasswordUpdateReq> adapterPasswordUpdateReq = gson.getDelegateAdapter(this, TypeToken.get(PasswordUpdateReq.class));
            final TypeAdapter<QuestionsAuthenticateReq> adapterQuestionsAuthenticateReq = gson.getDelegateAdapter(this, TypeToken.get(QuestionsAuthenticateReq.class));
            final TypeAdapter<QuestionsUpdateReq> adapterQuestionsUpdateReq = gson.getDelegateAdapter(this, TypeToken.get(QuestionsUpdateReq.class));

            return (TypeAdapter<T>) new TypeAdapter<AuthenticateReqAuthReqsValue>() {
                @Override
                public void write(JsonWriter out, AuthenticateReqAuthReqsValue value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `AppSecretReq`
                    if (value.getActualInstance() instanceof AppSecretReq) {
                        JsonObject obj = adapterAppSecretReq.toJsonTree((AppSecretReq)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `AuthReqDataJson`
                    if (value.getActualInstance() instanceof AuthReqDataJson) {
                        JsonObject obj = adapterAuthReqDataJson.toJsonTree((AuthReqDataJson)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `EmailAuthenticateReq`
                    if (value.getActualInstance() instanceof EmailAuthenticateReq) {
                        JsonObject obj = adapterEmailAuthenticateReq.toJsonTree((EmailAuthenticateReq)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `EmailUpdateReq`
                    if (value.getActualInstance() instanceof EmailUpdateReq) {
                        JsonObject obj = adapterEmailUpdateReq.toJsonTree((EmailUpdateReq)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `OAuthReq`
                    if (value.getActualInstance() instanceof OAuthReq) {
                        JsonObject obj = adapterOAuthReq.toJsonTree((OAuthReq)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `PasswordAuthenticateReq`
                    if (value.getActualInstance() instanceof PasswordAuthenticateReq) {
                        JsonObject obj = adapterPasswordAuthenticateReq.toJsonTree((PasswordAuthenticateReq)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `PasswordUpdateReq`
                    if (value.getActualInstance() instanceof PasswordUpdateReq) {
                        JsonObject obj = adapterPasswordUpdateReq.toJsonTree((PasswordUpdateReq)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `QuestionsAuthenticateReq`
                    if (value.getActualInstance() instanceof QuestionsAuthenticateReq) {
                        JsonObject obj = adapterQuestionsAuthenticateReq.toJsonTree((QuestionsAuthenticateReq)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `QuestionsUpdateReq`
                    if (value.getActualInstance() instanceof QuestionsUpdateReq) {
                        JsonObject obj = adapterQuestionsUpdateReq.toJsonTree((QuestionsUpdateReq)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AppSecretReq, AuthReqDataJson, EmailAuthenticateReq, EmailUpdateReq, OAuthReq, PasswordAuthenticateReq, PasswordUpdateReq, QuestionsAuthenticateReq, QuestionsUpdateReq");
                }

                @Override
                public AuthenticateReqAuthReqsValue read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize AppSecretReq
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AppSecretReq.validateJsonObject(jsonObject);
                        actualAdapter = adapterAppSecretReq;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AppSecretReq'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AppSecretReq failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AppSecretReq'", e);
                    }

                    // deserialize AuthReqDataJson
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AuthReqDataJson.validateJsonObject(jsonObject);
                        actualAdapter = adapterAuthReqDataJson;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AuthReqDataJson'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AuthReqDataJson failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AuthReqDataJson'", e);
                    }

                    // deserialize EmailAuthenticateReq
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EmailAuthenticateReq.validateJsonObject(jsonObject);
                        actualAdapter = adapterEmailAuthenticateReq;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'EmailAuthenticateReq'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for EmailAuthenticateReq failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'EmailAuthenticateReq'", e);
                    }

                    // deserialize EmailUpdateReq
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EmailUpdateReq.validateJsonObject(jsonObject);
                        actualAdapter = adapterEmailUpdateReq;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'EmailUpdateReq'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for EmailUpdateReq failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'EmailUpdateReq'", e);
                    }

                    // deserialize OAuthReq
                    try {
                        // validate the JSON object to see if any exception is thrown
                        OAuthReq.validateJsonObject(jsonObject);
                        actualAdapter = adapterOAuthReq;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'OAuthReq'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for OAuthReq failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'OAuthReq'", e);
                    }

                    // deserialize PasswordAuthenticateReq
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PasswordAuthenticateReq.validateJsonObject(jsonObject);
                        actualAdapter = adapterPasswordAuthenticateReq;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PasswordAuthenticateReq'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PasswordAuthenticateReq failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PasswordAuthenticateReq'", e);
                    }

                    // deserialize PasswordUpdateReq
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PasswordUpdateReq.validateJsonObject(jsonObject);
                        actualAdapter = adapterPasswordUpdateReq;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PasswordUpdateReq'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PasswordUpdateReq failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PasswordUpdateReq'", e);
                    }

                    // deserialize QuestionsAuthenticateReq
                    try {
                        // validate the JSON object to see if any exception is thrown
                        QuestionsAuthenticateReq.validateJsonObject(jsonObject);
                        actualAdapter = adapterQuestionsAuthenticateReq;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'QuestionsAuthenticateReq'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for QuestionsAuthenticateReq failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'QuestionsAuthenticateReq'", e);
                    }

                    // deserialize QuestionsUpdateReq
                    try {
                        // validate the JSON object to see if any exception is thrown
                        QuestionsUpdateReq.validateJsonObject(jsonObject);
                        actualAdapter = adapterQuestionsUpdateReq;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'QuestionsUpdateReq'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for QuestionsUpdateReq failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'QuestionsUpdateReq'", e);
                    }

                    if (match == 1) {
                        AuthenticateReqAuthReqsValue ret = new AuthenticateReqAuthReqsValue();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for AuthenticateReqAuthReqsValue: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public AuthenticateReqAuthReqsValue() {
        super("oneOf", Boolean.FALSE);
    }

    public AuthenticateReqAuthReqsValue(AppSecretReq o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AuthenticateReqAuthReqsValue(AuthReqDataJson o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AuthenticateReqAuthReqsValue(EmailAuthenticateReq o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AuthenticateReqAuthReqsValue(EmailUpdateReq o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AuthenticateReqAuthReqsValue(OAuthReq o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AuthenticateReqAuthReqsValue(PasswordAuthenticateReq o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AuthenticateReqAuthReqsValue(PasswordUpdateReq o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AuthenticateReqAuthReqsValue(QuestionsAuthenticateReq o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AuthenticateReqAuthReqsValue(QuestionsUpdateReq o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AppSecretReq", new GenericType<AppSecretReq>() {
        });
        schemas.put("AuthReqDataJson", new GenericType<AuthReqDataJson>() {
        });
        schemas.put("EmailAuthenticateReq", new GenericType<EmailAuthenticateReq>() {
        });
        schemas.put("EmailUpdateReq", new GenericType<EmailUpdateReq>() {
        });
        schemas.put("OAuthReq", new GenericType<OAuthReq>() {
        });
        schemas.put("PasswordAuthenticateReq", new GenericType<PasswordAuthenticateReq>() {
        });
        schemas.put("PasswordUpdateReq", new GenericType<PasswordUpdateReq>() {
        });
        schemas.put("QuestionsAuthenticateReq", new GenericType<QuestionsAuthenticateReq>() {
        });
        schemas.put("QuestionsUpdateReq", new GenericType<QuestionsUpdateReq>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return AuthenticateReqAuthReqsValue.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AppSecretReq, AuthReqDataJson, EmailAuthenticateReq, EmailUpdateReq, OAuthReq, PasswordAuthenticateReq, PasswordUpdateReq, QuestionsAuthenticateReq, QuestionsUpdateReq
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof AppSecretReq) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof AuthReqDataJson) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EmailAuthenticateReq) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EmailUpdateReq) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof OAuthReq) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PasswordAuthenticateReq) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PasswordUpdateReq) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof QuestionsAuthenticateReq) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof QuestionsUpdateReq) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AppSecretReq, AuthReqDataJson, EmailAuthenticateReq, EmailUpdateReq, OAuthReq, PasswordAuthenticateReq, PasswordUpdateReq, QuestionsAuthenticateReq, QuestionsUpdateReq");
    }

    /**
     * Get the actual instance, which can be the following:
     * AppSecretReq, AuthReqDataJson, EmailAuthenticateReq, EmailUpdateReq, OAuthReq, PasswordAuthenticateReq, PasswordUpdateReq, QuestionsAuthenticateReq, QuestionsUpdateReq
     *
     * @return The actual instance (AppSecretReq, AuthReqDataJson, EmailAuthenticateReq, EmailUpdateReq, OAuthReq, PasswordAuthenticateReq, PasswordUpdateReq, QuestionsAuthenticateReq, QuestionsUpdateReq)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AppSecretReq`. If the actual instance is not `AppSecretReq`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AppSecretReq`
     * @throws ClassCastException if the instance is not `AppSecretReq`
     */
    public AppSecretReq getAppSecretReq() throws ClassCastException {
        return (AppSecretReq)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AuthReqDataJson`. If the actual instance is not `AuthReqDataJson`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AuthReqDataJson`
     * @throws ClassCastException if the instance is not `AuthReqDataJson`
     */
    public AuthReqDataJson getAuthReqDataJson() throws ClassCastException {
        return (AuthReqDataJson)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EmailAuthenticateReq`. If the actual instance is not `EmailAuthenticateReq`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EmailAuthenticateReq`
     * @throws ClassCastException if the instance is not `EmailAuthenticateReq`
     */
    public EmailAuthenticateReq getEmailAuthenticateReq() throws ClassCastException {
        return (EmailAuthenticateReq)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EmailUpdateReq`. If the actual instance is not `EmailUpdateReq`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EmailUpdateReq`
     * @throws ClassCastException if the instance is not `EmailUpdateReq`
     */
    public EmailUpdateReq getEmailUpdateReq() throws ClassCastException {
        return (EmailUpdateReq)super.getActualInstance();
    }

    /**
     * Get the actual instance of `OAuthReq`. If the actual instance is not `OAuthReq`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OAuthReq`
     * @throws ClassCastException if the instance is not `OAuthReq`
     */
    public OAuthReq getOAuthReq() throws ClassCastException {
        return (OAuthReq)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PasswordAuthenticateReq`. If the actual instance is not `PasswordAuthenticateReq`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PasswordAuthenticateReq`
     * @throws ClassCastException if the instance is not `PasswordAuthenticateReq`
     */
    public PasswordAuthenticateReq getPasswordAuthenticateReq() throws ClassCastException {
        return (PasswordAuthenticateReq)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PasswordUpdateReq`. If the actual instance is not `PasswordUpdateReq`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PasswordUpdateReq`
     * @throws ClassCastException if the instance is not `PasswordUpdateReq`
     */
    public PasswordUpdateReq getPasswordUpdateReq() throws ClassCastException {
        return (PasswordUpdateReq)super.getActualInstance();
    }

    /**
     * Get the actual instance of `QuestionsAuthenticateReq`. If the actual instance is not `QuestionsAuthenticateReq`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `QuestionsAuthenticateReq`
     * @throws ClassCastException if the instance is not `QuestionsAuthenticateReq`
     */
    public QuestionsAuthenticateReq getQuestionsAuthenticateReq() throws ClassCastException {
        return (QuestionsAuthenticateReq)super.getActualInstance();
    }

    /**
     * Get the actual instance of `QuestionsUpdateReq`. If the actual instance is not `QuestionsUpdateReq`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `QuestionsUpdateReq`
     * @throws ClassCastException if the instance is not `QuestionsUpdateReq`
     */
    public QuestionsUpdateReq getQuestionsUpdateReq() throws ClassCastException {
        return (QuestionsUpdateReq)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthenticateReqAuthReqsValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with AppSecretReq
    try {
      AppSecretReq.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for AppSecretReq failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with AuthReqDataJson
    try {
      AuthReqDataJson.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for AuthReqDataJson failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with EmailAuthenticateReq
    try {
      EmailAuthenticateReq.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for EmailAuthenticateReq failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with EmailUpdateReq
    try {
      EmailUpdateReq.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for EmailUpdateReq failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with OAuthReq
    try {
      OAuthReq.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for OAuthReq failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PasswordAuthenticateReq
    try {
      PasswordAuthenticateReq.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PasswordAuthenticateReq failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PasswordUpdateReq
    try {
      PasswordUpdateReq.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PasswordUpdateReq failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with QuestionsAuthenticateReq
    try {
      QuestionsAuthenticateReq.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for QuestionsAuthenticateReq failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with QuestionsUpdateReq
    try {
      QuestionsUpdateReq.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for QuestionsUpdateReq failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for AuthenticateReqAuthReqsValue with oneOf schemas: AppSecretReq, AuthReqDataJson, EmailAuthenticateReq, EmailUpdateReq, OAuthReq, PasswordAuthenticateReq, PasswordUpdateReq, QuestionsAuthenticateReq, QuestionsUpdateReq. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
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

