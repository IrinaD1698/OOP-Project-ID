package bg.tu_varna.sit.f24621698.cmdlintf;

import bg.tu_varna.sit.f24621698.Shape;
import bg.tu_varna.sit.f24621698.ShapeManager;
import java.util.List;

public class Context {

    public String currentFile = null;

    private ShapeManager shapeManager = new ShapeManager();

    public ShapeManager getShapeManager() {
        return shapeManager;
    }

    /**
     * Resets the application state.
     * Required for the 'close' command logic[cite: 72, 92].
     */
    public void clear() {
        currentFile = null;
        shapeManager.clear();
    }
}