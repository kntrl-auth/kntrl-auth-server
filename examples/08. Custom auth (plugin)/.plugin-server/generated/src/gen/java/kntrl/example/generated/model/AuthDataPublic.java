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



@JsonTypeName("AuthData_public")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T19:23:38.989036+03:00[Europe/Kiev]")
public class AuthDataPublic extends HashMap<String, Object>  {
  private @Valid String email;
  private @Valid Long updatedAt;
  private @Valid Map<String, Long> questionsSavedAt = null;

  /**
   * User email.
   **/
  public AuthDataPublic email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(value = "User email.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  @JsonProperty("email")
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Time when password was updated last time.
   **/
  public AuthDataPublic updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(value = "Time when password was updated last time.")
  @JsonProperty("updatedAt")
  public Long getUpdatedAt() {
    return updatedAt;
  }

  @JsonProperty("updatedAt")
  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   **/
  public AuthDataPublic questionsSavedAt(Map<String, Long> questionsSavedAt) {
    this.questionsSavedAt = questionsSavedAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("questionsSavedAt")
  public Map<String, Long> getQuestionsSavedAt() {
    return questionsSavedAt;
  }

  @JsonProperty("questionsSavedAt")
  public void setQuestionsSavedAt(Map<String, Long> questionsSavedAt) {
    this.questionsSavedAt = questionsSavedAt;
  }

  public AuthDataPublic putQuestionsSavedAtItem(String key, Long questionsSavedAtItem) {
    if (this.questionsSavedAt == null) {
      this.questionsSavedAt = new HashMap<>();
    }

    this.questionsSavedAt.put(key, questionsSavedAtItem);
    return this;
  }

  public AuthDataPublic removeQuestionsSavedAtItem(Long questionsSavedAtItem) {
    if (questionsSavedAtItem != null && this.questionsSavedAt != null) {
      this.questionsSavedAt.remove(questionsSavedAtItem);
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
    AuthDataPublic authDataPublic = (AuthDataPublic) o;
    return Objects.equals(this.email, authDataPublic.email) &&
        Objects.equals(this.updatedAt, authDataPublic.updatedAt) &&
        Objects.equals(this.questionsSavedAt, authDataPublic.questionsSavedAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, updatedAt, questionsSavedAt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthDataPublic {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    questionsSavedAt: ").append(toIndentedString(questionsSavedAt)).append("\n");
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

