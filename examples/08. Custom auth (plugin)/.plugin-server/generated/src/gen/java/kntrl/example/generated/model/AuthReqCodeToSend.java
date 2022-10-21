package kntrl.example.generated.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Generated code. Will be null if no code-config specified.
 **/
@ApiModel(description = "Generated code. Will be null if no code-config specified.")
@JsonTypeName("AuthReq_codeToSend")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-21T17:10:42.806916+03:00[Europe/Kiev]")
public class AuthReqCodeToSend   {
  private @Valid Long validUntil;
  private @Valid Integer usedAttempts;
  private @Valid Integer attemptsLeft;
  private @Valid String codeHash;
  private @Valid Long sentAt;
  private @Valid String code;

  /**
   **/
  public AuthReqCodeToSend validUntil(Long validUntil) {
    this.validUntil = validUntil;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("validUntil")
  @NotNull
  public Long getValidUntil() {
    return validUntil;
  }

  @JsonProperty("validUntil")
  public void setValidUntil(Long validUntil) {
    this.validUntil = validUntil;
  }

  /**
   **/
  public AuthReqCodeToSend usedAttempts(Integer usedAttempts) {
    this.usedAttempts = usedAttempts;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("usedAttempts")
  @NotNull
  public Integer getUsedAttempts() {
    return usedAttempts;
  }

  @JsonProperty("usedAttempts")
  public void setUsedAttempts(Integer usedAttempts) {
    this.usedAttempts = usedAttempts;
  }

  /**
   **/
  public AuthReqCodeToSend attemptsLeft(Integer attemptsLeft) {
    this.attemptsLeft = attemptsLeft;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("attemptsLeft")
  @NotNull
  public Integer getAttemptsLeft() {
    return attemptsLeft;
  }

  @JsonProperty("attemptsLeft")
  public void setAttemptsLeft(Integer attemptsLeft) {
    this.attemptsLeft = attemptsLeft;
  }

  /**
   **/
  public AuthReqCodeToSend codeHash(String codeHash) {
    this.codeHash = codeHash;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("codeHash")
  @NotNull
  public String getCodeHash() {
    return codeHash;
  }

  @JsonProperty("codeHash")
  public void setCodeHash(String codeHash) {
    this.codeHash = codeHash;
  }

  /**
   **/
  public AuthReqCodeToSend sentAt(Long sentAt) {
    this.sentAt = sentAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sentAt")
  @NotNull
  public Long getSentAt() {
    return sentAt;
  }

  @JsonProperty("sentAt")
  public void setSentAt(Long sentAt) {
    this.sentAt = sentAt;
  }

  /**
   **/
  public AuthReqCodeToSend code(String code) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthReqCodeToSend authReqCodeToSend = (AuthReqCodeToSend) o;
    return Objects.equals(this.validUntil, authReqCodeToSend.validUntil) &&
        Objects.equals(this.usedAttempts, authReqCodeToSend.usedAttempts) &&
        Objects.equals(this.attemptsLeft, authReqCodeToSend.attemptsLeft) &&
        Objects.equals(this.codeHash, authReqCodeToSend.codeHash) &&
        Objects.equals(this.sentAt, authReqCodeToSend.sentAt) &&
        Objects.equals(this.code, authReqCodeToSend.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validUntil, usedAttempts, attemptsLeft, codeHash, sentAt, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthReqCodeToSend {\n");
    
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    usedAttempts: ").append(toIndentedString(usedAttempts)).append("\n");
    sb.append("    attemptsLeft: ").append(toIndentedString(attemptsLeft)).append("\n");
    sb.append("    codeHash: ").append(toIndentedString(codeHash)).append("\n");
    sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

