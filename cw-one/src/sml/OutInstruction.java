package sml;

/**
 * Created by elianne on 06/04/2016.
 */
public class OutInstruction extends Instruction {

    private int register;
    private int value;

    public OutInstruction(String label, String op) {
        super(label, op);
    }

    public OutInstruction(String label, int register) {
        this(label, "out");
        this.register = register;
    }

    @Override
    public void execute(Machine m) {
        this.value =  m.getRegisters().getRegister(register);
        System.out.println("The value of register " + this.register + " is " + this.value);
    }

    @Override
    public String toString() {
        return super.toString() + " print contents of register " + register ;
    }
}
