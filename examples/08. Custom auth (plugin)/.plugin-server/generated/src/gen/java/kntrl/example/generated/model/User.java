package kntrl.example.generated.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kntrl.example.generated.model.AuthUserCfg;
import kntrl.example.generated.model.Login;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("User")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-21T17:10:42.806916+03:00[Europe/Kiev]")
public class User   {
  private @Valid String id;
  private @Valid List<Login> logins = new ArrayList<>();
  private @Valid Map<String, AuthUserCfg> auths = new HashMap<>();
  private @Valid Set<String> factors = new LinkedHashSet<>();
  private @Valid Long signedUpAt;
  private @Valid Long updatedAt;
  private @Valid Boolean systemAccess;

  /**
   * Generated user uuid 
   **/
  public User id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "2c24704f-198a-4bc4-9718-306ccc97bbdc", required = true, value = "Generated user uuid ")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public User logins(List<Login> logins) {
    this.logins = logins;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("logins")
  @NotNull
  public List<Login> getLogins() {
    return logins;
  }

  @JsonProperty("logins")
  public void setLogins(List<Login> logins) {
    this.logins = logins;
  }

  public User addLoginsItem(Login loginsItem) {
    if (this.logins == null) {
      this.logins = new ArrayList<>();
    }

    this.logins.add(loginsItem);
    return this;
  }

  public User removeLoginsItem(Login loginsItem) {
    if (loginsItem != null && this.logins != null) {
      this.logins.remove(loginsItem);
    }

    return this;
  }
  /**
   * Public data of confirmed auths and sent codes for unconfirmed auths. 
   **/
  public User auths(Map<String, AuthUserCfg> auths) {
    this.auths = auths;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Public data of confirmed auths and sent codes for unconfirmed auths. ")
  @JsonProperty("auths")
  @NotNull
  public Map<String, AuthUserCfg> getAuths() {
    return auths;
  }

  @JsonProperty("auths")
  public void setAuths(Map<String, AuthUserCfg> auths) {
    this.auths = auths;
  }

  public User putAuthsItem(String key, AuthUserCfg authsItem) {
    if (this.auths == null) {
      this.auths = new HashMap<>();
    }

    this.auths.put(key, authsItem);
    return this;
  }

  public User removeAuthsItem(AuthUserCfg authsItem) {
    if (authsItem != null && this.auths != null) {
      this.auths.remove(authsItem);
    }

    return this;
  }
  /**
   * Enabled factors
   **/
  public User factors(Set<String> factors) {
    this.factors = factors;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Enabled factors")
  @JsonProperty("factors")
  @NotNull
  public Set<String> getFactors() {
    return factors;
  }

  @JsonProperty("factors")
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setFactors(Set<String> factors) {
    this.factors = factors;
  }

  public User addFactorsItem(String factorsItem) {
    if (this.factors == null) {
      this.factors = new LinkedHashSet<>();
    }

    this.factors.add(factorsItem);
    return this;
  }

  public User removeFactorsItem(String factorsItem) {
    if (factorsItem != null && this.factors != null) {
      this.factors.remove(factorsItem);
    }

    return this;
  }
  /**
   **/
  public User signedUpAt(Long signedUpAt) {
    this.signedUpAt = signedUpAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("signedUpAt")
  @NotNull
  public Long getSignedUpAt() {
    return signedUpAt;
  }

  @JsonProperty("signedUpAt")
  public void setSignedUpAt(Long signedUpAt) {
    this.signedUpAt = signedUpAt;
  }

  /**
   **/
  public User updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("updatedAt")
  @NotNull
  public Long getUpdatedAt() {
    return updatedAt;
  }

  @JsonProperty("updatedAt")
  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Allows to access to any user in the app.
   **/
  public User systemAccess(Boolean systemAccess) {
    this.systemAccess = systemAccess;
    return this;
  }

  
  @ApiModelProperty(value = "Allows to access to any user in the app.")
  @JsonProperty("systemAccess")
  public Boolean getSystemAccess() {
    return systemAccess;
  }

  @JsonProperty("systemAccess")
  public void setSystemAccess(Boolean systemAccess) {
    this.systemAccess = systemAccess;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.logins, user.logins) &&
        Objects.equals(this.auths, user.auths) &&
        Objects.equals(this.factors, user.factors) &&
        Objects.equals(this.signedUpAt, user.signedUpAt) &&
        Objects.equals(this.updatedAt, user.updatedAt) &&
        Objects.equals(this.systemAccess, user.systemAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, logins, auths, factors, signedUpAt, updatedAt, systemAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logins: ").append(toIndentedString(logins)).append("\n");
    sb.append("    auths: ").append(toIndentedString(auths)).append("\n");
    sb.append("    factors: ").append(toIndentedString(factors)).append("\n");
    sb.append("    signedUpAt: ").append(toIndentedString(signedUpAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    systemAccess: ").append(toIndentedString(systemAccess)).append("\n");
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

