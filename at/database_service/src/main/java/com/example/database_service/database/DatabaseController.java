package com.example.database_service.database;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {

    private final DatabaseService service;

    public DatabaseController(DatabaseService service) {
        this.service = service;
    }

    @GetMapping("/dbtest")
    public Iterable<DatabaseEntity> list() {
        return service.list();
    }
}