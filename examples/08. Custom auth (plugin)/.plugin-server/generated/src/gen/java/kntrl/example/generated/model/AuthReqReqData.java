package kntrl.example.generated.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
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



@JsonTypeName("AuthReq_reqData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T19:23:38.989036+03:00[Europe/Kiev]")
public class AuthReqReqData extends HashMap<String, Object>  {
  private @Valid String secret;
  private @Valid String email;
  private @Valid String template;
  private @Valid String accessToken;
  private @Valid String authorizationCode;
  private @Valid String password;
  private @Valid String confirmPassword;
  private @Valid Map<String, String> answers = null;

  /**
   **/
  public AuthReqReqData secret(String secret) {
    this.secret = secret;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("secret")
  public String getSecret() {
    return secret;
  }

  @JsonProperty("secret")
  public void setSecret(String secret) {
    this.secret = secret;
  }

  /**
   * New email to set.
   **/
  public AuthReqReqData email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(value = "New email to set.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  @JsonProperty("email")
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Template to use.
   **/
  public AuthReqReqData template(String template) {
    this.template = template;
    return this;
  }

  
  @ApiModelProperty(value = "Template to use.")
  @JsonProperty("template")
  public String getTemplate() {
    return template;
  }

  @JsonProperty("template")
  public void setTemplate(String template) {
    this.template = template;
  }

  /**
   * If you have access-token - put it here.
   **/
  public AuthReqReqData accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  
  @ApiModelProperty(value = "If you have access-token - put it here.")
  @JsonProperty("accessToken")
  public String getAccessToken() {
    return accessToken;
  }

  @JsonProperty("accessToken")
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   * If you have authorisation-code - app will exchange it for access-token.
   **/
  public AuthReqReqData authorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
    return this;
  }

  
  @ApiModelProperty(value = "If you have authorisation-code - app will exchange it for access-token.")
  @JsonProperty("authorizationCode")
  public String getAuthorizationCode() {
    return authorizationCode;
  }

  @JsonProperty("authorizationCode")
  public void setAuthorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
  }

  /**
   * New password to set. If null app generates password automatically.
   **/
  public AuthReqReqData password(String password) {
    this.password = password;
    return this;
  }

  
  @ApiModelProperty(value = "New password to set. If null app generates password automatically.")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  @JsonProperty("password")
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Password confirmation. If null app doesn&#39;t perform this check.
   **/
  public AuthReqReqData confirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
    return this;
  }

  
  @ApiModelProperty(value = "Password confirmation. If null app doesn't perform this check.")
  @JsonProperty("confirmPassword")
  public String getConfirmPassword() {
    return confirmPassword;
  }

  @JsonProperty("confirmPassword")
  public void setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
  }

  /**
   * Answers to save. &#x60;null&#x60; as value removes answer 
   **/
  public AuthReqReqData answers(Map<String, String> answers) {
    this.answers = answers;
    return this;
  }

  
  @ApiModelProperty(example = "{\"HOME_CITY\":\"London\",\"MOTHER_NAME\":null}", value = "Answers to save. `null` as value removes answer ")
  @JsonProperty("answers")
  public Map<String, String> getAnswers() {
    return answers;
  }

  @JsonProperty("answers")
  public void setAnswers(Map<String, String> answers) {
    this.answers = answers;
  }

  public AuthReqReqData putAnswersItem(String key, String answersItem) {
    if (this.answers == null) {
      this.answers = new HashMap<>();
    }

    this.answers.put(key, answersItem);
    return this;
  }

  public AuthReqReqData removeAnswersItem(String answersItem) {
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
    AuthReqReqData authReqReqData = (AuthReqReqData) o;
    return Objects.equals(this.secret, authReqReqData.secret) &&
        Objects.equals(this.email, authReqReqData.email) &&
        Objects.equals(this.template, authReqReqData.template) &&
        Objects.equals(this.accessToken, authReqReqData.accessToken) &&
        Objects.equals(this.authorizationCode, authReqReqData.authorizationCode) &&
        Objects.equals(this.password, authReqReqData.password) &&
        Objects.equals(this.confirmPassword, authReqReqData.confirmPassword) &&
        Objects.equals(this.answers, authReqReqData.answers) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secret, email, template, accessToken, authorizationCode, password, confirmPassword, answers, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthReqReqData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    authorizationCode: ").append(toIndentedString(authorizationCode)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    confirmPassword: ").append(toIndentedString(confirmPassword)).append("\n");
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

