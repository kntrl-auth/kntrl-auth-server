package kntrl.example.generated.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kntrl.example.generated.model.AuthUserCfg;
import kntrl.example.generated.model.Login;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * User loaded from database. Can be null if user isn&#39;t identified yet.
 **/

@JsonTypeName("AuthReq_user")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-22T00:20:30.250260+03:00[Europe/Kiev]")
public class AuthReqUser   {
  private String id;
  private List<Login> logins = new ArrayList<>();
  private Map<String, AuthUserCfg> auths = new HashMap<>();
  private Set<String> factors = new LinkedHashSet<>();
  private Long signedUpAt;
  private Long updatedAt;
  private Boolean systemAccess;

  /**
   * Generated user uuid 
   **/
  public AuthReqUser id(String id) {
    this.id = id;
    return this;
  }

  
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public AuthReqUser logins(List<Login> logins) {
    this.logins = logins;
    return this;
  }

  
  @JsonProperty("logins")
  public List<Login> getLogins() {
    return logins;
  }

  @JsonProperty("logins")
  public void setLogins(List<Login> logins) {
    this.logins = logins;
  }

  public AuthReqUser addLoginsItem(Login loginsItem) {
    if (this.logins == null) {
      this.logins = new ArrayList<>();
    }

    this.logins.add(loginsItem);
    return this;
  }

  public AuthReqUser removeLoginsItem(Login loginsItem) {
    if (loginsItem != null && this.logins != null) {
      this.logins.remove(loginsItem);
    }

    return this;
  }
  /**
   * Public data of confirmed auths and sent codes for unconfirmed auths. 
   **/
  public AuthReqUser auths(Map<String, AuthUserCfg> auths) {
    this.auths = auths;
    return this;
  }

  
  @JsonProperty("auths")
  public Map<String, AuthUserCfg> getAuths() {
    return auths;
  }

  @JsonProperty("auths")
  public void setAuths(Map<String, AuthUserCfg> auths) {
    this.auths = auths;
  }

  public AuthReqUser putAuthsItem(String key, AuthUserCfg authsItem) {
    if (this.auths == null) {
      this.auths = new HashMap<>();
    }

    this.auths.put(key, authsItem);
    return this;
  }

  public AuthReqUser removeAuthsItem(AuthUserCfg authsItem) {
    if (authsItem != null && this.auths != null) {
      this.auths.remove(authsItem);
    }

    return this;
  }
  /**
   * Enabled factors
   **/
  public AuthReqUser factors(Set<String> factors) {
    this.factors = factors;
    return this;
  }

  
  @JsonProperty("factors")
  public Set<String> getFactors() {
    return factors;
  }

  @JsonProperty("factors")
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setFactors(Set<String> factors) {
    this.factors = factors;
  }

  public AuthReqUser addFactorsItem(String factorsItem) {
    if (this.factors == null) {
      this.factors = new LinkedHashSet<>();
    }

    this.factors.add(factorsItem);
    return this;
  }

  public AuthReqUser removeFactorsItem(String factorsItem) {
    if (factorsItem != null && this.factors != null) {
      this.factors.remove(factorsItem);
    }

    return this;
  }
  /**
   **/
  public AuthReqUser signedUpAt(Long signedUpAt) {
    this.signedUpAt = signedUpAt;
    return this;
  }

  
  @JsonProperty("signedUpAt")
  public Long getSignedUpAt() {
    return signedUpAt;
  }

  @JsonProperty("signedUpAt")
  public void setSignedUpAt(Long signedUpAt) {
    this.signedUpAt = signedUpAt;
  }

  /**
   **/
  public AuthReqUser updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @JsonProperty("updatedAt")
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
  public AuthReqUser systemAccess(Boolean systemAccess) {
    this.systemAccess = systemAccess;
    return this;
  }

  
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
    AuthReqUser authReqUser = (AuthReqUser) o;
    return Objects.equals(this.id, authReqUser.id) &&
        Objects.equals(this.logins, authReqUser.logins) &&
        Objects.equals(this.auths, authReqUser.auths) &&
        Objects.equals(this.factors, authReqUser.factors) &&
        Objects.equals(this.signedUpAt, authReqUser.signedUpAt) &&
        Objects.equals(this.updatedAt, authReqUser.updatedAt) &&
        Objects.equals(this.systemAccess, authReqUser.systemAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, logins, auths, factors, signedUpAt, updatedAt, systemAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthReqUser {\n");
    
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

