package action;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import model.Teacher;
import service.TeacherService;
import util.ImportExcel;

public class LoadTeacherByExcelAction extends ActionSupport {

	private static final long serialVersionUID = -9183898923669162394L;
	
	private TeacherService teacherService;
	
	private String path;
	
	private String errorKey;
	
	private String messageKey;

	public TeacherService getTeacherService() {
		return teacherService;
	}

	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 * @throws UnsupportedEncodingException 
	 */
	public void setPath(String path) throws UnsupportedEncodingException {
		this.path = URLDecoder.decode(path, "UTF-8");
	}

	/**
	 * @return the errorKey
	 */
	public String getErrorKey() {
		return errorKey;
	}

	/**
	 * @param errorKey the errorKey to set
	 */
	public void setErrorKey(String errorKey) {
		this.errorKey = errorKey;
	}

	/**
	 * @return the messageKey
	 */
	public String getMessageKey() {
		return messageKey;
	}

	/**
	 * @param messageKey the messageKey to set
	 */
	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}

	@Override
	public String execute() throws Exception {
		if(path == null || !new File(path).exists()){
			setErrorKey("admin.not.exist.uploadfile");
			return ERROR;
		}
		//���ϴ����ļ����д���
		File excel = new File(path);
		
		List<Teacher> teachers = ImportExcel.importTeacherByExcel(excel);
		
		getTeacherService().createTeachers(teachers);
		
		setMessageKey("admin.load.teacher.success");
		
		return SUCCESS;
	}
	
	

}