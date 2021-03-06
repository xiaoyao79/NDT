/*
* generated by Xtext
*/
package sc.ndt.editor.bmodes.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;


@Singleton
public class BmodestspGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelBmodestspElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ModelBmodestsp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cHeadAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cHeadHeaderParserRuleCall_0_0 = (RuleCall)cHeadAssignment_0.eContents().get(0);
		private final Assignment cNNodesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNNodesINodesParserRuleCall_1_0 = (RuleCall)cNNodesAssignment_1.eContents().get(0);
		private final RuleCall cNEWLINETerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cSectionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSectionsASecParserRuleCall_3_0 = (RuleCall)cSectionsAssignment_3.eContents().get(0);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final RuleCall cWSTerminalRuleCall_4_0 = (RuleCall)cAlternatives_4.eContents().get(0);
		private final RuleCall cNEWLINETerminalRuleCall_4_1 = (RuleCall)cAlternatives_4.eContents().get(1);
		private final RuleCall cSL_COMMENTTerminalRuleCall_4_2 = (RuleCall)cAlternatives_4.eContents().get(2);
		
		//ModelBmodestsp:
		//	Head=Header NNodes=iNodes NEWLINE Sections=aSec (WS | NEWLINE | SL_COMMENT)*;
		public ParserRule getRule() { return rule; }

		//Head=Header NNodes=iNodes NEWLINE Sections=aSec (WS | NEWLINE | SL_COMMENT)*
		public Group getGroup() { return cGroup; }

		//Head=Header
		public Assignment getHeadAssignment_0() { return cHeadAssignment_0; }

		//Header
		public RuleCall getHeadHeaderParserRuleCall_0_0() { return cHeadHeaderParserRuleCall_0_0; }

		//NNodes=iNodes
		public Assignment getNNodesAssignment_1() { return cNNodesAssignment_1; }

		//iNodes
		public RuleCall getNNodesINodesParserRuleCall_1_0() { return cNNodesINodesParserRuleCall_1_0; }

		//NEWLINE
		public RuleCall getNEWLINETerminalRuleCall_2() { return cNEWLINETerminalRuleCall_2; }

		//Sections=aSec
		public Assignment getSectionsAssignment_3() { return cSectionsAssignment_3; }

		//aSec
		public RuleCall getSectionsASecParserRuleCall_3_0() { return cSectionsASecParserRuleCall_3_0; }

		//(WS | NEWLINE | SL_COMMENT)*
		public Alternatives getAlternatives_4() { return cAlternatives_4; }

		//WS
		public RuleCall getWSTerminalRuleCall_4_0() { return cWSTerminalRuleCall_4_0; }

		//NEWLINE
		public RuleCall getNEWLINETerminalRuleCall_4_1() { return cNEWLINETerminalRuleCall_4_1; }

		//SL_COMMENT
		public RuleCall getSL_COMMENTTerminalRuleCall_4_2() { return cSL_COMMENTTerminalRuleCall_4_2; }
	}

	public class TNUMBERElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "tNUMBER");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNUMBERTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//tNUMBER returns ecore::EFloat:
		//	INT | NUMBER;
		public ParserRule getRule() { return rule; }

		//INT | NUMBER
		public Alternatives getAlternatives() { return cAlternatives; }

		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }

		//NUMBER
		public RuleCall getNUMBERTerminalRuleCall_1() { return cNUMBERTerminalRuleCall_1; }
	}

	public class TARRAY_STRElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "tARRAY_STR");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cWSTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cWSTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cNEWLINETerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		////from online help: The QualifiedName is a little special. It does not contain any assignments. 
		//// Therefore, it serves as a data type rule, which returns a String. So the feature name of a 
		//// Package is still of type String. 
		////FILE: ('.'?'.'?)('/'? STRING)*;
		////FILE returns ecore::EString:
		////	'"' ((('.'|'..')? '/')? (NAME '/')* NAME'.'NAME)? '"';
		//tARRAY_STR returns ecore::EString hidden(SL_COMMENT):
		//	(WS? STRING WS? NEWLINE)*;
		public ParserRule getRule() { return rule; }

		//(WS? STRING WS? NEWLINE)*
		public Group getGroup() { return cGroup; }

		//WS?
		public RuleCall getWSTerminalRuleCall_0() { return cWSTerminalRuleCall_0; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_1() { return cSTRINGTerminalRuleCall_1; }

		//WS?
		public RuleCall getWSTerminalRuleCall_2() { return cWSTerminalRuleCall_2; }

		//NEWLINE
		public RuleCall getNEWLINETerminalRuleCall_3() { return cNEWLINETerminalRuleCall_3; }
	}

	public class HeaderElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Header");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameSL_COMMENTTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final RuleCall cNEWLINETerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Header hidden():
		//	name=SL_COMMENT NEWLINE;
		public ParserRule getRule() { return rule; }

		//name=SL_COMMENT NEWLINE
		public Group getGroup() { return cGroup; }

		//name=SL_COMMENT
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//SL_COMMENT
		public RuleCall getNameSL_COMMENTTerminalRuleCall_0_0() { return cNameSL_COMMENTTerminalRuleCall_0_0; }

		//NEWLINE
		public RuleCall getNEWLINETerminalRuleCall_1() { return cNEWLINETerminalRuleCall_1; }
	}

	public class INodesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "iNodes");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cWSTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Keyword cNameN_secsKeyword_3_0 = (Keyword)cNameAssignment_3.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final RuleCall cSL_COMMENTTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final RuleCall cNEWLINETerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		
		//iNodes hidden():
		//	WS? value=INT WS name="n_secs" WS? SL_COMMENT? NEWLINE;
		public ParserRule getRule() { return rule; }

		//WS? value=INT WS name="n_secs" WS? SL_COMMENT? NEWLINE
		public Group getGroup() { return cGroup; }

		//WS?
		public RuleCall getWSTerminalRuleCall_0() { return cWSTerminalRuleCall_0; }

		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }

		//WS
		public RuleCall getWSTerminalRuleCall_2() { return cWSTerminalRuleCall_2; }

		//name="n_secs"
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//"n_secs"
		public Keyword getNameN_secsKeyword_3_0() { return cNameN_secsKeyword_3_0; }

		//WS?
		public RuleCall getWSTerminalRuleCall_4() { return cWSTerminalRuleCall_4; }

		//SL_COMMENT?
		public RuleCall getSL_COMMENTTerminalRuleCall_5() { return cSL_COMMENTTerminalRuleCall_5; }

		//NEWLINE
		public RuleCall getNEWLINETerminalRuleCall_6() { return cNEWLINETerminalRuleCall_6; }
	}

	public class ASecElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "aSec");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cWSTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cSec_locKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cWSTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cStr_twKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final RuleCall cWSTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Keyword cTw_inerKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final RuleCall cWSTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Keyword cMass_denKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final RuleCall cWSTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		private final Keyword cFlp_inerKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final RuleCall cWSTerminalRuleCall_10 = (RuleCall)cGroup.eContents().get(10);
		private final Keyword cEdge_inerKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final RuleCall cWSTerminalRuleCall_12 = (RuleCall)cGroup.eContents().get(12);
		private final Keyword cFlp_stffKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final RuleCall cWSTerminalRuleCall_14 = (RuleCall)cGroup.eContents().get(14);
		private final Keyword cEdge_stffKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final RuleCall cWSTerminalRuleCall_16 = (RuleCall)cGroup.eContents().get(16);
		private final Keyword cTor_stffKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final RuleCall cWSTerminalRuleCall_18 = (RuleCall)cGroup.eContents().get(18);
		private final Keyword cAxial_stffKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final RuleCall cWSTerminalRuleCall_20 = (RuleCall)cGroup.eContents().get(20);
		private final Keyword cCg_offstKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final RuleCall cWSTerminalRuleCall_22 = (RuleCall)cGroup.eContents().get(22);
		private final Keyword cSc_offstKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final RuleCall cWSTerminalRuleCall_24 = (RuleCall)cGroup.eContents().get(24);
		private final Keyword cTc_offstKeyword_25 = (Keyword)cGroup.eContents().get(25);
		private final RuleCall cWSTerminalRuleCall_26 = (RuleCall)cGroup.eContents().get(26);
		private final RuleCall cSL_COMMENTTerminalRuleCall_27 = (RuleCall)cGroup.eContents().get(27);
		private final RuleCall cNEWLINETerminalRuleCall_28 = (RuleCall)cGroup.eContents().get(28);
		private final RuleCall cWSTerminalRuleCall_29 = (RuleCall)cGroup.eContents().get(29);
		private final Keyword cLeftParenthesisHyphenMinusRightParenthesisKeyword_30 = (Keyword)cGroup.eContents().get(30);
		private final RuleCall cWSTerminalRuleCall_31 = (RuleCall)cGroup.eContents().get(31);
		private final Keyword cDegKeyword_32 = (Keyword)cGroup.eContents().get(32);
		private final RuleCall cWSTerminalRuleCall_33 = (RuleCall)cGroup.eContents().get(33);
		private final Keyword cDegKeyword_34 = (Keyword)cGroup.eContents().get(34);
		private final RuleCall cWSTerminalRuleCall_35 = (RuleCall)cGroup.eContents().get(35);
		private final Keyword cKgMKeyword_36 = (Keyword)cGroup.eContents().get(36);
		private final RuleCall cWSTerminalRuleCall_37 = (RuleCall)cGroup.eContents().get(37);
		private final Keyword cKgMKeyword_38 = (Keyword)cGroup.eContents().get(38);
		private final RuleCall cWSTerminalRuleCall_39 = (RuleCall)cGroup.eContents().get(39);
		private final Keyword cKgMKeyword_40 = (Keyword)cGroup.eContents().get(40);
		private final RuleCall cWSTerminalRuleCall_41 = (RuleCall)cGroup.eContents().get(41);
		private final Keyword cNm2Keyword_42 = (Keyword)cGroup.eContents().get(42);
		private final RuleCall cWSTerminalRuleCall_43 = (RuleCall)cGroup.eContents().get(43);
		private final Keyword cNm2Keyword_44 = (Keyword)cGroup.eContents().get(44);
		private final RuleCall cWSTerminalRuleCall_45 = (RuleCall)cGroup.eContents().get(45);
		private final Keyword cNm2Keyword_46 = (Keyword)cGroup.eContents().get(46);
		private final RuleCall cWSTerminalRuleCall_47 = (RuleCall)cGroup.eContents().get(47);
		private final Keyword cNKeyword_48 = (Keyword)cGroup.eContents().get(48);
		private final RuleCall cWSTerminalRuleCall_49 = (RuleCall)cGroup.eContents().get(49);
		private final Keyword cMKeyword_50 = (Keyword)cGroup.eContents().get(50);
		private final RuleCall cWSTerminalRuleCall_51 = (RuleCall)cGroup.eContents().get(51);
		private final Keyword cMKeyword_52 = (Keyword)cGroup.eContents().get(52);
		private final RuleCall cWSTerminalRuleCall_53 = (RuleCall)cGroup.eContents().get(53);
		private final Keyword cMKeyword_54 = (Keyword)cGroup.eContents().get(54);
		private final RuleCall cWSTerminalRuleCall_55 = (RuleCall)cGroup.eContents().get(55);
		private final RuleCall cSL_COMMENTTerminalRuleCall_56 = (RuleCall)cGroup.eContents().get(56);
		private final RuleCall cNEWLINETerminalRuleCall_57 = (RuleCall)cGroup.eContents().get(57);
		private final Group cGroup_58 = (Group)cGroup.eContents().get(58);
		private final RuleCall cWSTerminalRuleCall_58_0 = (RuleCall)cGroup_58.eContents().get(0);
		private final Assignment cSec_locAssignment_58_1 = (Assignment)cGroup_58.eContents().get(1);
		private final RuleCall cSec_locTNUMBERParserRuleCall_58_1_0 = (RuleCall)cSec_locAssignment_58_1.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_58_2 = (RuleCall)cGroup_58.eContents().get(2);
		private final Assignment cStr_twAssignment_58_3 = (Assignment)cGroup_58.eContents().get(3);
		private final RuleCall cStr_twTNUMBERParserRuleCall_58_3_0 = (RuleCall)cStr_twAssignment_58_3.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_58_4 = (RuleCall)cGroup_58.eContents().get(4);
		private final Assignment cTw_inerAssignment_58_5 = (Assignment)cGroup_58.eContents().get(5);
		private final RuleCall cTw_inerTNUMBERParserRuleCall_58_5_0 = (RuleCall)cTw_inerAssignment_58_5.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_58_6 = (RuleCall)cGroup_58.eContents().get(6);
		private final Assignment cMass_denAssignment_58_7 = (Assignment)cGroup_58.eContents().get(7);
		private final RuleCall cMass_denTNUMBERParserRuleCall_58_7_0 = (RuleCall)cMass_denAssignment_58_7.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_58_8 = (RuleCall)cGroup_58.eContents().get(8);
		private final Assignment cFlp_inerAssignment_58_9 = (Assignment)cGroup_58.eContents().get(9);
		private final RuleCall cFlp_inerTNUMBERParserRuleCall_58_9_0 = (RuleCall)cFlp_inerAssignment_58_9.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_58_10 = (RuleCall)cGroup_58.eContents().get(10);
		private final Assignment cEdge_inerAssignment_58_11 = (Assignment)cGroup_58.eContents().get(11);
		private final RuleCall cEdge_inerTNUMBERParserRuleCall_58_11_0 = (RuleCall)cEdge_inerAssignment_58_11.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_58_12 = (RuleCall)cGroup_58.eContents().get(12);
		private final Assignment cFlp_stffAssignment_58_13 = (Assignment)cGroup_58.eContents().get(13);
		private final RuleCall cFlp_stffTNUMBERParserRuleCall_58_13_0 = (RuleCall)cFlp_stffAssignment_58_13.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_58_14 = (RuleCall)cGroup_58.eContents().get(14);
		private final Assignment cEdge_stffAssignment_58_15 = (Assignment)cGroup_58.eContents().get(15);
		private final RuleCall cEdge_stffTNUMBERParserRuleCall_58_15_0 = (RuleCall)cEdge_stffAssignment_58_15.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_58_16 = (RuleCall)cGroup_58.eContents().get(16);
		private final Assignment cTor_stffAssignment_58_17 = (Assignment)cGroup_58.eContents().get(17);
		private final RuleCall cTor_stffTNUMBERParserRuleCall_58_17_0 = (RuleCall)cTor_stffAssignment_58_17.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_58_18 = (RuleCall)cGroup_58.eContents().get(18);
		private final Assignment cAxial_stffAssignment_58_19 = (Assignment)cGroup_58.eContents().get(19);
		private final RuleCall cAxial_stffTNUMBERParserRuleCall_58_19_0 = (RuleCall)cAxial_stffAssignment_58_19.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_58_20 = (RuleCall)cGroup_58.eContents().get(20);
		private final Assignment cCg_offstAssignment_58_21 = (Assignment)cGroup_58.eContents().get(21);
		private final RuleCall cCg_offstTNUMBERParserRuleCall_58_21_0 = (RuleCall)cCg_offstAssignment_58_21.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_58_22 = (RuleCall)cGroup_58.eContents().get(22);
		private final Assignment cSc_offstAssignment_58_23 = (Assignment)cGroup_58.eContents().get(23);
		private final RuleCall cSc_offstTNUMBERParserRuleCall_58_23_0 = (RuleCall)cSc_offstAssignment_58_23.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_58_24 = (RuleCall)cGroup_58.eContents().get(24);
		private final Assignment cTc_offstAssignment_58_25 = (Assignment)cGroup_58.eContents().get(25);
		private final RuleCall cTc_offstTNUMBERParserRuleCall_58_25_0 = (RuleCall)cTc_offstAssignment_58_25.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_58_26 = (RuleCall)cGroup_58.eContents().get(26);
		private final RuleCall cSL_COMMENTTerminalRuleCall_58_27 = (RuleCall)cGroup_58.eContents().get(27);
		private final RuleCall cNEWLINETerminalRuleCall_58_28 = (RuleCall)cGroup_58.eContents().get(28);
		
		//aSec hidden():
		//	WS? "sec_loc" WS "str_tw" WS "tw_iner" WS "mass_den" WS "flp_iner" WS "edge_iner" WS "flp_stff" WS "edge_stff" WS
		//	"tor_stff" WS "axial_stff" WS "cg_offst" WS "sc_offst" WS "tc_offst" WS? SL_COMMENT? NEWLINE WS? "(-)" WS "(deg)" WS
		//	"(deg)" WS "(kg/m)" WS "(kg-m)" WS "(kg-m)" WS "(Nm^2)" WS "(Nm^2)" WS "(Nm^2)" WS "(N)" WS "(m)" WS "(m)" WS "(m)"
		//	WS? SL_COMMENT? NEWLINE (WS? sec_loc+=tNUMBER WS str_tw+=tNUMBER WS tw_iner+=tNUMBER WS mass_den+=tNUMBER WS
		//	flp_iner+=tNUMBER WS edge_iner+=tNUMBER WS flp_stff+=tNUMBER WS edge_stff+=tNUMBER WS tor_stff+=tNUMBER WS
		//	axial_stff+=tNUMBER WS cg_offst+=tNUMBER WS sc_offst+=tNUMBER WS tc_offst+=tNUMBER WS? SL_COMMENT? NEWLINE)+;
		public ParserRule getRule() { return rule; }

		//WS? "sec_loc" WS "str_tw" WS "tw_iner" WS "mass_den" WS "flp_iner" WS "edge_iner" WS "flp_stff" WS "edge_stff" WS
		//"tor_stff" WS "axial_stff" WS "cg_offst" WS "sc_offst" WS "tc_offst" WS? SL_COMMENT? NEWLINE WS? "(-)" WS "(deg)" WS
		//"(deg)" WS "(kg/m)" WS "(kg-m)" WS "(kg-m)" WS "(Nm^2)" WS "(Nm^2)" WS "(Nm^2)" WS "(N)" WS "(m)" WS "(m)" WS "(m)" WS?
		//SL_COMMENT? NEWLINE (WS? sec_loc+=tNUMBER WS str_tw+=tNUMBER WS tw_iner+=tNUMBER WS mass_den+=tNUMBER WS
		//flp_iner+=tNUMBER WS edge_iner+=tNUMBER WS flp_stff+=tNUMBER WS edge_stff+=tNUMBER WS tor_stff+=tNUMBER WS
		//axial_stff+=tNUMBER WS cg_offst+=tNUMBER WS sc_offst+=tNUMBER WS tc_offst+=tNUMBER WS? SL_COMMENT? NEWLINE)+
		public Group getGroup() { return cGroup; }

		//WS?
		public RuleCall getWSTerminalRuleCall_0() { return cWSTerminalRuleCall_0; }

		//"sec_loc"
		public Keyword getSec_locKeyword_1() { return cSec_locKeyword_1; }

		//WS
		public RuleCall getWSTerminalRuleCall_2() { return cWSTerminalRuleCall_2; }

		//"str_tw"
		public Keyword getStr_twKeyword_3() { return cStr_twKeyword_3; }

		//WS
		public RuleCall getWSTerminalRuleCall_4() { return cWSTerminalRuleCall_4; }

		//"tw_iner"
		public Keyword getTw_inerKeyword_5() { return cTw_inerKeyword_5; }

		//WS
		public RuleCall getWSTerminalRuleCall_6() { return cWSTerminalRuleCall_6; }

		//"mass_den"
		public Keyword getMass_denKeyword_7() { return cMass_denKeyword_7; }

		//WS
		public RuleCall getWSTerminalRuleCall_8() { return cWSTerminalRuleCall_8; }

		//"flp_iner"
		public Keyword getFlp_inerKeyword_9() { return cFlp_inerKeyword_9; }

		//WS
		public RuleCall getWSTerminalRuleCall_10() { return cWSTerminalRuleCall_10; }

		//"edge_iner"
		public Keyword getEdge_inerKeyword_11() { return cEdge_inerKeyword_11; }

		//WS
		public RuleCall getWSTerminalRuleCall_12() { return cWSTerminalRuleCall_12; }

		//"flp_stff"
		public Keyword getFlp_stffKeyword_13() { return cFlp_stffKeyword_13; }

		//WS
		public RuleCall getWSTerminalRuleCall_14() { return cWSTerminalRuleCall_14; }

		//"edge_stff"
		public Keyword getEdge_stffKeyword_15() { return cEdge_stffKeyword_15; }

		//WS
		public RuleCall getWSTerminalRuleCall_16() { return cWSTerminalRuleCall_16; }

		//"tor_stff"
		public Keyword getTor_stffKeyword_17() { return cTor_stffKeyword_17; }

		//WS
		public RuleCall getWSTerminalRuleCall_18() { return cWSTerminalRuleCall_18; }

		//"axial_stff"
		public Keyword getAxial_stffKeyword_19() { return cAxial_stffKeyword_19; }

		//WS
		public RuleCall getWSTerminalRuleCall_20() { return cWSTerminalRuleCall_20; }

		//"cg_offst"
		public Keyword getCg_offstKeyword_21() { return cCg_offstKeyword_21; }

		//WS
		public RuleCall getWSTerminalRuleCall_22() { return cWSTerminalRuleCall_22; }

		//"sc_offst"
		public Keyword getSc_offstKeyword_23() { return cSc_offstKeyword_23; }

		//WS
		public RuleCall getWSTerminalRuleCall_24() { return cWSTerminalRuleCall_24; }

		//"tc_offst"
		public Keyword getTc_offstKeyword_25() { return cTc_offstKeyword_25; }

		//WS?
		public RuleCall getWSTerminalRuleCall_26() { return cWSTerminalRuleCall_26; }

		//SL_COMMENT?
		public RuleCall getSL_COMMENTTerminalRuleCall_27() { return cSL_COMMENTTerminalRuleCall_27; }

		//NEWLINE
		public RuleCall getNEWLINETerminalRuleCall_28() { return cNEWLINETerminalRuleCall_28; }

		//WS?
		public RuleCall getWSTerminalRuleCall_29() { return cWSTerminalRuleCall_29; }

		//"(-)"
		public Keyword getLeftParenthesisHyphenMinusRightParenthesisKeyword_30() { return cLeftParenthesisHyphenMinusRightParenthesisKeyword_30; }

		//WS
		public RuleCall getWSTerminalRuleCall_31() { return cWSTerminalRuleCall_31; }

		//"(deg)"
		public Keyword getDegKeyword_32() { return cDegKeyword_32; }

		//WS
		public RuleCall getWSTerminalRuleCall_33() { return cWSTerminalRuleCall_33; }

		//"(deg)"
		public Keyword getDegKeyword_34() { return cDegKeyword_34; }

		//WS
		public RuleCall getWSTerminalRuleCall_35() { return cWSTerminalRuleCall_35; }

		//"(kg/m)"
		public Keyword getKgMKeyword_36() { return cKgMKeyword_36; }

		//WS
		public RuleCall getWSTerminalRuleCall_37() { return cWSTerminalRuleCall_37; }

		//"(kg-m)"
		public Keyword getKgMKeyword_38() { return cKgMKeyword_38; }

		//WS
		public RuleCall getWSTerminalRuleCall_39() { return cWSTerminalRuleCall_39; }

		//"(kg-m)"
		public Keyword getKgMKeyword_40() { return cKgMKeyword_40; }

		//WS
		public RuleCall getWSTerminalRuleCall_41() { return cWSTerminalRuleCall_41; }

		//"(Nm^2)"
		public Keyword getNm2Keyword_42() { return cNm2Keyword_42; }

		//WS
		public RuleCall getWSTerminalRuleCall_43() { return cWSTerminalRuleCall_43; }

		//"(Nm^2)"
		public Keyword getNm2Keyword_44() { return cNm2Keyword_44; }

		//WS
		public RuleCall getWSTerminalRuleCall_45() { return cWSTerminalRuleCall_45; }

		//"(Nm^2)"
		public Keyword getNm2Keyword_46() { return cNm2Keyword_46; }

		//WS
		public RuleCall getWSTerminalRuleCall_47() { return cWSTerminalRuleCall_47; }

		//"(N)"
		public Keyword getNKeyword_48() { return cNKeyword_48; }

		//WS
		public RuleCall getWSTerminalRuleCall_49() { return cWSTerminalRuleCall_49; }

		//"(m)"
		public Keyword getMKeyword_50() { return cMKeyword_50; }

		//WS
		public RuleCall getWSTerminalRuleCall_51() { return cWSTerminalRuleCall_51; }

		//"(m)"
		public Keyword getMKeyword_52() { return cMKeyword_52; }

		//WS
		public RuleCall getWSTerminalRuleCall_53() { return cWSTerminalRuleCall_53; }

		//"(m)"
		public Keyword getMKeyword_54() { return cMKeyword_54; }

		//WS?
		public RuleCall getWSTerminalRuleCall_55() { return cWSTerminalRuleCall_55; }

		//SL_COMMENT?
		public RuleCall getSL_COMMENTTerminalRuleCall_56() { return cSL_COMMENTTerminalRuleCall_56; }

		//NEWLINE
		public RuleCall getNEWLINETerminalRuleCall_57() { return cNEWLINETerminalRuleCall_57; }

		//(WS? sec_loc+=tNUMBER WS str_tw+=tNUMBER WS tw_iner+=tNUMBER WS mass_den+=tNUMBER WS flp_iner+=tNUMBER WS
		//edge_iner+=tNUMBER WS flp_stff+=tNUMBER WS edge_stff+=tNUMBER WS tor_stff+=tNUMBER WS axial_stff+=tNUMBER WS
		//cg_offst+=tNUMBER WS sc_offst+=tNUMBER WS tc_offst+=tNUMBER WS? SL_COMMENT? NEWLINE)+
		public Group getGroup_58() { return cGroup_58; }

		//WS?
		public RuleCall getWSTerminalRuleCall_58_0() { return cWSTerminalRuleCall_58_0; }

		//sec_loc+=tNUMBER
		public Assignment getSec_locAssignment_58_1() { return cSec_locAssignment_58_1; }

		//tNUMBER
		public RuleCall getSec_locTNUMBERParserRuleCall_58_1_0() { return cSec_locTNUMBERParserRuleCall_58_1_0; }

		//WS
		public RuleCall getWSTerminalRuleCall_58_2() { return cWSTerminalRuleCall_58_2; }

		//str_tw+=tNUMBER
		public Assignment getStr_twAssignment_58_3() { return cStr_twAssignment_58_3; }

		//tNUMBER
		public RuleCall getStr_twTNUMBERParserRuleCall_58_3_0() { return cStr_twTNUMBERParserRuleCall_58_3_0; }

		//WS
		public RuleCall getWSTerminalRuleCall_58_4() { return cWSTerminalRuleCall_58_4; }

		//tw_iner+=tNUMBER
		public Assignment getTw_inerAssignment_58_5() { return cTw_inerAssignment_58_5; }

		//tNUMBER
		public RuleCall getTw_inerTNUMBERParserRuleCall_58_5_0() { return cTw_inerTNUMBERParserRuleCall_58_5_0; }

		//WS
		public RuleCall getWSTerminalRuleCall_58_6() { return cWSTerminalRuleCall_58_6; }

		//mass_den+=tNUMBER
		public Assignment getMass_denAssignment_58_7() { return cMass_denAssignment_58_7; }

		//tNUMBER
		public RuleCall getMass_denTNUMBERParserRuleCall_58_7_0() { return cMass_denTNUMBERParserRuleCall_58_7_0; }

		//WS
		public RuleCall getWSTerminalRuleCall_58_8() { return cWSTerminalRuleCall_58_8; }

		//flp_iner+=tNUMBER
		public Assignment getFlp_inerAssignment_58_9() { return cFlp_inerAssignment_58_9; }

		//tNUMBER
		public RuleCall getFlp_inerTNUMBERParserRuleCall_58_9_0() { return cFlp_inerTNUMBERParserRuleCall_58_9_0; }

		//WS
		public RuleCall getWSTerminalRuleCall_58_10() { return cWSTerminalRuleCall_58_10; }

		//edge_iner+=tNUMBER
		public Assignment getEdge_inerAssignment_58_11() { return cEdge_inerAssignment_58_11; }

		//tNUMBER
		public RuleCall getEdge_inerTNUMBERParserRuleCall_58_11_0() { return cEdge_inerTNUMBERParserRuleCall_58_11_0; }

		//WS
		public RuleCall getWSTerminalRuleCall_58_12() { return cWSTerminalRuleCall_58_12; }

		//flp_stff+=tNUMBER
		public Assignment getFlp_stffAssignment_58_13() { return cFlp_stffAssignment_58_13; }

		//tNUMBER
		public RuleCall getFlp_stffTNUMBERParserRuleCall_58_13_0() { return cFlp_stffTNUMBERParserRuleCall_58_13_0; }

		//WS
		public RuleCall getWSTerminalRuleCall_58_14() { return cWSTerminalRuleCall_58_14; }

		//edge_stff+=tNUMBER
		public Assignment getEdge_stffAssignment_58_15() { return cEdge_stffAssignment_58_15; }

		//tNUMBER
		public RuleCall getEdge_stffTNUMBERParserRuleCall_58_15_0() { return cEdge_stffTNUMBERParserRuleCall_58_15_0; }

		//WS
		public RuleCall getWSTerminalRuleCall_58_16() { return cWSTerminalRuleCall_58_16; }

		//tor_stff+=tNUMBER
		public Assignment getTor_stffAssignment_58_17() { return cTor_stffAssignment_58_17; }

		//tNUMBER
		public RuleCall getTor_stffTNUMBERParserRuleCall_58_17_0() { return cTor_stffTNUMBERParserRuleCall_58_17_0; }

		//WS
		public RuleCall getWSTerminalRuleCall_58_18() { return cWSTerminalRuleCall_58_18; }

		//axial_stff+=tNUMBER
		public Assignment getAxial_stffAssignment_58_19() { return cAxial_stffAssignment_58_19; }

		//tNUMBER
		public RuleCall getAxial_stffTNUMBERParserRuleCall_58_19_0() { return cAxial_stffTNUMBERParserRuleCall_58_19_0; }

		//WS
		public RuleCall getWSTerminalRuleCall_58_20() { return cWSTerminalRuleCall_58_20; }

		//cg_offst+=tNUMBER
		public Assignment getCg_offstAssignment_58_21() { return cCg_offstAssignment_58_21; }

		//tNUMBER
		public RuleCall getCg_offstTNUMBERParserRuleCall_58_21_0() { return cCg_offstTNUMBERParserRuleCall_58_21_0; }

		//WS
		public RuleCall getWSTerminalRuleCall_58_22() { return cWSTerminalRuleCall_58_22; }

		//sc_offst+=tNUMBER
		public Assignment getSc_offstAssignment_58_23() { return cSc_offstAssignment_58_23; }

		//tNUMBER
		public RuleCall getSc_offstTNUMBERParserRuleCall_58_23_0() { return cSc_offstTNUMBERParserRuleCall_58_23_0; }

		//WS
		public RuleCall getWSTerminalRuleCall_58_24() { return cWSTerminalRuleCall_58_24; }

		//tc_offst+=tNUMBER
		public Assignment getTc_offstAssignment_58_25() { return cTc_offstAssignment_58_25; }

		//tNUMBER
		public RuleCall getTc_offstTNUMBERParserRuleCall_58_25_0() { return cTc_offstTNUMBERParserRuleCall_58_25_0; }

		//WS?
		public RuleCall getWSTerminalRuleCall_58_26() { return cWSTerminalRuleCall_58_26; }

		//SL_COMMENT?
		public RuleCall getSL_COMMENTTerminalRuleCall_58_27() { return cSL_COMMENTTerminalRuleCall_58_27; }

		//NEWLINE
		public RuleCall getNEWLINETerminalRuleCall_58_28() { return cNEWLINETerminalRuleCall_58_28; }
	}
	
	
	private final ModelBmodestspElements pModelBmodestsp;
	private final TNUMBERElements pTNUMBER;
	private final TARRAY_STRElements pTARRAY_STR;
	private final TerminalRule tINT;
	private final TerminalRule tNUMBER;
	private final TerminalRule tSTRING;
	private final TerminalRule tNEWLINE;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tWS;
	private final HeaderElements pHeader;
	private final INodesElements pINodes;
	private final ASecElements pASec;
	
	private final Grammar grammar;

	@Inject
	public BmodestspGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pModelBmodestsp = new ModelBmodestspElements();
		this.pTNUMBER = new TNUMBERElements();
		this.pTARRAY_STR = new TARRAY_STRElements();
		this.tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "INT");
		this.tNUMBER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "NUMBER");
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "STRING");
		this.tNEWLINE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "NEWLINE");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SL_COMMENT");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WS");
		this.pHeader = new HeaderElements();
		this.pINodes = new INodesElements();
		this.pASec = new ASecElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("sc.ndt.editor.bmodes.Bmodestsp".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//ModelBmodestsp:
	//	Head=Header NNodes=iNodes NEWLINE Sections=aSec (WS | NEWLINE | SL_COMMENT)*;
	public ModelBmodestspElements getModelBmodestspAccess() {
		return pModelBmodestsp;
	}
	
	public ParserRule getModelBmodestspRule() {
		return getModelBmodestspAccess().getRule();
	}

	//tNUMBER returns ecore::EFloat:
	//	INT | NUMBER;
	public TNUMBERElements getTNUMBERAccess() {
		return pTNUMBER;
	}
	
	public ParserRule getTNUMBERRule() {
		return getTNUMBERAccess().getRule();
	}

	////from online help: The QualifiedName is a little special. It does not contain any assignments. 
	//// Therefore, it serves as a data type rule, which returns a String. So the feature name of a 
	//// Package is still of type String. 
	////FILE: ('.'?'.'?)('/'? STRING)*;
	////FILE returns ecore::EString:
	////	'"' ((('.'|'..')? '/')? (NAME '/')* NAME'.'NAME)? '"';
	//tARRAY_STR returns ecore::EString hidden(SL_COMMENT):
	//	(WS? STRING WS? NEWLINE)*;
	public TARRAY_STRElements getTARRAY_STRAccess() {
		return pTARRAY_STR;
	}
	
	public ParserRule getTARRAY_STRRule() {
		return getTARRAY_STRAccess().getRule();
	}

	//// TERMINALS 
	//// NOTE : see http://www.eclipse.org/Xtext/documentation.html#syntax
	//// NOTE : the order of terminal rules is crucial for your grammar, as they may shadow each other. This is especially important for newly introduced rules in connection with imported rules from used grammars. 
	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return tINT;
	} 

	//terminal NUMBER returns ecore::EFloat:
	//	("+" | "-")? INT ("." INT?) (("E" | "e") ("+" | "-")? INT)? | ("+" | "-")? INT (("E" | "e") ("+" | "-")? INT) | ("."
	//	INT) (("E" | "e") ("+" | "-")? INT)? | "-" INT;
	public TerminalRule getNUMBERRule() {
		return tNUMBER;
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return tSTRING;
	} 

	//terminal NEWLINE:
	//	"\r" | "\n" | "\r\n";
	public TerminalRule getNEWLINERule() {
		return tNEWLINE;
	} 

	//terminal SL_COMMENT:
	//	"-" !"0".."9" !("\r" | "\n" | "\r\n")*;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	} 

	//terminal WS:
	//	(" " | "\t")+;
	public TerminalRule getWSRule() {
		return tWS;
	} 

	//Header hidden():
	//	name=SL_COMMENT NEWLINE;
	public HeaderElements getHeaderAccess() {
		return pHeader;
	}
	
	public ParserRule getHeaderRule() {
		return getHeaderAccess().getRule();
	}

	//iNodes hidden():
	//	WS? value=INT WS name="n_secs" WS? SL_COMMENT? NEWLINE;
	public INodesElements getINodesAccess() {
		return pINodes;
	}
	
	public ParserRule getINodesRule() {
		return getINodesAccess().getRule();
	}

	//aSec hidden():
	//	WS? "sec_loc" WS "str_tw" WS "tw_iner" WS "mass_den" WS "flp_iner" WS "edge_iner" WS "flp_stff" WS "edge_stff" WS
	//	"tor_stff" WS "axial_stff" WS "cg_offst" WS "sc_offst" WS "tc_offst" WS? SL_COMMENT? NEWLINE WS? "(-)" WS "(deg)" WS
	//	"(deg)" WS "(kg/m)" WS "(kg-m)" WS "(kg-m)" WS "(Nm^2)" WS "(Nm^2)" WS "(Nm^2)" WS "(N)" WS "(m)" WS "(m)" WS "(m)"
	//	WS? SL_COMMENT? NEWLINE (WS? sec_loc+=tNUMBER WS str_tw+=tNUMBER WS tw_iner+=tNUMBER WS mass_den+=tNUMBER WS
	//	flp_iner+=tNUMBER WS edge_iner+=tNUMBER WS flp_stff+=tNUMBER WS edge_stff+=tNUMBER WS tor_stff+=tNUMBER WS
	//	axial_stff+=tNUMBER WS cg_offst+=tNUMBER WS sc_offst+=tNUMBER WS tc_offst+=tNUMBER WS? SL_COMMENT? NEWLINE)+;
	public ASecElements getASecAccess() {
		return pASec;
	}
	
	public ParserRule getASecRule() {
		return getASecAccess().getRule();
	}
}
