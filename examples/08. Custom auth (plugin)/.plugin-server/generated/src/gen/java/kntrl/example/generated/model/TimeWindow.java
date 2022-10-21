package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("TimeWindow")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-21T17:10:42.806916+03:00[Europe/Kiev]")
public class TimeWindow   {
  private @Valid Long start;
  private @Valid Long end;

  /**
   **/
  public TimeWindow start(Long start) {
    this.start = start;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("start")
  @NotNull
  public Long getStart() {
    return start;
  }

  @JsonProperty("start")
  public void setStart(Long start) {
    this.start = start;
  }

  /**
   **/
  public TimeWindow end(Long end) {
    this.end = end;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("end")
  @NotNull
  public Long getEnd() {
    return end;
  }

  @JsonProperty("end")
  public void setEnd(Long end) {
    this.end = end;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeWindow timeWindow = (TimeWindow) o;
    return Objects.equals(this.start, timeWindow.start) &&
        Objects.equals(this.end, timeWindow.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeWindow {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

