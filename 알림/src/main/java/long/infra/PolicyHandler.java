package long.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import long.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import long.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler{
    @Autowired NotificationRepository notificationRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='정산결제됨'")
    public void whenever정산결제됨_CreateNotification(@Payload 정산결제됨 정산결제됨){

        정산결제됨 event = 정산결제됨;
        System.out.println("\n\n##### listener CreateNotification : " + 정산결제됨 + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='배송완료됨'")
    public void whenever배송완료됨_CreateNotification(@Payload 배송완료됨 배송완료됨){

        배송완료됨 event = 배송완료됨;
        System.out.println("\n\n##### listener CreateNotification : " + 배송완료됨 + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='배송시작됨'")
    public void whenever배송시작됨_CreateNotification(@Payload 배송시작됨 배송시작됨){

        배송시작됨 event = 배송시작됨;
        System.out.println("\n\n##### listener CreateNotification : " + 배송시작됨 + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='배송취소됨'")
    public void whenever배송취소됨_CreateNotification(@Payload 배송취소됨 배송취소됨){

        배송취소됨 event = 배송취소됨;
        System.out.println("\n\n##### listener CreateNotification : " + 배송취소됨 + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='FreightRegistered'")
    public void wheneverFreightRegistered_CreateNotification(@Payload FreightRegistered freightRegistered){

        FreightRegistered event = freightRegistered;
        System.out.println("\n\n##### listener CreateNotification : " + freightRegistered + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='배송시간경과함'")
    public void whenever배송시간경과함_CreateNotification(@Payload 배송시간경과함 배송시간경과함){

        배송시간경과함 event = 배송시간경과함;
        System.out.println("\n\n##### listener CreateNotification : " + 배송시간경과함 + "\n\n");


        

        // Sample Logic //

        

    }

}

//>>> Clean Arch / Inbound Adaptor

