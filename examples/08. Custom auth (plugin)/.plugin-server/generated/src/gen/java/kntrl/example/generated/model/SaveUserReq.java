package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import kntrl.example.generated.model.Login;
import kntrl.example.generated.model.LoginId;
import kntrl.example.generated.model.User;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("SaveUserReq")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T22:48:57.779152+03:00[Europe/Kiev]")
public class SaveUserReq   {
  private @Valid List<LoginId> removedLogins = new ArrayList<>();
  private @Valid List<User> updatedUsers = new ArrayList<>();
  private @Valid List<User> newUsers = new ArrayList<>();
  private @Valid List<Login> updatedLogins = new ArrayList<>();
  private @Valid List<Login> newLogins = new ArrayList<>();
  private @Valid List<User> updatedUsersOrLogins = new ArrayList<>();

  /**
   * Login ids to remove.
   **/
  public SaveUserReq removedLogins(List<LoginId> removedLogins) {
    this.removedLogins = removedLogins;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Login ids to remove.")
  @JsonProperty("removedLogins")
  @NotNull
  public List<LoginId> getRemovedLogins() {
    return removedLogins;
  }

  @JsonProperty("removedLogins")
  public void setRemovedLogins(List<LoginId> removedLogins) {
    this.removedLogins = removedLogins;
  }

  public SaveUserReq addRemovedLoginsItem(LoginId removedLoginsItem) {
    if (this.removedLogins == null) {
      this.removedLogins = new ArrayList<>();
    }

    this.removedLogins.add(removedLoginsItem);
    return this;
  }

  public SaveUserReq removeRemovedLoginsItem(LoginId removedLoginsItem) {
    if (removedLoginsItem != null && this.removedLogins != null) {
      this.removedLogins.remove(removedLoginsItem);
    }

    return this;
  }
  /**
   * User that must be updated. This list doesn&#39;t include users that have new/updated/removed logins only.
   **/
  public SaveUserReq updatedUsers(List<User> updatedUsers) {
    this.updatedUsers = updatedUsers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "User that must be updated. This list doesn't include users that have new/updated/removed logins only.")
  @JsonProperty("updatedUsers")
  @NotNull
  public List<User> getUpdatedUsers() {
    return updatedUsers;
  }

  @JsonProperty("updatedUsers")
  public void setUpdatedUsers(List<User> updatedUsers) {
    this.updatedUsers = updatedUsers;
  }

  public SaveUserReq addUpdatedUsersItem(User updatedUsersItem) {
    if (this.updatedUsers == null) {
      this.updatedUsers = new ArrayList<>();
    }

    this.updatedUsers.add(updatedUsersItem);
    return this;
  }

  public SaveUserReq removeUpdatedUsersItem(User updatedUsersItem) {
    if (updatedUsersItem != null && this.updatedUsers != null) {
      this.updatedUsers.remove(updatedUsersItem);
    }

    return this;
  }
  /**
   * Users to insert
   **/
  public SaveUserReq newUsers(List<User> newUsers) {
    this.newUsers = newUsers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Users to insert")
  @JsonProperty("newUsers")
  @NotNull
  public List<User> getNewUsers() {
    return newUsers;
  }

  @JsonProperty("newUsers")
  public void setNewUsers(List<User> newUsers) {
    this.newUsers = newUsers;
  }

  public SaveUserReq addNewUsersItem(User newUsersItem) {
    if (this.newUsers == null) {
      this.newUsers = new ArrayList<>();
    }

    this.newUsers.add(newUsersItem);
    return this;
  }

  public SaveUserReq removeNewUsersItem(User newUsersItem) {
    if (newUsersItem != null && this.newUsers != null) {
      this.newUsers.remove(newUsersItem);
    }

    return this;
  }
  /**
   * Logins to update
   **/
  public SaveUserReq updatedLogins(List<Login> updatedLogins) {
    this.updatedLogins = updatedLogins;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Logins to update")
  @JsonProperty("updatedLogins")
  @NotNull
  public List<Login> getUpdatedLogins() {
    return updatedLogins;
  }

  @JsonProperty("updatedLogins")
  public void setUpdatedLogins(List<Login> updatedLogins) {
    this.updatedLogins = updatedLogins;
  }

  public SaveUserReq addUpdatedLoginsItem(Login updatedLoginsItem) {
    if (this.updatedLogins == null) {
      this.updatedLogins = new ArrayList<>();
    }

    this.updatedLogins.add(updatedLoginsItem);
    return this;
  }

  public SaveUserReq removeUpdatedLoginsItem(Login updatedLoginsItem) {
    if (updatedLoginsItem != null && this.updatedLogins != null) {
      this.updatedLogins.remove(updatedLoginsItem);
    }

    return this;
  }
  /**
   * Logins to insert
   **/
  public SaveUserReq newLogins(List<Login> newLogins) {
    this.newLogins = newLogins;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Logins to insert")
  @JsonProperty("newLogins")
  @NotNull
  public List<Login> getNewLogins() {
    return newLogins;
  }

  @JsonProperty("newLogins")
  public void setNewLogins(List<Login> newLogins) {
    this.newLogins = newLogins;
  }

  public SaveUserReq addNewLoginsItem(Login newLoginsItem) {
    if (this.newLogins == null) {
      this.newLogins = new ArrayList<>();
    }

    this.newLogins.add(newLoginsItem);
    return this;
  }

  public SaveUserReq removeNewLoginsItem(Login newLoginsItem) {
    if (newLoginsItem != null && this.newLogins != null) {
      this.newLogins.remove(newLoginsItem);
    }

    return this;
  }
  /**
   * Alternative field, if users and logins stored withing single document - prefer this field + &#x60;newUsers&#x60;
   **/
  public SaveUserReq updatedUsersOrLogins(List<User> updatedUsersOrLogins) {
    this.updatedUsersOrLogins = updatedUsersOrLogins;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Alternative field, if users and logins stored withing single document - prefer this field + `newUsers`")
  @JsonProperty("updatedUsersOrLogins")
  @NotNull
  public List<User> getUpdatedUsersOrLogins() {
    return updatedUsersOrLogins;
  }

  @JsonProperty("updatedUsersOrLogins")
  public void setUpdatedUsersOrLogins(List<User> updatedUsersOrLogins) {
    this.updatedUsersOrLogins = updatedUsersOrLogins;
  }

  public SaveUserReq addUpdatedUsersOrLoginsItem(User updatedUsersOrLoginsItem) {
    if (this.updatedUsersOrLogins == null) {
      this.updatedUsersOrLogins = new ArrayList<>();
    }

    this.updatedUsersOrLogins.add(updatedUsersOrLoginsItem);
    return this;
  }

  public SaveUserReq removeUpdatedUsersOrLoginsItem(User updatedUsersOrLoginsItem) {
    if (updatedUsersOrLoginsItem != null && this.updatedUsersOrLogins != null) {
      this.updatedUsersOrLogins.remove(updatedUsersOrLoginsItem);
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
    SaveUserReq saveUserReq = (SaveUserReq) o;
    return Objects.equals(this.removedLogins, saveUserReq.removedLogins) &&
        Objects.equals(this.updatedUsers, saveUserReq.updatedUsers) &&
        Objects.equals(this.newUsers, saveUserReq.newUsers) &&
        Objects.equals(this.updatedLogins, saveUserReq.updatedLogins) &&
        Objects.equals(this.newLogins, saveUserReq.newLogins) &&
        Objects.equals(this.updatedUsersOrLogins, saveUserReq.updatedUsersOrLogins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removedLogins, updatedUsers, newUsers, updatedLogins, newLogins, updatedUsersOrLogins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveUserReq {\n");
    
    sb.append("    removedLogins: ").append(toIndentedString(removedLogins)).append("\n");
    sb.append("    updatedUsers: ").append(toIndentedString(updatedUsers)).append("\n");
    sb.append("    newUsers: ").append(toIndentedString(newUsers)).append("\n");
    sb.append("    updatedLogins: ").append(toIndentedString(updatedLogins)).append("\n");
    sb.append("    newLogins: ").append(toIndentedString(newLogins)).append("\n");
    sb.append("    updatedUsersOrLogins: ").append(toIndentedString(updatedUsersOrLogins)).append("\n");
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

