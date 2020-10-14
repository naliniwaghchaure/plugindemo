package ut.com.atlassian.tutorial.DataLoaderAndExporter;

import org.junit.Test;
import com.atlassian.tutorial.DataLoaderAndExporter.api.MyPluginComponent;
import com.atlassian.tutorial.DataLoaderAndExporter.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}