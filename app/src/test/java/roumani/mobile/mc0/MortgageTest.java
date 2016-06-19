package roumani.mobile.mc0;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class MortgageTest
{
    @Test
    public void getPaymentString_isCorrect() throws Exception
    {
        Mortgage m;
        String p, a, i;
        String result;

        p = "300000";
        a = "25";
        i = "3.5";
        m = new Mortgage(p, a, i);
        result = m.getPaymentString();
        System.out.printf("Testing p=%s, a=%s, i=%s yields %s\n", p, a, i, result);
        assertThat(result, startsWith("1501."));


        p = "300000";
        a = "30";
        i = "1.25";
        m = new Mortgage(p, a, i);
        result = m.getPaymentString();
        System.out.printf("Testing p=%s, a=%s, i=%s yields %s\n", p, a, i, result);
        assertThat(m.getPaymentString(), startsWith("999."));
    }

}
