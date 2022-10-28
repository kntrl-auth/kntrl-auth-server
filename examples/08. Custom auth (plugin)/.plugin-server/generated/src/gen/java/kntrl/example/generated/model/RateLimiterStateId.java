package kntrl.example.generated.model;

import kntrl.example.generated.model.RateLimiterUser;
import kntrl.example.generated.model.TimeWindow;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("RateLimiterStateId")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-22T00:20:30.250260+03:00[Europe/Kiev]")
public class RateLimiterStateId   {
  private String rateLimiter;
  private RateLimiterUser user;
  private TimeWindow window;

  /**
   **/
  public RateLimiterStateId rateLimiter(String rateLimiter) {
    this.rateLimiter = rateLimiter;
    return this;
  }

  
  @JsonProperty("rateLimiter")
  public String getRateLimiter() {
    return rateLimiter;
  }

  @JsonProperty("rateLimiter")
  public void setRateLimiter(String rateLimiter) {
    this.rateLimiter = rateLimiter;
  }

  /**
   **/
  public RateLimiterStateId user(RateLimiterUser user) {
    this.user = user;
    return this;
  }

  
  @JsonProperty("user")
  public RateLimiterUser getUser() {
    return user;
  }

  @JsonProperty("user")
  public void setUser(RateLimiterUser user) {
    this.user = user;
  }

  /**
   **/
  public RateLimiterStateId window(TimeWindow window) {
    this.window = window;
    return this;
  }

  
  @JsonProperty("window")
  public TimeWindow getWindow() {
    return window;
  }

  @JsonProperty("window")
  public void setWindow(TimeWindow window) {
    this.window = window;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateLimiterStateId rateLimiterStateId = (RateLimiterStateId) o;
    return Objects.equals(this.rateLimiter, rateLimiterStateId.rateLimiter) &&
        Objects.equals(this.user, rateLimiterStateId.user) &&
        Objects.equals(this.window, rateLimiterStateId.window);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateLimiter, user, window);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateLimiterStateId {\n");
    
    sb.append("    rateLimiter: ").append(toIndentedString(rateLimiter)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    window: ").append(toIndentedString(window)).append("\n");
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

