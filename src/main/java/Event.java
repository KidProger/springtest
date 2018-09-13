import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

public class Event {
    private final Random random = new Random();
    private int id = random.nextInt();
    private String msg;
    private Date date;
    private DateFormat df;

    public Event(Date date, DateFormat df){
        this.date = date;
        this.df = df;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return id+""+msg+""+df.format(date);
    }
}
