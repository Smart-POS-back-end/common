package com.pesona.group.dto.Response;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.List;

@Data
@RequiredArgsConstructor
public class GlobalDatabaseActionResultPaginate implements Serializable {
    private int code;
    private HttpStatus status;
    private String message;
    private List<Object> payload;
    private int pageIndex;
    private int pageSize;
    private long totalElements;
    private int totalPages;
    private int nextPage;
    private int previousPage;
}