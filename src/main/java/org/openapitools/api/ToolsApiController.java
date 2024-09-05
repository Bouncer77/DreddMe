package org.openapitools.api;

import lombok.RequiredArgsConstructor;
import org.openapitools.exception.ResourceNotFoundException;
import org.openapitools.model.Tool;


import org.openapitools.repository.ToolRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-04T22:08:42.480945392Z[Etc/UTC]", comments = "Generator version: 7.9.0-SNAPSHOT")
@Controller
@RequestMapping("${openapi.renovaTech.base-path:/api/v1}")
@RestController
@RequiredArgsConstructor
public class ToolsApiController implements ToolsApi {

    private final NativeWebRequest request;

    private final ToolRepository toolRepository;

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public List<Tool> getAllTools() {
        return toolRepository.findAll();
    }

    @Override
    public Tool getToolById(Long id) {
        return toolRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Product with id " + id + " not found"));
    }

}
