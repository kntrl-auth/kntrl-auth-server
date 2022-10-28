package kntrl.example.generated.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AnswerErr")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-22T00:20:30.250260+03:00[Europe/Kiev]")
public class AnswerErr   {
  private Boolean tooShort;
  private Boolean tooLong;

  /**
   **/
  public AnswerErr tooShort(Boolean tooShort) {
    this.tooShort = tooShort;
    return this;
  }

  
  @JsonProperty("tooShort")
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

  
  @JsonProperty("tooLong")
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

