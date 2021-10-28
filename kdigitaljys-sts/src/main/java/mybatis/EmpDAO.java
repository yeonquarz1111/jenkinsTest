package mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import org.springframework.stereotype.Repository;


@Mapper //@Mapper-scan 어노테이션 스프링 시작파일에서 설정
@Repository //@Component-scan
public interface EmpDAO { //DAO = 데이터가 있는 곳에 직접 가서 접근, sql 실행하는 객체

	//@Autowired SqlSession session; //세션을 대신해서 mapper 넣음

	public List<EmpVO> emplist(); 
	
	//0.sql-mapping.xml 주석 해제
	//1.메소드 이름을 session.xxx("emp.mapping 파일 id", xxx);
	//2.메소드 구현부 삭제
	//3.EmpService, EmpServiceImpl 주석해제. dao 호출메소드 수정
	//4.컨트롤러 getdeptlist 주석 해제 후 실행

	
	public EmpVO empone(int id);
	
	public void insertemp(EmpVO vo);
	
	public void updateemp(EmpVO vo);
	
	public void deleteemp(String name);
	
	public int cnt();
	
	public List<EmpVO> empdeptlist(int [] dept_list);
	

}
