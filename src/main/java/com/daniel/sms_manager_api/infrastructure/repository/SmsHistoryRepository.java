package com.daniel.sms_manager_api.infrastructure.repository;

import com.daniel.sms_manager_api.infrastructure.entity.SmsHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmsHistoryRepository extends JpaRepository<SmsHistory, Long> {
}
