/*
* generated by Xtext
*/
package sc.ndt.editor.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import sc.ndt.editor.services.BmodesoutGrammarAccess;

public class BmodesoutParser extends AbstractContentAssistParser {
	
	@Inject
	private BmodesoutGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected sc.ndt.editor.ui.contentassist.antlr.internal.InternalBmodesoutParser createParser() {
		sc.ndt.editor.ui.contentassist.antlr.internal.InternalBmodesoutParser result = new sc.ndt.editor.ui.contentassist.antlr.internal.InternalBmodesoutParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTNUMBERAccess().getAlternatives(), "rule__TNUMBER__Alternatives");
					put(grammarAccess.getModelBmodesoutAccess().getGroup(), "rule__ModelBmodesout__Group__0");
					put(grammarAccess.getHeaderAccess().getGroup(), "rule__Header__Group__0");
					put(grammarAccess.getModeAccess().getGroup(), "rule__Mode__Group__0");
					put(grammarAccess.getModeAccess().getGroup_17(), "rule__Mode__Group_17__0");
					put(grammarAccess.getModelBmodesoutAccess().getHeadAssignment_0(), "rule__ModelBmodesout__HeadAssignment_0");
					put(grammarAccess.getModelBmodesoutAccess().getModesAssignment_1(), "rule__ModelBmodesout__ModesAssignment_1");
					put(grammarAccess.getHeaderAccess().getNAssignment_19(), "rule__Header__NAssignment_19");
					put(grammarAccess.getModeAccess().getIndexAssignment_3(), "rule__Mode__IndexAssignment_3");
					put(grammarAccess.getModeAccess().getFreqAssignment_5(), "rule__Mode__FreqAssignment_5");
					put(grammarAccess.getModeAccess().getSpan_locAssignment_17_0(), "rule__Mode__Span_locAssignment_17_0");
					put(grammarAccess.getModeAccess().getFlap_dispAssignment_17_1(), "rule__Mode__Flap_dispAssignment_17_1");
					put(grammarAccess.getModeAccess().getFlap_slopeAssignment_17_2(), "rule__Mode__Flap_slopeAssignment_17_2");
					put(grammarAccess.getModeAccess().getLag_dispAssignment_17_3(), "rule__Mode__Lag_dispAssignment_17_3");
					put(grammarAccess.getModeAccess().getLag_slopeAssignment_17_4(), "rule__Mode__Lag_slopeAssignment_17_4");
					put(grammarAccess.getModeAccess().getTwistAssignment_17_5(), "rule__Mode__TwistAssignment_17_5");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			sc.ndt.editor.ui.contentassist.antlr.internal.InternalBmodesoutParser typedParser = (sc.ndt.editor.ui.contentassist.antlr.internal.InternalBmodesoutParser) parser;
			typedParser.entryRuleModelBmodesout();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] {  };
	}
	
	public BmodesoutGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(BmodesoutGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
