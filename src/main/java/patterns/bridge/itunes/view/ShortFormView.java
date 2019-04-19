package patterns.bridge.itunes.view;

import patterns.bridge.itunes.resource.Resource;

public class ShortFormView extends View {

    public ShortFormView(Resource resource) {
        super();
        this.resource = resource;
    }

    @Override
    public String show() {
        return resource.getTitle() +
                System.lineSeparator() +
                resource.getImageURL();
    }

}
