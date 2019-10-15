package MyIP;

public class Task {
	private String TaskDescription; 
	private String TaskId; 
	private String TaskDate;
	private String TaskName;
	private String ProjectName;
	private String TaskStatus;
	
	public Task(String TaskDescription, String id, String date, String name, String projectName ,String TaskStatus) {
		super();
		this.TaskDescription = TaskDescription;
		this.TaskId = TaskId;
		this.TaskDate = TaskDate;
		this.TaskName = TaskName;
		this.ProjectName = ProjectName;
		this.TaskStatus = TaskStatus;
	}

	public String getTaskStatus() {
		return TaskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		TaskStatus = taskStatus;
	}
	
	public String getDescription() {
		return TaskDescription;
	}

	public void setDescription(String description) {
		this.TaskDescription = description;
	}

	public String getTaskId() {
		return TaskId;
	}

	public void setTaskId(String TaskId) {
		this.TaskId = TaskId;
	}

	public String getDate() {
		return TaskDate;
	}

	public void setDate(String date) {
		this.TaskDate = date;
	}

	public String getTaskName() {
		return TaskName;
	}

	public void setName(String name) {
		this.TaskName = name;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String ProjectName) {
		this.ProjectName =ProjectName;
	}
	
	
	public String toString() {
	    return "TaskId="+TaskId+"\n"+"TaskName="+TaskName+"\n"+"TaskStatus="+TaskStatus+"\n"+"TaskDate="+TaskDate+"\n"+"ProjectName="+ProjectName;
	}

}
