package hyoungki.conf.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;

import hyoungki.conf.dao.impl.ConfDao;
import hyoungki.conf.domain.Conf;
import hyoungki.exception.DuplicateUserIdException;

public class ConfDaoJdbc implements ConfDao{
	
	private JdbcTemplate 	jdbcTemplate;
	private RowMapper<Conf>	confMapper	= 
					
			new RowMapper<Conf>() {

				public Conf mapRow(ResultSet rs, int rowNum) throws SQLException {
					
					Conf	conf	= new Conf();
					
					conf.setCreatorUcid(rs.getString("creator_ucid"));
					conf.setTitle(rs.getString("title"));
					conf.setResvDate(rs.getString("resv_date"));
					
					return conf;
				}
			};
	
	
	public void setDataSource(DataSource dataSource) {
		
		this.jdbcTemplate	= new JdbcTemplate(dataSource);
	}
	
	/**
	 * @param conf
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void add(final Conf conf) throws DuplicateKeyException {
		
//		try {
			this.jdbcTemplate.update("insert into CONF_TBL(OWNER_IDX, TITLE, CREATOR_UCID, RESV_DATE, START_DATE, END_DATE, WORK_DATE, WORKER_ID)"
					+ " values(?, ?, ?, ?, ?, ?, ?, ?)",
					conf.getOwnerIdx(),    
					conf.getTitle(),       
					conf.getCreatorUcid(), 
					conf.getResvDate(),    
					conf.getResvDate(),    
					conf.getResvDate(),    
					conf.getResvDate(),    
					conf.getCreatorUcid());
//		}
//		catch (SQLException e) {
//			if (e.getErrorCode() == 2601) {
//				throw new DuplicateUserIdException(e);
//			}
//			else {
//				throw new RuntimeException();
//			}
//				
//		}
		
	}
	
	/**
	 * @param userId
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public Conf get(String userId) {
//		Connection	c		= dataSource.getConnection();
//		
//		PreparedStatement	ps	= c.prepareStatement(
//				"select * from CONF_TBL where CREATOR_UCID = ?");
//		ps.setString(1, userId);
//		
//		ResultSet	rs		= ps.executeQuery();
//		Conf		conf	= null;
//		
//		if (rs.next()) {
//			conf	= new Conf();
//			
//			conf.setOwnerIdx(rs.getString("OWNER_IDX"));
//			conf.setTitle(rs.getString("TITLE"));
//			conf.setRoomNo(rs.getInt("ROOM_NO"));
//			conf.setCreatorUcid(rs.getString("CREATOR_UCID"));
//			conf.setResvDate(rs.getString("RESV_DATE"));
//			conf.setStartDate(rs.getString("START_DATE"));
//			conf.setEndDate(rs.getString("END_DATE"));
//		}
//		
//		rs.close();
//		ps.close();
//		c.close();
//		
//		if (conf == null) throw new EmptyResultDataAccessException(1);
//		
//		return conf;
		
//		return this.jdbcTemplate.queryForObject("select * from CONF_TBL where CREATOR_UCID = ?", 
//				new Object[] {userId},
//				new RowMapper<Conf>((rs, rowNum) -> {
//						Conf	conf	= new Conf();
//						
//						conf.setOwnerIdx(rs.getString("OWNER_IDX"));      
//						conf.setTitle(rs.getString("TITLE"));             
//						conf.setRoomNo(rs.getInt("ROOM_NO"));             
//						conf.setCreatorUcid(rs.getString("CREATOR_UCID"));
//						conf.setResvDate(rs.getString("RESV_DATE"));      
//						conf.setStartDate(rs.getString("START_DATE"));    
//						conf.setEndDate(rs.getString("END_DATE"));        
//						
//						return conf;
//					})
//				);	
		
		return this.jdbcTemplate.queryForObject("select * from CONF_TBL where CREATOR_UCID = ?", 
				new Object[] {userId}, this.confMapper);
	}
	
	/**
	 * @throws SQLException
	 */
	public void deleteAll() {

//		this.jdbcTemplate.update(
//		new PreparedStatementCreator() {
//			
//			@Override
//			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
//				
//				return con.prepareStatement("delete from CONF_TBL");
//			}
//		}	
//	);		
		
//		this.jdbcTemplate.update(con -> con.prepareStatement("delete from CONF_TBL"));
		
		this.jdbcTemplate.update("delete from CONF_TBL");
	}
	
	public int getCount() {
//		Connection			c	= null;	
//		PreparedStatement	ps	= null;	
//		ResultSet			rs	= null; 
//		
//		try {
//			c	= dataSource.getConnection();
//			ps	= c.prepareStatement(
//					"select count(*) from CONF_TBL");
//			rs	= ps.executeQuery();
//			rs.next();
//			
//			return rs.getInt(1); 
//		} catch(SQLException e) {
//			throw e;
//		} finally {
//			
//			if (rs != null) {
//				try {
//					rs.close();
//				} catch (SQLException e) {
//					
//				}
//			}
//			
//			if (ps != null) {
//				try {
//					ps.close();
//				} catch (SQLException e) {
//					
//				}
//			}
//			
//			if (c != null) {
//				try {
//					rs.close();
//				} catch (SQLException e) {
//					
//				}
//			}
//		}
		
		return this.jdbcTemplate.queryForInt("select count(*) from CONF_TBL");
	}

	public List<Conf> getAll() {
		
		return this.jdbcTemplate.query("select * from CONF_TBL order by room_no", this.confMapper);
	}
}
