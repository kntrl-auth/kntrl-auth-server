package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import kntrl.example.generated.model.SaveSessionReqNew;
import kntrl.example.generated.model.SaveSessionReqUpdated;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("SaveSessionReq")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T22:48:57.779152+03:00[Europe/Kiev]")
public class SaveSessionReq   {
  private @Valid String userId;
  private @Valid SaveSessionReqUpdated updated;
  private @Valid SaveSessionReqNew _new;
  private @Valid List<String> removed = new ArrayList<>();

  /**
   **/
  public SaveSessionReq userId(String userId) {
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
   **/
  public SaveSessionReq updated(SaveSessionReqUpdated updated) {
    this.updated = updated;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("updated")
  public SaveSessionReqUpdated getUpdated() {
    return updated;
  }

  @JsonProperty("updated")
  public void setUpdated(SaveSessionReqUpdated updated) {
    this.updated = updated;
  }

  /**
   **/
  public SaveSessionReq _new(SaveSessionReqNew _new) {
    this._new = _new;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("new")
  public SaveSessionReqNew getNew() {
    return _new;
  }

  @JsonProperty("new")
  public void setNew(SaveSessionReqNew _new) {
    this._new = _new;
  }

  /**
   * Session ids to remove
   **/
  public SaveSessionReq removed(List<String> removed) {
    this.removed = removed;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Session ids to remove")
  @JsonProperty("removed")
  @NotNull
  public List<String> getRemoved() {
    return removed;
  }

  @JsonProperty("removed")
  public void setRemoved(List<String> removed) {
    this.removed = removed;
  }

  public SaveSessionReq addRemovedItem(String removedItem) {
    if (this.removed == null) {
      this.removed = new ArrayList<>();
    }

    this.removed.add(removedItem);
    return this;
  }

  public SaveSessionReq removeRemovedItem(String removedItem) {
    if (removedItem != null && this.removed != null) {
      this.removed.remove(removedItem);
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
    SaveSessionReq saveSessionReq = (SaveSessionReq) o;
    return Objects.equals(this.userId, saveSessionReq.userId) &&
        Objects.equals(this.updated, saveSessionReq.updated) &&
        Objects.equals(this._new, saveSessionReq._new) &&
        Objects.equals(this.removed, saveSessionReq.removed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, updated, _new, removed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveSessionReq {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
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

