package kntrl.example.generated.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("RateLimiterUser")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-22T00:20:30.250260+03:00[Europe/Kiev]")
public class RateLimiterUser   {
  private String userId;
  private String ip;

  /**
   **/
  public RateLimiterUser userId(String userId) {
    this.userId = userId;
    return this;
  }

  
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  @JsonProperty("userId")
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   **/
  public RateLimiterUser ip(String ip) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateLimiterUser rateLimiterUser = (RateLimiterUser) o;
    return Objects.equals(this.userId, rateLimiterUser.userId) &&
        Objects.equals(this.ip, rateLimiterUser.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, ip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateLimiterUser {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

