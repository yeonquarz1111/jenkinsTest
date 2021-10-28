package mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("service")
public class EmpServiceImpl implements EmpService{
	
	@Autowired //만들어진 dao 를 자동으로 나에게 주입해줘 - setter 뺌
	EmpDAO dao;
	
	@Override
	public List<EmpVO> getEmpList() {
		//dao 1개 메소드 select count(*) from employees sql 실행
		return dao.emplist();
	}
		 
	@Override
	public EmpVO getEmpOne (int id) {
		return dao.empone(id);
	}
	@Override
	public void insertEmp(EmpVO vo) {
		EmpVO result = dao.empone(vo.getEmployee_id()); //해당 아이디 가진 데이터가 존재하는지
		if (result == null) {dao.insertemp(vo); } //한개 서비스 계층 메소드에서 sql 두개 실행
		else {}//이미 해당 사번의 사원 존재 
		//서비스는 기능 단위이므로 두 개의 메소드 호출 가능
	}
	@Override
	public void updateEmp(EmpVO vo) {
		dao.updateemp(vo);
		
	}
	@Override
	public void deleteEmp(String name) {
		name = "%" + name + "%"; //메인에서 주는 이름을 포함하는 이름을 삭제하도록
		dao.deleteemp(name);
		
	}
	@Override
	public int cnt() {
		return dao.cnt();
	}
	@Override
	public List<EmpVO> getDeptList(int[] a) {
		return dao.empdeptlist(a);
	}
	
	
	
}
