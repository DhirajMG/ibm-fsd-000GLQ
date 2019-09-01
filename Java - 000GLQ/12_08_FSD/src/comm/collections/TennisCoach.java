package comm.collections;

public class TennisCoach implements Coach{
private String name;
private Level level;

public TennisCoach() {
	
}
@Override 
public String getDailyWorkout() {
	return "Practice back volley today..";
	
}
public void createCoach(String name,Level level) {
	this.name=name;
	this.level=level;
}
public String getName() {
	return name;
	
}
public void setName(String name) {
	this.name=name;
}
public Level getLevel() {
	return level;
}
public void setLevel(Level level) {
	this.level=level;
}
public String getCoachDetails() {
	StringBuilder sb = new StringBuilder();
	sb.append("Today's Workout plan:" + getDailyWorkout() +"\n");
	sb.append("Name of the coach:"+getName()+"\n");
	sb.append("Level of the coach:  " + level + "\n");
	sb.append("Coach's rank is:" + level.getLevelCode());
	return sb.toString();
}
}
