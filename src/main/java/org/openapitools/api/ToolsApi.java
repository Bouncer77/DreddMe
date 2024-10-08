/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.Tool;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-04T22:08:42.480945392Z[Etc/UTC]", comments = "Generator version: 7.9.0-SNAPSHOT")
@Validated
@Tag(name = "Tools", description = "the Tools API")
public interface ToolsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }
    /**
     * GET /tools : Метод получения списка инструментов
     *
     * @return Успешный ответ со списком инструментов (status code 200)
     *         or Всё нестандартное (status code 200)
     */
    @Operation(
        operationId = "getAllTools",
        summary = "Метод получения списка инструментов",
        tags = { "Tools" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Успешный ответ со списком инструментов", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Tool.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/tools",
        produces = { "application/json" }
    )
    
    default List<Tool> getAllTools(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"name\" : \"Шуруповерт\", \"tool_id\" : 1, \"status\" : \"new\" }]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ArrayList<>();

    }


    /**
     * GET /tools/{toolId} : Метод получения списка инструментов
     *
     * @param toolId Идентификатор инструмента (required)
     * @return Успешный ответ со списком инструментов (status code 200)
     *         or Всё нестандартное (status code 200)
     */
    @Operation(
        operationId = "getToolById",
        summary = "Метод получения списка инструментов",
        tags = { "Tools" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Успешный ответ со списком инструментов", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Tool.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/tools/{tool_id}",
        produces = { "application/json" }
    )
    
    default Tool getToolById(
        @Parameter(name = "tool_id", description = "Идентификатор инструмента", required = true, in = ParameterIn.PATH) @PathVariable("tool_id") Long toolId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"Шуруповерт\", \"tool_id\" : 77, \"status\" : \"new\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return null;

    }

}
