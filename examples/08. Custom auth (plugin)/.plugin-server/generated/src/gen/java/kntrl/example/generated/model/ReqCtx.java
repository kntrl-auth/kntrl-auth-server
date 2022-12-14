package kntrl.example.generated.model;

import java.util.HashMap;
import java.util.Map;
import kntrl.example.generated.model.Device;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ReqCtx")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-22T00:20:30.250260+03:00[Europe/Kiev]")
public class ReqCtx   {
  private String lang;
  private String ip;
  private Device device;
  private Map<String, String> headers = new HashMap<>();

  /**
   **/
  public ReqCtx lang(String lang) {
    this.lang = lang;
    return this;
  }

  
  @JsonProperty("lang")
  public String getLang() {
    return lang;
  }

  @JsonProperty("lang")
  public void setLang(String lang) {
    this.lang = lang;
  }

  /**
   **/
  public ReqCtx ip(String ip) {
    this.ip = ip;
    return this;
  }

  
  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }

  @JsonProperty("ip")
  public void setIp(String ip) {
    this.ip = ip;
  }

  /**
   **/
  public ReqCtx device(Device device) {
    this.device = device;
    return this;
  }

  
  @JsonProperty("device")
  public Device getDevice() {
    return device;
  }

  @JsonProperty("device")
  public void setDevice(Device device) {
    this.device = device;
  }

  /**
   **/
  public ReqCtx headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }

  
  @JsonProperty("headers")
  public Map<String, String> getHeaders() {
    return headers;
  }

  @JsonProperty("headers")
  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }

  public ReqCtx putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }

    this.headers.put(key, headersItem);
    return this;
  }

  public ReqCtx removeHeadersItem(String headersItem) {
    if (headersItem != null && this.headers != null) {
      this.headers.remove(headersItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReqCtx reqCtx = (ReqCtx) o;
    return Objects.equals(this.lang, reqCtx.lang) &&
        Objects.equals(this.ip, reqCtx.ip) &&
        Objects.equals(this.device, reqCtx.device) &&
        Objects.equals(this.headers, reqCtx.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lang, ip, device, headers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReqCtx {\n");
    
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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


}

