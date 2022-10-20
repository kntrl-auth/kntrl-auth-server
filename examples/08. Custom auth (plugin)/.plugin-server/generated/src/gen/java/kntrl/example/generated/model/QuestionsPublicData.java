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



@JsonTypeName("QuestionsPublicData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T19:23:38.989036+03:00[Europe/Kiev]")
public class QuestionsPublicData extends HashMap<String, Object>  {
  private @Valid Map<String, Long> questionsSavedAt = null;

  /**
   **/
  public QuestionsPublicData questionsSavedAt(Map<String, Long> questionsSavedAt) {
    this.questionsSavedAt = questionsSavedAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("questionsSavedAt")
  public Map<String, Long> getQuestionsSavedAt() {
    return questionsSavedAt;
  }

  @JsonProperty("questionsSavedAt")
  public void setQuestionsSavedAt(Map<String, Long> questionsSavedAt) {
    this.questionsSavedAt = questionsSavedAt;
  }

  public QuestionsPublicData putQuestionsSavedAtItem(String key, Long questionsSavedAtItem) {
    if (this.questionsSavedAt == null) {
      this.questionsSavedAt = new HashMap<>();
    }

    this.questionsSavedAt.put(key, questionsSavedAtItem);
    return this;
  }

  public QuestionsPublicData removeQuestionsSavedAtItem(Long questionsSavedAtItem) {
    if (questionsSavedAtItem != null && this.questionsSavedAt != null) {
      this.questionsSavedAt.remove(questionsSavedAtItem);
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
    QuestionsPublicData questionsPublicData = (QuestionsPublicData) o;
    return Objects.equals(this.questionsSavedAt, questionsPublicData.questionsSavedAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionsSavedAt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionsPublicData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    questionsSavedAt: ").append(toIndentedString(questionsSavedAt)).append("\n");
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

