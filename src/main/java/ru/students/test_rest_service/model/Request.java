package ru.students.test_rest_service.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Request {

    @NotBlank
    @Size(max = 32)
    private String uid;

    @NotBlank
    @Size(max = 32)
    private String operationUid;

    private String systemName;

    @NotBlank
    private String systemTime;

    private String source;

    private Integer communicationId;
    private Integer templateId;

    @Max(7)
    private Integer productCode;

    @Max(5)
    private Integer smsCode;

}
