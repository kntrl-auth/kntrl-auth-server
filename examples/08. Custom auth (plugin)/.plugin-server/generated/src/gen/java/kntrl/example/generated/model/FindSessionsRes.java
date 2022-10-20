package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import kntrl.example.generated.model.Session;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("FindSessionsRes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-20T19:23:38.989036+03:00[Europe/Kiev]")
public class FindSessionsRes   {
  private @Valid List<Session> sessions = new ArrayList<>();
  private @Valid Boolean tooManySessions;

  /**
   **/
  public FindSessionsRes sessions(List<Session> sessions) {
    this.sessions = sessions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sessions")
  @NotNull
  public List<Session> getSessions() {
    return sessions;
  }

  @JsonProperty("sessions")
  public void setSessions(List<Session> sessions) {
    this.sessions = sessions;
  }

  public FindSessionsRes addSessionsItem(Session sessionsItem) {
    if (this.sessions == null) {
      this.sessions = new ArrayList<>();
    }

    this.sessions.add(sessionsItem);
    return this;
  }

  public FindSessionsRes removeSessionsItem(Session sessionsItem) {
    if (sessionsItem != null && this.sessions != null) {
      this.sessions.remove(sessionsItem);
    }

    return this;
  }
  /**
   * True if number of sessions in database exceeds some limit
   **/
  public FindSessionsRes tooManySessions(Boolean tooManySessions) {
    this.tooManySessions = tooManySessions;
    return this;
  }

  
  @ApiModelProperty(value = "True if number of sessions in database exceeds some limit")
  @JsonProperty("tooManySessions")
  public Boolean getTooManySessions() {
    return tooManySessions;
  }

  @JsonProperty("tooManySessions")
  public void setTooManySessions(Boolean tooManySessions) {
    this.tooManySessions = tooManySessions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindSessionsRes findSessionsRes = (FindSessionsRes) o;
    return Objects.equals(this.sessions, findSessionsRes.sessions) &&
        Objects.equals(this.tooManySessions, findSessionsRes.tooManySessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessions, tooManySessions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindSessionsRes {\n");
    
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
    sb.append("    tooManySessions: ").append(toIndentedString(tooManySessions)).append("\n");
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

