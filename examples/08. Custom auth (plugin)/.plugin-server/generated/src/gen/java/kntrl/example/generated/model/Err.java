package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kntrl.example.generated.model.AnswerErr;
import kntrl.example.generated.model.LoginId;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Err")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-21T17:10:42.806916+03:00[Europe/Kiev]")
public class Err extends HashMap<String, Object>  {
  private @Valid String code;
  private @Valid String devMsg;
  private @Valid String msg;
  private @Valid Long changedAt;
  private @Valid Long changedDaysAgo;
  private @Valid Boolean tooLong;
  private @Valid Boolean tooShort;
  private @Valid Boolean missingNumber;
  private @Valid Boolean missingSymbol;
  private @Valid Boolean missingUpperCase;
  private @Valid Boolean missingLowerCase;
  private @Valid Boolean commonPassword;
  private @Valid Long wasUsedBeforeAt;
  private @Valid LoginId matchesLogin;
  private @Valid Boolean passwordsMismatch;
  private @Valid String strength;
  private @Valid Long wasUsedDaysAgo;
  private @Valid List<String> incorrectAnswers = null;
  private @Valid Boolean requiresMoreAnswers;
  private @Valid List<String> questionsNotFound = null;
  private @Valid Map<String, AnswerErr> invalidAnswers = null;
  private @Valid Boolean tooManyAnswers;
  private @Valid Integer waitTimeMs;
  private @Valid Integer waitTimeSeconds;
  private @Valid Integer waitTimeMinutes;
  private @Valid Long expiredAt;
  private @Valid LoginId loginId;

  /**
   **/
  public Err code(String code) {
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
  public Err devMsg(String devMsg) {
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
  public Err msg(String msg) {
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
  public Err changedAt(Long changedAt) {
    this.changedAt = changedAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("changedAt")
  public Long getChangedAt() {
    return changedAt;
  }

  @JsonProperty("changedAt")
  public void setChangedAt(Long changedAt) {
    this.changedAt = changedAt;
  }

  /**
   **/
  public Err changedDaysAgo(Long changedDaysAgo) {
    this.changedDaysAgo = changedDaysAgo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("changedDaysAgo")
  public Long getChangedDaysAgo() {
    return changedDaysAgo;
  }

  @JsonProperty("changedDaysAgo")
  public void setChangedDaysAgo(Long changedDaysAgo) {
    this.changedDaysAgo = changedDaysAgo;
  }

  /**
   **/
  public Err tooLong(Boolean tooLong) {
    this.tooLong = tooLong;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tooLong")
  public Boolean getTooLong() {
    return tooLong;
  }

  @JsonProperty("tooLong")
  public void setTooLong(Boolean tooLong) {
    this.tooLong = tooLong;
  }

  /**
   **/
  public Err tooShort(Boolean tooShort) {
    this.tooShort = tooShort;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
  public Err missingNumber(Boolean missingNumber) {
    this.missingNumber = missingNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("missingNumber")
  public Boolean getMissingNumber() {
    return missingNumber;
  }

  @JsonProperty("missingNumber")
  public void setMissingNumber(Boolean missingNumber) {
    this.missingNumber = missingNumber;
  }

  /**
   **/
  public Err missingSymbol(Boolean missingSymbol) {
    this.missingSymbol = missingSymbol;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("missingSymbol")
  public Boolean getMissingSymbol() {
    return missingSymbol;
  }

  @JsonProperty("missingSymbol")
  public void setMissingSymbol(Boolean missingSymbol) {
    this.missingSymbol = missingSymbol;
  }

  /**
   **/
  public Err missingUpperCase(Boolean missingUpperCase) {
    this.missingUpperCase = missingUpperCase;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("missingUpperCase")
  public Boolean getMissingUpperCase() {
    return missingUpperCase;
  }

  @JsonProperty("missingUpperCase")
  public void setMissingUpperCase(Boolean missingUpperCase) {
    this.missingUpperCase = missingUpperCase;
  }

  /**
   **/
  public Err missingLowerCase(Boolean missingLowerCase) {
    this.missingLowerCase = missingLowerCase;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("missingLowerCase")
  public Boolean getMissingLowerCase() {
    return missingLowerCase;
  }

  @JsonProperty("missingLowerCase")
  public void setMissingLowerCase(Boolean missingLowerCase) {
    this.missingLowerCase = missingLowerCase;
  }

  /**
   **/
  public Err commonPassword(Boolean commonPassword) {
    this.commonPassword = commonPassword;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("commonPassword")
  public Boolean getCommonPassword() {
    return commonPassword;
  }

  @JsonProperty("commonPassword")
  public void setCommonPassword(Boolean commonPassword) {
    this.commonPassword = commonPassword;
  }

  /**
   **/
  public Err wasUsedBeforeAt(Long wasUsedBeforeAt) {
    this.wasUsedBeforeAt = wasUsedBeforeAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("wasUsedBeforeAt")
  public Long getWasUsedBeforeAt() {
    return wasUsedBeforeAt;
  }

  @JsonProperty("wasUsedBeforeAt")
  public void setWasUsedBeforeAt(Long wasUsedBeforeAt) {
    this.wasUsedBeforeAt = wasUsedBeforeAt;
  }

  /**
   **/
  public Err matchesLogin(LoginId matchesLogin) {
    this.matchesLogin = matchesLogin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("matchesLogin")
  public LoginId getMatchesLogin() {
    return matchesLogin;
  }

  @JsonProperty("matchesLogin")
  public void setMatchesLogin(LoginId matchesLogin) {
    this.matchesLogin = matchesLogin;
  }

  /**
   **/
  public Err passwordsMismatch(Boolean passwordsMismatch) {
    this.passwordsMismatch = passwordsMismatch;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("passwordsMismatch")
  public Boolean getPasswordsMismatch() {
    return passwordsMismatch;
  }

  @JsonProperty("passwordsMismatch")
  public void setPasswordsMismatch(Boolean passwordsMismatch) {
    this.passwordsMismatch = passwordsMismatch;
  }

  /**
   **/
  public Err strength(String strength) {
    this.strength = strength;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("strength")
  public String getStrength() {
    return strength;
  }

  @JsonProperty("strength")
  public void setStrength(String strength) {
    this.strength = strength;
  }

  /**
   **/
  public Err wasUsedDaysAgo(Long wasUsedDaysAgo) {
    this.wasUsedDaysAgo = wasUsedDaysAgo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("wasUsedDaysAgo")
  public Long getWasUsedDaysAgo() {
    return wasUsedDaysAgo;
  }

  @JsonProperty("wasUsedDaysAgo")
  public void setWasUsedDaysAgo(Long wasUsedDaysAgo) {
    this.wasUsedDaysAgo = wasUsedDaysAgo;
  }

  /**
   **/
  public Err incorrectAnswers(List<String> incorrectAnswers) {
    this.incorrectAnswers = incorrectAnswers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("incorrectAnswers")
  public List<String> getIncorrectAnswers() {
    return incorrectAnswers;
  }

  @JsonProperty("incorrectAnswers")
  public void setIncorrectAnswers(List<String> incorrectAnswers) {
    this.incorrectAnswers = incorrectAnswers;
  }

  public Err addIncorrectAnswersItem(String incorrectAnswersItem) {
    if (this.incorrectAnswers == null) {
      this.incorrectAnswers = new ArrayList<>();
    }

    this.incorrectAnswers.add(incorrectAnswersItem);
    return this;
  }

  public Err removeIncorrectAnswersItem(String incorrectAnswersItem) {
    if (incorrectAnswersItem != null && this.incorrectAnswers != null) {
      this.incorrectAnswers.remove(incorrectAnswersItem);
    }

    return this;
  }
  /**
   **/
  public Err requiresMoreAnswers(Boolean requiresMoreAnswers) {
    this.requiresMoreAnswers = requiresMoreAnswers;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
  public Err questionsNotFound(List<String> questionsNotFound) {
    this.questionsNotFound = questionsNotFound;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("questionsNotFound")
  public List<String> getQuestionsNotFound() {
    return questionsNotFound;
  }

  @JsonProperty("questionsNotFound")
  public void setQuestionsNotFound(List<String> questionsNotFound) {
    this.questionsNotFound = questionsNotFound;
  }

  public Err addQuestionsNotFoundItem(String questionsNotFoundItem) {
    if (this.questionsNotFound == null) {
      this.questionsNotFound = new ArrayList<>();
    }

    this.questionsNotFound.add(questionsNotFoundItem);
    return this;
  }

  public Err removeQuestionsNotFoundItem(String questionsNotFoundItem) {
    if (questionsNotFoundItem != null && this.questionsNotFound != null) {
      this.questionsNotFound.remove(questionsNotFoundItem);
    }

    return this;
  }
  /**
   **/
  public Err invalidAnswers(Map<String, AnswerErr> invalidAnswers) {
    this.invalidAnswers = invalidAnswers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("invalidAnswers")
  public Map<String, AnswerErr> getInvalidAnswers() {
    return invalidAnswers;
  }

  @JsonProperty("invalidAnswers")
  public void setInvalidAnswers(Map<String, AnswerErr> invalidAnswers) {
    this.invalidAnswers = invalidAnswers;
  }

  public Err putInvalidAnswersItem(String key, AnswerErr invalidAnswersItem) {
    if (this.invalidAnswers == null) {
      this.invalidAnswers = new HashMap<>();
    }

    this.invalidAnswers.put(key, invalidAnswersItem);
    return this;
  }

  public Err removeInvalidAnswersItem(AnswerErr invalidAnswersItem) {
    if (invalidAnswersItem != null && this.invalidAnswers != null) {
      this.invalidAnswers.remove(invalidAnswersItem);
    }

    return this;
  }
  /**
   **/
  public Err tooManyAnswers(Boolean tooManyAnswers) {
    this.tooManyAnswers = tooManyAnswers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tooManyAnswers")
  public Boolean getTooManyAnswers() {
    return tooManyAnswers;
  }

  @JsonProperty("tooManyAnswers")
  public void setTooManyAnswers(Boolean tooManyAnswers) {
    this.tooManyAnswers = tooManyAnswers;
  }

  /**
   **/
  public Err waitTimeMs(Integer waitTimeMs) {
    this.waitTimeMs = waitTimeMs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("waitTimeMs")
  public Integer getWaitTimeMs() {
    return waitTimeMs;
  }

  @JsonProperty("waitTimeMs")
  public void setWaitTimeMs(Integer waitTimeMs) {
    this.waitTimeMs = waitTimeMs;
  }

  /**
   **/
  public Err waitTimeSeconds(Integer waitTimeSeconds) {
    this.waitTimeSeconds = waitTimeSeconds;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("waitTimeSeconds")
  public Integer getWaitTimeSeconds() {
    return waitTimeSeconds;
  }

  @JsonProperty("waitTimeSeconds")
  public void setWaitTimeSeconds(Integer waitTimeSeconds) {
    this.waitTimeSeconds = waitTimeSeconds;
  }

  /**
   **/
  public Err waitTimeMinutes(Integer waitTimeMinutes) {
    this.waitTimeMinutes = waitTimeMinutes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("waitTimeMinutes")
  public Integer getWaitTimeMinutes() {
    return waitTimeMinutes;
  }

  @JsonProperty("waitTimeMinutes")
  public void setWaitTimeMinutes(Integer waitTimeMinutes) {
    this.waitTimeMinutes = waitTimeMinutes;
  }

  /**
   **/
  public Err expiredAt(Long expiredAt) {
    this.expiredAt = expiredAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("expiredAt")
  public Long getExpiredAt() {
    return expiredAt;
  }

  @JsonProperty("expiredAt")
  public void setExpiredAt(Long expiredAt) {
    this.expiredAt = expiredAt;
  }

  /**
   **/
  public Err loginId(LoginId loginId) {
    this.loginId = loginId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("loginId")
  public LoginId getLoginId() {
    return loginId;
  }

  @JsonProperty("loginId")
  public void setLoginId(LoginId loginId) {
    this.loginId = loginId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Err err = (Err) o;
    return Objects.equals(this.code, err.code) &&
        Objects.equals(this.devMsg, err.devMsg) &&
        Objects.equals(this.msg, err.msg) &&
        Objects.equals(this.changedAt, err.changedAt) &&
        Objects.equals(this.changedDaysAgo, err.changedDaysAgo) &&
        Objects.equals(this.tooLong, err.tooLong) &&
        Objects.equals(this.tooShort, err.tooShort) &&
        Objects.equals(this.missingNumber, err.missingNumber) &&
        Objects.equals(this.missingSymbol, err.missingSymbol) &&
        Objects.equals(this.missingUpperCase, err.missingUpperCase) &&
        Objects.equals(this.missingLowerCase, err.missingLowerCase) &&
        Objects.equals(this.commonPassword, err.commonPassword) &&
        Objects.equals(this.wasUsedBeforeAt, err.wasUsedBeforeAt) &&
        Objects.equals(this.matchesLogin, err.matchesLogin) &&
        Objects.equals(this.passwordsMismatch, err.passwordsMismatch) &&
        Objects.equals(this.strength, err.strength) &&
        Objects.equals(this.wasUsedDaysAgo, err.wasUsedDaysAgo) &&
        Objects.equals(this.incorrectAnswers, err.incorrectAnswers) &&
        Objects.equals(this.requiresMoreAnswers, err.requiresMoreAnswers) &&
        Objects.equals(this.questionsNotFound, err.questionsNotFound) &&
        Objects.equals(this.invalidAnswers, err.invalidAnswers) &&
        Objects.equals(this.tooManyAnswers, err.tooManyAnswers) &&
        Objects.equals(this.waitTimeMs, err.waitTimeMs) &&
        Objects.equals(this.waitTimeSeconds, err.waitTimeSeconds) &&
        Objects.equals(this.waitTimeMinutes, err.waitTimeMinutes) &&
        Objects.equals(this.expiredAt, err.expiredAt) &&
        Objects.equals(this.loginId, err.loginId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, devMsg, msg, changedAt, changedDaysAgo, tooLong, tooShort, missingNumber, missingSymbol, missingUpperCase, missingLowerCase, commonPassword, wasUsedBeforeAt, matchesLogin, passwordsMismatch, strength, wasUsedDaysAgo, incorrectAnswers, requiresMoreAnswers, questionsNotFound, invalidAnswers, tooManyAnswers, waitTimeMs, waitTimeSeconds, waitTimeMinutes, expiredAt, loginId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Err {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    devMsg: ").append(toIndentedString(devMsg)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    changedAt: ").append(toIndentedString(changedAt)).append("\n");
    sb.append("    changedDaysAgo: ").append(toIndentedString(changedDaysAgo)).append("\n");
    sb.append("    tooLong: ").append(toIndentedString(tooLong)).append("\n");
    sb.append("    tooShort: ").append(toIndentedString(tooShort)).append("\n");
    sb.append("    missingNumber: ").append(toIndentedString(missingNumber)).append("\n");
    sb.append("    missingSymbol: ").append(toIndentedString(missingSymbol)).append("\n");
    sb.append("    missingUpperCase: ").append(toIndentedString(missingUpperCase)).append("\n");
    sb.append("    missingLowerCase: ").append(toIndentedString(missingLowerCase)).append("\n");
    sb.append("    commonPassword: ").append(toIndentedString(commonPassword)).append("\n");
    sb.append("    wasUsedBeforeAt: ").append(toIndentedString(wasUsedBeforeAt)).append("\n");
    sb.append("    matchesLogin: ").append(toIndentedString(matchesLogin)).append("\n");
    sb.append("    passwordsMismatch: ").append(toIndentedString(passwordsMismatch)).append("\n");
    sb.append("    strength: ").append(toIndentedString(strength)).append("\n");
    sb.append("    wasUsedDaysAgo: ").append(toIndentedString(wasUsedDaysAgo)).append("\n");
    sb.append("    incorrectAnswers: ").append(toIndentedString(incorrectAnswers)).append("\n");
    sb.append("    requiresMoreAnswers: ").append(toIndentedString(requiresMoreAnswers)).append("\n");
    sb.append("    questionsNotFound: ").append(toIndentedString(questionsNotFound)).append("\n");
    sb.append("    invalidAnswers: ").append(toIndentedString(invalidAnswers)).append("\n");
    sb.append("    tooManyAnswers: ").append(toIndentedString(tooManyAnswers)).append("\n");
    sb.append("    waitTimeMs: ").append(toIndentedString(waitTimeMs)).append("\n");
    sb.append("    waitTimeSeconds: ").append(toIndentedString(waitTimeSeconds)).append("\n");
    sb.append("    waitTimeMinutes: ").append(toIndentedString(waitTimeMinutes)).append("\n");
    sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
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

