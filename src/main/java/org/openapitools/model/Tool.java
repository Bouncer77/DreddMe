package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Tool
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-04T22:08:42.480945392Z[Etc/UTC]", comments = "Generator version: 7.9.0-SNAPSHOT")
@Entity
@Table(name = "tool")
@Data
@AllArgsConstructor
public class Tool {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long toolId;

    @Column(name = "name")
    private String name;

    /**
     * Состояние инструмента
     */
    @Column(name = "status")
    private String status;

    public Tool() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Tool(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public Tool toolId(Long toolId) {
        this.toolId = toolId;
        return this;
    }

    /**
     * Get toolId
     *
     * @return toolId
     */

    @Schema(name = "tool_id", example = "77", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tool_id")
    public Long getToolId() {
        return toolId;
    }

    public void setToolId(Long toolId) {
        this.toolId = toolId;
    }

    public Tool name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
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

    public Tool status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Состояние инструмента
     *
     * @return status
     */
    @NotNull
    @Schema(name = "status", description = "Состояние инструмента", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        return Objects.equals(this.name, tool.name) &&
                Objects.equals(this.status, tool.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tool {\n");
        sb.append("    toolId: ").append(toIndentedString(toolId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

