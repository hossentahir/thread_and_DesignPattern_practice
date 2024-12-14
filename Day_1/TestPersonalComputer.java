public class TestPersonalComputer {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer.PersonalComputerBuilder("Intel", 16).setProcessor("AMD")
                .setGraphicsCard(true)
                .getPersonalComputer();
        System.out.println(pc);
    }
}

class PersonalComputer {
    String processor;
    int ramSize;
    int hardDriveSize;
    boolean graphicsCard;
    boolean operatingSystem;

    public PersonalComputer(PersonalComputerBuilder builder) {
        this.processor = builder.processor;
        this.ramSize = builder.ramSize;
        this.hardDriveSize = builder.hardDriveSize;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }

    @Override
    public String toString() {
        return "PersonalComputer [processor=" + processor + ", ramSize=" + ramSize + ", hardDriveSize=" + hardDriveSize
                + ", graphicsCard=" + graphicsCard + ", operatingSystem=" + operatingSystem + "]";
    }

    public static class PersonalComputerBuilder {

        String processor;
        int ramSize;
        int hardDriveSize;
        boolean graphicsCard;
        boolean operatingSystem;

        public PersonalComputerBuilder setHardDriveSize(int hardDriveSize) {
            this.hardDriveSize = hardDriveSize;
            return this;
        }

        public PersonalComputerBuilder setGraphicsCard(boolean graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public PersonalComputerBuilder setOperatingSystem(boolean operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public PersonalComputerBuilder(String processor, int ramSize) {
            this.processor = processor;
            this.ramSize = ramSize;
        }

        public PersonalComputerBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public PersonalComputer getPersonalComputer() {
            return new PersonalComputer(this);
        }

    }

}