package com.rafael.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.dsmovie.entities.Score;
import com.rafael.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
