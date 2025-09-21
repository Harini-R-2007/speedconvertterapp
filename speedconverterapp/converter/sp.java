package converter;
public class sp{
private double speed;
public sp(double speed){
this.speed=speed;
}
public double mpsToKmph(){
return speed*3.6;
}
public double mpsToMph(){
return speed*2.23694;
}
public double KmphToMps(){
return speed/3.6;
}
public double KmphToMph(){
return speed/1.609;
}
public double mphToMps(){
return speed/2.23694;
}
public double mphToKmph(){
return speed*1.609;
}
}
