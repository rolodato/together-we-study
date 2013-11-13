package rolodato.tws.transformers;

import java.util.HashMap;
import org.mule.transformer.AbstractTransformer;

public class LfgSearchTransformer extends AbstractTransformer {
	public Object doTransform(Object src, String encoding) {
		
		HashMap map = (HashMap <String, String>) src;
		
		for (String k : new String[]{"title", "studySubject", "owner", "before", "after"}) {
			if (!map.containsKey(k)) {
				map.put(k, "");
			}
		}
		
		if (!map.containsKey("startTime")) {
			map.put("startTime", "00:00");
		}
		
		if (!map.containsKey("endTime")) {
			map.put("endTime", "23:59:59");
		}
		
		return map;
	}
}
