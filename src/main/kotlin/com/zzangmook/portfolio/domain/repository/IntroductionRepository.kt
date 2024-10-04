package com.zzangmook.portfolio.domain.repository


import com.zzangmook.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository : JpaRepository<Introduction, Long> {
    
}