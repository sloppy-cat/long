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
    @Autowired SettlementRepository settlementRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='배송수령완료됨'")
    public void whenever배송수령완료됨_CreateSettlement(@Payload 배송수령완료됨 배송수령완료됨){

        배송수령완료됨 event = 배송수령완료됨;
        System.out.println("\n\n##### listener CreateSettlement : " + 배송수령완료됨 + "\n\n");


        

        // Sample Logic //
        Settlement.createSettlement(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='배송시간경과함'")
    public void whenever배송시간경과함_CreateSettlement(@Payload 배송시간경과함 배송시간경과함){

        배송시간경과함 event = 배송시간경과함;
        System.out.println("\n\n##### listener CreateSettlement : " + 배송시간경과함 + "\n\n");


        

        // Sample Logic //
        Settlement.createSettlement(event);
        

        

    }

}

//>>> Clean Arch / Inbound Adaptor

