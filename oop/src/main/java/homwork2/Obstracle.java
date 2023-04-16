package homwork2;

public class Obstracle {
    private  Wall wall;
    private RunningTrack road;
    public void Obstacle(Wall wall, RunningTrack road){
        this.road=road;
        this.wall=wall;
    }

    public int getRoadLength(){
        return road.getLength();
    }

    public int getWallHeight(){
        return wall.getHight();
    }
}
