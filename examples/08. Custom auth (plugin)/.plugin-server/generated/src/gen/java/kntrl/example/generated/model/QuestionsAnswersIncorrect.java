package kntrl.example.generated.model;

import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("QuestionsAnswersIncorrect")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-22T00:20:30.250260+03:00[Europe/Kiev]")
public class QuestionsAnswersIncorrect   {
  private String code;
  private String devMsg;
  private String msg;
  private List<String> incorrectAnswers = new ArrayList<>();
  private Boolean requiresMoreAnswers;
  private List<String> questionsNotFound = new ArrayList<>();

  /**
   **/
  public QuestionsAnswersIncorrect code(String code) {
    this.code = code;
    return this;
  }

  
  @JsonProperty("code")
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
  public QuestionsAnswersIncorrect devMsg(String devMsg) {
    this.devMsg = devMsg;
    return this;
  }

  
  @JsonProperty("devMsg")
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
  public QuestionsAnswersIncorrect msg(String msg) {
    this.msg = msg;
    return this;
  }

  
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
  public QuestionsAnswersIncorrect incorrectAnswers(List<String> incorrectAnswers) {
    this.incorrectAnswers = incorrectAnswers;
    return this;
  }

  
  @JsonProperty("incorrectAnswers")
  public List<String> getIncorrectAnswers() {
    return incorrectAnswers;
  }

  @JsonProperty("incorrectAnswers")
  public void setIncorrectAnswers(List<String> incorrectAnswers) {
    this.incorrectAnswers = incorrectAnswers;
  }

  public QuestionsAnswersIncorrect addIncorrectAnswersItem(String incorrectAnswersItem) {
    if (this.incorrectAnswers == null) {
      this.incorrectAnswers = new ArrayList<>();
    }

    this.incorrectAnswers.add(incorrectAnswersItem);
    return this;
  }

  public QuestionsAnswersIncorrect removeIncorrectAnswersItem(String incorrectAnswersItem) {
    if (incorrectAnswersItem != null && this.incorrectAnswers != null) {
      this.incorrectAnswers.remove(incorrectAnswersItem);
    }

    return this;
  }
  /**
   **/
  public QuestionsAnswersIncorrect requiresMoreAnswers(Boolean requiresMoreAnswers) {
    this.requiresMoreAnswers = requiresMoreAnswers;
    return this;
  }

  
  @JsonProperty("requiresMoreAnswers")
  public Boolean getRequiresMoreAnswers() {
    return requiresMoreAnswers;
  }

  @JsonProperty("requiresMoreAnswers")
  public void setRequiresMoreAnswers(Boolean requiresMoreAnswers) {
    this.requiresMoreAnswers = requiresMoreAnswers;
  }

  /**
   **/
  public QuestionsAnswersIncorrect questionsNotFound(List<String> questionsNotFound) {
    this.questionsNotFound = questionsNotFound;
    return this;
  }

  
  @JsonProperty("questionsNotFound")
  public List<String> getQuestionsNotFound() {
    return questionsNotFound;
  }

  @JsonProperty("questionsNotFound")
  public void setQuestionsNotFound(List<String> questionsNotFound) {
    this.questionsNotFound = questionsNotFound;
  }

  public QuestionsAnswersIncorrect addQuestionsNotFoundItem(String questionsNotFoundItem) {
    if (this.questionsNotFound == null) {
      this.questionsNotFound = new ArrayList<>();
    }

    this.questionsNotFound.add(questionsNotFoundItem);
    return this;
  }

  public QuestionsAnswersIncorrect removeQuestionsNotFoundItem(String questionsNotFoundItem) {
    if (questionsNotFoundItem != null && this.questionsNotFound != null) {
      this.questionsNotFound.remove(questionsNotFoundItem);
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
    QuestionsAnswersIncorrect questionsAnswersIncorrect = (QuestionsAnswersIncorrect) o;
    return Objects.equals(this.code, questionsAnswersIncorrect.code) &&
        Objects.equals(this.devMsg, questionsAnswersIncorrect.devMsg) &&
        Objects.equals(this.msg, questionsAnswersIncorrect.msg) &&
        Objects.equals(this.incorrectAnswers, questionsAnswersIncorrect.incorrectAnswers) &&
        Objects.equals(this.requiresMoreAnswers, questionsAnswersIncorrect.requiresMoreAnswers) &&
        Objects.equals(this.questionsNotFound, questionsAnswersIncorrect.questionsNotFound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, devMsg, msg, incorrectAnswers, requiresMoreAnswers, questionsNotFound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionsAnswersIncorrect {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    devMsg: ").append(toIndentedString(devMsg)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    incorrectAnswers: ").append(toIndentedString(incorrectAnswers)).append("\n");
    sb.append("    requiresMoreAnswers: ").append(toIndentedString(requiresMoreAnswers)).append("\n");
    sb.append("    questionsNotFound: ").append(toIndentedString(questionsNotFound)).append("\n");
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

