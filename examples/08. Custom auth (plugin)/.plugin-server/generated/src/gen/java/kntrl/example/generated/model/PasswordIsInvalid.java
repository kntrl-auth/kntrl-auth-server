package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kntrl.example.generated.model.LoginId;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PasswordIsInvalid")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-21T17:10:42.806916+03:00[Europe/Kiev]")
public class PasswordIsInvalid   {
  private @Valid String code;
  private @Valid String devMsg;
  private @Valid String msg;
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

  /**
   **/
  public PasswordIsInvalid code(String code) {
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
  public PasswordIsInvalid devMsg(String devMsg) {
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
  public PasswordIsInvalid msg(String msg) {
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
  public PasswordIsInvalid tooLong(Boolean tooLong) {
    this.tooLong = tooLong;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("tooLong")
  @NotNull
  public Boolean getTooLong() {
    return tooLong;
  }

  @JsonProperty("tooLong")
  public void setTooLong(Boolean tooLong) {
    this.tooLong = tooLong;
  }

  /**
   **/
  public PasswordIsInvalid tooShort(Boolean tooShort) {
    this.tooShort = tooShort;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("tooShort")
  @NotNull
  public Boolean getTooShort() {
    return tooShort;
  }

  @JsonProperty("tooShort")
  public void setTooShort(Boolean tooShort) {
    this.tooShort = tooShort;
  }

  /**
   **/
  public PasswordIsInvalid missingNumber(Boolean missingNumber) {
    this.missingNumber = missingNumber;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("missingNumber")
  @NotNull
  public Boolean getMissingNumber() {
    return missingNumber;
  }

  @JsonProperty("missingNumber")
  public void setMissingNumber(Boolean missingNumber) {
    this.missingNumber = missingNumber;
  }

  /**
   **/
  public PasswordIsInvalid missingSymbol(Boolean missingSymbol) {
    this.missingSymbol = missingSymbol;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("missingSymbol")
  @NotNull
  public Boolean getMissingSymbol() {
    return missingSymbol;
  }

  @JsonProperty("missingSymbol")
  public void setMissingSymbol(Boolean missingSymbol) {
    this.missingSymbol = missingSymbol;
  }

  /**
   **/
  public PasswordIsInvalid missingUpperCase(Boolean missingUpperCase) {
    this.missingUpperCase = missingUpperCase;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("missingUpperCase")
  @NotNull
  public Boolean getMissingUpperCase() {
    return missingUpperCase;
  }

  @JsonProperty("missingUpperCase")
  public void setMissingUpperCase(Boolean missingUpperCase) {
    this.missingUpperCase = missingUpperCase;
  }

  /**
   **/
  public PasswordIsInvalid missingLowerCase(Boolean missingLowerCase) {
    this.missingLowerCase = missingLowerCase;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("missingLowerCase")
  @NotNull
  public Boolean getMissingLowerCase() {
    return missingLowerCase;
  }

  @JsonProperty("missingLowerCase")
  public void setMissingLowerCase(Boolean missingLowerCase) {
    this.missingLowerCase = missingLowerCase;
  }

  /**
   **/
  public PasswordIsInvalid commonPassword(Boolean commonPassword) {
    this.commonPassword = commonPassword;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("commonPassword")
  @NotNull
  public Boolean getCommonPassword() {
    return commonPassword;
  }

  @JsonProperty("commonPassword")
  public void setCommonPassword(Boolean commonPassword) {
    this.commonPassword = commonPassword;
  }

  /**
   **/
  public PasswordIsInvalid wasUsedBeforeAt(Long wasUsedBeforeAt) {
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
  public PasswordIsInvalid matchesLogin(LoginId matchesLogin) {
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
  public PasswordIsInvalid passwordsMismatch(Boolean passwordsMismatch) {
    this.passwordsMismatch = passwordsMismatch;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("passwordsMismatch")
  @NotNull
  public Boolean getPasswordsMismatch() {
    return passwordsMismatch;
  }

  @JsonProperty("passwordsMismatch")
  public void setPasswordsMismatch(Boolean passwordsMismatch) {
    this.passwordsMismatch = passwordsMismatch;
  }

  /**
   **/
  public PasswordIsInvalid strength(String strength) {
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
  public PasswordIsInvalid wasUsedDaysAgo(Long wasUsedDaysAgo) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordIsInvalid passwordIsInvalid = (PasswordIsInvalid) o;
    return Objects.equals(this.code, passwordIsInvalid.code) &&
        Objects.equals(this.devMsg, passwordIsInvalid.devMsg) &&
        Objects.equals(this.msg, passwordIsInvalid.msg) &&
        Objects.equals(this.tooLong, passwordIsInvalid.tooLong) &&
        Objects.equals(this.tooShort, passwordIsInvalid.tooShort) &&
        Objects.equals(this.missingNumber, passwordIsInvalid.missingNumber) &&
        Objects.equals(this.missingSymbol, passwordIsInvalid.missingSymbol) &&
        Objects.equals(this.missingUpperCase, passwordIsInvalid.missingUpperCase) &&
        Objects.equals(this.missingLowerCase, passwordIsInvalid.missingLowerCase) &&
        Objects.equals(this.commonPassword, passwordIsInvalid.commonPassword) &&
        Objects.equals(this.wasUsedBeforeAt, passwordIsInvalid.wasUsedBeforeAt) &&
        Objects.equals(this.matchesLogin, passwordIsInvalid.matchesLogin) &&
        Objects.equals(this.passwordsMismatch, passwordIsInvalid.passwordsMismatch) &&
        Objects.equals(this.strength, passwordIsInvalid.strength) &&
        Objects.equals(this.wasUsedDaysAgo, passwordIsInvalid.wasUsedDaysAgo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, devMsg, msg, tooLong, tooShort, missingNumber, missingSymbol, missingUpperCase, missingLowerCase, commonPassword, wasUsedBeforeAt, matchesLogin, passwordsMismatch, strength, wasUsedDaysAgo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordIsInvalid {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    devMsg: ").append(toIndentedString(devMsg)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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

