package long.domain;

import long.domain.*;
import long.infra.AbstractEvent;
import java.util.*;
import lombok.*;
import java.time.LocalDate;


//<<< DDD / Domain Event
@Data
@ToString
public class 배송시작됨 extends AbstractEvent {

    private Long id;
    private Long freightId;
    private Long carOwnerId;
    private Date createdAt;
    private String s;

    public 배송시작됨(FreightDelivery aggregate){
        super(aggregate);
    }
    public 배송시작됨(){
        super();
    }
}
//>>> DDD / Domain Event