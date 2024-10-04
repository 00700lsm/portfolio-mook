package com.zzangmook.portfolio.domain.repository


import com.zzangmook.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long> {
    
}