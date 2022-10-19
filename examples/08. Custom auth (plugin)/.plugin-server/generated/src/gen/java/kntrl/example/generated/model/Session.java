package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kntrl.example.generated.model.Device;
import kntrl.example.generated.model.LoginId;
import kntrl.example.generated.model.NextFactor;
import kntrl.example.generated.model.UnconfirmedAuth;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Session")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-19T21:13:03.480932+03:00[Europe/Kiev]")
public class Session   {
  private @Valid String id;
  private @Valid String entry;
  private @Valid List<LoginId> identifiedBy = new ArrayList<>();
  private @Valid String userId;
  private @Valid Map<String, String> authenticatedBy = new HashMap<>();
  private @Valid Map<String, UnconfirmedAuth> unconfirmedAuths = new HashMap<>();
  private @Valid List<NextFactor> nextFactors = new ArrayList<>();
  private @Valid Long signedInAt;
  private @Valid Long expiresAt;
  private @Valid Long refreshedAt;
  private @Valid Boolean newUser;
  private @Valid Device device;
  private @Valid Boolean systemAccess;
  private @Valid Boolean authenticated;

  /**
   **/
  public Session id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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
   * Entry that authenticates this session
   **/
  public Session entry(String entry) {
    this.entry = entry;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Entry that authenticates this session")
  @JsonProperty("entry")
  @NotNull
  public String getEntry() {
    return entry;
  }

  @JsonProperty("entry")
  public void setEntry(String entry) {
    this.entry = entry;
  }

  /**
   * Login used to identify this user
   **/
  public Session identifiedBy(List<LoginId> identifiedBy) {
    this.identifiedBy = identifiedBy;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Login used to identify this user")
  @JsonProperty("identifiedBy")
  @NotNull
  public List<LoginId> getIdentifiedBy() {
    return identifiedBy;
  }

  @JsonProperty("identifiedBy")
  public void setIdentifiedBy(List<LoginId> identifiedBy) {
    this.identifiedBy = identifiedBy;
  }

  public Session addIdentifiedByItem(LoginId identifiedByItem) {
    if (this.identifiedBy == null) {
      this.identifiedBy = new ArrayList<>();
    }

    this.identifiedBy.add(identifiedByItem);
    return this;
  }

  public Session removeIdentifiedByItem(LoginId identifiedByItem) {
    if (identifiedByItem != null && this.identifiedBy != null) {
      this.identifiedBy.remove(identifiedByItem);
    }

    return this;
  }
  /**
   **/
  public Session userId(String userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  @JsonProperty("userId")
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * Authenticator used for factors 
   **/
  public Session authenticatedBy(Map<String, String> authenticatedBy) {
    this.authenticatedBy = authenticatedBy;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Authenticator used for factors ")
  @JsonProperty("authenticatedBy")
  @NotNull
  public Map<String, String> getAuthenticatedBy() {
    return authenticatedBy;
  }

  @JsonProperty("authenticatedBy")
  public void setAuthenticatedBy(Map<String, String> authenticatedBy) {
    this.authenticatedBy = authenticatedBy;
  }

  public Session putAuthenticatedByItem(String key, String authenticatedByItem) {
    if (this.authenticatedBy == null) {
      this.authenticatedBy = new HashMap<>();
    }

    this.authenticatedBy.put(key, authenticatedByItem);
    return this;
  }

  public Session removeAuthenticatedByItem(String authenticatedByItem) {
    if (authenticatedByItem != null && this.authenticatedBy != null) {
      this.authenticatedBy.remove(authenticatedByItem);
    }

    return this;
  }
  /**
   * Auths that waiting for confirmation 
   **/
  public Session unconfirmedAuths(Map<String, UnconfirmedAuth> unconfirmedAuths) {
    this.unconfirmedAuths = unconfirmedAuths;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Auths that waiting for confirmation ")
  @JsonProperty("unconfirmedAuths")
  @NotNull
  public Map<String, UnconfirmedAuth> getUnconfirmedAuths() {
    return unconfirmedAuths;
  }

  @JsonProperty("unconfirmedAuths")
  public void setUnconfirmedAuths(Map<String, UnconfirmedAuth> unconfirmedAuths) {
    this.unconfirmedAuths = unconfirmedAuths;
  }

  public Session putUnconfirmedAuthsItem(String key, UnconfirmedAuth unconfirmedAuthsItem) {
    if (this.unconfirmedAuths == null) {
      this.unconfirmedAuths = new HashMap<>();
    }

    this.unconfirmedAuths.put(key, unconfirmedAuthsItem);
    return this;
  }

  public Session removeUnconfirmedAuthsItem(UnconfirmedAuth unconfirmedAuthsItem) {
    if (unconfirmedAuthsItem != null && this.unconfirmedAuths != null) {
      this.unconfirmedAuths.remove(unconfirmedAuthsItem);
    }

    return this;
  }
  /**
   * List of factors needed to authenticate this session
   **/
  public Session nextFactors(List<NextFactor> nextFactors) {
    this.nextFactors = nextFactors;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of factors needed to authenticate this session")
  @JsonProperty("nextFactors")
  @NotNull
  public List<NextFactor> getNextFactors() {
    return nextFactors;
  }

  @JsonProperty("nextFactors")
  public void setNextFactors(List<NextFactor> nextFactors) {
    this.nextFactors = nextFactors;
  }

  public Session addNextFactorsItem(NextFactor nextFactorsItem) {
    if (this.nextFactors == null) {
      this.nextFactors = new ArrayList<>();
    }

    this.nextFactors.add(nextFactorsItem);
    return this;
  }

  public Session removeNextFactorsItem(NextFactor nextFactorsItem) {
    if (nextFactorsItem != null && this.nextFactors != null) {
      this.nextFactors.remove(nextFactorsItem);
    }

    return this;
  }
  /**
   **/
  public Session signedInAt(Long signedInAt) {
    this.signedInAt = signedInAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("signedInAt")
  @NotNull
  public Long getSignedInAt() {
    return signedInAt;
  }

  @JsonProperty("signedInAt")
  public void setSignedInAt(Long signedInAt) {
    this.signedInAt = signedInAt;
  }

  /**
   **/
  public Session expiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("expiresAt")
  @NotNull
  public Long getExpiresAt() {
    return expiresAt;
  }

  @JsonProperty("expiresAt")
  public void setExpiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   **/
  public Session refreshedAt(Long refreshedAt) {
    this.refreshedAt = refreshedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("refreshedAt")
  @NotNull
  public Long getRefreshedAt() {
    return refreshedAt;
  }

  @JsonProperty("refreshedAt")
  public void setRefreshedAt(Long refreshedAt) {
    this.refreshedAt = refreshedAt;
  }

  /**
   **/
  public Session newUser(Boolean newUser) {
    this.newUser = newUser;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("newUser")
  @NotNull
  public Boolean getNewUser() {
    return newUser;
  }

  @JsonProperty("newUser")
  public void setNewUser(Boolean newUser) {
    this.newUser = newUser;
  }

  /**
   **/
  public Session device(Device device) {
    this.device = device;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("device")
  @NotNull
  public Device getDevice() {
    return device;
  }

  @JsonProperty("device")
  public void setDevice(Device device) {
    this.device = device;
  }

  /**
   **/
  public Session systemAccess(Boolean systemAccess) {
    this.systemAccess = systemAccess;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("systemAccess")
  @NotNull
  public Boolean getSystemAccess() {
    return systemAccess;
  }

  @JsonProperty("systemAccess")
  public void setSystemAccess(Boolean systemAccess) {
    this.systemAccess = systemAccess;
  }

  /**
   **/
  public Session authenticated(Boolean authenticated) {
    this.authenticated = authenticated;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("authenticated")
  public Boolean getAuthenticated() {
    return authenticated;
  }

  @JsonProperty("authenticated")
  public void setAuthenticated(Boolean authenticated) {
    this.authenticated = authenticated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Session session = (Session) o;
    return Objects.equals(this.id, session.id) &&
        Objects.equals(this.entry, session.entry) &&
        Objects.equals(this.identifiedBy, session.identifiedBy) &&
        Objects.equals(this.userId, session.userId) &&
        Objects.equals(this.authenticatedBy, session.authenticatedBy) &&
        Objects.equals(this.unconfirmedAuths, session.unconfirmedAuths) &&
        Objects.equals(this.nextFactors, session.nextFactors) &&
        Objects.equals(this.signedInAt, session.signedInAt) &&
        Objects.equals(this.expiresAt, session.expiresAt) &&
        Objects.equals(this.refreshedAt, session.refreshedAt) &&
        Objects.equals(this.newUser, session.newUser) &&
        Objects.equals(this.device, session.device) &&
        Objects.equals(this.systemAccess, session.systemAccess) &&
        Objects.equals(this.authenticated, session.authenticated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, entry, identifiedBy, userId, authenticatedBy, unconfirmedAuths, nextFactors, signedInAt, expiresAt, refreshedAt, newUser, device, systemAccess, authenticated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Session {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    entry: ").append(toIndentedString(entry)).append("\n");
    sb.append("    identifiedBy: ").append(toIndentedString(identifiedBy)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    authenticatedBy: ").append(toIndentedString(authenticatedBy)).append("\n");
    sb.append("    unconfirmedAuths: ").append(toIndentedString(unconfirmedAuths)).append("\n");
    sb.append("    nextFactors: ").append(toIndentedString(nextFactors)).append("\n");
    sb.append("    signedInAt: ").append(toIndentedString(signedInAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    refreshedAt: ").append(toIndentedString(refreshedAt)).append("\n");
    sb.append("    newUser: ").append(toIndentedString(newUser)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    systemAccess: ").append(toIndentedString(systemAccess)).append("\n");
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
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

