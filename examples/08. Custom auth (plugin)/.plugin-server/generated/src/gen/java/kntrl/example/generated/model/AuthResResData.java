package kntrl.example.generated.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
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

/**
 * This data will be sent back to the client.
 **/
@ApiModel(description = "This data will be sent back to the client.")
@JsonTypeName("AuthRes_resData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T19:23:38.989036+03:00[Europe/Kiev]")
public class AuthResResData extends HashMap<String, Object>  {
  private @Valid String emailSentTo;
  private @Valid String ipEncoded;
  private @Valid String login;
  private @Valid Map<String, Object> publicData = null;
  private @Valid String password;
  private @Valid String strength;
  private @Valid Map<String, Boolean> correct = null;
  private @Valid AuthResResDataAnswersSavedAt answersSavedAt;

  /**
   * Shows user email, that was used to send a code. Email will be partially hidden.
   **/
  public AuthResResData emailSentTo(String emailSentTo) {
    this.emailSentTo = emailSentTo;
    return this;
  }

  
  @ApiModelProperty(value = "Shows user email, that was used to send a code. Email will be partially hidden.")
  @JsonProperty("emailSentTo")
  public String getEmailSentTo() {
    return emailSentTo;
  }

  @JsonProperty("emailSentTo")
  public void setEmailSentTo(String emailSentTo) {
    this.emailSentTo = emailSentTo;
  }

  /**
   **/
  public AuthResResData ipEncoded(String ipEncoded) {
    this.ipEncoded = ipEncoded;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ipEncoded")
  public String getIpEncoded() {
    return ipEncoded;
  }

  @JsonProperty("ipEncoded")
  public void setIpEncoded(String ipEncoded) {
    this.ipEncoded = ipEncoded;
  }

  /**
   **/
  public AuthResResData login(String login) {
    this.login = login;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }

  @JsonProperty("login")
  public void setLogin(String login) {
    this.login = login;
  }

  /**
   **/
  public AuthResResData publicData(Map<String, Object> publicData) {
    this.publicData = publicData;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("publicData")
  public Map<String, Object> getPublicData() {
    return publicData;
  }

  @JsonProperty("publicData")
  public void setPublicData(Map<String, Object> publicData) {
    this.publicData = publicData;
  }

  public AuthResResData putPublicDataItem(String key, Object publicDataItem) {
    if (this.publicData == null) {
      this.publicData = new HashMap<>();
    }

    this.publicData.put(key, publicDataItem);
    return this;
  }

  public AuthResResData removePublicDataItem(Object publicDataItem) {
    if (publicDataItem != null && this.publicData != null) {
      this.publicData.remove(publicDataItem);
    }

    return this;
  }
  /**
   * If password was generated by app this field contains generated password.
   **/
  public AuthResResData password(String password) {
    this.password = password;
    return this;
  }

  
  @ApiModelProperty(value = "If password was generated by app this field contains generated password.")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  @JsonProperty("password")
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Calculated strength of password. Null means that all checks failed.
   **/
  public AuthResResData strength(String strength) {
    this.strength = strength;
    return this;
  }

  
  @ApiModelProperty(value = "Calculated strength of password. Null means that all checks failed.")
  @JsonProperty("strength")
  public String getStrength() {
    return strength;
  }

  @JsonProperty("strength")
  public void setStrength(String strength) {
    this.strength = strength;
  }

  /**
   * Shows is answer was correct. 
   **/
  public AuthResResData correct(Map<String, Boolean> correct) {
    this.correct = correct;
    return this;
  }

  
  @ApiModelProperty(example = "{\"HOME_CITY\":true,\"MOTHER_NAME\":false}", value = "Shows is answer was correct. ")
  @JsonProperty("correct")
  public Map<String, Boolean> getCorrect() {
    return correct;
  }

  @JsonProperty("correct")
  public void setCorrect(Map<String, Boolean> correct) {
    this.correct = correct;
  }

  public AuthResResData putCorrectItem(String key, Boolean correctItem) {
    if (this.correct == null) {
      this.correct = new HashMap<>();
    }

    this.correct.put(key, correctItem);
    return this;
  }

  public AuthResResData removeCorrectItem(Boolean correctItem) {
    if (correctItem != null && this.correct != null) {
      this.correct.remove(correctItem);
    }

    return this;
  }
  /**
   **/
  public AuthResResData answersSavedAt(AuthResResDataAnswersSavedAt answersSavedAt) {
    this.answersSavedAt = answersSavedAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("answersSavedAt")
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
    AuthResResData authResResData = (AuthResResData) o;
    return Objects.equals(this.emailSentTo, authResResData.emailSentTo) &&
        Objects.equals(this.ipEncoded, authResResData.ipEncoded) &&
        Objects.equals(this.login, authResResData.login) &&
        Objects.equals(this.publicData, authResResData.publicData) &&
        Objects.equals(this.password, authResResData.password) &&
        Objects.equals(this.strength, authResResData.strength) &&
        Objects.equals(this.correct, authResResData.correct) &&
        Objects.equals(this.answersSavedAt, authResResData.answersSavedAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailSentTo, ipEncoded, login, publicData, password, strength, correct, answersSavedAt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthResResData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    emailSentTo: ").append(toIndentedString(emailSentTo)).append("\n");
    sb.append("    ipEncoded: ").append(toIndentedString(ipEncoded)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    publicData: ").append(toIndentedString(publicData)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    strength: ").append(toIndentedString(strength)).append("\n");
    sb.append("    correct: ").append(toIndentedString(correct)).append("\n");
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
