package homwork2;

public class Obstracle {
    private  Wall wall;
    private Road road;
    public Obstacle(Wall wall, RunningTrack road){
        this.road=road;
        this.wall=wall;
    }
    // Получает длину дорожки
    public int getRoadLength(){
        return road.getLenght();
    }
    // Получает высоту стенки
    public Double getWallHeight(){
        return wall.getHeight();
    }
}
