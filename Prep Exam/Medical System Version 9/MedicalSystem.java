import java.util.ArrayList;

public class MedicalSystem {

    // ---------------- DATA ----------------
    private ArrayList<MedicalStaff> staffList;

    // ---------------- CONSTRUCTOR ----------------
    public MedicalSystem() {
        staffList = new ArrayList<>();
    }

    // ---------------- CREATE ----------------
    // Adds any MedicalStaff object (Doctor or Nurse) to the list
    public void addStaff(MedicalStaff staff) {
        staffList.add(staff);
    }

    // ---------------- READ ----------------
    // Returns the MedicalStaff object at the specified index
    public MedicalStaff getStaff(int index) {
        return staffList.get(index);
    }
    
    public String getAllStaff() {
        String listOfStaff = "";
        for(int i = 0; i < staffList.size() ; i++)
        {
            listOfStaff +="Index: " + i +  getStaff(i);
        }
        return listOfStaff;
    }

    // Returns the total number of staff objects in the list
    public int getStaffCount() {
        return staffList.size();
    }

    // ---------------- VALIDATION ----------------
    // Checks if the given index is valid for the staffList ArrayList
    public boolean isValidStaffIndex(int index) {
        return index >= 0 && index < staffList.size();
    }

    // ---------------- DELETE ----------------
    // Removes the MedicalStaff object at the specified index
    public void removeStaff(int index) {
        staffList.remove(index);
    }

  

    
}