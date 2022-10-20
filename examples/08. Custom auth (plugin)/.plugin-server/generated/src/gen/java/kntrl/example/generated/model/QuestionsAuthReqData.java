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



@JsonTypeName("QuestionsAuthReqData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T22:48:57.779152+03:00[Europe/Kiev]")
public class QuestionsAuthReqData extends HashMap<String, Object>  {
  private @Valid Map<String, String> answers = new HashMap<>();

  /**
   * Given answers for questions. 
   **/
  public QuestionsAuthReqData answers(Map<String, String> answers) {
    this.answers = answers;
    return this;
  }

  
  @ApiModelProperty(example = "{\"HOME_CITY\":\"New-York\",\"MOTHER_NAME\":\"Emma\"}", required = true, value = "Given answers for questions. ")
  @JsonProperty("answers")
  @NotNull
  public Map<String, String> getAnswers() {
    return answers;
  }

  @JsonProperty("answers")
  public void setAnswers(Map<String, String> answers) {
    this.answers = answers;
  }

  public QuestionsAuthReqData putAnswersItem(String key, String answersItem) {
    if (this.answers == null) {
      this.answers = new HashMap<>();
    }

    this.answers.put(key, answersItem);
    return this;
  }

  public QuestionsAuthReqData removeAnswersItem(String answersItem) {
    if (answersItem != null && this.answers != null) {
      this.answers.remove(answersItem);
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
    QuestionsAuthReqData questionsAuthReqData = (QuestionsAuthReqData) o;
    return Objects.equals(this.answers, questionsAuthReqData.answers) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answers, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionsAuthReqData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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

