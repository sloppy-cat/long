package long.domain;

import long.domain.*;
import long.infra.AbstractEvent;
import java.util.*;
import lombok.*;
import java.time.LocalDate;


//<<< DDD / Domain Event
@Data
@ToString
public class 정산결제됨 extends AbstractEvent {

    private Long id;
    private Long carOwnerId;
    private Long freightOwnerId;
    private Double fee;
    private String state;

    public 정산결제됨(Settlement aggregate){
        super(aggregate);
    }
    public 정산결제됨(){
        super();
    }
}
//>>> DDD / Domain Event