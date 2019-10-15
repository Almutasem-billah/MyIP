package MyIP;
import java.util.*;

public class TaskRegister {
			
	// Here will create an ArrayList
	    
	   private Task task;
	 private ArrayList<Task> tasksList=new ArrayList<Task>();  
	 

	 
	 public ArrayList<Task> getTasksList() {
		return tasksList;
	}

	public void setTasksList(ArrayList<Task> tasksList) {
		this.tasksList = tasksList;
	}

	public void addtask(Task atask) {
	     
	     tasksList.add(task);
	     
	 }

	public void removeTask(String taskId) {
	        Task tmpTask;
	        tmpTask = this.searchTask(taskId);
	        tasksList.remove(tmpTask);
	}


	private Task searchTask(String taskId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Task findTask(String TaskId)
	 {
	     
	     for(Task Task:tasksList)
	     {
		
		 if(task.getTaskId().equals(TaskId))
		 {
		     return task;    
		 }
		 	 
	     }
	     return null;
	 }
	 }
	
	
	
	
	
	
	