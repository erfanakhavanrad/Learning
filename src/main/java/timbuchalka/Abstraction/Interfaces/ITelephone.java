package timbuchalka.Abstraction.Interfaces;

/**
 * @author Erfan Akhavan Rad
 * @created 07/21/2023
 */
public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
