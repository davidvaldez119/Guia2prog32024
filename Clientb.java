import java.util.UUID;
public class Clientb {
        private String name;
        private char gen;
        private UUID uuid;

        public Clientb (UUID uuid,String name,char gen) {
            this.setUuid(UUID.randomUUID());
            this.name=name;
            this.gen=gen;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public char getGen() {
            return gen;
        }
        public void setGen(char gen) {
            this.gen = gen;
        }

        @Override
        public String toString() {
            return "Client [name=" + name + ", gen=" + gen + "]";
        }

        public UUID getUuid() {
            return uuid;
        }

        public void setUuid(UUID uuid) {
            this.uuid = uuid;
        }


    }

