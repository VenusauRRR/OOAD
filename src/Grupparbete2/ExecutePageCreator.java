package Grupparbete2;

public abstract class ExecutePageCreator implements ExecutePage{

    Content contentpage;

    public ExecutePageCreator(Content contentpage){
        this.contentpage = contentpage;
    }
}
