package com.ibrahim.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibrahim.springboot.entities.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {

}
