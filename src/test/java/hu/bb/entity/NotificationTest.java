package hu.bb.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import hu.bb.constants.NotificationType;

class NotificationTest {
    



    @Test
    void testBuilder() {
        String message = "Test";


        Notification notification = Notification.builder()
            .id(new UUID(1, 1))
            .message(message)
            .type(NotificationType.EMAIL.getType())
            .deviceId("1")
            .userId("ou=Test")
            .createdAt(new Date())
            .status("active")
            .build();

        assertEquals(message, notification.getMessage());
    }

    @Test
    void testCreateNotification() {
        Notification notification = new Notification();

        String message = "Test";
        Date date = new Date();
        String status = "active";
        UUID uuid = new UUID(1, 1);
        String userId = "ou=Test";
        String deviceId = "1";
        String type = NotificationType.EMAIL.getType();

        notification.setId(uuid);
        notification.setMessage(message);
        notification.setDeviceId(deviceId);
        notification.setUserId(userId);
        notification.setType(type);
        notification.setStatus(status);
        notification.setCreatedAt(date);
        

        assertEquals(uuid, notification.getId());
        assertEquals(userId, notification.getUserId());
        assertEquals(deviceId, notification.getDeviceId());
        assertEquals(type, notification.getType());
        assertEquals(status, notification.getStatus());
        assertEquals(date, notification.getCreatedAt());
    }
}
