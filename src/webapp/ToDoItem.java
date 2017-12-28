package webapp;

public class ToDoItem {
	private	int id;
	private	String title;
	private String data;
	
	public ToDoItem() {
		super();
	}
	
	public ToDoItem(int _id,String _title,String _data) {
		id = _id;
		title = _title;
		data = _data;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}