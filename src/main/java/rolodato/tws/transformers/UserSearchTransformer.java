package rolodato.tws.transformers;

import java.util.HashMap;
import org.mule.transformer.AbstractTransformer;

public class UserSearchTransformer extends AbstractTransformer {
	public Object doTransform(Object src, String encoding) {
		
		HashMap map = (HashMap <String, String>) src;
		
		for (String k : new String[]{"school", "location", "userName"}) {
			if (!map.containsKey(k)) {
				map.put(k, "");
			}
		}
		
		return map;
	}
}
