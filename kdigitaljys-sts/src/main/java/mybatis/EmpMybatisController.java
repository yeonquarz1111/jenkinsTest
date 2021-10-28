package mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EmpMybatisController {
	
	@Autowired
	@Qualifier("service")
	EmpService service;

	@RequestMapping("/emplist")
	public ModelAndView emplist() {
		List<EmpVO> list = service.getEmpList();
		ModelAndView mv= new ModelAndView();
		
		mv.addObject("emplist", list); //모델에 emplist 이름으로 모델 만들기
		mv.setViewName("/mybatis/emplist");
		
		
		return mv;
	}
	
	@RequestMapping(value="/empdeptlist" , method=RequestMethod.GET)
	public String empDeptForm() {
		
		return "/mybatis/empdeptform";
	
	}
	@RequestMapping(value="/empdeptlist" , method=RequestMethod.POST)
	public ModelAndView empDeptList(int []dept_list) { //여러개 데이터 저장. 정수 타입 형변환 자동
		List<EmpVO> deptlist = service.getDeptList(dept_list);
		ModelAndView mv = new ModelAndView();
		mv.addObject("empdeptlist",deptlist);
		mv.setViewName("/mybatis/empdeptlist");
		return mv;
	}
	
	
}
