package builder;

public class Shaorma {


    private boolean cuKetchup;
    private boolean cuMaioneza;
    private boolean cuRosii;
    private boolean cuSalata;
    private boolean cuVarza;
    private boolean cuCarne;
    private boolean cuCurry;
    private boolean cuCastraveti;
    private boolean cuCartofi;
    private boolean cuMiniPizza;

    private Shaorma(Builder builder) {
        this.cuKetchup = builder.cuKetchup;
        this.cuMaioneza = builder.cuMaioneza;
        this.cuRosii = builder.cuRosii;
        this.cuSalata = builder.cuSalata;
        this.cuVarza = builder.cuVarza;
        this.cuCarne = builder.cuCarne;
        this.cuCurry = builder.cuCurry;
        this.cuCastraveti = builder.cuCastraveti;
        this.cuCartofi = builder.cuCartofi;
        this.cuMiniPizza = builder.cuMiniPizza;
    }

    public static Builder newShaorma() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Shaorma{" +
                "cuKetchup=" + cuKetchup +
                ", cuMaioneza=" + cuMaioneza +
                ", cuRosii=" + cuRosii +
                ", cuSalata=" + cuSalata +
                ", cuVarza=" + cuVarza +
                ", cuCarne=" + cuCarne +
                ", cuCurry=" + cuCurry +
                ", cuCastraveti=" + cuCastraveti +
                ", cuCartofi=" + cuCartofi +
                ", cuMiniPizza=" + cuMiniPizza +
                '}';
    }


    public static final class Builder {
        private boolean cuKetchup;
        private boolean cuMaioneza;
        private boolean cuRosii;
        private boolean cuSalata;
        private boolean cuVarza;
        private boolean cuCarne;
        private boolean cuCurry;
        private boolean cuCastraveti;
        private boolean cuCartofi;
        private boolean cuMiniPizza;

        private Builder() {
        }

        public Shaorma build() {
            return new Shaorma(this);
        }

        public Builder cuKetchup(boolean cuKetchup) {
            this.cuKetchup = cuKetchup;
            return this;
        }

        public Builder cuMaioneza(boolean cuMaioneza) {
            this.cuMaioneza = cuMaioneza;
            return this;
        }

        public Builder cuRosii(boolean cuRosii) {
            this.cuRosii = cuRosii;
            return this;
        }

        public Builder cuSalata(boolean cuSalata) {
            this.cuSalata = cuSalata;
            return this;
        }

        public Builder cuVarza(boolean cuVarza) {
            this.cuVarza = cuVarza;
            return this;
        }

        public Builder cuCarne(boolean cuCarne) {
            this.cuCarne = cuCarne;
            return this;
        }

        public Builder cuCurry(boolean cuCurry) {
            this.cuCurry = cuCurry;
            return this;
        }

        public Builder cuCastraveti(boolean cuCastraveti) {
            this.cuCastraveti = cuCastraveti;
            return this;
        }

        public Builder cuCartofi(boolean cuCartofi) {
            this.cuCartofi = cuCartofi;
            return this;
        }

        public Builder cuMiniPizza(boolean cuMiniPizza) {
            this.cuMiniPizza = cuMiniPizza;
            return this;
        }
    }

}
