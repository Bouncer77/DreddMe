package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Tool
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-04T22:08:42.480945392Z[Etc/UTC]", comments = "Generator version: 7.9.0-SNAPSHOT")
public class Tool {

  private Integer toolId;

  private String name;

  /**
   * Состояние инструмента
   */
  public enum StatusEnum {
    NEW("new"),
    
    OLD("old"),
    
    BROKEN("broken");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private String createDate;

  public Tool() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Tool(String name, StatusEnum status) {
    this.name = name;
    this.status = status;
  }

  public Tool toolId(Integer toolId) {
    this.toolId = toolId;
    return this;
  }

  /**
   * Get toolId
   * @return toolId
   */
  
  @Schema(name = "tool_id", example = "77", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tool_id")
  public Integer getToolId() {
    return toolId;
  }

  public void setToolId(Integer toolId) {
    this.toolId = toolId;
  }

  public Tool name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @NotNull 
  @Schema(name = "name", example = "Шуруповерт", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Tool status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Состояние инструмента
   * @return status
   */
  @NotNull 
  @Schema(name = "status", description = "Состояние инструмента", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Tool createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Get createDate
   * @return createDate
   */
  
  @Schema(name = "create_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("create_date")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tool tool = (Tool) o;
    return Objects.equals(this.toolId, tool.toolId) &&
        Objects.equals(this.name, tool.name) &&
        Objects.equals(this.status, tool.status) &&
        Objects.equals(this.createDate, tool.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolId, name, status, createDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tool {\n");
    sb.append("    toolId: ").append(toIndentedString(toolId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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

