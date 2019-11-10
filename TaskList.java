

public class TaskList {
	
	private String mName;
	private String mDueDate;
	private String mDueTime;
	
	public enum Priority
	{
		LOW (1),
		MEDIUM (2),
		HIGH(3);
	
	private final int mPriorityRate;
	
		private Priority(int priorityrate) 
		{
        mPriorityRate = priorityrate;
		}
	}
	
	
	private static int sTotalTasks;
	
	public TaskList(String name, String duedate, String duetime)
	{
		mName = name;
		mDueDate = duedate;
		mDueTime = duetime;

	}
	public TaskList(TaskList other)
	{
		mName = other.mName;
		mDueDate = other.mDueDate;
		mDueTime = other.mDueTime;
	}
	public String getName()
	{
		return mName;
	}
	public String getDueDate()
	{
		return mDueDate;
	}
	public String getDueTime()
	{
		return mDueTime;
	}
	
	 public int getPriorityRate() 
	 {
        return mPriorityRate;
     }
	
	
	public void setName(String name)
	{
		mName = name;
	}
	public void setDueDate(String duedate)
	{
		mDueDate = duedate;
	}
	public void setDueTime(String duetime)
	{
		mDueTime = duetime;
	}
	public String toString()
	{
		String output = "Task [Name =" + mName + ", Due Date =" + mDueDate + ", Due Time =" 
		+ mDueTime + ", Priority ="  + "]";
		return output;
	}
}

