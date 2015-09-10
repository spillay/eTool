package com.dsleng.etool.semantic.map.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.dsleng.etool.semantic.map.services.SemanticmapDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSemanticmapDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SemanticMapping for'", "'{'", "'}'", "'Ecore:'", "':'", "'key:'", "'value:'", "'import'", "'as'", "'.'", "'element'", "'mapsTo'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSemanticmapDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSemanticmapDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSemanticmapDslParser.tokenNames; }
    public String getGrammarFileName() { return "../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g"; }



     	private SemanticmapDslGrammarAccess grammarAccess;
     	
        public InternalSemanticmapDslParser(TokenStream input, SemanticmapDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SemanticMapping";	
       	}
       	
       	@Override
       	protected SemanticmapDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSemanticMapping"
    // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:67:1: entryRuleSemanticMapping returns [EObject current=null] : iv_ruleSemanticMapping= ruleSemanticMapping EOF ;
    public final EObject entryRuleSemanticMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemanticMapping = null;


        try {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:68:2: (iv_ruleSemanticMapping= ruleSemanticMapping EOF )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:69:2: iv_ruleSemanticMapping= ruleSemanticMapping EOF
            {
             newCompositeNode(grammarAccess.getSemanticMappingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSemanticMapping_in_entryRuleSemanticMapping75);
            iv_ruleSemanticMapping=ruleSemanticMapping();

            state._fsp--;

             current =iv_ruleSemanticMapping; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSemanticMapping85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSemanticMapping"


    // $ANTLR start "ruleSemanticMapping"
    // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:76:1: ruleSemanticMapping returns [EObject current=null] : ( ( (lv_ename_0_0= ruleImport ) ) otherlv_1= 'SemanticMapping for' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_mapping_4_0= ruleMappings ) )* otherlv_5= '}' ( (lv_el_6_0= ruleElement ) ) ) ;
    public final EObject ruleSemanticMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ename_0_0 = null;

        EObject lv_mapping_4_0 = null;

        EObject lv_el_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:79:28: ( ( ( (lv_ename_0_0= ruleImport ) ) otherlv_1= 'SemanticMapping for' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_mapping_4_0= ruleMappings ) )* otherlv_5= '}' ( (lv_el_6_0= ruleElement ) ) ) )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:80:1: ( ( (lv_ename_0_0= ruleImport ) ) otherlv_1= 'SemanticMapping for' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_mapping_4_0= ruleMappings ) )* otherlv_5= '}' ( (lv_el_6_0= ruleElement ) ) )
            {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:80:1: ( ( (lv_ename_0_0= ruleImport ) ) otherlv_1= 'SemanticMapping for' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_mapping_4_0= ruleMappings ) )* otherlv_5= '}' ( (lv_el_6_0= ruleElement ) ) )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:80:2: ( (lv_ename_0_0= ruleImport ) ) otherlv_1= 'SemanticMapping for' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_mapping_4_0= ruleMappings ) )* otherlv_5= '}' ( (lv_el_6_0= ruleElement ) )
            {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:80:2: ( (lv_ename_0_0= ruleImport ) )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:81:1: (lv_ename_0_0= ruleImport )
            {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:81:1: (lv_ename_0_0= ruleImport )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:82:3: lv_ename_0_0= ruleImport
            {
             
            	        newCompositeNode(grammarAccess.getSemanticMappingAccess().getEnameImportParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleImport_in_ruleSemanticMapping131);
            lv_ename_0_0=ruleImport();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSemanticMappingRule());
            	        }
                   		set(
                   			current, 
                   			"ename",
                    		lv_ename_0_0, 
                    		"Import");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSemanticMapping143); 

                	newLeafNode(otherlv_1, grammarAccess.getSemanticMappingAccess().getSemanticMappingForKeyword_1());
                
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:102:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:103:1: (lv_name_2_0= RULE_STRING )
            {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:103:1: (lv_name_2_0= RULE_STRING )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:104:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSemanticMapping160); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSemanticMappingAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSemanticMappingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSemanticMapping177); 

                	newLeafNode(otherlv_3, grammarAccess.getSemanticMappingAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:124:1: ( (lv_mapping_4_0= ruleMappings ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:125:1: (lv_mapping_4_0= ruleMappings )
            	    {
            	    // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:125:1: (lv_mapping_4_0= ruleMappings )
            	    // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:126:3: lv_mapping_4_0= ruleMappings
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSemanticMappingAccess().getMappingMappingsParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMappings_in_ruleSemanticMapping198);
            	    lv_mapping_4_0=ruleMappings();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSemanticMappingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mapping",
            	            		lv_mapping_4_0, 
            	            		"Mappings");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSemanticMapping211); 

                	newLeafNode(otherlv_5, grammarAccess.getSemanticMappingAccess().getRightCurlyBracketKeyword_5());
                
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:146:1: ( (lv_el_6_0= ruleElement ) )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:147:1: (lv_el_6_0= ruleElement )
            {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:147:1: (lv_el_6_0= ruleElement )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:148:3: lv_el_6_0= ruleElement
            {
             
            	        newCompositeNode(grammarAccess.getSemanticMappingAccess().getElElementParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleSemanticMapping232);
            lv_el_6_0=ruleElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSemanticMappingRule());
            	        }
                   		set(
                   			current, 
                   			"el",
                    		lv_el_6_0, 
                    		"Element");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSemanticMapping"


    // $ANTLR start "entryRuleMappings"
    // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:172:1: entryRuleMappings returns [EObject current=null] : iv_ruleMappings= ruleMappings EOF ;
    public final EObject entryRuleMappings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappings = null;


        try {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:173:2: (iv_ruleMappings= ruleMappings EOF )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:174:2: iv_ruleMappings= ruleMappings EOF
            {
             newCompositeNode(grammarAccess.getMappingsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMappings_in_entryRuleMappings268);
            iv_ruleMappings=ruleMappings();

            state._fsp--;

             current =iv_ruleMappings; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMappings278); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMappings"


    // $ANTLR start "ruleMappings"
    // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:181:1: ruleMappings returns [EObject current=null] : (otherlv_0= 'Ecore:' this_LClass_1= ruleLClass otherlv_2= ':' otherlv_3= 'key:' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ':' otherlv_6= 'value:' otherlv_7= '{' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= '}' ) ;
    public final EObject ruleMappings() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_value_8_0=null;
        Token otherlv_9=null;
        EObject this_LClass_1 = null;


         enterRule(); 
            
        try {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:184:28: ( (otherlv_0= 'Ecore:' this_LClass_1= ruleLClass otherlv_2= ':' otherlv_3= 'key:' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ':' otherlv_6= 'value:' otherlv_7= '{' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= '}' ) )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:185:1: (otherlv_0= 'Ecore:' this_LClass_1= ruleLClass otherlv_2= ':' otherlv_3= 'key:' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ':' otherlv_6= 'value:' otherlv_7= '{' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= '}' )
            {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:185:1: (otherlv_0= 'Ecore:' this_LClass_1= ruleLClass otherlv_2= ':' otherlv_3= 'key:' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ':' otherlv_6= 'value:' otherlv_7= '{' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= '}' )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:185:3: otherlv_0= 'Ecore:' this_LClass_1= ruleLClass otherlv_2= ':' otherlv_3= 'key:' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ':' otherlv_6= 'value:' otherlv_7= '{' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMappings315); 

                	newLeafNode(otherlv_0, grammarAccess.getMappingsAccess().getEcoreKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getMappingsAccess().getLClassParserRuleCall_1()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleLClass_in_ruleMappings337);
            this_LClass_1=ruleLClass();

            state._fsp--;

             
                    current = this_LClass_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMappings348); 

                	newLeafNode(otherlv_2, grammarAccess.getMappingsAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMappings360); 

                	newLeafNode(otherlv_3, grammarAccess.getMappingsAccess().getKeyKeyword_3());
                
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:206:1: ( (lv_name_4_0= RULE_STRING ) )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:207:1: (lv_name_4_0= RULE_STRING )
            {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:207:1: (lv_name_4_0= RULE_STRING )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:208:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleMappings377); 

            			newLeafNode(lv_name_4_0, grammarAccess.getMappingsAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMappingsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMappings394); 

                	newLeafNode(otherlv_5, grammarAccess.getMappingsAccess().getColonKeyword_5());
                
            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMappings406); 

                	newLeafNode(otherlv_6, grammarAccess.getMappingsAccess().getValueKeyword_6());
                
            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMappings418); 

                	newLeafNode(otherlv_7, grammarAccess.getMappingsAccess().getLeftCurlyBracketKeyword_7());
                
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:236:1: ( (lv_value_8_0= RULE_STRING ) )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:237:1: (lv_value_8_0= RULE_STRING )
            {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:237:1: (lv_value_8_0= RULE_STRING )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:238:3: lv_value_8_0= RULE_STRING
            {
            lv_value_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleMappings435); 

            			newLeafNode(lv_value_8_0, grammarAccess.getMappingsAccess().getValueSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMappingsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_8_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMappings452); 

                	newLeafNode(otherlv_9, grammarAccess.getMappingsAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMappings"


    // $ANTLR start "entryRuleImport"
    // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:266:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:267:2: (iv_ruleImport= ruleImport EOF )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:268:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImport_in_entryRuleImport488);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImport498); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:275:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:278:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:279:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:279:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:279:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleImport535); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:283:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:284:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:284:1: (lv_importURI_1_0= RULE_STRING )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:285:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleImport552); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleImport569); 

                	newLeafNode(otherlv_2, grammarAccess.getImportAccess().getAsKeyword_2());
                
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:305:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:306:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:306:1: (lv_name_3_0= RULE_ID )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:307:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleImport586); 

            			newLeafNode(lv_name_3_0, grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleLClass"
    // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:331:1: entryRuleLClass returns [EObject current=null] : iv_ruleLClass= ruleLClass EOF ;
    public final EObject entryRuleLClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLClass = null;


        try {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:332:2: (iv_ruleLClass= ruleLClass EOF )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:333:2: iv_ruleLClass= ruleLClass EOF
            {
             newCompositeNode(grammarAccess.getLClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLClass_in_entryRuleLClass627);
            iv_ruleLClass=ruleLClass();

            state._fsp--;

             current =iv_ruleLClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLClass637); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLClass"


    // $ANTLR start "ruleLClass"
    // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:340:1: ruleLClass returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleLClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:343:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:344:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:344:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:344:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:344:2: ( (otherlv_0= RULE_ID ) )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:345:1: (otherlv_0= RULE_ID )
            {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:345:1: (otherlv_0= RULE_ID )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:346:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLClassRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLClass682); 

            		newLeafNode(otherlv_0, grammarAccess.getLClassAccess().getEcoreTypesImportCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLClass694); 

                	newLeafNode(otherlv_1, grammarAccess.getLClassAccess().getFullStopKeyword_1());
                
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:361:1: ( (otherlv_2= RULE_ID ) )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:362:1: (otherlv_2= RULE_ID )
            {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:362:1: (otherlv_2= RULE_ID )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:363:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLClassRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLClass714); 

            		newLeafNode(otherlv_2, grammarAccess.getLClassAccess().getObjEClassCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLClass"


    // $ANTLR start "entryRuleElement"
    // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:382:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:383:2: (iv_ruleElement= ruleElement EOF )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:384:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_entryRuleElement750);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement760); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:391:1: ruleElement returns [EObject current=null] : (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( ( ruleFQN ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:394:28: ( (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( ( ruleFQN ) ) ) )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:395:1: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( ( ruleFQN ) ) )
            {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:395:1: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( ( ruleFQN ) ) )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:395:3: otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleElement797); 

                	newLeafNode(otherlv_0, grammarAccess.getElementAccess().getElementKeyword_0());
                
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:399:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:400:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:400:1: (lv_name_1_0= RULE_ID )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:401:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleElement814); 

            			newLeafNode(lv_name_1_0, grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleElement831); 

                	newLeafNode(otherlv_2, grammarAccess.getElementAccess().getMapsToKeyword_2());
                
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:421:1: ( ( ruleFQN ) )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:422:1: ( ruleFQN )
            {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:422:1: ( ruleFQN )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:423:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getElementRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getElementAccess().getRefEClassCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_ruleElement854);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleFQN"
    // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:444:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:445:2: (iv_ruleFQN= ruleFQN EOF )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:446:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_entryRuleFQN891);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFQN902); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:453:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:456:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:457:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:457:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:457:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFQN942); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:464:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.dsleng.etool.semantic.map/src-gen/com/dsleng/etool/semantic/map/parser/antlr/internal/InternalSemanticmapDsl.g:465:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFQN961); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFQN976); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSemanticMapping_in_entryRuleSemanticMapping75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSemanticMapping85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImport_in_ruleSemanticMapping131 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleSemanticMapping143 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSemanticMapping160 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSemanticMapping177 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_ruleMappings_in_ruleSemanticMapping198 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleSemanticMapping211 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleElement_in_ruleSemanticMapping232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMappings_in_entryRuleMappings268 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMappings278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleMappings315 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleLClass_in_ruleMappings337 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMappings348 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMappings360 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleMappings377 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMappings394 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMappings406 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMappings418 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleMappings435 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMappings452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImport_in_entryRuleImport488 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImport498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleImport535 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleImport552 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleImport569 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleImport586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLClass_in_entryRuleLClass627 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLClass637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLClass682 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleLClass694 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLClass714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_entryRuleElement750 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleElement797 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleElement814 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleElement831 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleFQN_in_ruleElement854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN891 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFQN902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFQN942 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleFQN961 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFQN976 = new BitSet(new long[]{0x0000000000100002L});
    }


}