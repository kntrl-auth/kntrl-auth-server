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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Cache
 */
@JsonAdapter(Cache.Adapter.class)
public enum Cache {
  
  JWT("JWT"),
  
  BINARY("BINARY");

  private String value;

  Cache(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Cache fromValue(String value) {
    for (Cache b : Cache.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Cache> {
    @Override
    public void write(final JsonWriter jsonWriter, final Cache enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Cache read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Cache.fromValue(value);
    }
  }
}

