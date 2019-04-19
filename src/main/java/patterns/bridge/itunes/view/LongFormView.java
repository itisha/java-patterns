package patterns.bridge.itunes.view;

import patterns.bridge.itunes.resource.Resource;

public class LongFormView extends View {

    public LongFormView(Resource resource) {
        super();
        this.resource = resource;
    }

    @Override
    public String show() {
        return new StringBuilder()
                .append(resource.getTitle())
                .append(System.lineSeparator())
                .append(resource.getImageURL())
                .append(System.lineSeparator())
                .append(resource.getShortDescription())
                .append(System.lineSeparator())
                .append(resource.getLongDescription()).toString();
    }

}