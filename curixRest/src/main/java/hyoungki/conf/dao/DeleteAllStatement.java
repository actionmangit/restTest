package hyoungki.conf.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteAllStatement implements StatementStrategy{

	@Override
	public PreparedStatement makePreparedStatement(Connection c) throws SQLException {
		
		PreparedStatement	ps	= c.prepareStatement("delete from CONF_TBL");
		return ps;
	}
}
