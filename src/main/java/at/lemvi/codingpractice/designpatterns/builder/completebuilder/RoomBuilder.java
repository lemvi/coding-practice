package at.lemvi.codingpractice.designpatterns.builder.completebuilder;

import java.awt.*;

public interface RoomBuilder {
    RoomBuilder setDimensions(Dimension dimensions);

    RoomBuilder setCeilingHeight(int ceilingHeight);

    RoomBuilder setFloorNumber(int floorNumber);

    RoomBuilder setWallColor(Color wallColor);

    RoomBuilder setNumberOfWindows(int numberOfWindows);

    RoomBuilder setNumberOfDoors(int numberOfDoors);
}
