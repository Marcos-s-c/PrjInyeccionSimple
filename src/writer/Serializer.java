package writer;

import java.util.HashMap;

public interface Serializer {
    String serialize(HashMap<String, String> hashList);
}
