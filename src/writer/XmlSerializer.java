package writer;

import java.util.HashMap;
import java.util.Map;

public class XmlSerializer implements Serializer {
    public String serialize(HashMap<String, String> hashList) {
        StringBuilder sb = new StringBuilder();
        sb.append("<hashList>");
        for (Map.Entry<String, String> entry : hashList.entrySet()) {
            sb.append("<").append(entry.getKey()).append(">").append(entry.getValue()).append("</").append(entry.getKey()).append(">");
        }
        sb.append("</hashList>");
        return sb.toString();
    }

}
