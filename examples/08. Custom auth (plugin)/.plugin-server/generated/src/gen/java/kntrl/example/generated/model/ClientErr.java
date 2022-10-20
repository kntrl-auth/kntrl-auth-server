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



@JsonTypeName("ClientErr")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T22:48:57.779152+03:00[Europe/Kiev]")
public class ClientErr extends HashMap<String, Object>  {
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
  public ClientErr code(String code) {
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
  public ClientErr devMsg(String devMsg) {
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
  public ClientErr msg(String msg) {
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
  public ClientErr changedAt(Long changedAt) {
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
  public ClientErr changedDaysAgo(Long changedDaysAgo) {
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
  public ClientErr tooLong(Boolean tooLong) {
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
  public ClientErr tooShort(Boolean tooShort) {
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
  public ClientErr missingNumber(Boolean missingNumber) {
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
  public ClientErr missingSymbol(Boolean missingSymbol) {
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
  public ClientErr missingUpperCase(Boolean missingUpperCase) {
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
  public ClientErr missingLowerCase(Boolean missingLowerCase) {
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
  public ClientErr commonPassword(Boolean commonPassword) {
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
  public ClientErr wasUsedBeforeAt(Long wasUsedBeforeAt) {
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
  public ClientErr matchesLogin(LoginId matchesLogin) {
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
  public ClientErr passwordsMismatch(Boolean passwordsMismatch) {
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
  public ClientErr strength(String strength) {
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
  public ClientErr wasUsedDaysAgo(Long wasUsedDaysAgo) {
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
  public ClientErr incorrectAnswers(List<String> incorrectAnswers) {
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

  public ClientErr addIncorrectAnswersItem(String incorrectAnswersItem) {
    if (this.incorrectAnswers == null) {
      this.incorrectAnswers = new ArrayList<>();
    }

    this.incorrectAnswers.add(incorrectAnswersItem);
    return this;
  }

  public ClientErr removeIncorrectAnswersItem(String incorrectAnswersItem) {
    if (incorrectAnswersItem != null && this.incorrectAnswers != null) {
      this.incorrectAnswers.remove(incorrectAnswersItem);
    }

    return this;
  }
  /**
   **/
  public ClientErr requiresMoreAnswers(Boolean requiresMoreAnswers) {
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
  public ClientErr questionsNotFound(List<String> questionsNotFound) {
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

  public ClientErr addQuestionsNotFoundItem(String questionsNotFoundItem) {
    if (this.questionsNotFound == null) {
      this.questionsNotFound = new ArrayList<>();
    }

    this.questionsNotFound.add(questionsNotFoundItem);
    return this;
  }

  public ClientErr removeQuestionsNotFoundItem(String questionsNotFoundItem) {
    if (questionsNotFoundItem != null && this.questionsNotFound != null) {
      this.questionsNotFound.remove(questionsNotFoundItem);
    }

    return this;
  }
  /**
   **/
  public ClientErr invalidAnswers(Map<String, AnswerErr> invalidAnswers) {
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

  public ClientErr putInvalidAnswersItem(String key, AnswerErr invalidAnswersItem) {
    if (this.invalidAnswers == null) {
      this.invalidAnswers = new HashMap<>();
    }

    this.invalidAnswers.put(key, invalidAnswersItem);
    return this;
  }

  public ClientErr removeInvalidAnswersItem(AnswerErr invalidAnswersItem) {
    if (invalidAnswersItem != null && this.invalidAnswers != null) {
      this.invalidAnswers.remove(invalidAnswersItem);
    }

    return this;
  }
  /**
   **/
  public ClientErr tooManyAnswers(Boolean tooManyAnswers) {
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
  public ClientErr waitTimeMs(Integer waitTimeMs) {
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
  public ClientErr waitTimeSeconds(Integer waitTimeSeconds) {
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
  public ClientErr waitTimeMinutes(Integer waitTimeMinutes) {
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
  public ClientErr expiredAt(Long expiredAt) {
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
  public ClientErr loginId(LoginId loginId) {
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
    ClientErr clientErr = (ClientErr) o;
    return Objects.equals(this.code, clientErr.code) &&
        Objects.equals(this.devMsg, clientErr.devMsg) &&
        Objects.equals(this.msg, clientErr.msg) &&
        Objects.equals(this.changedAt, clientErr.changedAt) &&
        Objects.equals(this.changedDaysAgo, clientErr.changedDaysAgo) &&
        Objects.equals(this.tooLong, clientErr.tooLong) &&
        Objects.equals(this.tooShort, clientErr.tooShort) &&
        Objects.equals(this.missingNumber, clientErr.missingNumber) &&
        Objects.equals(this.missingSymbol, clientErr.missingSymbol) &&
        Objects.equals(this.missingUpperCase, clientErr.missingUpperCase) &&
        Objects.equals(this.missingLowerCase, clientErr.missingLowerCase) &&
        Objects.equals(this.commonPassword, clientErr.commonPassword) &&
        Objects.equals(this.wasUsedBeforeAt, clientErr.wasUsedBeforeAt) &&
        Objects.equals(this.matchesLogin, clientErr.matchesLogin) &&
        Objects.equals(this.passwordsMismatch, clientErr.passwordsMismatch) &&
        Objects.equals(this.strength, clientErr.strength) &&
        Objects.equals(this.wasUsedDaysAgo, clientErr.wasUsedDaysAgo) &&
        Objects.equals(this.incorrectAnswers, clientErr.incorrectAnswers) &&
        Objects.equals(this.requiresMoreAnswers, clientErr.requiresMoreAnswers) &&
        Objects.equals(this.questionsNotFound, clientErr.questionsNotFound) &&
        Objects.equals(this.invalidAnswers, clientErr.invalidAnswers) &&
        Objects.equals(this.tooManyAnswers, clientErr.tooManyAnswers) &&
        Objects.equals(this.waitTimeMs, clientErr.waitTimeMs) &&
        Objects.equals(this.waitTimeSeconds, clientErr.waitTimeSeconds) &&
        Objects.equals(this.waitTimeMinutes, clientErr.waitTimeMinutes) &&
        Objects.equals(this.expiredAt, clientErr.expiredAt) &&
        Objects.equals(this.loginId, clientErr.loginId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, devMsg, msg, changedAt, changedDaysAgo, tooLong, tooShort, missingNumber, missingSymbol, missingUpperCase, missingLowerCase, commonPassword, wasUsedBeforeAt, matchesLogin, passwordsMismatch, strength, wasUsedDaysAgo, incorrectAnswers, requiresMoreAnswers, questionsNotFound, invalidAnswers, tooManyAnswers, waitTimeMs, waitTimeSeconds, waitTimeMinutes, expiredAt, loginId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientErr {\n");
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

