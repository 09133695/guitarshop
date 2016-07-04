package service;

import dao.PageQuery;
import exception.RoleExistException;
import model.ClassRoom;
import model.Course;
import model.Role;
import model.Student;
import model.Teacher;
import model.User;

/**
 * ����Աҵ���ӿ�
 * @author Administrator
 *
 */
public interface AdminService {
	/**
	 * ����ȫ�����ң���һҳ
	 * @return
	 */
	PageQuery<ClassRoom> searchClassRoomByAll();
	
	/**
	 * ����ȫ�����ң�����ҳ
	 * @param pq
	 * @return
	 */
	PageQuery<ClassRoom> searchClassRoomByAll(PageQuery<ClassRoom> pq);	
	
	/**
	 * ����ȫ����ʦ����һҳ
	 * @return
	 */
	PageQuery<Teacher> searchTeacherByAll();
	
	/**
	 * ����ȫ����ʦ������ҳ
	 * @param pq
	 * @return
	 */
	PageQuery<Teacher> searchTeacherByAll(PageQuery<Teacher> pq);	
	/**
	 * ��������������ʦ,��һҳ
	 * @param name
	 * @return
	 */
	PageQuery<Teacher> searchTeacherByName(String name);
	/**
	 * ��������������ʦ������ҳ
	 * @param pq
	 * @param name
	 * @return
	 */
	PageQuery<Teacher> searchTeacherByName(PageQuery<Teacher> pq,String name);
	/**
	 * ����ȫ��ѧ������һҳ
	 * @return
	 */
	PageQuery<Student> searchStudentByAll();
	
	/**
	 * ����ȫ��ѧ��������ҳ
	 * @param pq
	 * @return
	 */
	PageQuery<Student> searchStudentByAll(PageQuery<Student> pq);	
	/**
	 * ������������ѧ��,��һҳ
	 * @param name
	 * @return
	 */
	PageQuery<Student> searchStudentByName(String name);
	/**
	 * ������������ѧ��������ҳ
	 * @param pq
	 * @param name
	 * @return
	 */
	PageQuery<Student> searchStudentByName(PageQuery<Student> pq,String name);

	/**
	 * ���ݰ༶����ѧ��,��һҳ
	 * @param name
	 * @return
	 */
	PageQuery<Student> searchStudentByClass(String clazz);
	/**
	 * ���ݰ༶����ѧ��������ҳ
	 * @param pq
	 * @param name
	 * @return
	 */
	PageQuery<Student> searchStudentByClass(PageQuery<Student> pq,String clazz);
	/**
	 * ����Ժϵ����ѧ��,��һҳ
	 * @param name
	 * @return
	 */
	PageQuery<Student> searchStudentByDepartment(String department);
	/**
	 * ����Ժϵ����ѧ��������ҳ
	 * @param pq
	 * @param name
	 * @return
	 */
	PageQuery<Student> searchStudentByDepartment(PageQuery<Student> pq,String department);
	/**
	 * ɾ���γ�
	 * @param course
	 */
	void deleteCourse(Course course);
	
	/**
	 * ����һ�ſγ�
	 * @param course
	 * @return
	 */
	void addCourse(Course course);
	
	/**
	 * �ѿγ���ӵ�����
	 * @param course
	 * @param classroom
	 * @return
	 */
	boolean addCourseToClassRoom(Course course,ClassRoom classroom);
	
	/**
	 * �޸Ŀγ���Ϣ
	 * @param course
	 * @return
	 */
	void alterCourse(Course course);
	
	/**
	 * ����һ�ֽ�ɫ
	 * @param role
	 * @return
	 * @throws RoleExistException 
	 */
	Integer createRole(Role role) throws RoleExistException;
	/**
	 * �޸Ĺ���Աʵ��
	 * @param user
	 */
	void modifyAdmin(User user);
	/**
	 * ͨ����ʶ���Ի��ʵ��
	 * @param id
	 * @return
	 */
	User getAdminByID(Integer id);
	
}
