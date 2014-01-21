package au.com.jaylin.pimon.rest;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface IflowListBuilder {
	public List<IFlow> build(Map<String, Date> timestamps, boolean errorsOnly);
}
