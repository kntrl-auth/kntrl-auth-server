package kntrl.example.generated.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("NextFactor")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-22T00:20:30.250260+03:00[Europe/Kiev]")
public class NextFactor   {
  private String factor;
  private Set<String> supportedAuths = new LinkedHashSet<>();

  /**
   **/
  public NextFactor factor(String factor) {
    this.factor = factor;
    return this;
  }

  
  @JsonProperty("factor")
  public String getFactor() {
    return factor;
  }

  @JsonProperty("factor")
  public void setFactor(String factor) {
    this.factor = factor;
  }

  /**
   **/
  public NextFactor supportedAuths(Set<String> supportedAuths) {
    this.supportedAuths = supportedAuths;
    return this;
  }

  
  @JsonProperty("supportedAuths")
  public Set<String> getSupportedAuths() {
    return supportedAuths;
  }

  @JsonProperty("supportedAuths")
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setSupportedAuths(Set<String> supportedAuths) {
    this.supportedAuths = supportedAuths;
  }

  public NextFactor addSupportedAuthsItem(String supportedAuthsItem) {
    if (this.supportedAuths == null) {
      this.supportedAuths = new LinkedHashSet<>();
    }

    this.supportedAuths.add(supportedAuthsItem);
    return this;
  }

  public NextFactor removeSupportedAuthsItem(String supportedAuthsItem) {
    if (supportedAuthsItem != null && this.supportedAuths != null) {
      this.supportedAuths.remove(supportedAuthsItem);
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
    NextFactor nextFactor = (NextFactor) o;
    return Objects.equals(this.factor, nextFactor.factor) &&
        Objects.equals(this.supportedAuths, nextFactor.supportedAuths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(factor, supportedAuths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NextFactor {\n");
    
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    supportedAuths: ").append(toIndentedString(supportedAuths)).append("\n");
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

