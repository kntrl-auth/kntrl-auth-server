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
 * User database config
 */
@ApiModel(description = "User database config")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShDbsCfgUser {
  public static final String SERIALIZED_NAME_IN_MEMORY = "inMemory";
  @SerializedName(SERIALIZED_NAME_IN_MEMORY)
  private Boolean inMemory = true;

  public static final String SERIALIZED_NAME_IN_TOKEN = "inToken";
  @SerializedName(SERIALIZED_NAME_IN_TOKEN)
  private Boolean inToken = true;

  public static final String SERIALIZED_NAME_MONGODB = "mongodb";
  @SerializedName(SERIALIZED_NAME_MONGODB)
  private String mongodb;

  public static final String SERIALIZED_NAME_DATABASE = "database";
  @SerializedName(SERIALIZED_NAME_DATABASE)
  private Integer database;

  public static final String SERIALIZED_NAME_REDIS = "redis";
  @SerializedName(SERIALIZED_NAME_REDIS)
  private List<String> redis = null;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private Boolean cluster = false;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password = "";

  public static final String SERIALIZED_NAME_SSL = "ssl";
  @SerializedName(SERIALIZED_NAME_SSL)
  private Boolean ssl = false;

  public static final String SERIALIZED_NAME_MAX_CONNECTIONS = "maxConnections";
  @SerializedName(SERIALIZED_NAME_MAX_CONNECTIONS)
  private Integer maxConnections = 500;

  public static final String SERIALIZED_NAME_REMOTE = "remote";
  @SerializedName(SERIALIZED_NAME_REMOTE)
  private String remote;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private Map<String, String> query = null;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private Map<String, String> headers = null;

  public static final String SERIALIZED_NAME_MYSQL = "mysql";
  @SerializedName(SERIALIZED_NAME_MYSQL)
  private String mysql = "localhost:3306";

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username = "";

  public static final String SERIALIZED_NAME_POSTGRES = "postgres";
  @SerializedName(SERIALIZED_NAME_POSTGRES)
  private String postgres = "localhost:5432/";

  public static final String SERIALIZED_NAME_SQLITE = "sqlite";
  @SerializedName(SERIALIZED_NAME_SQLITE)
  private String sqlite = "./sqlite";

  public ShDbsCfgUser() {
  }

  public ShDbsCfgUser inMemory(Boolean inMemory) {
    
    this.inMemory = inMemory;
    return this;
  }

   /**
   * Get inMemory
   * @return inMemory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInMemory() {
    return inMemory;
  }


  public void setInMemory(Boolean inMemory) {
    this.inMemory = inMemory;
  }


  public ShDbsCfgUser inToken(Boolean inToken) {
    
    this.inToken = inToken;
    return this;
  }

   /**
   * Get inToken
   * @return inToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInToken() {
    return inToken;
  }


  public void setInToken(Boolean inToken) {
    this.inToken = inToken;
  }


  public ShDbsCfgUser mongodb(String mongodb) {
    
    this.mongodb = mongodb;
    return this;
  }

   /**
   * Get mongodb
   * @return mongodb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMongodb() {
    return mongodb;
  }


  public void setMongodb(String mongodb) {
    this.mongodb = mongodb;
  }


  public ShDbsCfgUser database(Integer database) {
    
    this.database = database;
    return this;
  }

   /**
   * Get database
   * @return database
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDatabase() {
    return database;
  }


  public void setDatabase(Integer database) {
    this.database = database;
  }


  public ShDbsCfgUser redis(List<String> redis) {
    
    this.redis = redis;
    return this;
  }

  public ShDbsCfgUser addRedisItem(String redisItem) {
    if (this.redis == null) {
      this.redis = new ArrayList<>();
    }
    this.redis.add(redisItem);
    return this;
  }

   /**
   * Get redis
   * @return redis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRedis() {
    return redis;
  }


  public void setRedis(List<String> redis) {
    this.redis = redis;
  }


  public ShDbsCfgUser cluster(Boolean cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCluster() {
    return cluster;
  }


  public void setCluster(Boolean cluster) {
    this.cluster = cluster;
  }


  public ShDbsCfgUser user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }


  public ShDbsCfgUser password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public ShDbsCfgUser ssl(Boolean ssl) {
    
    this.ssl = ssl;
    return this;
  }

   /**
   * Get ssl
   * @return ssl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSsl() {
    return ssl;
  }


  public void setSsl(Boolean ssl) {
    this.ssl = ssl;
  }


  public ShDbsCfgUser maxConnections(Integer maxConnections) {
    
    this.maxConnections = maxConnections;
    return this;
  }

   /**
   * Get maxConnections
   * @return maxConnections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxConnections() {
    return maxConnections;
  }


  public void setMaxConnections(Integer maxConnections) {
    this.maxConnections = maxConnections;
  }


  public ShDbsCfgUser remote(String remote) {
    
    this.remote = remote;
    return this;
  }

   /**
   * Get remote
   * @return remote
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRemote() {
    return remote;
  }


  public void setRemote(String remote) {
    this.remote = remote;
  }


  public ShDbsCfgUser query(Map<String, String> query) {
    
    this.query = query;
    return this;
  }

  public ShDbsCfgUser putQueryItem(String key, String queryItem) {
    if (this.query == null) {
      this.query = new HashMap<>();
    }
    this.query.put(key, queryItem);
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getQuery() {
    return query;
  }


  public void setQuery(Map<String, String> query) {
    this.query = query;
  }


  public ShDbsCfgUser headers(Map<String, String> headers) {
    
    this.headers = headers;
    return this;
  }

  public ShDbsCfgUser putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getHeaders() {
    return headers;
  }


  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }


  public ShDbsCfgUser mysql(String mysql) {
    
    this.mysql = mysql;
    return this;
  }

   /**
   * Get mysql
   * @return mysql
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMysql() {
    return mysql;
  }


  public void setMysql(String mysql) {
    this.mysql = mysql;
  }


  public ShDbsCfgUser username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public ShDbsCfgUser postgres(String postgres) {
    
    this.postgres = postgres;
    return this;
  }

   /**
   * Get postgres
   * @return postgres
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostgres() {
    return postgres;
  }


  public void setPostgres(String postgres) {
    this.postgres = postgres;
  }


  public ShDbsCfgUser sqlite(String sqlite) {
    
    this.sqlite = sqlite;
    return this;
  }

   /**
   * Get sqlite
   * @return sqlite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSqlite() {
    return sqlite;
  }


  public void setSqlite(String sqlite) {
    this.sqlite = sqlite;
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
  public ShDbsCfgUser putAdditionalProperty(String key, Object value) {
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
    ShDbsCfgUser shDbsCfgUser = (ShDbsCfgUser) o;
    return Objects.equals(this.inMemory, shDbsCfgUser.inMemory) &&
        Objects.equals(this.inToken, shDbsCfgUser.inToken) &&
        Objects.equals(this.mongodb, shDbsCfgUser.mongodb) &&
        Objects.equals(this.database, shDbsCfgUser.database) &&
        Objects.equals(this.redis, shDbsCfgUser.redis) &&
        Objects.equals(this.cluster, shDbsCfgUser.cluster) &&
        Objects.equals(this.user, shDbsCfgUser.user) &&
        Objects.equals(this.password, shDbsCfgUser.password) &&
        Objects.equals(this.ssl, shDbsCfgUser.ssl) &&
        Objects.equals(this.maxConnections, shDbsCfgUser.maxConnections) &&
        Objects.equals(this.remote, shDbsCfgUser.remote) &&
        Objects.equals(this.query, shDbsCfgUser.query) &&
        Objects.equals(this.headers, shDbsCfgUser.headers) &&
        Objects.equals(this.mysql, shDbsCfgUser.mysql) &&
        Objects.equals(this.username, shDbsCfgUser.username) &&
        Objects.equals(this.postgres, shDbsCfgUser.postgres) &&
        Objects.equals(this.sqlite, shDbsCfgUser.sqlite)&&
        Objects.equals(this.additionalProperties, shDbsCfgUser.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inMemory, inToken, mongodb, database, redis, cluster, user, password, ssl, maxConnections, remote, query, headers, mysql, username, postgres, sqlite, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShDbsCfgUser {\n");
    sb.append("    inMemory: ").append(toIndentedString(inMemory)).append("\n");
    sb.append("    inToken: ").append(toIndentedString(inToken)).append("\n");
    sb.append("    mongodb: ").append(toIndentedString(mongodb)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    redis: ").append(toIndentedString(redis)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
    sb.append("    maxConnections: ").append(toIndentedString(maxConnections)).append("\n");
    sb.append("    remote: ").append(toIndentedString(remote)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    mysql: ").append(toIndentedString(mysql)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    postgres: ").append(toIndentedString(postgres)).append("\n");
    sb.append("    sqlite: ").append(toIndentedString(sqlite)).append("\n");
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
    openapiFields.add("inMemory");
    openapiFields.add("inToken");
    openapiFields.add("mongodb");
    openapiFields.add("database");
    openapiFields.add("redis");
    openapiFields.add("cluster");
    openapiFields.add("user");
    openapiFields.add("password");
    openapiFields.add("ssl");
    openapiFields.add("maxConnections");
    openapiFields.add("remote");
    openapiFields.add("query");
    openapiFields.add("headers");
    openapiFields.add("mysql");
    openapiFields.add("username");
    openapiFields.add("postgres");
    openapiFields.add("sqlite");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShDbsCfgUser
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ShDbsCfgUser.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShDbsCfgUser is not found in the empty JSON string", ShDbsCfgUser.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("mongodb") != null && !jsonObj.get("mongodb").isJsonNull()) && !jsonObj.get("mongodb").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mongodb` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mongodb").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("redis") != null && !jsonObj.get("redis").isJsonNull()) && !jsonObj.get("redis").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `redis` to be an array in the JSON string but got `%s`", jsonObj.get("redis").toString()));
      }
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("remote") != null && !jsonObj.get("remote").isJsonNull()) && !jsonObj.get("remote").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remote` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remote").toString()));
      }
      if ((jsonObj.get("mysql") != null && !jsonObj.get("mysql").isJsonNull()) && !jsonObj.get("mysql").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mysql` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mysql").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("postgres") != null && !jsonObj.get("postgres").isJsonNull()) && !jsonObj.get("postgres").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postgres` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postgres").toString()));
      }
      if ((jsonObj.get("sqlite") != null && !jsonObj.get("sqlite").isJsonNull()) && !jsonObj.get("sqlite").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sqlite` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sqlite").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShDbsCfgUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShDbsCfgUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShDbsCfgUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShDbsCfgUser.class));

       return (TypeAdapter<T>) new TypeAdapter<ShDbsCfgUser>() {
           @Override
           public void write(JsonWriter out, ShDbsCfgUser value) throws IOException {
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
           public ShDbsCfgUser read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ShDbsCfgUser instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ShDbsCfgUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShDbsCfgUser
  * @throws IOException if the JSON string is invalid with respect to ShDbsCfgUser
  */
  public static ShDbsCfgUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShDbsCfgUser.class);
  }

 /**
  * Convert an instance of ShDbsCfgUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

