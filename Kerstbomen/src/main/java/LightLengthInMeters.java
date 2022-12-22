public enum LightLengthInMeters {
    ONEMETER,
    FIVEMETER,
    TENMETER,
    THIRTYMETER;

    public int getNumber() {
        switch (this) {
            case ONEMETER:
                return 1;

            case FIVEMETER:
                return 5;

            case TENMETER:
                return 10;

            case THIRTYMETER:
                return 30;

            default: return 0;
        }
    }

}