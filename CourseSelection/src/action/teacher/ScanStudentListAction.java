package action.teacher;

import com.opensymphony.xwork2.ActionSupport;

import dao.PageQuery;
import model.Course;
import model.Student;
import service.CourseService;
import service.StudentService;

public class ScanStudentListAction extends ActionSupport {

	private static final long serialVersionUID = -7635577824068366763L;
	/**
	 * 封装分页查找得到的数据以及请求参数
	 */
	private PageQuery<Student> pageQuery;
	
	/**
	 * 调用的业务逻辑组件
	 */
	private StudentService studentService;
	
	private CourseService courseService;
	
	private Course course;
	
	private Integer courseID;
	
	/**
	 * 是否为跳转
	 */
	private boolean isJump;

	/**
	 * 跳转到的指定页面
	 */
	private int gotoPage;
	
	private String action;

	/**
	 * @return the pageQuery
	 */
	public PageQuery<Student> getPageQuery() {
		return pageQuery;
	}

	/**
	 * @param pageQuery the pageQuery to set
	 */
	public void setPageQuery(PageQuery<Student> pageQuery) {
		this.pageQuery = pageQuery;
	}

	/**
	 * @return the isJump
	 */
	public boolean isJump() {
		return isJump;
	}

	/**
	 * @param isJump the isJump to set
	 */
	public void setJump(boolean isJump) {
		this.isJump = isJump;
	}

	/**
	 * @return the gotoPage
	 */
	public int getGotoPage() {
		return gotoPage;
	}

	/**
	 * @param gotoPage the gotoPage to set
	 */
	public void setGotoPage(int gotoPage) {
		this.gotoPage = gotoPage;
	}

	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * @param action the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}


	@Override
	public String execute() throws Exception {
		
		course = getCourseService().getCourseByID(getCourseID());
		
		if(isJump()){
			
			PageQuery<Student> pq = pageQuery.getSpecificPage(getGotoPage());
			
			pageQuery = getStudentService().scanStudentByCourse(pq,course);
			
		}else if(pageQuery == null || pageQuery.isFirst()){
			
			pageQuery = getStudentService().scanStudentByCourse(null, course);
			
		}else{
			
			pageQuery = getStudentService().scanStudentByCourse(pageQuery, course);
			
		}
		
		return SUCCESS;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Integer getCourseID() {
		return courseID;
	}

	public void setCourseID(Integer courseID) {
		this.courseID = courseID;
	}

	public CourseService getCourseService() {
		return courseService;
	}

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

}
