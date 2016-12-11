package contracttest;


import generalstuff.LineSummary;
import generalstuff.ReservationDetail;
import generalstuff.ReservationIdentifier;
import java.util.Collection;
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
  public void testGetLines() {
    assumeThat(CustomerInterfaceHolder.customerInterface, not(nullValue()));
    
    Collection<LineSummary> lines =
        CustomerInterfaceHolder.customerInterface.getLines();    
    assertThat(lines, not(nullValue()));
    assertThat(lines.size(),not(0));
    }
  
  
}
