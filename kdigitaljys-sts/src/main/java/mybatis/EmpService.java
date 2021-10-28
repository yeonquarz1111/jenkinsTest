package mybatis;

import java.util.List;

public interface EmpService {
	public List<EmpVO> getEmpList();
	public EmpVO getEmpOne(int id);
	public void insertEmp(EmpVO vo);
	public void updateEmp(EmpVO vo);
	public void deleteEmp(String name);
	public int cnt();
	public List<EmpVO> getDeptList(int [] a);
	
}
