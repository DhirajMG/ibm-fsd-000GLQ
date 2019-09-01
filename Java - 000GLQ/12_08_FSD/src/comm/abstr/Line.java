package comm.abstr;

public class Line extends Model{
int startPoint;
int endPoint;
public Line() {
	super();
}
public Line(int startPoint, int endPoint) {
	super();
	this.startPoint = startPoint;
	this.endPoint = endPoint;
}

public void setStartPoint(int startPoint) {
	this.startPoint=startPoint;
}
public int getStartPoint() {
	return startPoint;
}
public void setEndPoint(int startPoint) {
	this.endPoint=endPoint;
}
public int getEndPoint() {
	return endPoint;
}
public int calculateLength() {
	return getEndPoint()-getStartPoint();
}
@Override
public boolean isGreater(Object obj1, Object obj2) {
	// TODO Auto-generated method stub
	Line m1=(Line)obj1;
	Line m2=(Line)obj2;
	return m1.calculateLength()>m2.calculateLength();
}
@Override
public boolean isLesser(Object obj1, Object obj2) {
	// TODO Auto-generated method stub
	Line m1=(Line)obj1;
	Line m2=(Line)obj2;
	return m1.calculateLength()<m2.calculateLength();
}
@Override
public boolean isEqual(Object obj1, Object obj2) {
	// TODO Auto-generated method stub
	Line m1=(Line)obj1;
	Line m2=(Line)obj2;
	return m1.calculateLength()==m2.calculateLength();
}
}
