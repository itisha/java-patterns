package patterns.bridge.itunes.view;

import patterns.bridge.itunes.resource.Resource;

public abstract class View {

    protected Resource resource;

    //generates html to render itself
    public abstract String show();

}
