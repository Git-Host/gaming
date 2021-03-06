/*
 * Copyright (c) 2011. Chartwell Technology Inc. All Rights Reserved.
 *
 * This software is the proprietary information of Chartwell Technology Inc.
 * Use is subject to license terms.
 */

package  com.cwh.test.wb.actions;

import com.cwh.test.mocks.MockLocalHttpServletRequest;
import  com.cwh.wb.utils.ResourceLoader;

import net.sourceforge.stripes.mock.MockHttpServletResponse;

import org.junit.Test;

import static junit.framework.Assert.fail;
import static org.junit.Assert.*;

public class ResumeGameRequestActionBeanTest extends BaseActionBeanTestMock {
    private static final ResourceLoader rLoader    = new ResourceLoader();
    private static final String         gdkRequest = new String(rLoader.getResourceAsBytes("com/cwh/test/wb/resources/gdkRequest_resume.xml"));

    @Test
    public void testSpinGameRequest() {
        try {
            this.mockRequest  = new MockLocalHttpServletRequest("/someContext", "/resume_game");
            this.mockResponse = new MockHttpServletResponse();
            this.mockRequest.setMockRequestData(ResumeGameRequestActionBeanTest.gdkRequest);
            this.mockContext.acceptRequest(mockRequest, mockResponse);

            final String sResponse = this.mockResponse.getOutputString();
            System.out.println(sResponse);
            // This is more of a sanity check. Ensure that the resulting XML should return the following XML(String).
            assertTrue(sResponse.equals("<gdkResponse version=\"2\"><gameResponse><instructions><financial /></instructions><responseToClient><msgdata reqName=\"ResumeGameReq\"><mainReelsConfig><reel id=\"1\">2,3,5,3,6,4,5,4,3,3,6,5,7,6,5,10,6,8,5,3,6,5,7,6,4,4,6,10,6,5,3,9,3,9,5,3,6,8,10,5,10,6,5,2,8,3,6,3,5,10,3,10,10,5,3,3,6,7,9,5,3,6,3,9,9,5,6,3,3,5,6,5,6,3,8,3,6,5,6,8,6,4,5,4,3,5,6,3,3,2,6,5,3,6,3,3,5,6,8,5,6,3,3,5,7,6,5,10,3,6,3,5,9,9,5,6,3,3,5,8,6,5,6,3,5,6,3,10,10,5</reel><reel id=\"2\">12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,7,1,1,1,1,1,8,7,1,7,11,11,5,8,7,8,7,5,2,7,8,8,4,11,9,7,9,8,11,8,10,8,5,7,11,7,5,7,3,2,5,8,8,11,6,8,5,7,7,11,4,5,8,8,2,5,8,8,11,7,7,10,3,10,10,5,7,9,9,7,11,4,5,3,7,7,5,8,8,8,5,8,6,5,5,7,11,7,3,11,5,8,4,8,7,5,7,3,7,5,7,8,8,10,10,5,10,11,6,7,8,5,8,7,5,9,5,9,9,8,8,6,5,7,3,7,5,11,7,8,5,3,5,8,5,8,6,3,5,8</reel><reel id=\"3\">12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,4,6,8,4,9,9,10,8,4,2,8,7,8,1,1,1,1,4,8,4,1,8,9,11,11,11,11,4,8,8,11,2,9,9,8,4,8,1,4,5,9,10,9,9,8,4,8,8,5,4,9,8,11,9,11,11,9,9,8,4,8,8,4,9,5,6,4,4,8,10,9,8,9,9,7,10,10,11,10,4,9,8,4,3,8,2,8,8,4,9,11,8,9,7,9,9,4,8,9,6,8,4,7,4,8,11,8,4,5,7,9,4,6,3,4,8,9,8,9,9,4,2,5,4,10,10,11,4,9,10,9,4,9,9,8,4,3,8,4,11,9,9,4,10,10,4,5,4,3,4</reel><reel id=\"4\">12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,4,5,7,6,4,1,1,1,1,7,5,4,1,9,7,11,4,7,5,7,6,4,10,6,10,10,11,4,5,5,7,8,7,5,8,4,6,5,4,6,11,5,4,11,7,7,5,4,6,4,5,9,9,4,11,7,4,7,6,5,8,6,8,4,5,6,4,11,7,7,5,3,7,4,5,10,6,10,10,5,8,8,6,4,7,3,7,5,7,4,6,5,9,4,7,2,5,7,11,6,5,4,3,8,6,8,4,7,5,7,9,9,7,5,10,2,10,10,8,8,5,4,7,11,7,6,3,5,7,4,10,5,4,7,7,8,2,8,7,5</reel><reel id=\"5\">6,7,7,9,9,3,6,4,6,5,9,9,6,3,6,6,7,7,9,9,7,7,6,3,6,9,9,5,6,2,6,7,6,7,7,3,6,9,9,6,9,8,6,3,9,9,10,6,10,5,7,7,6,6,9,9,5,4,7,6,7,9,9,6,8,6,5,8,6,7,7,9,9,7,10,10,6,6,8,6,9,9,5,2,7,6,7,7,3,6,9,9,7,7,7,6,5,4,6,9,3,9,9,8,6,8,7,3,7,6,4,9,6,9,9,10,5,10,6,7,7,8,9,9,6,6,2,7,6,7,3,9,9,10,10,6,7,10,7,7,9,9,6,3,6,8,6,10,9,9</reel></mainReelsConfig><freeSpinReelsConfig><reel id=\"1\">2,3,5,6,10,8,7,9,10,8,5,7,10,9,8,4,10,3,9,8,10,7,9,8,10,6,5,8,10,4,9,8,10,7,9,2,10,8,9,7,9,10,8,10,6,9,5,8,9,7,10,10,9,8,7,9,6,10,7,8,9,3,10,5,9,7,6,10,7,8,9,10,4,7,9,5,10,2,7,6,10,8,7,3,9,4,9,2,6,10,3,8,7,9,2,5,4,6,7,9</reel><reel id=\"2\">12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,7,8,1,1,1,1,10,7,8,11,11,7,5,8,7,1,8,2,8,7,8,4,11,9,7,8,5,7,11,8,2,7,11,8,5,7,5,3,8,2,7,5,11,8,6,8,5,7,11,8,5,7,4,2,8,5,7,11,9,8,5,7,3,10,5,7,8,9,7,11,8,5,3,7,4,8,5,10,7,8,5,6,7,8,5,9,11,7,3,11,8,5,7,4,8,5,7,8,7,3,5,8,7,10,5,11,8,7,6,5,8,9,7,5,8,10,9,7,5,8,6,3,5,7,11,5,8,9,3,5,8,5,7,10,5,8,6,3,5,8</reel><reel id=\"3\">12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,4,8,2,6,4,8,2,9,4,8,7,2,4,8,9,1,1,1,1,9,4,8,2,11,11,11,11,9,8,4,11,2,8,4,8,9,9,4,4,8,5,2,1,8,9,4,8,5,9,4,8,2,11,9,11,11,9,8,4,9,8,5,4,2,8,6,4,9,8,2,4,9,8,7,10,11,4,9,8,2,4,8,3,2,8,8,4,9,11,2,9,8,4,7,2,6,8,4,9,5,7,4,8,11,9,10,4,8,10,7,2,4,9,3,6,4,8,5,9,4,2,8,9,4,10,11,9,4,2,9,4,8,9,4,5,8,9,4,11,10,9,4,9,10,4,3,4,10,3,4</reel><reel id=\"4\">12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,4,5,7,6,4,7,5,1,1,1,1,1,4,7,9,11,4,7,5,6,4,7,10,6,11,4,5,5,7,10,5,8,4,6,5,7,4,6,5,11,4,7,11,7,4,9,6,5,4,8,9,5,4,11,7,8,4,6,7,5,10,6,4,7,8,5,6,4,11,10,7,5,3,7,4,5,10,6,5,8,7,10,6,4,3,7,5,8,4,5,7,6,9,4,7,2,5,8,7,11,6,4,5,7,3,6,8,4,5,7,9,6,5,10,7,8,4,2,7,9,5,10,11,7,8,3,5,7,4,2,8,7,5,4,10,7,2,8,7,5</reel><reel id=\"5\">2,3,5,6,10,8,7,9,10,8,5,7,10,9,8,4,10,3,9,8,10,7,9,8,10,6,5,8,10,4,9,8,10,7,9,2,10,8,9,7,9,10,8,10,6,9,5,8,9,7,10,10,9,8,7,9,6,10,7,8,9,3,10,5,9,7,6,10,7,8,9,10,4,7,9,5,10,2,7,6,10,8,7,3,9,4,9,2,6,10,3,8,7,9,2,5,4,6,7,9</reel></freeSpinReelsConfig><reels><reel id=\"1\" pos=\"0\">1,1,1,1</reel><reel id=\"2\" pos=\"0\">1,1,1,1</reel><reel id=\"3\" pos=\"0\">1,1,1,1</reel><reel id=\"4\" pos=\"0\">1,1,1,1</reel><reel id=\"5\" pos=\"0\">1,1,1,1</reel><rePattern>1,7,7</rePattern></reels><lines won=\"200\"><line id=\"3\" won=\"100\" icon=\"1\" positions=\"1,2;2,2;3,2;4,2;5,2\" /><line id=\"4\" won=\"100\" icon=\"1\" positions=\"1,0;2,1;3,2;4,1;5,0\" /></lines><creditResults wagered=\"250\" won=\"300\" /><initialWager coinValue=\"0.01\" creditWager=\"5\" /><freeSpins total=\"0\" used=\"0\" won=\"0\" /><baseGameStops>1,1,1,1,1</baseGameStops></msgdata></responseToClient></gameResponse></gdkResponse>"));
        } catch(Throwable t) {
            t.printStackTrace();
            fail();
        }
    }
}