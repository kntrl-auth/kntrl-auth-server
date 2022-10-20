package kntrl.example.generated.model;

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



@JsonTypeName("PasswordHistory")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T19:23:38.989036+03:00[Europe/Kiev]")
public class PasswordHistory extends HashMap<String, Object>  {
  private @Valid List<Password> passwords = null;
  private @Valid Long changedAt;

  /**
   **/
  public PasswordHistory passwords(List<Password> passwords) {
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

  public PasswordHistory addPasswordsItem(Password passwordsItem) {
    if (this.passwords == null) {
      this.passwords = new ArrayList<>();
    }

    this.passwords.add(passwordsItem);
    return this;
  }

  public PasswordHistory removePasswordsItem(Password passwordsItem) {
    if (passwordsItem != null && this.passwords != null) {
      this.passwords.remove(passwordsItem);
    }

    return this;
  }
  /**
   **/
  public PasswordHistory changedAt(Long changedAt) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordHistory passwordHistory = (PasswordHistory) o;
    return Objects.equals(this.passwords, passwordHistory.passwords) &&
        Objects.equals(this.changedAt, passwordHistory.changedAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwords, changedAt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordHistory {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    passwords: ").append(toIndentedString(passwords)).append("\n");
    sb.append("    changedAt: ").append(toIndentedString(changedAt)).append("\n");
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

