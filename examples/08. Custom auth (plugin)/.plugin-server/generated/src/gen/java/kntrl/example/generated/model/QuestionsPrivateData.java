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



@JsonTypeName("QuestionsPrivateData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-21T17:10:42.806916+03:00[Europe/Kiev]")
public class QuestionsPrivateData extends HashMap<String, Object>  {
  private @Valid Map<String, String> questions = null;

  /**
   **/
  public QuestionsPrivateData questions(Map<String, String> questions) {
    this.questions = questions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("questions")
  public Map<String, String> getQuestions() {
    return questions;
  }

  @JsonProperty("questions")
  public void setQuestions(Map<String, String> questions) {
    this.questions = questions;
  }

  public QuestionsPrivateData putQuestionsItem(String key, String questionsItem) {
    if (this.questions == null) {
      this.questions = new HashMap<>();
    }

    this.questions.put(key, questionsItem);
    return this;
  }

  public QuestionsPrivateData removeQuestionsItem(String questionsItem) {
    if (questionsItem != null && this.questions != null) {
      this.questions.remove(questionsItem);
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
    QuestionsPrivateData questionsPrivateData = (QuestionsPrivateData) o;
    return Objects.equals(this.questions, questionsPrivateData.questions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questions, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionsPrivateData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
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

