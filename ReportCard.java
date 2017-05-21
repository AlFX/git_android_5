public class ReportCard {
    private int mItaliano;
    private int mLatino;
    private int mMatematica;
    private int mFisica;
    private int mInformatica;
    private int mChimica;
    private int mStoria;
    private int mFilosofia;
    private int mArte;
    private int mEdFisica;

    public ReportCard(int Italiano, int Latino, int Matematica, int Fisica, int Informatica, int Chimica,
                      int Storia, int Filosofia, int Arte, int EdFisica) {
        mItaliano = Italiano;
        mLatino = Latino;
        mMatematica = Matematica;
        mFisica = Fisica;
        mInformatica = Informatica;
        mChimica = Chimica;
        mStoria = Storia;
        mFilosofia = Filosofia;
        mArte = Arte;
        mEdFisica = EdFisica;
    }

    public void setmItaliano(int Italiano) {
        mItaliano = Italiano;
    }

    public void setmLatino(int Latino) {
        mLatino = Latino;
    }

    public void setmMatematica(int Matematica) {
        mMatematica = Matematica;
    }

    public void setmFisica(int Fisica) {
        mFisica = Fisica;
    }

    public void setmInformatica(int Informatica) {
        mInformatica = Informatica;
    }

    public void setmChimica(int Chimica) {
        mChimica = Chimica;
    }

    public void setmStoria(int Storia) {
        mStoria = Storia;
    }

    public void setmFilosofia(int Filosofia) {
        mFilosofia = Filosofia;
    }

    public void setmArte(int Arte) {
        mArte = Arte;
    }

    public void setmEdFisica(int EdFisica) {
        mEdFisica = EdFisica;
    }


    public int getmItaliano() {
        return mItaliano;
    }

    public int getmLatino() {
        return mLatino;
    }

    public int getmMatematica() {
        return mMatematica;
    }

    public int getmFisica() {
        return mFisica;
    }

    public int getmInformatica() {
        return mInformatica;
    }

    public int getmChimica() {
        return mChimica;
    }

    public int getmStoria() {
        return mStoria;
    }

    public int getmFilosofia() {
        return mFilosofia;
    }

    public int getmArte() {
        return mArte;
    }

    public int getmEdFisica() {
        return mEdFisica;
    }

    @Override
    public String toString() {
        return "Italiano: " + getmItaliano() +
                "\nLatino " + getmLatino() +
                "\nMatematica " + getmMatematica() +
                "\nFisica " + getmFisica() +
                "\nInformatica " + getmInformatica() +
                "\nChimica " + getmChimica() +
                "\nStoria " + getmStoria() +
                "\nFilosofia " + getmFilosofia() +
                "\nArte " + getmArte() +
                "\nEducazione Fisica" + getmEdFisica();
    }

}

