package hyoungki.dao.conf;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import hyoungki.conf.dao.ConfDaoJdbc;
import hyoungki.conf.domain.Conf;
import hyoungki.conf.domain.ScheduleType;

public class ConfDaoTest {
	
	private ConfDaoJdbc dao;
	
	private Conf	conf1;
	private Conf	conf2;
	private Conf	conf3;
	
	@Before
	public void setUp() {
		
		dao	= new ConfDaoJdbc();
		SingleConnectionDataSource	dataSource	= new SingleConnectionDataSource();
		
		dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
		dataSource.setUrl("jdbc:mariadb://127.0.0.1:3306/curix55");
		dataSource.setUsername("root");
		dataSource.setPassword("1234");
		dataSource.setSuppressClose(true);
		
		dao.setDataSource(dataSource);
		
		this.conf1	= new Conf("3EF9FD4C-7745-4B78-807C-5BC34D0C6C9B", "B500F6FE-7C34-45ca-A448-F6DCC06574D6", "형기회의01", "user01", "20170710000000", ScheduleType.DAY);
		this.conf2	= new Conf("3EF9FD4C-7745-4B78-807C-5BC34D0C6C9B", "58D7744D-0DE9-42a7-BC82-87141B98B4B7", "형기회의02", "user02", "20170810000000", ScheduleType.MONTH);
		this.conf3	= new Conf("3EF9FD4C-7745-4B78-807C-5BC34D0C6C9B", "9FE68FCB-B35E-4c36-B58E-39A37CB77028", "형기회의03", "user03", "20170910000000", ScheduleType.WEEK);
	}

	@Test
	public void andAndGet() {
		
		dao.deleteAll();
		assertThat(dao.getCount(), equalTo(0));
		
		dao.add(conf1);
		dao.add(conf2);
		assertThat(dao.getCount(), equalTo(2));
		
		Conf		confget1	= dao.get(conf1.getRoomId());
		assertThat(confget1.getRoomId(), equalTo(conf1.getRoomId()));
		assertThat(confget1.getTitle(), equalTo(conf1.getTitle()));
		
		Conf		confget2	= dao.get(conf2.getRoomId());
		assertThat(confget2.getRoomId(), equalTo(conf2.getRoomId()));
		assertThat(confget2.getTitle(), equalTo(conf2.getTitle()));
	}
	
	@Test
	public void count() {

		dao.deleteAll();
		assertThat(dao.getCount(), equalTo(0));
		
		dao.add(conf1);
		assertThat(dao.getCount(), equalTo(1));
		
		dao.add(conf2);
		assertThat(dao.getCount(), equalTo(2));

		dao.add(conf3);
		assertThat(dao.getCount(), equalTo(3));
	}
	
	@Test(expected=EmptyResultDataAccessException.class)
	public void getUserFailure() {

		dao.deleteAll();
		assertThat(dao.getCount(), equalTo(0));
		
		dao.get("unknown_id");
	}
	
	@Test
	public void getAll() {
		
		dao.deleteAll();
		
		List<Conf>		confs0	= dao.getAll();
		assertThat(confs0.size(), equalTo(0));
		
		dao.add(conf1);
		List<Conf>		confs1	= dao.getAll();
		assertThat(confs1.size(), equalTo(1));
		checkSameConf(conf1, confs1.get(0));
		
		dao.add(conf2);
		List<Conf>		confs2	= dao.getAll();
		assertThat(confs2.size(), equalTo(2));
		checkSameConf(conf1, confs2.get(0));
		checkSameConf(conf2, confs2.get(1));
		
		dao.add(conf3);
		List<Conf>		confs3	= dao.getAll();
		assertThat(confs3.size(), equalTo(3));
		checkSameConf(conf1, confs3.get(0));
		checkSameConf(conf2, confs3.get(1));
		checkSameConf(conf3, confs3.get(2));
	}
	
	private void checkSameConf(Conf conf1, Conf conf2) {
		assertThat(conf1.getRoomId(), equalTo(conf2.getRoomId()));
		assertThat(conf1.getTitle(), equalTo(conf1.getTitle()));
		assertThat(conf1.getResvDate(), equalTo(conf1.getResvDate()));
	}
	
	@Test(expected = DataAccessException.class)
	public void duplciateKey() {
		dao.deleteAll();
		
		dao.add(conf1);
		dao.add(conf1);
	}
}
