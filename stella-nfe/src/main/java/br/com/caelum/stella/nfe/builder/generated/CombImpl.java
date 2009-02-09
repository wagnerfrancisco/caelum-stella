package br.com.caelum.stella.nfe.builder.generated;

import br.com.caelum.stella.nfe.ObjectCreator;

public final class CombImpl implements Comb, br.com.caelum.stella.nfe.ObjectCreator {
    private final br.com.caelum.stella.nfe.modelo.Comb comb;

    public CombImpl() {
        comb = new br.com.caelum.stella.nfe.modelo.Comb();
    }

    public br.com.caelum.stella.nfe.modelo.Comb getInstance() {
        return comb;
    }

    public Comb withCProdANP(final String string) {
        comb.setCProdANP(string);
        return this;
    }

    public Comb withCODIF(final String string) {
        comb.setCODIF(string);
        return this;
    }

    public Comb withQTemp(final String string) {
        comb.setQTemp(string);
        return this;
    }

    public Comb withCIDE(final CIDE cIDE) {
        comb.setCIDE((br.com.caelum.stella.nfe.modelo.CIDE) ((ObjectCreator) cIDE).getInstance());
        return this;
    }

    public Comb withICMSComb(final ICMSComb iCMSComb) {
        comb.setICMSComb((br.com.caelum.stella.nfe.modelo.ICMSComb) ((ObjectCreator) iCMSComb).getInstance());
        return this;
    }

    public Comb withICMSInter(final ICMSInter iCMSInter) {
        comb.setICMSInter((br.com.caelum.stella.nfe.modelo.ICMSInter) ((ObjectCreator) iCMSInter).getInstance());
        return this;
    }

    public Comb withICMSCons(final ICMSCons iCMSCons) {
        comb.setICMSCons((br.com.caelum.stella.nfe.modelo.ICMSCons) ((ObjectCreator) iCMSCons).getInstance());
        return this;
    }
}