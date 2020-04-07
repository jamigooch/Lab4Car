
public class CarClass {

    //Accessors (Get values of YearModel, Make, Speed Field)
    public int YearModel;
    public String Make;
    public int Speed;

    //Set Year Model
    public void SetYearModel(int YearModel) {
        this.YearModel = YearModel;
    }

    //Get Year Model
    public int GetYearModel() {
        return YearModel;
    }

    //Set Make
    public void SetMake(String Make) {
        this.Make = Make;
    }

    //Get Make
    public String GetMake() {
        return Make;
    }

    //Set Speed
    public void SetSpeed(int Speed) {
        this.Speed = Speed;
    }

    //Get Speed
    public int GetSpeed() {
        return Speed;
    }

    //Accelerate (Add 5 to Speed Field)
    public void Accelerate() {
        Speed = Speed + 5;
    }

    //Brake (Subtract 5 from Speed Field)
    public void Brake() {
        Speed = Speed - 5;
    }

}
