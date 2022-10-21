package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import kntrl.example.generated.model.AuthResResDataAnswersSavedAt;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("QuestionsUpdateResData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-21T17:10:42.806916+03:00[Europe/Kiev]")
public class QuestionsUpdateResData extends HashMap<String, Object>  {
  private @Valid AuthResResDataAnswersSavedAt answersSavedAt;

  /**
   **/
  public QuestionsUpdateResData answersSavedAt(AuthResResDataAnswersSavedAt answersSavedAt) {
    this.answersSavedAt = answersSavedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("answersSavedAt")
  @NotNull
  public AuthResResDataAnswersSavedAt getAnswersSavedAt() {
    return answersSavedAt;
  }

  @JsonProperty("answersSavedAt")
  public void setAnswersSavedAt(AuthResResDataAnswersSavedAt answersSavedAt) {
    this.answersSavedAt = answersSavedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionsUpdateResData questionsUpdateResData = (QuestionsUpdateResData) o;
    return Objects.equals(this.answersSavedAt, questionsUpdateResData.answersSavedAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answersSavedAt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionsUpdateResData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

