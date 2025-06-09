package com.mg7.RiskAnalyser.repository;

import com.mg7.RiskAnalyser.entity.Portfolio;
import com.mg7.RiskAnalyser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {

    List<Portfolio> findByUser(User user);

    List<Portfolio> findByUserId(Long userId);

    List<Portfolio> findByUserAndTickerContainingIgnoreCase(User user, String ticker);
}
