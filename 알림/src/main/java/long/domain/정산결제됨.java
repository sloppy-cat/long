package long.domain;

import long.domain.*;
import long.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class 정산결제됨 extends AbstractEvent {

    private Long id;
    private Long carOwnerId;
    private Long freightOwnerId;
    private Double fee;
    private String state;
}


