import de.unitrier.st.core.CountryDataPoint;
import de.unitrier.st.core.DataLoader;
import de.unitrier.st.core.DataParser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertFalse;

public class DataTest {

    @Test
    public void tmpTest() {
        Assert.assertEquals(true, true);
    }

    @Test
    public void smartTest(){
        DataLoader dataLoader = new DataLoader();
        String json = dataLoader.loadJsonFile("countries-aggregated_json2.json");
        assertFalse(json.isEmpty());
    }
}
