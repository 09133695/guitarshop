package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.PageQuery;
import model.Course;
import service.CourseService;

public class ScanUnDeletedCourseListAction extends ActionSupport {

	private static final long serialVersionUID = -8466300157993981394L;
	
	/**
	 * 封装分页查找得到的数据以及请求参数
	 */
	private PageQuery<Course> pageQuery;
	
	/**
	 * 调用的业务逻辑组件
	 */
	private CourseService courseService;
	
	/**
	 * 是否为跳转
	 */
	private boolean isJump;
	
	/**
	 * 跳转到的指定页面
	 */
	private int gotoPage;

	public PageQuery<Course> getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery<Course> pageQuery) {
		this.pageQuery = pageQuery;
	}

	public CourseService getCourseService() {
		return courseService;
	}

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	@Override
	public String execute() throws Exception {
		
		if(isJump()){
			
			PageQuery<Course> pq = pageQuery.getSpecificPage(getGotoPage());
			
			pageQuery = getCourseService().scanNotDeletedCourse(pq);
			
		}else if(pageQuery == null || pageQuery.isFirst()){
			
			pageQuery = getCourseService().scanNotDeletedCourse();
			
		}else{
			
			pageQuery = getCourseService().scanNotDeletedCourse(pageQuery);
			
		}
		
		return SUCCESS;
	}

	public int getGotoPage() {
		return gotoPage;
	}

	public void setGotoPage(int gotoPage) {
		this.gotoPage = gotoPage;
	}

	public boolean isJump() {
		return isJump;
	}

	public void setJump(boolean isJump) {
		this.isJump = isJump;
	}

}
