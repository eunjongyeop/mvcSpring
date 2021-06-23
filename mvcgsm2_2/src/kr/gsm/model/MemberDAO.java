package kr.gsm.model;
// JDBC -> myBatis
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class MemberDAO {
	private Connection conn;	// DB 연결 객체
	private PreparedStatement ps;	// SQL 전송객체
	private ResultSet rs;	// 결과 집합을 담는 객체
	
	// 연결 동작
	public void getConnect() {
		String url = "jdbc:mysql://localhost:3306/mysql";
		String user = "root";
		String password = "12345";
		// 드라이버클래스를 메모리에 로딩 : com.mysql.jdbc.Driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	// 저장동작
	public int memberInsert(MemberVO vo) {
		getConnect();
		//		 	불완전환 SQL										  // 파라미터 : 1, 2, 3, 4, 5, 6
		String SQL="insert into member(id, pass, name, age, phone, email) values(?, ?, ?, ?, ?, ?)";
		int cnt=0;
		
		try {
			ps = conn.prepareStatement(SQL);	// SQL문장 전송 객체 생성
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPass());
			ps.setString(3, vo.getName());
			ps.setInt(4, vo.getAge());
			ps.setString(5, vo.getPhone());
			ps.setString(6, vo.getEmail());
			cnt = ps.executeUpdate();	// 실행
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cnt;	// 성공-1, 실패-0
	}
	
	// 회원전체리스트 : List<MmemberVO>
	public List<MemberVO> memberList() {
		getConnect();
		String SQL = "Select * from member order by id asc";
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		try {
			ps = conn.prepareStatement(SQL);
			rs = ps.executeQuery();
	
			while(rs.next()) {
				int num = rs.getInt("num");
				String id = rs.getString("id");
				String pass = rs.getString("pass");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String phone = rs.getString("phone");
				String email = rs.getString("email");
				
				MemberVO vo = new MemberVO();
				vo.setNum(num);
				vo.setId(id);
				vo.setPass(pass);
				vo.setName(name);
				vo.setAge(age);
				vo.setPhone(phone);
				vo.setEmail(email);
				
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	// 멤버 삭제
	public int memberDelete(int num) {
		getConnect();
		String SQL = "Delete from member where num = ?";
		int cnt = 0;
		
		try {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, num);
			cnt = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cnt;
	}
	
	public MemberVO memberContent(int num) {
		getConnect();
		String SQL = "Select * from member where num = ?";
		MemberVO vo = null;
		
		try {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, num);
			rs = ps.executeQuery();	// 실행
			
			if (rs.next()) {
				num = rs.getInt("num");
				String id = rs.getString("id");
				String pass = rs.getString("pass");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String phone = rs.getString("phone");
				String email = rs.getString("email");
				
				vo = new MemberVO();
				vo.setNum(num);
				vo.setId(id);
				vo.setPass(pass);
				vo.setName(name);
				vo.setAge(age);
				vo.setPhone(phone);
				vo.setEmail(email);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return vo;
	}
	public int memberUpdate(MemberVO vo) {
		getConnect();
		String SQL = "Update member set age = ?, phone = ?, email = ? where num = ?";
		int cnt = 0;
		
		try {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, vo.getAge());
			ps.setString(2, vo.getPhone());
			ps.setString(3, vo.getEmail());
			ps.setInt(4, vo.getNum());
			
			cnt = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cnt;
	}
}
