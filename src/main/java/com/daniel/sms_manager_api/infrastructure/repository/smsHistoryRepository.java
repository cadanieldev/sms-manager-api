package com.daniel.sms_manager_api.infrastructure.repository;

import com.daniel.sms_manager_api.infrastructure.entity.smsHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface smsHistoryRepository extends JpaRepository<smsHistory, Long> {
}
