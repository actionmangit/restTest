package hyoungki.conf.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import hyoungki.conf.domain.Conf;

public class AddStatement implements StatementStrategy{

	Conf	conf;
	
	public AddStatement(Conf conf) {
		this.conf	= conf;
	}
	
	@Override
	public PreparedStatement makePreparedStatement(Connection c) throws SQLException {
		
		PreparedStatement	ps	= c.prepareStatement(
				"insert into CONF_TBL(OWNER_IDX, TITLE, CREATOR_UCID, RESV_DATE, START_DATE, END_DATE, WORK_DATE, WORKER_ID)"
				+ " values(?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, conf.getOwnerIdx());
		ps.setString(2, conf.getTitle());
		ps.setString(3, conf.getCreatorUcid());
		ps.setString(4, conf.getResvDate());
		ps.setString(5, conf.getResvDate());
		ps.setString(6, conf.getResvDate());
		ps.setString(7, conf.getResvDate());
		ps.setString(8, conf.getCreatorUcid());
		
		return ps;
	}
}
