package com.example.demo.controller;

import com.example.demo.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/reports")
public class ReportController {
    @Autowired
    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @PostMapping
    public ResponseEntity<String> generateReport() {
       reportService.generateReport();
       return ResponseEntity.accepted().body("Report generation started. You will be notified once it's complete.");
    }

    @GetMapping("/async")
    public CompletableFuture<ResponseEntity<String>> asyncApi() {
        return reportService.processAsync()
                .thenApply(ResponseEntity::ok);
    }

    @GetMapping("/deferred")
    public DeferredResult<String> deferredApi() {
        DeferredResult<String> result = new DeferredResult<>();

        CompletableFuture.runAsync(() -> {
            // long task
            result.setResult("Completed");
        });

        return result;
    }


    @PostMapping("/reportsWithJobId")
    public ResponseEntity<String> submitJob() {
        String jobId = UUID.randomUUID().toString();
        reportService.processAsyncJobId(jobId);
        return ResponseEntity.accepted().body(jobId);
    }

    @GetMapping("/reportsDet/{id}")
    public String getStatus(@PathVariable String id) {
        return "IN_PROGRESS";
    }





}
