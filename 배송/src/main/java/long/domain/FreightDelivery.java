package long.domain;

import long.domain.배송시작됨;
import long.domain.배송완료됨;
import long.domain.배송시간경과함;
import long.domain.배송수령완료됨;
import long.domain.배송취소됨;
import long.배송Application;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;


@Entity
@Table(name="FreightDelivery_table")
@Data

//<<< DDD / Aggregate Root
public class FreightDelivery  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    private Long id;
    
    
    
    
    private Long freightId;
    
    
    
    
    private Long carOwnerId;
    
    
    
    
    private Date createdAt;
    
    
    
    
    private String state;
    
    
    
    
    private Boolean isRecieved;
    
    
    
    
    private Long freightOwnerId;

    @PostPersist
    public void onPostPersist(){


        배송시작됨 배송시작됨 = new 배송시작됨(this);
        배송시작됨.publishAfterCommit();

    }
    @PostUpdate
    public void onPostUpdate(){


        배송완료됨 배송완료됨 = new 배송완료됨(this);
        배송완료됨.publishAfterCommit();


        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        long.external.FreightDelivery freightDelivery = new long.external.FreightDelivery();
        // mappings goes here
        배송Application.applicationContext.getBean(long.external.FreightDeliveryService.class)
            .completeDelivery(freightDelivery);


        배송시간경과함 배송시간경과함 = new 배송시간경과함(this);
        배송시간경과함.publishAfterCommit();



        배송수령완료됨 배송수령완료됨 = new 배송수령완료됨(this);
        배송수령완료됨.publishAfterCommit();

    }
    @PostRemove
    public void onPostRemove(){


        배송취소됨 배송취소됨 = new 배송취소됨(this);
        배송취소됨.publishAfterCommit();

    }
    @PreRemove
    public void onPreRemove(){
    }

    public static FreightDeliveryRepository repository(){
        FreightDeliveryRepository freightDeliveryRepository = 배송Application.applicationContext.getBean(FreightDeliveryRepository.class);
        return freightDeliveryRepository;
    }






}
//>>> DDD / Aggregate Root
