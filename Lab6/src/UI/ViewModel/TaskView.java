package UI.ViewModel;

public class TaskView {
    private int id;
    private String name;
    private String description;
    private WorkerView owner;

    public TaskView(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public TaskView(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WorkerView getOwner() {
        return owner;
    }

    public void setOwner(WorkerView owner) {
        this.owner = owner;
    }
}
<<<<<<< HEAD

=======
>>>>>>> 796b62f3b6b590a60f88f3488e46281af90009af
