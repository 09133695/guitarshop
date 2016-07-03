package action.student;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.PageQuery;
import model.Course;
import service.CourseService;

public class CourseSelectAction extends ActionSupport {

	private static final long serialVersionUID = -290024252377552045L;
	
	private CourseService courseService;
	
	private Boolean courseSelect;

	public CourseService getCourseService() {
		return courseService;
	}

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}


	@Override
	public String execute() throws Exception {
		
		courseSelect = (Boolean) ServletActionContext.getServletContext().getAttribute("courseSelect");
		if(courseSelect !=  null && courseSelect){
			setCourseSelect(true);
		}
		if(getCourseSelect() == null || !getCourseSelect()){
			PageQuery<Course> pq = getCourseService().scanPickableCourse();
			if(pq != null && !pq.getDatas().isEmpty()){
				setCourseSelect(true);				
			}
		}
		
		return SUCCESS;
	}

	public Boolean getCourseSelect() {
		return courseSelect;
	}

	public void setCourseSelect(Boolean courseSelect) {
		this.courseSelect = courseSelect;
	}


}
