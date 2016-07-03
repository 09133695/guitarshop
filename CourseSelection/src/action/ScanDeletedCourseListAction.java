package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.PageQuery;
import model.Course;
import service.CourseService;

public class ScanDeletedCourseListAction extends ActionSupport {

	private static final long serialVersionUID = -8466300157993981394L;
	
	/**
	 * ��װ��ҳ���ҵõ��������Լ��������
	 */
	private PageQuery<Course> pageQuery;
	
	/**
	 * ���õ�ҵ���߼����
	 */
	private CourseService courseService;
	
	/**
	 * �Ƿ�Ϊ��ת
	 */
	private boolean isJump;
	
	/**
	 * ��ת����ָ��ҳ��
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
			
			pageQuery = getCourseService().scanDeletedCourse(pq);
			
		}else if(pageQuery == null || pageQuery.isFirst()){
			
			pageQuery = getCourseService().scanDeletedCourse();
			
		}else{
			
			pageQuery = getCourseService().scanDeletedCourse(pageQuery);
			
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