/*
* generated by Xtext
*/
package sc.ndt.editor.fast.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import sc.ndt.editor.fast.services.FastadnGrammarAccess;

public class FastadnParser extends AbstractContentAssistParser {
	
	@Inject
	private FastadnGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected sc.ndt.editor.fast.ui.contentassist.antlr.internal.InternalFastadnParser createParser() {
		sc.ndt.editor.fast.ui.contentassist.antlr.internal.InternalFastadnParser result = new sc.ndt.editor.fast.ui.contentassist.antlr.internal.InternalFastadnParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelFastadnAccess().getAlternatives_21(), "rule__ModelFastadn__Alternatives_21");
					put(grammarAccess.getTNUMBERAccess().getAlternatives(), "rule__TNUMBER__Alternatives");
					put(grammarAccess.getNAtolerAccess().getNameAlternatives_3_0(), "rule__NAtoler__NameAlternatives_3_0");
					put(grammarAccess.getNRhoAccess().getNameAlternatives_3_0(), "rule__NRho__NameAlternatives_3_0");
					put(grammarAccess.getModelFastadnAccess().getGroup(), "rule__ModelFastadn__Group__0");
					put(grammarAccess.getTARRAY_STRAccess().getGroup(), "rule__TARRAY_STR__Group__0");
					put(grammarAccess.getHeaderAccess().getGroup(), "rule__Header__Group__0");
					put(grammarAccess.getSUnitsAccess().getGroup(), "rule__SUnits__Group__0");
					put(grammarAccess.getSStallModAccess().getGroup(), "rule__SStallMod__Group__0");
					put(grammarAccess.getSUseCmAccess().getGroup(), "rule__SUseCm__Group__0");
					put(grammarAccess.getSInfModelAccess().getGroup(), "rule__SInfModel__Group__0");
					put(grammarAccess.getSIndModelAccess().getGroup(), "rule__SIndModel__Group__0");
					put(grammarAccess.getNAtolerAccess().getGroup(), "rule__NAtoler__Group__0");
					put(grammarAccess.getSTLModelAccess().getGroup(), "rule__STLModel__Group__0");
					put(grammarAccess.getSHLModelAccess().getGroup(), "rule__SHLModel__Group__0");
					put(grammarAccess.getFWindFileAccess().getGroup(), "rule__FWindFile__Group__0");
					put(grammarAccess.getNHHAccess().getGroup(), "rule__NHH__Group__0");
					put(grammarAccess.getNTwrShadAccess().getGroup(), "rule__NTwrShad__Group__0");
					put(grammarAccess.getNShadHWidAccess().getGroup(), "rule__NShadHWid__Group__0");
					put(grammarAccess.getNTShadRefPtAccess().getGroup(), "rule__NTShadRefPt__Group__0");
					put(grammarAccess.getNRhoAccess().getGroup(), "rule__NRho__Group__0");
					put(grammarAccess.getNKinViscAccess().getGroup(), "rule__NKinVisc__Group__0");
					put(grammarAccess.getNDTAeroAccess().getGroup(), "rule__NDTAero__Group__0");
					put(grammarAccess.getINumFoilAccess().getGroup(), "rule__INumFoil__Group__0");
					put(grammarAccess.getAAirfoilListAccess().getGroup(), "rule__AAirfoilList__Group__0");
					put(grammarAccess.getAAirfoilListAccess().getGroup_7(), "rule__AAirfoilList__Group_7__0");
					put(grammarAccess.getIBldNodesAccess().getGroup(), "rule__IBldNodes__Group__0");
					put(grammarAccess.getAAirStatAccess().getGroup(), "rule__AAirStat__Group__0");
					put(grammarAccess.getAAirStatAccess().getGroup_15(), "rule__AAirStat__Group_15__0");
					put(grammarAccess.getModelFastadnAccess().getHeadAssignment_0(), "rule__ModelFastadn__HeadAssignment_0");
					put(grammarAccess.getModelFastadnAccess().getSIUnitsAssignment_1(), "rule__ModelFastadn__SIUnitsAssignment_1");
					put(grammarAccess.getModelFastadnAccess().getStallModAssignment_2(), "rule__ModelFastadn__StallModAssignment_2");
					put(grammarAccess.getModelFastadnAccess().getUseCmAssignment_3(), "rule__ModelFastadn__UseCmAssignment_3");
					put(grammarAccess.getModelFastadnAccess().getInfModelAssignment_4(), "rule__ModelFastadn__InfModelAssignment_4");
					put(grammarAccess.getModelFastadnAccess().getIndModelAssignment_5(), "rule__ModelFastadn__IndModelAssignment_5");
					put(grammarAccess.getModelFastadnAccess().getAtolerAssignment_6(), "rule__ModelFastadn__AtolerAssignment_6");
					put(grammarAccess.getModelFastadnAccess().getTLModelAssignment_7(), "rule__ModelFastadn__TLModelAssignment_7");
					put(grammarAccess.getModelFastadnAccess().getHLModelAssignment_8(), "rule__ModelFastadn__HLModelAssignment_8");
					put(grammarAccess.getModelFastadnAccess().getWindFileAssignment_9(), "rule__ModelFastadn__WindFileAssignment_9");
					put(grammarAccess.getModelFastadnAccess().getHHAssignment_10(), "rule__ModelFastadn__HHAssignment_10");
					put(grammarAccess.getModelFastadnAccess().getTwrShadAssignment_11(), "rule__ModelFastadn__TwrShadAssignment_11");
					put(grammarAccess.getModelFastadnAccess().getShadHWidAssignment_12(), "rule__ModelFastadn__ShadHWidAssignment_12");
					put(grammarAccess.getModelFastadnAccess().getTShadRefPtAssignment_13(), "rule__ModelFastadn__TShadRefPtAssignment_13");
					put(grammarAccess.getModelFastadnAccess().getRhoAssignment_14(), "rule__ModelFastadn__RhoAssignment_14");
					put(grammarAccess.getModelFastadnAccess().getKinViscAssignment_15(), "rule__ModelFastadn__KinViscAssignment_15");
					put(grammarAccess.getModelFastadnAccess().getDTAeroAssignment_16(), "rule__ModelFastadn__DTAeroAssignment_16");
					put(grammarAccess.getModelFastadnAccess().getNumFoilAssignment_17(), "rule__ModelFastadn__NumFoilAssignment_17");
					put(grammarAccess.getModelFastadnAccess().getFoilNmAssignment_18(), "rule__ModelFastadn__FoilNmAssignment_18");
					put(grammarAccess.getModelFastadnAccess().getBldNodesAssignment_19(), "rule__ModelFastadn__BldNodesAssignment_19");
					put(grammarAccess.getModelFastadnAccess().getAirStatAssignment_20(), "rule__ModelFastadn__AirStatAssignment_20");
					put(grammarAccess.getHeaderAccess().getNameAssignment_0(), "rule__Header__NameAssignment_0");
					put(grammarAccess.getSUnitsAccess().getValueAssignment_1(), "rule__SUnits__ValueAssignment_1");
					put(grammarAccess.getSUnitsAccess().getNameAssignment_3(), "rule__SUnits__NameAssignment_3");
					put(grammarAccess.getSStallModAccess().getValueAssignment_1(), "rule__SStallMod__ValueAssignment_1");
					put(grammarAccess.getSStallModAccess().getNameAssignment_3(), "rule__SStallMod__NameAssignment_3");
					put(grammarAccess.getSUseCmAccess().getValueAssignment_1(), "rule__SUseCm__ValueAssignment_1");
					put(grammarAccess.getSUseCmAccess().getNameAssignment_3(), "rule__SUseCm__NameAssignment_3");
					put(grammarAccess.getSInfModelAccess().getValueAssignment_1(), "rule__SInfModel__ValueAssignment_1");
					put(grammarAccess.getSInfModelAccess().getNameAssignment_3(), "rule__SInfModel__NameAssignment_3");
					put(grammarAccess.getSIndModelAccess().getValueAssignment_1(), "rule__SIndModel__ValueAssignment_1");
					put(grammarAccess.getSIndModelAccess().getNameAssignment_3(), "rule__SIndModel__NameAssignment_3");
					put(grammarAccess.getNAtolerAccess().getValueAssignment_1(), "rule__NAtoler__ValueAssignment_1");
					put(grammarAccess.getNAtolerAccess().getNameAssignment_3(), "rule__NAtoler__NameAssignment_3");
					put(grammarAccess.getSTLModelAccess().getValueAssignment_1(), "rule__STLModel__ValueAssignment_1");
					put(grammarAccess.getSTLModelAccess().getNameAssignment_3(), "rule__STLModel__NameAssignment_3");
					put(grammarAccess.getSHLModelAccess().getValueAssignment_1(), "rule__SHLModel__ValueAssignment_1");
					put(grammarAccess.getSHLModelAccess().getNameAssignment_3(), "rule__SHLModel__NameAssignment_3");
					put(grammarAccess.getFWindFileAccess().getValueAssignment_1(), "rule__FWindFile__ValueAssignment_1");
					put(grammarAccess.getFWindFileAccess().getNameAssignment_3(), "rule__FWindFile__NameAssignment_3");
					put(grammarAccess.getNHHAccess().getValueAssignment_1(), "rule__NHH__ValueAssignment_1");
					put(grammarAccess.getNHHAccess().getNameAssignment_3(), "rule__NHH__NameAssignment_3");
					put(grammarAccess.getNTwrShadAccess().getValueAssignment_1(), "rule__NTwrShad__ValueAssignment_1");
					put(grammarAccess.getNTwrShadAccess().getNameAssignment_3(), "rule__NTwrShad__NameAssignment_3");
					put(grammarAccess.getNShadHWidAccess().getValueAssignment_1(), "rule__NShadHWid__ValueAssignment_1");
					put(grammarAccess.getNShadHWidAccess().getNameAssignment_3(), "rule__NShadHWid__NameAssignment_3");
					put(grammarAccess.getNTShadRefPtAccess().getValueAssignment_1(), "rule__NTShadRefPt__ValueAssignment_1");
					put(grammarAccess.getNTShadRefPtAccess().getNameAssignment_3(), "rule__NTShadRefPt__NameAssignment_3");
					put(grammarAccess.getNRhoAccess().getValueAssignment_1(), "rule__NRho__ValueAssignment_1");
					put(grammarAccess.getNRhoAccess().getNameAssignment_3(), "rule__NRho__NameAssignment_3");
					put(grammarAccess.getNKinViscAccess().getValueAssignment_1(), "rule__NKinVisc__ValueAssignment_1");
					put(grammarAccess.getNKinViscAccess().getNameAssignment_3(), "rule__NKinVisc__NameAssignment_3");
					put(grammarAccess.getNDTAeroAccess().getValueAssignment_1(), "rule__NDTAero__ValueAssignment_1");
					put(grammarAccess.getNDTAeroAccess().getNameAssignment_3(), "rule__NDTAero__NameAssignment_3");
					put(grammarAccess.getINumFoilAccess().getValueAssignment_1(), "rule__INumFoil__ValueAssignment_1");
					put(grammarAccess.getINumFoilAccess().getNameAssignment_3(), "rule__INumFoil__NameAssignment_3");
					put(grammarAccess.getAAirfoilListAccess().getValueAssignment_1(), "rule__AAirfoilList__ValueAssignment_1");
					put(grammarAccess.getAAirfoilListAccess().getNameAssignment_3(), "rule__AAirfoilList__NameAssignment_3");
					put(grammarAccess.getAAirfoilListAccess().getValueAssignment_7_1(), "rule__AAirfoilList__ValueAssignment_7_1");
					put(grammarAccess.getIBldNodesAccess().getValueAssignment_1(), "rule__IBldNodes__ValueAssignment_1");
					put(grammarAccess.getIBldNodesAccess().getNameAssignment_3(), "rule__IBldNodes__NameAssignment_3");
					put(grammarAccess.getAAirStatAccess().getRnodesAssignment_15_1(), "rule__AAirStat__RnodesAssignment_15_1");
					put(grammarAccess.getAAirStatAccess().getAerotwstAssignment_15_3(), "rule__AAirStat__AerotwstAssignment_15_3");
					put(grammarAccess.getAAirStatAccess().getDrnodesAssignment_15_5(), "rule__AAirStat__DrnodesAssignment_15_5");
					put(grammarAccess.getAAirStatAccess().getChordAssignment_15_7(), "rule__AAirStat__ChordAssignment_15_7");
					put(grammarAccess.getAAirStatAccess().getNfoilAssignment_15_9(), "rule__AAirStat__NfoilAssignment_15_9");
					put(grammarAccess.getAAirStatAccess().getPrnelmAssignment_15_11(), "rule__AAirStat__PrnelmAssignment_15_11");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			sc.ndt.editor.fast.ui.contentassist.antlr.internal.InternalFastadnParser typedParser = (sc.ndt.editor.fast.ui.contentassist.antlr.internal.InternalFastadnParser) parser;
			typedParser.entryRuleModelFastadn();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] {  };
	}
	
	public FastadnGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FastadnGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
