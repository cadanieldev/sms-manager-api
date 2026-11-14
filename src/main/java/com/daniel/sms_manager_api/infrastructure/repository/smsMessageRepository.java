package com.daniel.sms_manager_api.infrastructure.repository;

import com.daniel.sms_manager_api.infrastructure.entity.smsMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface smsMessageRepository extends JpaRepository<smsMessage, Long> {
}
