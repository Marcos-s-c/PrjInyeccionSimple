package writer;

import java.util.HashMap;
import java.util.Map;

public class JsonSerializer implements Serializer {
    public String serialize(HashMap<String, String> hashList) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (Map.Entry<String, String> entry : hashList.entrySet()) {
            sb.append("\"").append(entry.getKey()).append("\":\"").append(entry.getValue()).append("\",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("}");
        return sb.toString();
    }

}
