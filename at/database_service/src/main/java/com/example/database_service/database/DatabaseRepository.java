package com.example.database_service.database;

import org.springframework.data.repository.ListCrudRepository;

public interface DatabaseRepository extends ListCrudRepository<DatabaseEntity, Long> {}
