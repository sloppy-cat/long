package long.domain;

import long.domain.*;
import long.infra.AbstractEvent;
import java.util.*;
import lombok.*;
import java.time.LocalDate;


//<<< DDD / Domain Event
@Data
@ToString
public class 배송시간경과함 extends AbstractEvent {

    private Long id;
    private Long freightId;
    private Long carOwnerId;
    private Date createdAt;
    private String state;
    private Boolean isRecieved;
    private Long freightOwnerId;

    public 배송시간경과함(FreightDelivery aggregate){
        super(aggregate);
    }
    public 배송시간경과함(){
        super();
    }
}
//>>> DDD / Domain Event