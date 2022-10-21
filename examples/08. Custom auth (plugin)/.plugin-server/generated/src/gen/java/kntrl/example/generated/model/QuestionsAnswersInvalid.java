package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import kntrl.example.generated.model.AnswerErr;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("QuestionsAnswersInvalid")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-21T17:10:42.806916+03:00[Europe/Kiev]")
public class QuestionsAnswersInvalid   {
  private @Valid String code;
  private @Valid String devMsg;
  private @Valid String msg;
  private @Valid Map<String, AnswerErr> invalidAnswers = new HashMap<>();
  private @Valid Boolean tooManyAnswers;

  /**
   **/
  public QuestionsAnswersInvalid code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("code")
  @NotNull
  public String getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Message for developers.
   **/
  public QuestionsAnswersInvalid devMsg(String devMsg) {
    this.devMsg = devMsg;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Message for developers.")
  @JsonProperty("devMsg")
  @NotNull
  public String getDevMsg() {
    return devMsg;
  }

  @JsonProperty("devMsg")
  public void setDevMsg(String devMsg) {
    this.devMsg = devMsg;
  }

  /**
   * Localised message suitable for UI.
   **/
  public QuestionsAnswersInvalid msg(String msg) {
    this.msg = msg;
    return this;
  }

  
  @ApiModelProperty(value = "Localised message suitable for UI.")
  @JsonProperty("msg")
  public String getMsg() {
    return msg;
  }

  @JsonProperty("msg")
  public void setMsg(String msg) {
    this.msg = msg;
  }

  /**
   **/
  public QuestionsAnswersInvalid invalidAnswers(Map<String, AnswerErr> invalidAnswers) {
    this.invalidAnswers = invalidAnswers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("invalidAnswers")
  @NotNull
  public Map<String, AnswerErr> getInvalidAnswers() {
    return invalidAnswers;
  }

  @JsonProperty("invalidAnswers")
  public void setInvalidAnswers(Map<String, AnswerErr> invalidAnswers) {
    this.invalidAnswers = invalidAnswers;
  }

  public QuestionsAnswersInvalid putInvalidAnswersItem(String key, AnswerErr invalidAnswersItem) {
    if (this.invalidAnswers == null) {
      this.invalidAnswers = new HashMap<>();
    }

    this.invalidAnswers.put(key, invalidAnswersItem);
    return this;
  }

  public QuestionsAnswersInvalid removeInvalidAnswersItem(AnswerErr invalidAnswersItem) {
    if (invalidAnswersItem != null && this.invalidAnswers != null) {
      this.invalidAnswers.remove(invalidAnswersItem);
    }

    return this;
  }
  /**
   **/
  public QuestionsAnswersInvalid tooManyAnswers(Boolean tooManyAnswers) {
    this.tooManyAnswers = tooManyAnswers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("tooManyAnswers")
  @NotNull
  public Boolean getTooManyAnswers() {
    return tooManyAnswers;
  }

  @JsonProperty("tooManyAnswers")
  public void setTooManyAnswers(Boolean tooManyAnswers) {
    this.tooManyAnswers = tooManyAnswers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionsAnswersInvalid questionsAnswersInvalid = (QuestionsAnswersInvalid) o;
    return Objects.equals(this.code, questionsAnswersInvalid.code) &&
        Objects.equals(this.devMsg, questionsAnswersInvalid.devMsg) &&
        Objects.equals(this.msg, questionsAnswersInvalid.msg) &&
        Objects.equals(this.invalidAnswers, questionsAnswersInvalid.invalidAnswers) &&
        Objects.equals(this.tooManyAnswers, questionsAnswersInvalid.tooManyAnswers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, devMsg, msg, invalidAnswers, tooManyAnswers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionsAnswersInvalid {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    devMsg: ").append(toIndentedString(devMsg)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    invalidAnswers: ").append(toIndentedString(invalidAnswers)).append("\n");
    sb.append("    tooManyAnswers: ").append(toIndentedString(tooManyAnswers)).append("\n");
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

