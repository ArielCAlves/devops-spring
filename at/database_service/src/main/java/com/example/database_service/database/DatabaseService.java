package com.example.database_service.database;

import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    private final DatabaseRepository repository;

    public DatabaseService(DatabaseRepository repository) {
        this.repository = repository;
    }

    public Iterable<DatabaseEntity> list() {
        return repository.findAll();
    }
}