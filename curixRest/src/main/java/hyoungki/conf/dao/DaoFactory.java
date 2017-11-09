package hyoungki.conf.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class DaoFactory {
	
	public ConfDaoJdbc confDao() {
		ConfDaoJdbc		confDao		= new ConfDaoJdbc();
		confDao.setDataSource(dataSource());
		
		return confDao;
	}
	
	public DataSource dataSource() {
		SimpleDriverDataSource		dataSource	= new SimpleDriverDataSource();
		
		return dataSource;
	}
}
