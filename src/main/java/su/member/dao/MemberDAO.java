package su.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import su.member.dto.MemberDTO;
import su.member.service.MemberService;

public class MemberDAO implements MemberService {
	
	private static Log log = LogFactory.getLog(MemberDAO.class);

	@Override
	public ArrayList<MemberDTO> memberSelectAll() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		ArrayList<MemberDTO> arrayList = new ArrayList<MemberDTO>();
		
		try {
			Context context = new InitialContext();
			DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc");
			connection = dataSource.getConnection();		
			
			String sql = "select * from member";
			log.info("전체 조회 SQL 확인 - " + sql);
			
			preparedStatement = connection.prepareStatement(sql);		
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				MemberDTO memberDTO = new MemberDTO();
				memberDTO.setMember_number(resultSet.getInt("member_number"));
				memberDTO.setMember_create(resultSet.getString("member_create"));
				memberDTO.setMember_update(resultSet.getString("member_update"));
				memberDTO.setMember_status(resultSet.getString("member_status"));
				memberDTO.setMember_id(resultSet.getString("member_id"));
				memberDTO.setMember_password(resultSet.getString("member_password"));
				memberDTO.setMember_name(resultSet.getString("member_name"));
				memberDTO.setMember_birth(resultSet.getString("member_birth"));
				memberDTO.setMember_email(resultSet.getString("member_email"));
				memberDTO.setMember_phone(resultSet.getString("member_phone"));
				memberDTO.setMember_rate(resultSet.getInt("member_rate"));
				memberDTO.setMember_address(resultSet.getString("member_address"));
				
				arrayList.add(memberDTO);
			}
			
			resultSet.getRow();

			if(resultSet.getRow() == 0) {
				log.info("등록한 회원이 없습니다. 회원을 등록해주세요");
			}
			
		} catch (Exception e) {
			log.info("전체 회원 조회 실패 - " + e);
		} finally {
			try {
				resultSet.close();
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return arrayList;
	}

	@Override
	public MemberDTO memberSelect(int member_number) {

		return null;
	}

	@Override
	public MemberDTO memberInsert(MemberDTO memberDTO) {

		return null;
	}

	@Override
	public MemberDTO memberUpdate(MemberDTO memberDTO) {

		return null;
	}

	@Override
	public MemberDTO memberDelete(int member_number) {

		return null;
	}

}
