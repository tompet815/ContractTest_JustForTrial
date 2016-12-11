
import generalstuff.ReservationDetail;
import generalstuff.ReservationIdentifier;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assume.assumeThat;

public class CustomerInterfaceTest {   
  

    @Test
  public void testGetReservation() {
    assumeThat(CustomerInterfaceHolder.customerInterface, not(nullValue()));
    
    ReservationDetail detail =
        CustomerInterfaceHolder.customerInterface.getReservation(new ReservationIdentifier(1));    
    assertThat(detail, not(nullValue()));
    }
  
  
}
