package com.dsleng.etool.xtext.presentation.view.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.dsleng.etool.xtext.presentation.view.services.ViewDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalViewDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Page'", "'{'", "'layout'", "'}'", "'Layout'", "'layers'", "','", "'resizable'", "'Layers'", "'style'", "'position'", "'minSize'", "'maxSize'", "'-'", "'Horizontal'", "'height'", "'Vertical'", "'width'", "'Content'", "'center'", "'west'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalViewDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalViewDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalViewDslParser.tokenNames; }
    public String getGrammarFileName() { return "../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g"; }



     	private ViewDslGrammarAccess grammarAccess;
     	
        public InternalViewDslParser(TokenStream input, ViewDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Page";	
       	}
       	
       	@Override
       	protected ViewDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePage"
    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:68:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:69:2: (iv_rulePage= rulePage EOF )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:70:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_entryRulePage75);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePage85); 

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
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:77:1: rulePage returns [EObject current=null] : (otherlv_0= 'Page' otherlv_1= '{' otherlv_2= 'layout' ( (lv_layout_3_0= ruleLayout ) ) otherlv_4= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_layout_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:80:28: ( (otherlv_0= 'Page' otherlv_1= '{' otherlv_2= 'layout' ( (lv_layout_3_0= ruleLayout ) ) otherlv_4= '}' ) )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:81:1: (otherlv_0= 'Page' otherlv_1= '{' otherlv_2= 'layout' ( (lv_layout_3_0= ruleLayout ) ) otherlv_4= '}' )
            {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:81:1: (otherlv_0= 'Page' otherlv_1= '{' otherlv_2= 'layout' ( (lv_layout_3_0= ruleLayout ) ) otherlv_4= '}' )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:81:3: otherlv_0= 'Page' otherlv_1= '{' otherlv_2= 'layout' ( (lv_layout_3_0= ruleLayout ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePage122); 

                	newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePage134); 

                	newLeafNode(otherlv_1, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePage146); 

                	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLayoutKeyword_2());
                
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:93:1: ( (lv_layout_3_0= ruleLayout ) )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:94:1: (lv_layout_3_0= ruleLayout )
            {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:94:1: (lv_layout_3_0= ruleLayout )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:95:3: lv_layout_3_0= ruleLayout
            {
             
            	        newCompositeNode(grammarAccess.getPageAccess().getLayoutLayoutParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_rulePage167);
            lv_layout_3_0=ruleLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPageRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_3_0, 
                    		"Layout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePage179); 

                	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleLayers"
    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:123:1: entryRuleLayers returns [EObject current=null] : iv_ruleLayers= ruleLayers EOF ;
    public final EObject entryRuleLayers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayers = null;


        try {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:124:2: (iv_ruleLayers= ruleLayers EOF )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:125:2: iv_ruleLayers= ruleLayers EOF
            {
             newCompositeNode(grammarAccess.getLayersRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayers_in_entryRuleLayers215);
            iv_ruleLayers=ruleLayers();

            state._fsp--;

             current =iv_ruleLayers; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLayers225); 

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
    // $ANTLR end "entryRuleLayers"


    // $ANTLR start "ruleLayers"
    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:132:1: ruleLayers returns [EObject current=null] : (this_Layers_Impl_0= ruleLayers_Impl | this_Horizontal_1= ruleHorizontal | this_Vertical_2= ruleVertical | this_Content_3= ruleContent ) ;
    public final EObject ruleLayers() throws RecognitionException {
        EObject current = null;

        EObject this_Layers_Impl_0 = null;

        EObject this_Horizontal_1 = null;

        EObject this_Vertical_2 = null;

        EObject this_Content_3 = null;


         enterRule(); 
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:135:28: ( (this_Layers_Impl_0= ruleLayers_Impl | this_Horizontal_1= ruleHorizontal | this_Vertical_2= ruleVertical | this_Content_3= ruleContent ) )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:136:1: (this_Layers_Impl_0= ruleLayers_Impl | this_Horizontal_1= ruleHorizontal | this_Vertical_2= ruleVertical | this_Content_3= ruleContent )
            {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:136:1: (this_Layers_Impl_0= ruleLayers_Impl | this_Horizontal_1= ruleHorizontal | this_Vertical_2= ruleVertical | this_Content_3= ruleContent )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt1=2;
                    }
                    break;
                case 19:
                    {
                    alt1=1;
                    }
                    break;
                case 29:
                    {
                    alt1=4;
                    }
                    break;
                case 27:
                    {
                    alt1=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

                }
                break;
            case 19:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 27:
                {
                alt1=3;
                }
                break;
            case 29:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:137:5: this_Layers_Impl_0= ruleLayers_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getLayersAccess().getLayers_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLayers_Impl_in_ruleLayers272);
                    this_Layers_Impl_0=ruleLayers_Impl();

                    state._fsp--;

                     
                            current = this_Layers_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:147:5: this_Horizontal_1= ruleHorizontal
                    {
                     
                            newCompositeNode(grammarAccess.getLayersAccess().getHorizontalParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHorizontal_in_ruleLayers299);
                    this_Horizontal_1=ruleHorizontal();

                    state._fsp--;

                     
                            current = this_Horizontal_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:157:5: this_Vertical_2= ruleVertical
                    {
                     
                            newCompositeNode(grammarAccess.getLayersAccess().getVerticalParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVertical_in_ruleLayers326);
                    this_Vertical_2=ruleVertical();

                    state._fsp--;

                     
                            current = this_Vertical_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:167:5: this_Content_3= ruleContent
                    {
                     
                            newCompositeNode(grammarAccess.getLayersAccess().getContentParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleContent_in_ruleLayers353);
                    this_Content_3=ruleContent();

                    state._fsp--;

                     
                            current = this_Content_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleLayers"


    // $ANTLR start "entryRuleLayout"
    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:183:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:184:2: (iv_ruleLayout= ruleLayout EOF )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:185:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_entryRuleLayout388);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLayout398); 

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
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:192:1: ruleLayout returns [EObject current=null] : ( () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'layers' otherlv_4= '{' ( (lv_layers_5_0= ruleLayers ) ) (otherlv_6= ',' ( (lv_layers_7_0= ruleLayers ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_layers_5_0 = null;

        EObject lv_layers_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:195:28: ( ( () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'layers' otherlv_4= '{' ( (lv_layers_5_0= ruleLayers ) ) (otherlv_6= ',' ( (lv_layers_7_0= ruleLayers ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:196:1: ( () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'layers' otherlv_4= '{' ( (lv_layers_5_0= ruleLayers ) ) (otherlv_6= ',' ( (lv_layers_7_0= ruleLayers ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:196:1: ( () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'layers' otherlv_4= '{' ( (lv_layers_5_0= ruleLayers ) ) (otherlv_6= ',' ( (lv_layers_7_0= ruleLayers ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:196:2: () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'layers' otherlv_4= '{' ( (lv_layers_5_0= ruleLayers ) ) (otherlv_6= ',' ( (lv_layers_7_0= ruleLayers ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:196:2: ()
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:197:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLayoutAccess().getLayoutAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLayout444); 

                	newLeafNode(otherlv_1, grammarAccess.getLayoutAccess().getLayoutKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLayout456); 

                	newLeafNode(otherlv_2, grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:210:1: (otherlv_3= 'layers' otherlv_4= '{' ( (lv_layers_5_0= ruleLayers ) ) (otherlv_6= ',' ( (lv_layers_7_0= ruleLayers ) ) )* otherlv_8= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:210:3: otherlv_3= 'layers' otherlv_4= '{' ( (lv_layers_5_0= ruleLayers ) ) (otherlv_6= ',' ( (lv_layers_7_0= ruleLayers ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLayout469); 

                        	newLeafNode(otherlv_3, grammarAccess.getLayoutAccess().getLayersKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLayout481); 

                        	newLeafNode(otherlv_4, grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:218:1: ( (lv_layers_5_0= ruleLayers ) )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:219:1: (lv_layers_5_0= ruleLayers )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:219:1: (lv_layers_5_0= ruleLayers )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:220:3: lv_layers_5_0= ruleLayers
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayoutAccess().getLayersLayersParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLayers_in_ruleLayout502);
                    lv_layers_5_0=ruleLayers();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLayoutRule());
                    	        }
                           		add(
                           			current, 
                           			"layers",
                            		lv_layers_5_0, 
                            		"Layers");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:236:2: (otherlv_6= ',' ( (lv_layers_7_0= ruleLayers ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==17) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:236:4: otherlv_6= ',' ( (lv_layers_7_0= ruleLayers ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLayout515); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getLayoutAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:240:1: ( (lv_layers_7_0= ruleLayers ) )
                    	    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:241:1: (lv_layers_7_0= ruleLayers )
                    	    {
                    	    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:241:1: (lv_layers_7_0= ruleLayers )
                    	    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:242:3: lv_layers_7_0= ruleLayers
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLayoutAccess().getLayersLayersParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleLayers_in_ruleLayout536);
                    	    lv_layers_7_0=ruleLayers();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLayoutRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"layers",
                    	            		lv_layers_7_0, 
                    	            		"Layers");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLayout550); 

                        	newLeafNode(otherlv_8, grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLayout564); 

                	newLeafNode(otherlv_9, grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleLayers_Impl"
    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:274:1: entryRuleLayers_Impl returns [EObject current=null] : iv_ruleLayers_Impl= ruleLayers_Impl EOF ;
    public final EObject entryRuleLayers_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayers_Impl = null;


        try {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:275:2: (iv_ruleLayers_Impl= ruleLayers_Impl EOF )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:276:2: iv_ruleLayers_Impl= ruleLayers_Impl EOF
            {
             newCompositeNode(grammarAccess.getLayers_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayers_Impl_in_entryRuleLayers_Impl600);
            iv_ruleLayers_Impl=ruleLayers_Impl();

            state._fsp--;

             current =iv_ruleLayers_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLayers_Impl610); 

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
    // $ANTLR end "entryRuleLayers_Impl"


    // $ANTLR start "ruleLayers_Impl"
    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:283:1: ruleLayers_Impl returns [EObject current=null] : ( () ( (lv_resizable_1_0= 'resizable' ) )? otherlv_2= 'Layers' otherlv_3= '{' (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )? (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )? (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleLayers_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_resizable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_style_5_0 = null;

        Enumerator lv_position_7_0 = null;

        AntlrDatatypeRuleToken lv_minSize_9_0 = null;

        AntlrDatatypeRuleToken lv_maxSize_11_0 = null;


         enterRule(); 
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:286:28: ( ( () ( (lv_resizable_1_0= 'resizable' ) )? otherlv_2= 'Layers' otherlv_3= '{' (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )? (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )? (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )? otherlv_12= '}' ) )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:287:1: ( () ( (lv_resizable_1_0= 'resizable' ) )? otherlv_2= 'Layers' otherlv_3= '{' (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )? (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )? (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )? otherlv_12= '}' )
            {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:287:1: ( () ( (lv_resizable_1_0= 'resizable' ) )? otherlv_2= 'Layers' otherlv_3= '{' (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )? (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )? (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )? otherlv_12= '}' )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:287:2: () ( (lv_resizable_1_0= 'resizable' ) )? otherlv_2= 'Layers' otherlv_3= '{' (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )? (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )? (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )? otherlv_12= '}'
            {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:287:2: ()
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:288:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLayers_ImplAccess().getLayersAction_0(),
                        current);
                

            }

            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:293:2: ( (lv_resizable_1_0= 'resizable' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:294:1: (lv_resizable_1_0= 'resizable' )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:294:1: (lv_resizable_1_0= 'resizable' )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:295:3: lv_resizable_1_0= 'resizable'
                    {
                    lv_resizable_1_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLayers_Impl662); 

                            newLeafNode(lv_resizable_1_0, grammarAccess.getLayers_ImplAccess().getResizableResizableKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLayers_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "resizable", true, "resizable");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLayers_Impl688); 

                	newLeafNode(otherlv_2, grammarAccess.getLayers_ImplAccess().getLayersKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLayers_Impl700); 

                	newLeafNode(otherlv_3, grammarAccess.getLayers_ImplAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:316:1: (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:316:3: otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLayers_Impl713); 

                        	newLeafNode(otherlv_4, grammarAccess.getLayers_ImplAccess().getStyleKeyword_4_0());
                        
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:320:1: ( (lv_style_5_0= ruleEString ) )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:321:1: (lv_style_5_0= ruleEString )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:321:1: (lv_style_5_0= ruleEString )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:322:3: lv_style_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayers_ImplAccess().getStyleEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLayers_Impl734);
                    lv_style_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLayers_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:338:4: (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:338:6: otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) )
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleLayers_Impl749); 

                        	newLeafNode(otherlv_6, grammarAccess.getLayers_ImplAccess().getPositionKeyword_5_0());
                        
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:342:1: ( (lv_position_7_0= ruleLayoutPosition ) )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:343:1: (lv_position_7_0= ruleLayoutPosition )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:343:1: (lv_position_7_0= ruleLayoutPosition )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:344:3: lv_position_7_0= ruleLayoutPosition
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayers_ImplAccess().getPositionLayoutPositionEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLayoutPosition_in_ruleLayers_Impl770);
                    lv_position_7_0=ruleLayoutPosition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLayers_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"position",
                            		lv_position_7_0, 
                            		"LayoutPosition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:360:4: (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:360:6: otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleLayers_Impl785); 

                        	newLeafNode(otherlv_8, grammarAccess.getLayers_ImplAccess().getMinSizeKeyword_6_0());
                        
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:364:1: ( (lv_minSize_9_0= ruleEInt ) )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:365:1: (lv_minSize_9_0= ruleEInt )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:365:1: (lv_minSize_9_0= ruleEInt )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:366:3: lv_minSize_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayers_ImplAccess().getMinSizeEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLayers_Impl806);
                    lv_minSize_9_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLayers_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"minSize",
                            		lv_minSize_9_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:382:4: (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:382:6: otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleLayers_Impl821); 

                        	newLeafNode(otherlv_10, grammarAccess.getLayers_ImplAccess().getMaxSizeKeyword_7_0());
                        
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:386:1: ( (lv_maxSize_11_0= ruleEInt ) )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:387:1: (lv_maxSize_11_0= ruleEInt )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:387:1: (lv_maxSize_11_0= ruleEInt )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:388:3: lv_maxSize_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayers_ImplAccess().getMaxSizeEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLayers_Impl842);
                    lv_maxSize_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLayers_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"maxSize",
                            		lv_maxSize_11_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLayers_Impl856); 

                	newLeafNode(otherlv_12, grammarAccess.getLayers_ImplAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleLayers_Impl"


    // $ANTLR start "entryRuleEString"
    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:416:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:417:2: (iv_ruleEString= ruleEString EOF )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:418:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString893);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString904); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:425:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:428:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:429:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:429:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:429:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString944); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:437:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString970); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:454:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:455:2: (iv_ruleEInt= ruleEInt EOF )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:456:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1018);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1029); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:463:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:466:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:467:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:467:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:467:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:467:2: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:468:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEInt1068); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1085); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleHorizontal"
    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:488:1: entryRuleHorizontal returns [EObject current=null] : iv_ruleHorizontal= ruleHorizontal EOF ;
    public final EObject entryRuleHorizontal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHorizontal = null;


        try {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:489:2: (iv_ruleHorizontal= ruleHorizontal EOF )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:490:2: iv_ruleHorizontal= ruleHorizontal EOF
            {
             newCompositeNode(grammarAccess.getHorizontalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHorizontal_in_entryRuleHorizontal1130);
            iv_ruleHorizontal=ruleHorizontal();

            state._fsp--;

             current =iv_ruleHorizontal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHorizontal1140); 

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
    // $ANTLR end "entryRuleHorizontal"


    // $ANTLR start "ruleHorizontal"
    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:497:1: ruleHorizontal returns [EObject current=null] : ( () ( (lv_resizable_1_0= 'resizable' ) )? otherlv_2= 'Horizontal' otherlv_3= '{' (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )? (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )? (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )? (otherlv_12= 'height' ( (lv_height_13_0= ruleEInt ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleHorizontal() throws RecognitionException {
        EObject current = null;

        Token lv_resizable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_style_5_0 = null;

        Enumerator lv_position_7_0 = null;

        AntlrDatatypeRuleToken lv_minSize_9_0 = null;

        AntlrDatatypeRuleToken lv_maxSize_11_0 = null;

        AntlrDatatypeRuleToken lv_height_13_0 = null;


         enterRule(); 
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:500:28: ( ( () ( (lv_resizable_1_0= 'resizable' ) )? otherlv_2= 'Horizontal' otherlv_3= '{' (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )? (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )? (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )? (otherlv_12= 'height' ( (lv_height_13_0= ruleEInt ) ) )? otherlv_14= '}' ) )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:501:1: ( () ( (lv_resizable_1_0= 'resizable' ) )? otherlv_2= 'Horizontal' otherlv_3= '{' (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )? (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )? (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )? (otherlv_12= 'height' ( (lv_height_13_0= ruleEInt ) ) )? otherlv_14= '}' )
            {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:501:1: ( () ( (lv_resizable_1_0= 'resizable' ) )? otherlv_2= 'Horizontal' otherlv_3= '{' (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )? (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )? (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )? (otherlv_12= 'height' ( (lv_height_13_0= ruleEInt ) ) )? otherlv_14= '}' )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:501:2: () ( (lv_resizable_1_0= 'resizable' ) )? otherlv_2= 'Horizontal' otherlv_3= '{' (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )? (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )? (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )? (otherlv_12= 'height' ( (lv_height_13_0= ruleEInt ) ) )? otherlv_14= '}'
            {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:501:2: ()
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:502:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHorizontalAccess().getHorizontalAction_0(),
                        current);
                

            }

            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:507:2: ( (lv_resizable_1_0= 'resizable' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:508:1: (lv_resizable_1_0= 'resizable' )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:508:1: (lv_resizable_1_0= 'resizable' )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:509:3: lv_resizable_1_0= 'resizable'
                    {
                    lv_resizable_1_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleHorizontal1192); 

                            newLeafNode(lv_resizable_1_0, grammarAccess.getHorizontalAccess().getResizableResizableKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHorizontalRule());
                    	        }
                           		setWithLastConsumed(current, "resizable", true, "resizable");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleHorizontal1218); 

                	newLeafNode(otherlv_2, grammarAccess.getHorizontalAccess().getHorizontalKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHorizontal1230); 

                	newLeafNode(otherlv_3, grammarAccess.getHorizontalAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:530:1: (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:530:3: otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleHorizontal1243); 

                        	newLeafNode(otherlv_4, grammarAccess.getHorizontalAccess().getStyleKeyword_4_0());
                        
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:534:1: ( (lv_style_5_0= ruleEString ) )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:535:1: (lv_style_5_0= ruleEString )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:535:1: (lv_style_5_0= ruleEString )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:536:3: lv_style_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getHorizontalAccess().getStyleEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleHorizontal1264);
                    lv_style_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHorizontalRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:552:4: (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:552:6: otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) )
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleHorizontal1279); 

                        	newLeafNode(otherlv_6, grammarAccess.getHorizontalAccess().getPositionKeyword_5_0());
                        
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:556:1: ( (lv_position_7_0= ruleLayoutPosition ) )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:557:1: (lv_position_7_0= ruleLayoutPosition )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:557:1: (lv_position_7_0= ruleLayoutPosition )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:558:3: lv_position_7_0= ruleLayoutPosition
                    {
                     
                    	        newCompositeNode(grammarAccess.getHorizontalAccess().getPositionLayoutPositionEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLayoutPosition_in_ruleHorizontal1300);
                    lv_position_7_0=ruleLayoutPosition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHorizontalRule());
                    	        }
                           		set(
                           			current, 
                           			"position",
                            		lv_position_7_0, 
                            		"LayoutPosition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:574:4: (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:574:6: otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleHorizontal1315); 

                        	newLeafNode(otherlv_8, grammarAccess.getHorizontalAccess().getMinSizeKeyword_6_0());
                        
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:578:1: ( (lv_minSize_9_0= ruleEInt ) )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:579:1: (lv_minSize_9_0= ruleEInt )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:579:1: (lv_minSize_9_0= ruleEInt )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:580:3: lv_minSize_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getHorizontalAccess().getMinSizeEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleHorizontal1336);
                    lv_minSize_9_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHorizontalRule());
                    	        }
                           		set(
                           			current, 
                           			"minSize",
                            		lv_minSize_9_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:596:4: (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:596:6: otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleHorizontal1351); 

                        	newLeafNode(otherlv_10, grammarAccess.getHorizontalAccess().getMaxSizeKeyword_7_0());
                        
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:600:1: ( (lv_maxSize_11_0= ruleEInt ) )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:601:1: (lv_maxSize_11_0= ruleEInt )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:601:1: (lv_maxSize_11_0= ruleEInt )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:602:3: lv_maxSize_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getHorizontalAccess().getMaxSizeEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleHorizontal1372);
                    lv_maxSize_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHorizontalRule());
                    	        }
                           		set(
                           			current, 
                           			"maxSize",
                            		lv_maxSize_11_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:618:4: (otherlv_12= 'height' ( (lv_height_13_0= ruleEInt ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:618:6: otherlv_12= 'height' ( (lv_height_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleHorizontal1387); 

                        	newLeafNode(otherlv_12, grammarAccess.getHorizontalAccess().getHeightKeyword_8_0());
                        
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:622:1: ( (lv_height_13_0= ruleEInt ) )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:623:1: (lv_height_13_0= ruleEInt )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:623:1: (lv_height_13_0= ruleEInt )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:624:3: lv_height_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getHorizontalAccess().getHeightEIntParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleHorizontal1408);
                    lv_height_13_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHorizontalRule());
                    	        }
                           		set(
                           			current, 
                           			"height",
                            		lv_height_13_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleHorizontal1422); 

                	newLeafNode(otherlv_14, grammarAccess.getHorizontalAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleHorizontal"


    // $ANTLR start "entryRuleVertical"
    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:652:1: entryRuleVertical returns [EObject current=null] : iv_ruleVertical= ruleVertical EOF ;
    public final EObject entryRuleVertical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVertical = null;


        try {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:653:2: (iv_ruleVertical= ruleVertical EOF )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:654:2: iv_ruleVertical= ruleVertical EOF
            {
             newCompositeNode(grammarAccess.getVerticalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVertical_in_entryRuleVertical1458);
            iv_ruleVertical=ruleVertical();

            state._fsp--;

             current =iv_ruleVertical; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVertical1468); 

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
    // $ANTLR end "entryRuleVertical"


    // $ANTLR start "ruleVertical"
    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:661:1: ruleVertical returns [EObject current=null] : ( () ( (lv_resizable_1_0= 'resizable' ) )? otherlv_2= 'Vertical' otherlv_3= '{' (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )? (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )? (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )? (otherlv_12= 'width' ( (lv_width_13_0= ruleEInt ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleVertical() throws RecognitionException {
        EObject current = null;

        Token lv_resizable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_style_5_0 = null;

        Enumerator lv_position_7_0 = null;

        AntlrDatatypeRuleToken lv_minSize_9_0 = null;

        AntlrDatatypeRuleToken lv_maxSize_11_0 = null;

        AntlrDatatypeRuleToken lv_width_13_0 = null;


         enterRule(); 
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:664:28: ( ( () ( (lv_resizable_1_0= 'resizable' ) )? otherlv_2= 'Vertical' otherlv_3= '{' (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )? (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )? (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )? (otherlv_12= 'width' ( (lv_width_13_0= ruleEInt ) ) )? otherlv_14= '}' ) )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:665:1: ( () ( (lv_resizable_1_0= 'resizable' ) )? otherlv_2= 'Vertical' otherlv_3= '{' (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )? (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )? (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )? (otherlv_12= 'width' ( (lv_width_13_0= ruleEInt ) ) )? otherlv_14= '}' )
            {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:665:1: ( () ( (lv_resizable_1_0= 'resizable' ) )? otherlv_2= 'Vertical' otherlv_3= '{' (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )? (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )? (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )? (otherlv_12= 'width' ( (lv_width_13_0= ruleEInt ) ) )? otherlv_14= '}' )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:665:2: () ( (lv_resizable_1_0= 'resizable' ) )? otherlv_2= 'Vertical' otherlv_3= '{' (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )? (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )? (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )? (otherlv_12= 'width' ( (lv_width_13_0= ruleEInt ) ) )? otherlv_14= '}'
            {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:665:2: ()
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:666:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVerticalAccess().getVerticalAction_0(),
                        current);
                

            }

            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:671:2: ( (lv_resizable_1_0= 'resizable' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:672:1: (lv_resizable_1_0= 'resizable' )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:672:1: (lv_resizable_1_0= 'resizable' )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:673:3: lv_resizable_1_0= 'resizable'
                    {
                    lv_resizable_1_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleVertical1520); 

                            newLeafNode(lv_resizable_1_0, grammarAccess.getVerticalAccess().getResizableResizableKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVerticalRule());
                    	        }
                           		setWithLastConsumed(current, "resizable", true, "resizable");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleVertical1546); 

                	newLeafNode(otherlv_2, grammarAccess.getVerticalAccess().getVerticalKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleVertical1558); 

                	newLeafNode(otherlv_3, grammarAccess.getVerticalAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:694:1: (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:694:3: otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleVertical1571); 

                        	newLeafNode(otherlv_4, grammarAccess.getVerticalAccess().getStyleKeyword_4_0());
                        
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:698:1: ( (lv_style_5_0= ruleEString ) )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:699:1: (lv_style_5_0= ruleEString )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:699:1: (lv_style_5_0= ruleEString )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:700:3: lv_style_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerticalAccess().getStyleEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVertical1592);
                    lv_style_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerticalRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:716:4: (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:716:6: otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) )
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleVertical1607); 

                        	newLeafNode(otherlv_6, grammarAccess.getVerticalAccess().getPositionKeyword_5_0());
                        
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:720:1: ( (lv_position_7_0= ruleLayoutPosition ) )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:721:1: (lv_position_7_0= ruleLayoutPosition )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:721:1: (lv_position_7_0= ruleLayoutPosition )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:722:3: lv_position_7_0= ruleLayoutPosition
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerticalAccess().getPositionLayoutPositionEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLayoutPosition_in_ruleVertical1628);
                    lv_position_7_0=ruleLayoutPosition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerticalRule());
                    	        }
                           		set(
                           			current, 
                           			"position",
                            		lv_position_7_0, 
                            		"LayoutPosition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:738:4: (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:738:6: otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleVertical1643); 

                        	newLeafNode(otherlv_8, grammarAccess.getVerticalAccess().getMinSizeKeyword_6_0());
                        
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:742:1: ( (lv_minSize_9_0= ruleEInt ) )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:743:1: (lv_minSize_9_0= ruleEInt )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:743:1: (lv_minSize_9_0= ruleEInt )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:744:3: lv_minSize_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerticalAccess().getMinSizeEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleVertical1664);
                    lv_minSize_9_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerticalRule());
                    	        }
                           		set(
                           			current, 
                           			"minSize",
                            		lv_minSize_9_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:760:4: (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:760:6: otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleVertical1679); 

                        	newLeafNode(otherlv_10, grammarAccess.getVerticalAccess().getMaxSizeKeyword_7_0());
                        
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:764:1: ( (lv_maxSize_11_0= ruleEInt ) )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:765:1: (lv_maxSize_11_0= ruleEInt )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:765:1: (lv_maxSize_11_0= ruleEInt )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:766:3: lv_maxSize_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerticalAccess().getMaxSizeEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleVertical1700);
                    lv_maxSize_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerticalRule());
                    	        }
                           		set(
                           			current, 
                           			"maxSize",
                            		lv_maxSize_11_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:782:4: (otherlv_12= 'width' ( (lv_width_13_0= ruleEInt ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:782:6: otherlv_12= 'width' ( (lv_width_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleVertical1715); 

                        	newLeafNode(otherlv_12, grammarAccess.getVerticalAccess().getWidthKeyword_8_0());
                        
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:786:1: ( (lv_width_13_0= ruleEInt ) )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:787:1: (lv_width_13_0= ruleEInt )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:787:1: (lv_width_13_0= ruleEInt )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:788:3: lv_width_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerticalAccess().getWidthEIntParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleVertical1736);
                    lv_width_13_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerticalRule());
                    	        }
                           		set(
                           			current, 
                           			"width",
                            		lv_width_13_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleVertical1750); 

                	newLeafNode(otherlv_14, grammarAccess.getVerticalAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleVertical"


    // $ANTLR start "entryRuleContent"
    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:816:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:817:2: (iv_ruleContent= ruleContent EOF )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:818:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_entryRuleContent1786);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContent1796); 

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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:825:1: ruleContent returns [EObject current=null] : ( () ( (lv_resizable_1_0= 'resizable' ) )? otherlv_2= 'Content' otherlv_3= '{' (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )? (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )? (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )? (otherlv_12= 'height' ( (lv_height_13_0= ruleEInt ) ) )? (otherlv_14= 'width' ( (lv_width_15_0= ruleEInt ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        Token lv_resizable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_style_5_0 = null;

        Enumerator lv_position_7_0 = null;

        AntlrDatatypeRuleToken lv_minSize_9_0 = null;

        AntlrDatatypeRuleToken lv_maxSize_11_0 = null;

        AntlrDatatypeRuleToken lv_height_13_0 = null;

        AntlrDatatypeRuleToken lv_width_15_0 = null;


         enterRule(); 
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:828:28: ( ( () ( (lv_resizable_1_0= 'resizable' ) )? otherlv_2= 'Content' otherlv_3= '{' (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )? (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )? (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )? (otherlv_12= 'height' ( (lv_height_13_0= ruleEInt ) ) )? (otherlv_14= 'width' ( (lv_width_15_0= ruleEInt ) ) )? otherlv_16= '}' ) )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:829:1: ( () ( (lv_resizable_1_0= 'resizable' ) )? otherlv_2= 'Content' otherlv_3= '{' (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )? (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )? (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )? (otherlv_12= 'height' ( (lv_height_13_0= ruleEInt ) ) )? (otherlv_14= 'width' ( (lv_width_15_0= ruleEInt ) ) )? otherlv_16= '}' )
            {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:829:1: ( () ( (lv_resizable_1_0= 'resizable' ) )? otherlv_2= 'Content' otherlv_3= '{' (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )? (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )? (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )? (otherlv_12= 'height' ( (lv_height_13_0= ruleEInt ) ) )? (otherlv_14= 'width' ( (lv_width_15_0= ruleEInt ) ) )? otherlv_16= '}' )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:829:2: () ( (lv_resizable_1_0= 'resizable' ) )? otherlv_2= 'Content' otherlv_3= '{' (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )? (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )? (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )? (otherlv_12= 'height' ( (lv_height_13_0= ruleEInt ) ) )? (otherlv_14= 'width' ( (lv_width_15_0= ruleEInt ) ) )? otherlv_16= '}'
            {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:829:2: ()
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:830:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContentAccess().getContentAction_0(),
                        current);
                

            }

            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:835:2: ( (lv_resizable_1_0= 'resizable' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:836:1: (lv_resizable_1_0= 'resizable' )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:836:1: (lv_resizable_1_0= 'resizable' )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:837:3: lv_resizable_1_0= 'resizable'
                    {
                    lv_resizable_1_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleContent1848); 

                            newLeafNode(lv_resizable_1_0, grammarAccess.getContentAccess().getResizableResizableKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContentRule());
                    	        }
                           		setWithLastConsumed(current, "resizable", true, "resizable");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleContent1874); 

                	newLeafNode(otherlv_2, grammarAccess.getContentAccess().getContentKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContent1886); 

                	newLeafNode(otherlv_3, grammarAccess.getContentAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:858:1: (otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:858:3: otherlv_4= 'style' ( (lv_style_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleContent1899); 

                        	newLeafNode(otherlv_4, grammarAccess.getContentAccess().getStyleKeyword_4_0());
                        
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:862:1: ( (lv_style_5_0= ruleEString ) )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:863:1: (lv_style_5_0= ruleEString )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:863:1: (lv_style_5_0= ruleEString )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:864:3: lv_style_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentAccess().getStyleEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContent1920);
                    lv_style_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:880:4: (otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:880:6: otherlv_6= 'position' ( (lv_position_7_0= ruleLayoutPosition ) )
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleContent1935); 

                        	newLeafNode(otherlv_6, grammarAccess.getContentAccess().getPositionKeyword_5_0());
                        
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:884:1: ( (lv_position_7_0= ruleLayoutPosition ) )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:885:1: (lv_position_7_0= ruleLayoutPosition )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:885:1: (lv_position_7_0= ruleLayoutPosition )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:886:3: lv_position_7_0= ruleLayoutPosition
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentAccess().getPositionLayoutPositionEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLayoutPosition_in_ruleContent1956);
                    lv_position_7_0=ruleLayoutPosition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentRule());
                    	        }
                           		set(
                           			current, 
                           			"position",
                            		lv_position_7_0, 
                            		"LayoutPosition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:902:4: (otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:902:6: otherlv_8= 'minSize' ( (lv_minSize_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleContent1971); 

                        	newLeafNode(otherlv_8, grammarAccess.getContentAccess().getMinSizeKeyword_6_0());
                        
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:906:1: ( (lv_minSize_9_0= ruleEInt ) )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:907:1: (lv_minSize_9_0= ruleEInt )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:907:1: (lv_minSize_9_0= ruleEInt )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:908:3: lv_minSize_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentAccess().getMinSizeEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleContent1992);
                    lv_minSize_9_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentRule());
                    	        }
                           		set(
                           			current, 
                           			"minSize",
                            		lv_minSize_9_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:924:4: (otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:924:6: otherlv_10= 'maxSize' ( (lv_maxSize_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleContent2007); 

                        	newLeafNode(otherlv_10, grammarAccess.getContentAccess().getMaxSizeKeyword_7_0());
                        
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:928:1: ( (lv_maxSize_11_0= ruleEInt ) )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:929:1: (lv_maxSize_11_0= ruleEInt )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:929:1: (lv_maxSize_11_0= ruleEInt )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:930:3: lv_maxSize_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentAccess().getMaxSizeEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleContent2028);
                    lv_maxSize_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentRule());
                    	        }
                           		set(
                           			current, 
                           			"maxSize",
                            		lv_maxSize_11_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:946:4: (otherlv_12= 'height' ( (lv_height_13_0= ruleEInt ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==26) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:946:6: otherlv_12= 'height' ( (lv_height_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleContent2043); 

                        	newLeafNode(otherlv_12, grammarAccess.getContentAccess().getHeightKeyword_8_0());
                        
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:950:1: ( (lv_height_13_0= ruleEInt ) )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:951:1: (lv_height_13_0= ruleEInt )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:951:1: (lv_height_13_0= ruleEInt )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:952:3: lv_height_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentAccess().getHeightEIntParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleContent2064);
                    lv_height_13_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentRule());
                    	        }
                           		set(
                           			current, 
                           			"height",
                            		lv_height_13_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:968:4: (otherlv_14= 'width' ( (lv_width_15_0= ruleEInt ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:968:6: otherlv_14= 'width' ( (lv_width_15_0= ruleEInt ) )
                    {
                    otherlv_14=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleContent2079); 

                        	newLeafNode(otherlv_14, grammarAccess.getContentAccess().getWidthKeyword_9_0());
                        
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:972:1: ( (lv_width_15_0= ruleEInt ) )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:973:1: (lv_width_15_0= ruleEInt )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:973:1: (lv_width_15_0= ruleEInt )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:974:3: lv_width_15_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentAccess().getWidthEIntParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleContent2100);
                    lv_width_15_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentRule());
                    	        }
                           		set(
                           			current, 
                           			"width",
                            		lv_width_15_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleContent2114); 

                	newLeafNode(otherlv_16, grammarAccess.getContentAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleContent"


    // $ANTLR start "ruleLayoutPosition"
    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:1002:1: ruleLayoutPosition returns [Enumerator current=null] : ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'west' ) ) ;
    public final Enumerator ruleLayoutPosition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:1004:28: ( ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'west' ) ) )
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:1005:1: ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'west' ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:1005:1: ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'west' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            else if ( (LA30_0==31) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:1005:2: (enumLiteral_0= 'center' )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:1005:2: (enumLiteral_0= 'center' )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:1005:4: enumLiteral_0= 'center'
                    {
                    enumLiteral_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLayoutPosition2164); 

                            current = grammarAccess.getLayoutPositionAccess().getCenterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLayoutPositionAccess().getCenterEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:1011:6: (enumLiteral_1= 'west' )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:1011:6: (enumLiteral_1= 'west' )
                    // ../com.dsleng.etool.xtext.presentation.view/src-gen/com/dsleng/etool/xtext/presentation/view/parser/antlr/internal/InternalViewDsl.g:1011:8: enumLiteral_1= 'west'
                    {
                    enumLiteral_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleLayoutPosition2181); 

                            current = grammarAccess.getLayoutPositionAccess().getWestEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLayoutPositionAccess().getWestEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleLayoutPosition"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulePage_in_entryRulePage75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePage85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rulePage122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePage134 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePage146 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleLayout_in_rulePage167 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePage179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayers_in_entryRuleLayers215 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLayers225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayers_Impl_in_ruleLayers272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHorizontal_in_ruleLayers299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVertical_in_ruleLayers326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_ruleLayers353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout388 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLayout398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleLayout444 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLayout456 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_16_in_ruleLayout469 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLayout481 = new BitSet(new long[]{0x000000002A0C0000L});
        public static final BitSet FOLLOW_ruleLayers_in_ruleLayout502 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_17_in_ruleLayout515 = new BitSet(new long[]{0x000000002A0C0000L});
        public static final BitSet FOLLOW_ruleLayers_in_ruleLayout536 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_14_in_ruleLayout550 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleLayout564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayers_Impl_in_entryRuleLayers_Impl600 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLayers_Impl610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleLayers_Impl662 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleLayers_Impl688 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLayers_Impl700 = new BitSet(new long[]{0x0000000000F04000L});
        public static final BitSet FOLLOW_20_in_ruleLayers_Impl713 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLayers_Impl734 = new BitSet(new long[]{0x0000000000E04000L});
        public static final BitSet FOLLOW_21_in_ruleLayers_Impl749 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_ruleLayoutPosition_in_ruleLayers_Impl770 = new BitSet(new long[]{0x0000000000C04000L});
        public static final BitSet FOLLOW_22_in_ruleLayers_Impl785 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLayers_Impl806 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleLayers_Impl821 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLayers_Impl842 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleLayers_Impl856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString893 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1018 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleEInt1068 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHorizontal_in_entryRuleHorizontal1130 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHorizontal1140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleHorizontal1192 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleHorizontal1218 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleHorizontal1230 = new BitSet(new long[]{0x0000000004F04000L});
        public static final BitSet FOLLOW_20_in_ruleHorizontal1243 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleHorizontal1264 = new BitSet(new long[]{0x0000000004E04000L});
        public static final BitSet FOLLOW_21_in_ruleHorizontal1279 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_ruleLayoutPosition_in_ruleHorizontal1300 = new BitSet(new long[]{0x0000000004C04000L});
        public static final BitSet FOLLOW_22_in_ruleHorizontal1315 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleHorizontal1336 = new BitSet(new long[]{0x0000000004804000L});
        public static final BitSet FOLLOW_23_in_ruleHorizontal1351 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleHorizontal1372 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_26_in_ruleHorizontal1387 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleHorizontal1408 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleHorizontal1422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVertical_in_entryRuleVertical1458 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVertical1468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleVertical1520 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleVertical1546 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleVertical1558 = new BitSet(new long[]{0x0000000010F04000L});
        public static final BitSet FOLLOW_20_in_ruleVertical1571 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVertical1592 = new BitSet(new long[]{0x0000000010E04000L});
        public static final BitSet FOLLOW_21_in_ruleVertical1607 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_ruleLayoutPosition_in_ruleVertical1628 = new BitSet(new long[]{0x0000000010C04000L});
        public static final BitSet FOLLOW_22_in_ruleVertical1643 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleVertical1664 = new BitSet(new long[]{0x0000000010804000L});
        public static final BitSet FOLLOW_23_in_ruleVertical1679 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleVertical1700 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_28_in_ruleVertical1715 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleVertical1736 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleVertical1750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_entryRuleContent1786 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContent1796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleContent1848 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleContent1874 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContent1886 = new BitSet(new long[]{0x0000000014F04000L});
        public static final BitSet FOLLOW_20_in_ruleContent1899 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContent1920 = new BitSet(new long[]{0x0000000014E04000L});
        public static final BitSet FOLLOW_21_in_ruleContent1935 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_ruleLayoutPosition_in_ruleContent1956 = new BitSet(new long[]{0x0000000014C04000L});
        public static final BitSet FOLLOW_22_in_ruleContent1971 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleContent1992 = new BitSet(new long[]{0x0000000014804000L});
        public static final BitSet FOLLOW_23_in_ruleContent2007 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleContent2028 = new BitSet(new long[]{0x0000000014004000L});
        public static final BitSet FOLLOW_26_in_ruleContent2043 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleContent2064 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_28_in_ruleContent2079 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleContent2100 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleContent2114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleLayoutPosition2164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleLayoutPosition2181 = new BitSet(new long[]{0x0000000000000002L});
    }


}