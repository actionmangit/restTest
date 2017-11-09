package hyoungki.conf.dao.impl;

import java.util.List;

import hyoungki.conf.domain.Conf;

public interface ConfDao {
	void add(final Conf conf);
	Conf get(String userId);
	void deleteAll();
	int getCount();
	List<Conf> getAll();
}
