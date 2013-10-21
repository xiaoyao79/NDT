/*
* generated by Xtext
*/
package sc.ndt.editor.fast.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import sc.ndt.editor.fast.services.FasttwrGrammarAccess;

public class FasttwrParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private FasttwrGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens();
	}
	
	@Override
	protected sc.ndt.editor.fast.parser.antlr.internal.InternalFasttwrParser createParser(XtextTokenStream stream) {
		return new sc.ndt.editor.fast.parser.antlr.internal.InternalFasttwrParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "ModelFasttwr";
	}
	
	public FasttwrGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FasttwrGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
