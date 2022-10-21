package kntrl.example.generated.model;

import kntrl.example.generated.model.Session;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("FindSessionRes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-22T00:20:30.250260+03:00[Europe/Kiev]")
public class FindSessionRes   {
  private Session session;

  /**
   **/
  public FindSessionRes session(Session session) {
    this.session = session;
    return this;
  }

  
  @JsonProperty("session")
  public Session getSession() {
    return session;
  }

  @JsonProperty("session")
  public void setSession(Session session) {
    this.session = session;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindSessionRes findSessionRes = (FindSessionRes) o;
    return Objects.equals(this.session, findSessionRes.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(session);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindSessionRes {\n");
    
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
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

