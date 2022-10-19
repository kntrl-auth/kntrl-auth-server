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



@JsonTypeName("QuestionsUpdateRes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-19T21:13:03.480932+03:00[Europe/Kiev]")
public class QuestionsUpdateRes   {
  private @Valid Map<String, Long> answersSavedAt = new HashMap<>();

  /**
   * Date of last update
   **/
  public QuestionsUpdateRes answersSavedAt(Map<String, Long> answersSavedAt) {
    this.answersSavedAt = answersSavedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Date of last update")
  @JsonProperty("answersSavedAt")
  @NotNull
  public Map<String, Long> getAnswersSavedAt() {
    return answersSavedAt;
  }

  @JsonProperty("answersSavedAt")
  public void setAnswersSavedAt(Map<String, Long> answersSavedAt) {
    this.answersSavedAt = answersSavedAt;
  }

  public QuestionsUpdateRes putAnswersSavedAtItem(String key, Long answersSavedAtItem) {
    if (this.answersSavedAt == null) {
      this.answersSavedAt = new HashMap<>();
    }

    this.answersSavedAt.put(key, answersSavedAtItem);
    return this;
  }

  public QuestionsUpdateRes removeAnswersSavedAtItem(Long answersSavedAtItem) {
    if (answersSavedAtItem != null && this.answersSavedAt != null) {
      this.answersSavedAt.remove(answersSavedAtItem);
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
    QuestionsUpdateRes questionsUpdateRes = (QuestionsUpdateRes) o;
    return Objects.equals(this.answersSavedAt, questionsUpdateRes.answersSavedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answersSavedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionsUpdateRes {\n");
    
    sb.append("    answersSavedAt: ").append(toIndentedString(answersSavedAt)).append("\n");
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

