package denominator.model.rdata;

import static denominator.model.ResourceRecordSets.naptr;

import org.testng.annotations.Test;

@Test
public class NAPTRDataTest {

    public void testGoodRecord() {
    	naptr("www.denominator.io.", "1 1 U E2U+sip !^.*$!sip:customer-service@example.com! .");
    }    
    
    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = ".*record must have exactly six parts.*")
    public void testMissingParts() {
    	naptr("www.denominator.io.", "1 1 U E2U+sip");
    }

}
