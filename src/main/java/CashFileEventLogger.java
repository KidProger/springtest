import java.util.List;

public class CashFileEventLogger extends FileEventLogger{
    private int casheSize;
    private List<Event> cashe;

    public CashFileEventLogger(int casheSize){
        this.casheSize = casheSize;
    }

    public void logEvent(Event event){
        cashe.add(event);

        if(cashe.size() == casheSize){
            wtiteEventsFromCashe();
            cashe.clear();
        }
    }

    public void destroy(){
        if(!cashe.isEmpty()){
            wtiteEventsFromCashe();
        }
    }

    public void wtiteEventsFromCashe(){

    }

}
