package com.crimsonlogic.spring.hibernate.manytomany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crimsonlogic.spring.hibernate.manytomany.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {
  List<Tag> findTagsByTutorialsId(Long tutorialId);
}
