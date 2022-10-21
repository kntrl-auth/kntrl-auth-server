package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("QuestionsAuthResData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-21T17:10:42.806916+03:00[Europe/Kiev]")
public class QuestionsAuthResData extends HashMap<String, Object>  {
  private @Valid Map<String, Boolean> correct = new HashMap<>();

  /**
   * Shows is answer was correct. 
   **/
  public QuestionsAuthResData correct(Map<String, Boolean> correct) {
    this.correct = correct;
    return this;
  }

  
  @ApiModelProperty(example = "{\"HOME_CITY\":true,\"MOTHER_NAME\":false}", required = true, value = "Shows is answer was correct. ")
  @JsonProperty("correct")
  @NotNull
  public Map<String, Boolean> getCorrect() {
    return correct;
  }

  @JsonProperty("correct")
  public void setCorrect(Map<String, Boolean> correct) {
    this.correct = correct;
  }

  public QuestionsAuthResData putCorrectItem(String key, Boolean correctItem) {
    if (this.correct == null) {
      this.correct = new HashMap<>();
    }

    this.correct.put(key, correctItem);
    return this;
  }

  public QuestionsAuthResData removeCorrectItem(Boolean correctItem) {
    if (correctItem != null && this.correct != null) {
      this.correct.remove(correctItem);
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
    QuestionsAuthResData questionsAuthResData = (QuestionsAuthResData) o;
    return Objects.equals(this.correct, questionsAuthResData.correct) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correct, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionsAuthResData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    correct: ").append(toIndentedString(correct)).append("\n");
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

