package com.zzangmook.portfolio.domain.repository


import com.zzangmook.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository : JpaRepository<Project, Long> {
    
}