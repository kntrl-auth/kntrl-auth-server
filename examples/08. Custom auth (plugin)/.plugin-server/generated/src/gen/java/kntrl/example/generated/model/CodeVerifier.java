package kntrl.example.generated.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CodeVerifier")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-22T00:20:30.250260+03:00[Europe/Kiev]")
public class CodeVerifier   {
  private Long validUntil;
  private Integer usedAttempts;
  private Integer attemptsLeft;
  private String codeHash;
  private Long sentAt;

  /**
   **/
  public CodeVerifier validUntil(Long validUntil) {
    this.validUntil = validUntil;
    return this;
  }

  
  @JsonProperty("validUntil")
  public Long getValidUntil() {
    return validUntil;
  }

  @JsonProperty("validUntil")
  public void setValidUntil(Long validUntil) {
    this.validUntil = validUntil;
  }

  /**
   **/
  public CodeVerifier usedAttempts(Integer usedAttempts) {
    this.usedAttempts = usedAttempts;
    return this;
  }

  
  @JsonProperty("usedAttempts")
  public Integer getUsedAttempts() {
    return usedAttempts;
  }

  @JsonProperty("usedAttempts")
  public void setUsedAttempts(Integer usedAttempts) {
    this.usedAttempts = usedAttempts;
  }

  /**
   **/
  public CodeVerifier attemptsLeft(Integer attemptsLeft) {
    this.attemptsLeft = attemptsLeft;
    return this;
  }

  
  @JsonProperty("attemptsLeft")
  public Integer getAttemptsLeft() {
    return attemptsLeft;
  }

  @JsonProperty("attemptsLeft")
  public void setAttemptsLeft(Integer attemptsLeft) {
    this.attemptsLeft = attemptsLeft;
  }

  /**
   **/
  public CodeVerifier codeHash(String codeHash) {
    this.codeHash = codeHash;
    return this;
  }

  
  @JsonProperty("codeHash")
  public String getCodeHash() {
    return codeHash;
  }

  @JsonProperty("codeHash")
  public void setCodeHash(String codeHash) {
    this.codeHash = codeHash;
  }

  /**
   **/
  public CodeVerifier sentAt(Long sentAt) {
    this.sentAt = sentAt;
    return this;
  }

  
  @JsonProperty("sentAt")
  public Long getSentAt() {
    return sentAt;
  }

  @JsonProperty("sentAt")
  public void setSentAt(Long sentAt) {
    this.sentAt = sentAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodeVerifier codeVerifier = (CodeVerifier) o;
    return Objects.equals(this.validUntil, codeVerifier.validUntil) &&
        Objects.equals(this.usedAttempts, codeVerifier.usedAttempts) &&
        Objects.equals(this.attemptsLeft, codeVerifier.attemptsLeft) &&
        Objects.equals(this.codeHash, codeVerifier.codeHash) &&
        Objects.equals(this.sentAt, codeVerifier.sentAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validUntil, usedAttempts, attemptsLeft, codeHash, sentAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeVerifier {\n");
    
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    usedAttempts: ").append(toIndentedString(usedAttempts)).append("\n");
    sb.append("    attemptsLeft: ").append(toIndentedString(attemptsLeft)).append("\n");
    sb.append("    codeHash: ").append(toIndentedString(codeHash)).append("\n");
    sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
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

