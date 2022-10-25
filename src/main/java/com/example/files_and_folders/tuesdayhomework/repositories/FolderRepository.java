package com.example.files_and_folders.tuesdayhomework.repositories;

import com.example.files_and_folders.tuesdayhomework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {}
