package long.domain;

import long.domain.정산결제됨;
import long.정산Application;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;


@Entity
@Table(name="Settlement_table")
@Data

//<<< DDD / Aggregate Root
public class Settlement  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    private Long id;
    
    
    
    
    private Long carOwnerId;
    
    
    
    
    private Long freightOwnerId;
    
    
    
    
    private Double fee;
    
    
    
    
    private String state;

    @PostPersist
    public void onPostPersist(){


        정산결제됨 정산결제됨 = new 정산결제됨(this);
        정산결제됨.publishAfterCommit();

    }

    public static SettlementRepository repository(){
        SettlementRepository settlementRepository = 정산Application.applicationContext.getBean(SettlementRepository.class);
        return settlementRepository;
    }




//<<< Clean Arch / Port Method
    public static void createSettlement(배송수령완료됨 배송수령완료됨){
        
        //implement business logic here:

        /** Example 1:  new item 
        Settlement settlement = new Settlement();
        repository().save(settlement);

        */

        /** Example 2:  finding and process
        
        repository().findById(배송수령완료됨.get???()).ifPresent(settlement->{
            
            settlement // do something
            repository().save(settlement);


         });
        */

        
    }
//>>> Clean Arch / Port Method
//<<< Clean Arch / Port Method
    public static void createSettlement(배송시간경과함 배송시간경과함){
        
        //implement business logic here:

        /** Example 1:  new item 
        Settlement settlement = new Settlement();
        repository().save(settlement);

        */

        /** Example 2:  finding and process
        
        repository().findById(배송시간경과함.get???()).ifPresent(settlement->{
            
            settlement // do something
            repository().save(settlement);


         });
        */

        
    }
//>>> Clean Arch / Port Method


}
//>>> DDD / Aggregate Root
