package com.example.files_and_folders.tuesdayhomework.repositories;

import com.example.files_and_folders.tuesdayhomework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {}
