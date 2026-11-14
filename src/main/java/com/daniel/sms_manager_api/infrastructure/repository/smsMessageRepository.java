package com.daniel.sms_manager_api.infrastructure.repository;

import com.daniel.sms_manager_api.infrastructure.entity.SmsMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface smsMessageRepository extends JpaRepository<SmsMessage, Long> {
}
