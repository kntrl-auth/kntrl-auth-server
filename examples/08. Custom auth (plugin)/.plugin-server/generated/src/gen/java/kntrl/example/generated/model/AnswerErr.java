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



@JsonTypeName("AnswerErr")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T19:23:38.989036+03:00[Europe/Kiev]")
public class AnswerErr   {
  private @Valid Boolean tooShort;
  private @Valid Boolean tooLong;

  /**
   **/
  public AnswerErr tooShort(Boolean tooShort) {
    this.tooShort = tooShort;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("tooShort")
  @NotNull
  public Boolean getTooShort() {
    return tooShort;
  }

  @JsonProperty("tooShort")
  public void setTooShort(Boolean tooShort) {
    this.tooShort = tooShort;
  }

  /**
   **/
  public AnswerErr tooLong(Boolean tooLong) {
    this.tooLong = tooLong;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("tooLong")
  @NotNull
  public Boolean getTooLong() {
    return tooLong;
  }

  @JsonProperty("tooLong")
  public void setTooLong(Boolean tooLong) {
    this.tooLong = tooLong;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnswerErr answerErr = (AnswerErr) o;
    return Objects.equals(this.tooShort, answerErr.tooShort) &&
        Objects.equals(this.tooLong, answerErr.tooLong);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tooShort, tooLong);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnswerErr {\n");
    
    sb.append("    tooShort: ").append(toIndentedString(tooShort)).append("\n");
    sb.append("    tooLong: ").append(toIndentedString(tooLong)).append("\n");
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

