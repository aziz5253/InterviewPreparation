package com.example.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class ReportService {
    @Async
    public void generateReport(){
        System.out.println("Report generation started");
    }

    @Async
    public CompletableFuture<String> processAsync() {
        return CompletableFuture.completedFuture("Done");
    }

    public void processAsyncJobId(String jobId) {
        System.out.println("Report generation started"+jobId);
    }
}
