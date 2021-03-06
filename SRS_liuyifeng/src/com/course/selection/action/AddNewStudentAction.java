package com.course.selection.action;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.imageio.ImageIO;

import com.course.selection.domain.Student;
import com.course.selection.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class AddNewStudentAction extends ActionSupport {

	private static final long serialVersionUID = 2263371913528659356L;
	
	private int ID;
	
	private String messageKey;
	
	private String errorKey;
		
	private Student student;
	
	private String newPassword;
	
	private String reNewPassword;
	
	/**
	 * 封装上传文件类型的属性
	 */
	private String uploadContentType;
	/**
	 * 封装上传文件名的属性
	 */
	private String uploadFileName;

	/**
	 * 直接在struts.xml文件中配置的属性
	 */
	private String savePath;
	/**
	 * 绝对路径
	 */
	private String realPath;
	
	private StudentService studentService;
	
	/**
	 * 封装上传文件域的属性
	 */
	private File upload;
	/**
	 * @return the upload
	 */
	public File getUpload() {
		return upload;
	}

	/**
	 * @param upload the upload to set
	 */
	public void setUpload(File upload) {
		this.upload = upload;
	}

	/**
	 * @return the uploadContentType
	 */
	public String getUploadContentType() {
		return uploadContentType;
	}

	/**
	 * @param uploadContentType the uploadContentType to set
	 */
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	/**
	 * @return the uploadFileName
	 */
	public String getUploadFileName() {
		return uploadFileName;
	}

	/**
	 * @param uploadFileName the uploadFileName to set
	 */
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	/**
	 * @return the savePath
	 */
	public String getSavePath() {
		return savePath;
	}

	/**
	 * @param savePath the savePath to set
	 */
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	/**
	 * @return the realPath
	 */
	public String getRealPath() {
		return realPath;
	}

	/**
	 * @param realPath the realPath to set
	 */
	public void setRealPath(String realPath) {
		this.realPath = realPath;
	}

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
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
	public String execute() throws Exception{

		Student temp = getStudentService().getStudentByAccount(getStudent().getAccount());
		
		if(temp != null){
			setErrorKey("admin.student.add.error");
			return ERROR;
		}
		
		student.setPassword(getNewPassword());
		
		
		if(getUpload() != null){
			File dirPath = new File(getSavePath());
			if(!dirPath.exists()){
				dirPath.mkdirs();
			}
			
			File filePath = new File(dirPath, getUploadFileName());
			FileOutputStream fos = new FileOutputStream(filePath);
			
			FileInputStream fis = new FileInputStream(getUpload());
			
			byte[] buffer = new byte[1024];
			int len = 0;
			while((len = fis.read(buffer)) > 0){
				fos.write(buffer, 0, len);
			}
			
			fos.close();
			fis.close();
			this.setRealPath(filePath.getAbsolutePath());
			
			BufferedImage photo = ImageIO.read(filePath);
			student.getProfile().setPhoto(photo);
		}
		
		getStudentService().createStudent(student);
		
		setMessageKey("admin.student.add.success");
		
		return SUCCESS;
	}

	public String getErrorKey() {
		return errorKey;
	}

	public void setErrorKey(String errorKey) {
		this.errorKey = errorKey;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getReNewPassword() {
		return reNewPassword;
	}

	public void setReNewPassword(String reNewPassword) {
		this.reNewPassword = reNewPassword;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

}
