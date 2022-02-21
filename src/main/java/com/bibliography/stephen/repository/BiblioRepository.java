package com.bibliography.stephen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BiblioRepository  extends JpaRepository<BiblioRepository,String> {

    List<BiblioRepository> findAll();

}
