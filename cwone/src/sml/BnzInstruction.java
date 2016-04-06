package sml;

/**
 * Created by elianne on 06/04/2016.
 */
public class BnzInstruction extends Instruction {
    private int register;
    private String nextLabel;

    public BnzInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public BnzInstruction(String label, int register, String next) {
        super(label, "lin");
        this.register = register;
        this.nextLabel = next;

    }

    @Override
    public void execute(Machine m) {
        if(m.getRegisters().getRegister(register)!=0) {
            int labelIndex = m.getLabels().indexOf(this.nextLabel);
            if(labelIndex<0) {
                System.err.println("The instruction label on instruction "+this.label+" does not exist. Exiting.");
                System.exit(-1);
            } else {
                m.setPc(labelIndex);
            }



        }
    }

    @Override
    public String toString() {
        return super.toString() + " jump to instruction " + nextLabel;
    }
}


