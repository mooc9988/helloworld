package records;

import com.google.flatbuffers.FlatBufferBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeyValueTest {
    @Test
    public void test() {
        KeyValueT kv = new KeyValueT();
        kv.setKey("key");
        kv.setValue("value");
        FlatBufferBuilder builder = new FlatBufferBuilder();
        int pack = KeyValue.pack(builder, kv);
        builder.finish(pack);

        KeyValue realKv = KeyValue.getRootAsKeyValue(builder.dataBuffer());
        assertEquals(realKv.key(), kv.getKey());
        assertEquals(realKv.value(), kv.getValue());
    }

}