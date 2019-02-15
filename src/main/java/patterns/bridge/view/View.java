package patterns.bridge.view;

import patterns.bridge.resource.Resource;

public abstract class View {

    protected Resource resource;

    //generates html to render itself
    public abstract String show();

}
