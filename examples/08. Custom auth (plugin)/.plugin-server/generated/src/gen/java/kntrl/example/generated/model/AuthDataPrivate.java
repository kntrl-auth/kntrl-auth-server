package kntrl.example.generated.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kntrl.example.generated.model.Password;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AuthData_private")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T22:48:57.779152+03:00[Europe/Kiev]")
public class AuthDataPrivate extends HashMap<String, Object>  {
  private @Valid Map<String, Long> encodedIps = null;
  private @Valid List<Password> passwords = null;
  private @Valid Long changedAt;
  private @Valid Map<String, String> questions = null;

  /**
   **/
  public AuthDataPrivate encodedIps(Map<String, Long> encodedIps) {
    this.encodedIps = encodedIps;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("encodedIps")
  public Map<String, Long> getEncodedIps() {
    return encodedIps;
  }

  @JsonProperty("encodedIps")
  public void setEncodedIps(Map<String, Long> encodedIps) {
    this.encodedIps = encodedIps;
  }

  public AuthDataPrivate putEncodedIpsItem(String key, Long encodedIpsItem) {
    if (this.encodedIps == null) {
      this.encodedIps = new HashMap<>();
    }

    this.encodedIps.put(key, encodedIpsItem);
    return this;
  }

  public AuthDataPrivate removeEncodedIpsItem(Long encodedIpsItem) {
    if (encodedIpsItem != null && this.encodedIps != null) {
      this.encodedIps.remove(encodedIpsItem);
    }

    return this;
  }
  /**
   **/
  public AuthDataPrivate passwords(List<Password> passwords) {
    this.passwords = passwords;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("passwords")
  public List<Password> getPasswords() {
    return passwords;
  }

  @JsonProperty("passwords")
  public void setPasswords(List<Password> passwords) {
    this.passwords = passwords;
  }

  public AuthDataPrivate addPasswordsItem(Password passwordsItem) {
    if (this.passwords == null) {
      this.passwords = new ArrayList<>();
    }

    this.passwords.add(passwordsItem);
    return this;
  }

  public AuthDataPrivate removePasswordsItem(Password passwordsItem) {
    if (passwordsItem != null && this.passwords != null) {
      this.passwords.remove(passwordsItem);
    }

    return this;
  }
  /**
   **/
  public AuthDataPrivate changedAt(Long changedAt) {
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
  public AuthDataPrivate questions(Map<String, String> questions) {
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

  public AuthDataPrivate putQuestionsItem(String key, String questionsItem) {
    if (this.questions == null) {
      this.questions = new HashMap<>();
    }

    this.questions.put(key, questionsItem);
    return this;
  }

  public AuthDataPrivate removeQuestionsItem(String questionsItem) {
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
    AuthDataPrivate authDataPrivate = (AuthDataPrivate) o;
    return Objects.equals(this.encodedIps, authDataPrivate.encodedIps) &&
        Objects.equals(this.passwords, authDataPrivate.passwords) &&
        Objects.equals(this.changedAt, authDataPrivate.changedAt) &&
        Objects.equals(this.questions, authDataPrivate.questions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodedIps, passwords, changedAt, questions, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthDataPrivate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    encodedIps: ").append(toIndentedString(encodedIps)).append("\n");
    sb.append("    passwords: ").append(toIndentedString(passwords)).append("\n");
    sb.append("    changedAt: ").append(toIndentedString(changedAt)).append("\n");
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

