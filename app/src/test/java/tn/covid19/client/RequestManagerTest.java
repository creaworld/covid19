
package tn.covid19.client;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import tn.covid19.client.legacy.RequestManager;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
public class RequestManagerTest {

    @Ignore
    @Test
    public void testSendRequest() throws Exception {

        assertTrue(RequestManager.sendRequest("http://www.google.com"));

    }

}
