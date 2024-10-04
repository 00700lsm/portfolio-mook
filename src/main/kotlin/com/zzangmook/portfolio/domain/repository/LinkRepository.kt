package com.zzangmook.portfolio.domain.repository


import com.zzangmook.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long> {
    
}