package experiments;

/**
 * Created by Raksha on 07-05-2017.
 */
public class Component {

    private int componentId;
    private int startTime;
    private float endTime;
    private int date;

    public int getComponentId() {
        return componentId;
    }

    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public float getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Component(int componentId, float endTime, int date) {
        this.componentId = componentId;
        this.endTime = endTime;
        this.date = date;
    }

    public Component(int componentId, int startTime, int date) {
        this.componentId = componentId;
        this.startTime = startTime;
        this.date = date;
    }
}

