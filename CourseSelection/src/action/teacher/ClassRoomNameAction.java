package action.teacher;

import java.util.List;

import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;

import service.ClassRoomService;

public class ClassRoomNameAction extends ActionSupport {

	private static final long serialVersionUID = 6711012795296417823L;
	
	private List<String> names;
	
	private ClassRoomService classRoomService;
	
	@Override
	public String execute() throws Exception {
		
		List<String> temp = getClassRoomService().getClassRoomNames();
		
		setNames(temp);
		
		return SUCCESS;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}
	@JSON(serialize=false)
	public ClassRoomService getClassRoomService() {
		return classRoomService;
	}

	public void setClassRoomService(ClassRoomService classRoomService) {
		this.classRoomService = classRoomService;
	}

}
