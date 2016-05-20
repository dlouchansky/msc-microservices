package lv.ctco.cukesrest.api;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import cucumber.api.java.en.Given;
import lv.ctco.cukesrest.internal.RequestSpecificationFacade;
import lv.ctco.cukesrest.internal.helpers.time.Time;

/**
 * Created by bekas on 21/05/16.
 */

@Singleton
public class MyStepdefs {

    @Inject
    RequestSpecificationFacade facade;

    @Given("^should wait at most (\\\\d+) ([^ ]+) until status code (\\d+)$")
    public void shouldWaitAtMostSUntilStatusCode(int atMostTime, String atMostUnit, int statusCode) throws Throwable {
        this.facade.shouldWaitWithIntervalUntilStatusCodeReceived(Time.of(atMostTime, atMostUnit), Time.of(atMostTime, atMostUnit), statusCode);
    }
}
