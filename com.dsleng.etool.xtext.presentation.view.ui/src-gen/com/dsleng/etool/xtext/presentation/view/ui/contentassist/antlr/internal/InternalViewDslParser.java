package com.dsleng.etool.xtext.presentation.view.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.dsleng.etool.xtext.presentation.view.services.ViewDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalViewDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'center'", "'west'", "'Page'", "'{'", "'layout'", "'}'", "'Layout'", "'layers'", "','", "'Layers'", "'style'", "'position'", "'minSize'", "'maxSize'", "'-'", "'Horizontal'", "'height'", "'Vertical'", "'width'", "'Content'", "'resizable'"
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
    public String getGrammarFileName() { return "../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g"; }


     
     	private ViewDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ViewDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRulePage"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:60:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:61:1: ( rulePage EOF )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:62:1: rulePage EOF
            {
             before(grammarAccess.getPageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_entryRulePage61);
            rulePage();

            state._fsp--;

             after(grammarAccess.getPageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePage68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:69:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:73:2: ( ( ( rule__Page__Group__0 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:74:1: ( ( rule__Page__Group__0 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:74:1: ( ( rule__Page__Group__0 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:75:1: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:76:1: ( rule__Page__Group__0 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:76:2: rule__Page__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__0_in_rulePage94);
            rule__Page__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleLayers"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:88:1: entryRuleLayers : ruleLayers EOF ;
    public final void entryRuleLayers() throws RecognitionException {
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:89:1: ( ruleLayers EOF )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:90:1: ruleLayers EOF
            {
             before(grammarAccess.getLayersRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayers_in_entryRuleLayers121);
            ruleLayers();

            state._fsp--;

             after(grammarAccess.getLayersRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLayers128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayers"


    // $ANTLR start "ruleLayers"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:97:1: ruleLayers : ( ( rule__Layers__Alternatives ) ) ;
    public final void ruleLayers() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:101:2: ( ( ( rule__Layers__Alternatives ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:102:1: ( ( rule__Layers__Alternatives ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:102:1: ( ( rule__Layers__Alternatives ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:103:1: ( rule__Layers__Alternatives )
            {
             before(grammarAccess.getLayersAccess().getAlternatives()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:104:1: ( rule__Layers__Alternatives )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:104:2: rule__Layers__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers__Alternatives_in_ruleLayers154);
            rule__Layers__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayersAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayers"


    // $ANTLR start "entryRuleLayout"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:116:1: entryRuleLayout : ruleLayout EOF ;
    public final void entryRuleLayout() throws RecognitionException {
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:117:1: ( ruleLayout EOF )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:118:1: ruleLayout EOF
            {
             before(grammarAccess.getLayoutRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_entryRuleLayout181);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getLayoutRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLayout188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:125:1: ruleLayout : ( ( rule__Layout__Group__0 ) ) ;
    public final void ruleLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:129:2: ( ( ( rule__Layout__Group__0 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:130:1: ( ( rule__Layout__Group__0 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:130:1: ( ( rule__Layout__Group__0 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:131:1: ( rule__Layout__Group__0 )
            {
             before(grammarAccess.getLayoutAccess().getGroup()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:132:1: ( rule__Layout__Group__0 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:132:2: rule__Layout__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__0_in_ruleLayout214);
            rule__Layout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleLayers_Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:144:1: entryRuleLayers_Impl : ruleLayers_Impl EOF ;
    public final void entryRuleLayers_Impl() throws RecognitionException {
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:145:1: ( ruleLayers_Impl EOF )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:146:1: ruleLayers_Impl EOF
            {
             before(grammarAccess.getLayers_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayers_Impl_in_entryRuleLayers_Impl241);
            ruleLayers_Impl();

            state._fsp--;

             after(grammarAccess.getLayers_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLayers_Impl248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayers_Impl"


    // $ANTLR start "ruleLayers_Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:153:1: ruleLayers_Impl : ( ( rule__Layers_Impl__Group__0 ) ) ;
    public final void ruleLayers_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:157:2: ( ( ( rule__Layers_Impl__Group__0 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:158:1: ( ( rule__Layers_Impl__Group__0 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:158:1: ( ( rule__Layers_Impl__Group__0 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:159:1: ( rule__Layers_Impl__Group__0 )
            {
             before(grammarAccess.getLayers_ImplAccess().getGroup()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:160:1: ( rule__Layers_Impl__Group__0 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:160:2: rule__Layers_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group__0_in_ruleLayers_Impl274);
            rule__Layers_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayers_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayers_Impl"


    // $ANTLR start "entryRuleEString"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:172:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:173:1: ( ruleEString EOF )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:174:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString301);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:181:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:185:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:186:1: ( ( rule__EString__Alternatives ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:186:1: ( ( rule__EString__Alternatives ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:187:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:188:1: ( rule__EString__Alternatives )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:188:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString334);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:202:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:203:1: ( ruleEInt EOF )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:204:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt363);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:211:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:215:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:216:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:216:1: ( ( rule__EInt__Group__0 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:217:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:218:1: ( rule__EInt__Group__0 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:218:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt396);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleHorizontal"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:230:1: entryRuleHorizontal : ruleHorizontal EOF ;
    public final void entryRuleHorizontal() throws RecognitionException {
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:231:1: ( ruleHorizontal EOF )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:232:1: ruleHorizontal EOF
            {
             before(grammarAccess.getHorizontalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHorizontal_in_entryRuleHorizontal423);
            ruleHorizontal();

            state._fsp--;

             after(grammarAccess.getHorizontalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHorizontal430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHorizontal"


    // $ANTLR start "ruleHorizontal"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:239:1: ruleHorizontal : ( ( rule__Horizontal__Group__0 ) ) ;
    public final void ruleHorizontal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:243:2: ( ( ( rule__Horizontal__Group__0 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:244:1: ( ( rule__Horizontal__Group__0 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:244:1: ( ( rule__Horizontal__Group__0 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:245:1: ( rule__Horizontal__Group__0 )
            {
             before(grammarAccess.getHorizontalAccess().getGroup()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:246:1: ( rule__Horizontal__Group__0 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:246:2: rule__Horizontal__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group__0_in_ruleHorizontal456);
            rule__Horizontal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHorizontalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHorizontal"


    // $ANTLR start "entryRuleVertical"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:258:1: entryRuleVertical : ruleVertical EOF ;
    public final void entryRuleVertical() throws RecognitionException {
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:259:1: ( ruleVertical EOF )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:260:1: ruleVertical EOF
            {
             before(grammarAccess.getVerticalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVertical_in_entryRuleVertical483);
            ruleVertical();

            state._fsp--;

             after(grammarAccess.getVerticalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVertical490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVertical"


    // $ANTLR start "ruleVertical"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:267:1: ruleVertical : ( ( rule__Vertical__Group__0 ) ) ;
    public final void ruleVertical() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:271:2: ( ( ( rule__Vertical__Group__0 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:272:1: ( ( rule__Vertical__Group__0 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:272:1: ( ( rule__Vertical__Group__0 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:273:1: ( rule__Vertical__Group__0 )
            {
             before(grammarAccess.getVerticalAccess().getGroup()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:274:1: ( rule__Vertical__Group__0 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:274:2: rule__Vertical__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group__0_in_ruleVertical516);
            rule__Vertical__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerticalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVertical"


    // $ANTLR start "entryRuleContent"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:286:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:287:1: ( ruleContent EOF )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:288:1: ruleContent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_entryRuleContent543);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getContentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContent550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:295:1: ruleContent : ( ( rule__Content__Group__0 ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:299:2: ( ( ( rule__Content__Group__0 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:300:1: ( ( rule__Content__Group__0 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:300:1: ( ( rule__Content__Group__0 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:301:1: ( rule__Content__Group__0 )
            {
             before(grammarAccess.getContentAccess().getGroup()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:302:1: ( rule__Content__Group__0 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:302:2: rule__Content__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__0_in_ruleContent576);
            rule__Content__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "ruleLayoutPosition"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:315:1: ruleLayoutPosition : ( ( rule__LayoutPosition__Alternatives ) ) ;
    public final void ruleLayoutPosition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:319:1: ( ( ( rule__LayoutPosition__Alternatives ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:320:1: ( ( rule__LayoutPosition__Alternatives ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:320:1: ( ( rule__LayoutPosition__Alternatives ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:321:1: ( rule__LayoutPosition__Alternatives )
            {
             before(grammarAccess.getLayoutPositionAccess().getAlternatives()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:322:1: ( rule__LayoutPosition__Alternatives )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:322:2: rule__LayoutPosition__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__LayoutPosition__Alternatives_in_ruleLayoutPosition613);
            rule__LayoutPosition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayoutPositionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayoutPosition"


    // $ANTLR start "rule__Layers__Alternatives"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:333:1: rule__Layers__Alternatives : ( ( ruleLayers_Impl ) | ( ruleHorizontal ) | ( ruleVertical ) | ( ruleContent ) );
    public final void rule__Layers__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:337:1: ( ( ruleLayers_Impl ) | ( ruleHorizontal ) | ( ruleVertical ) | ( ruleContent ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                switch ( input.LA(2) ) {
                case 20:
                    {
                    alt1=1;
                    }
                    break;
                case 26:
                    {
                    alt1=2;
                    }
                    break;
                case 28:
                    {
                    alt1=3;
                    }
                    break;
                case 30:
                    {
                    alt1=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

                }
                break;
            case 20:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            case 30:
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
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:338:1: ( ruleLayers_Impl )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:338:1: ( ruleLayers_Impl )
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:339:1: ruleLayers_Impl
                    {
                     before(grammarAccess.getLayersAccess().getLayers_ImplParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLayers_Impl_in_rule__Layers__Alternatives648);
                    ruleLayers_Impl();

                    state._fsp--;

                     after(grammarAccess.getLayersAccess().getLayers_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:344:6: ( ruleHorizontal )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:344:6: ( ruleHorizontal )
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:345:1: ruleHorizontal
                    {
                     before(grammarAccess.getLayersAccess().getHorizontalParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleHorizontal_in_rule__Layers__Alternatives665);
                    ruleHorizontal();

                    state._fsp--;

                     after(grammarAccess.getLayersAccess().getHorizontalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:350:6: ( ruleVertical )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:350:6: ( ruleVertical )
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:351:1: ruleVertical
                    {
                     before(grammarAccess.getLayersAccess().getVerticalParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVertical_in_rule__Layers__Alternatives682);
                    ruleVertical();

                    state._fsp--;

                     after(grammarAccess.getLayersAccess().getVerticalParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:356:6: ( ruleContent )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:356:6: ( ruleContent )
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:357:1: ruleContent
                    {
                     before(grammarAccess.getLayersAccess().getContentParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleContent_in_rule__Layers__Alternatives699);
                    ruleContent();

                    state._fsp--;

                     after(grammarAccess.getLayersAccess().getContentParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:367:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:371:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:372:1: ( RULE_STRING )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:372:1: ( RULE_STRING )
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:373:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives731); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:378:6: ( RULE_ID )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:378:6: ( RULE_ID )
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:379:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives748); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__LayoutPosition__Alternatives"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:390:1: rule__LayoutPosition__Alternatives : ( ( ( 'center' ) ) | ( ( 'west' ) ) );
    public final void rule__LayoutPosition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:394:1: ( ( ( 'center' ) ) | ( ( 'west' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:395:1: ( ( 'center' ) )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:395:1: ( ( 'center' ) )
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:396:1: ( 'center' )
                    {
                     before(grammarAccess.getLayoutPositionAccess().getCenterEnumLiteralDeclaration_0()); 
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:397:1: ( 'center' )
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:397:3: 'center'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__LayoutPosition__Alternatives782); 

                    }

                     after(grammarAccess.getLayoutPositionAccess().getCenterEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:402:6: ( ( 'west' ) )
                    {
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:402:6: ( ( 'west' ) )
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:403:1: ( 'west' )
                    {
                     before(grammarAccess.getLayoutPositionAccess().getWestEnumLiteralDeclaration_1()); 
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:404:1: ( 'west' )
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:404:3: 'west'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__LayoutPosition__Alternatives803); 

                    }

                     after(grammarAccess.getLayoutPositionAccess().getWestEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutPosition__Alternatives"


    // $ANTLR start "rule__Page__Group__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:416:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:420:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:421:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__0836);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__1_in_rule__Page__Group__0839);
            rule__Page__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0"


    // $ANTLR start "rule__Page__Group__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:428:1: rule__Page__Group__0__Impl : ( 'Page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:432:1: ( ( 'Page' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:433:1: ( 'Page' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:433:1: ( 'Page' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:434:1: 'Page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Page__Group__0__Impl867); 
             after(grammarAccess.getPageAccess().getPageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0__Impl"


    // $ANTLR start "rule__Page__Group__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:447:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:451:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:452:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__1898);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__2_in_rule__Page__Group__1901);
            rule__Page__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1"


    // $ANTLR start "rule__Page__Group__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:459:1: rule__Page__Group__1__Impl : ( '{' ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:463:1: ( ( '{' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:464:1: ( '{' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:464:1: ( '{' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:465:1: '{'
            {
             before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Page__Group__1__Impl929); 
             after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__2"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:478:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:482:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:483:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__2960);
            rule__Page__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__3_in_rule__Page__Group__2963);
            rule__Page__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2"


    // $ANTLR start "rule__Page__Group__2__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:490:1: rule__Page__Group__2__Impl : ( 'layout' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:494:1: ( ( 'layout' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:495:1: ( 'layout' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:495:1: ( 'layout' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:496:1: 'layout'
            {
             before(grammarAccess.getPageAccess().getLayoutKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Page__Group__2__Impl991); 
             after(grammarAccess.getPageAccess().getLayoutKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2__Impl"


    // $ANTLR start "rule__Page__Group__3"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:509:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:513:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:514:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__31022);
            rule__Page__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__4_in_rule__Page__Group__31025);
            rule__Page__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3"


    // $ANTLR start "rule__Page__Group__3__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:521:1: rule__Page__Group__3__Impl : ( ( rule__Page__LayoutAssignment_3 ) ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:525:1: ( ( ( rule__Page__LayoutAssignment_3 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:526:1: ( ( rule__Page__LayoutAssignment_3 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:526:1: ( ( rule__Page__LayoutAssignment_3 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:527:1: ( rule__Page__LayoutAssignment_3 )
            {
             before(grammarAccess.getPageAccess().getLayoutAssignment_3()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:528:1: ( rule__Page__LayoutAssignment_3 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:528:2: rule__Page__LayoutAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__LayoutAssignment_3_in_rule__Page__Group__3__Impl1052);
            rule__Page__LayoutAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getLayoutAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3__Impl"


    // $ANTLR start "rule__Page__Group__4"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:538:1: rule__Page__Group__4 : rule__Page__Group__4__Impl ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:542:1: ( rule__Page__Group__4__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:543:2: rule__Page__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__41082);
            rule__Page__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4"


    // $ANTLR start "rule__Page__Group__4__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:549:1: rule__Page__Group__4__Impl : ( '}' ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:553:1: ( ( '}' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:554:1: ( '}' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:554:1: ( '}' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:555:1: '}'
            {
             before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Page__Group__4__Impl1110); 
             after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4__Impl"


    // $ANTLR start "rule__Layout__Group__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:578:1: rule__Layout__Group__0 : rule__Layout__Group__0__Impl rule__Layout__Group__1 ;
    public final void rule__Layout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:582:1: ( rule__Layout__Group__0__Impl rule__Layout__Group__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:583:2: rule__Layout__Group__0__Impl rule__Layout__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__0__Impl_in_rule__Layout__Group__01151);
            rule__Layout__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__1_in_rule__Layout__Group__01154);
            rule__Layout__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__0"


    // $ANTLR start "rule__Layout__Group__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:590:1: rule__Layout__Group__0__Impl : ( () ) ;
    public final void rule__Layout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:594:1: ( ( () ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:595:1: ( () )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:595:1: ( () )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:596:1: ()
            {
             before(grammarAccess.getLayoutAccess().getLayoutAction_0()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:597:1: ()
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:599:1: 
            {
            }

             after(grammarAccess.getLayoutAccess().getLayoutAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__0__Impl"


    // $ANTLR start "rule__Layout__Group__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:609:1: rule__Layout__Group__1 : rule__Layout__Group__1__Impl rule__Layout__Group__2 ;
    public final void rule__Layout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:613:1: ( rule__Layout__Group__1__Impl rule__Layout__Group__2 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:614:2: rule__Layout__Group__1__Impl rule__Layout__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__1__Impl_in_rule__Layout__Group__11212);
            rule__Layout__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__2_in_rule__Layout__Group__11215);
            rule__Layout__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__1"


    // $ANTLR start "rule__Layout__Group__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:621:1: rule__Layout__Group__1__Impl : ( 'Layout' ) ;
    public final void rule__Layout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:625:1: ( ( 'Layout' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:626:1: ( 'Layout' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:626:1: ( 'Layout' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:627:1: 'Layout'
            {
             before(grammarAccess.getLayoutAccess().getLayoutKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Layout__Group__1__Impl1243); 
             after(grammarAccess.getLayoutAccess().getLayoutKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__1__Impl"


    // $ANTLR start "rule__Layout__Group__2"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:640:1: rule__Layout__Group__2 : rule__Layout__Group__2__Impl rule__Layout__Group__3 ;
    public final void rule__Layout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:644:1: ( rule__Layout__Group__2__Impl rule__Layout__Group__3 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:645:2: rule__Layout__Group__2__Impl rule__Layout__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__2__Impl_in_rule__Layout__Group__21274);
            rule__Layout__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__3_in_rule__Layout__Group__21277);
            rule__Layout__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__2"


    // $ANTLR start "rule__Layout__Group__2__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:652:1: rule__Layout__Group__2__Impl : ( '{' ) ;
    public final void rule__Layout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:656:1: ( ( '{' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:657:1: ( '{' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:657:1: ( '{' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:658:1: '{'
            {
             before(grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Layout__Group__2__Impl1305); 
             after(grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__2__Impl"


    // $ANTLR start "rule__Layout__Group__3"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:671:1: rule__Layout__Group__3 : rule__Layout__Group__3__Impl rule__Layout__Group__4 ;
    public final void rule__Layout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:675:1: ( rule__Layout__Group__3__Impl rule__Layout__Group__4 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:676:2: rule__Layout__Group__3__Impl rule__Layout__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__3__Impl_in_rule__Layout__Group__31336);
            rule__Layout__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__4_in_rule__Layout__Group__31339);
            rule__Layout__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__3"


    // $ANTLR start "rule__Layout__Group__3__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:683:1: rule__Layout__Group__3__Impl : ( ( rule__Layout__Group_3__0 )? ) ;
    public final void rule__Layout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:687:1: ( ( ( rule__Layout__Group_3__0 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:688:1: ( ( rule__Layout__Group_3__0 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:688:1: ( ( rule__Layout__Group_3__0 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:689:1: ( rule__Layout__Group_3__0 )?
            {
             before(grammarAccess.getLayoutAccess().getGroup_3()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:690:1: ( rule__Layout__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:690:2: rule__Layout__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3__0_in_rule__Layout__Group__3__Impl1366);
                    rule__Layout__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayoutAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__3__Impl"


    // $ANTLR start "rule__Layout__Group__4"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:700:1: rule__Layout__Group__4 : rule__Layout__Group__4__Impl ;
    public final void rule__Layout__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:704:1: ( rule__Layout__Group__4__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:705:2: rule__Layout__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__4__Impl_in_rule__Layout__Group__41397);
            rule__Layout__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__4"


    // $ANTLR start "rule__Layout__Group__4__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:711:1: rule__Layout__Group__4__Impl : ( '}' ) ;
    public final void rule__Layout__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:715:1: ( ( '}' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:716:1: ( '}' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:716:1: ( '}' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:717:1: '}'
            {
             before(grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Layout__Group__4__Impl1425); 
             after(grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__4__Impl"


    // $ANTLR start "rule__Layout__Group_3__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:740:1: rule__Layout__Group_3__0 : rule__Layout__Group_3__0__Impl rule__Layout__Group_3__1 ;
    public final void rule__Layout__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:744:1: ( rule__Layout__Group_3__0__Impl rule__Layout__Group_3__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:745:2: rule__Layout__Group_3__0__Impl rule__Layout__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3__0__Impl_in_rule__Layout__Group_3__01466);
            rule__Layout__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3__1_in_rule__Layout__Group_3__01469);
            rule__Layout__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_3__0"


    // $ANTLR start "rule__Layout__Group_3__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:752:1: rule__Layout__Group_3__0__Impl : ( 'layers' ) ;
    public final void rule__Layout__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:756:1: ( ( 'layers' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:757:1: ( 'layers' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:757:1: ( 'layers' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:758:1: 'layers'
            {
             before(grammarAccess.getLayoutAccess().getLayersKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Layout__Group_3__0__Impl1497); 
             after(grammarAccess.getLayoutAccess().getLayersKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_3__0__Impl"


    // $ANTLR start "rule__Layout__Group_3__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:771:1: rule__Layout__Group_3__1 : rule__Layout__Group_3__1__Impl rule__Layout__Group_3__2 ;
    public final void rule__Layout__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:775:1: ( rule__Layout__Group_3__1__Impl rule__Layout__Group_3__2 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:776:2: rule__Layout__Group_3__1__Impl rule__Layout__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3__1__Impl_in_rule__Layout__Group_3__11528);
            rule__Layout__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3__2_in_rule__Layout__Group_3__11531);
            rule__Layout__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_3__1"


    // $ANTLR start "rule__Layout__Group_3__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:783:1: rule__Layout__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Layout__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:787:1: ( ( '{' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:788:1: ( '{' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:788:1: ( '{' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:789:1: '{'
            {
             before(grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Layout__Group_3__1__Impl1559); 
             after(grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_3__1__Impl"


    // $ANTLR start "rule__Layout__Group_3__2"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:802:1: rule__Layout__Group_3__2 : rule__Layout__Group_3__2__Impl rule__Layout__Group_3__3 ;
    public final void rule__Layout__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:806:1: ( rule__Layout__Group_3__2__Impl rule__Layout__Group_3__3 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:807:2: rule__Layout__Group_3__2__Impl rule__Layout__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3__2__Impl_in_rule__Layout__Group_3__21590);
            rule__Layout__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3__3_in_rule__Layout__Group_3__21593);
            rule__Layout__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_3__2"


    // $ANTLR start "rule__Layout__Group_3__2__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:814:1: rule__Layout__Group_3__2__Impl : ( ( rule__Layout__LayersAssignment_3_2 ) ) ;
    public final void rule__Layout__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:818:1: ( ( ( rule__Layout__LayersAssignment_3_2 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:819:1: ( ( rule__Layout__LayersAssignment_3_2 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:819:1: ( ( rule__Layout__LayersAssignment_3_2 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:820:1: ( rule__Layout__LayersAssignment_3_2 )
            {
             before(grammarAccess.getLayoutAccess().getLayersAssignment_3_2()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:821:1: ( rule__Layout__LayersAssignment_3_2 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:821:2: rule__Layout__LayersAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__LayersAssignment_3_2_in_rule__Layout__Group_3__2__Impl1620);
            rule__Layout__LayersAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getLayersAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_3__2__Impl"


    // $ANTLR start "rule__Layout__Group_3__3"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:831:1: rule__Layout__Group_3__3 : rule__Layout__Group_3__3__Impl rule__Layout__Group_3__4 ;
    public final void rule__Layout__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:835:1: ( rule__Layout__Group_3__3__Impl rule__Layout__Group_3__4 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:836:2: rule__Layout__Group_3__3__Impl rule__Layout__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3__3__Impl_in_rule__Layout__Group_3__31650);
            rule__Layout__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3__4_in_rule__Layout__Group_3__31653);
            rule__Layout__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_3__3"


    // $ANTLR start "rule__Layout__Group_3__3__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:843:1: rule__Layout__Group_3__3__Impl : ( ( rule__Layout__Group_3_3__0 )* ) ;
    public final void rule__Layout__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:847:1: ( ( ( rule__Layout__Group_3_3__0 )* ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:848:1: ( ( rule__Layout__Group_3_3__0 )* )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:848:1: ( ( rule__Layout__Group_3_3__0 )* )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:849:1: ( rule__Layout__Group_3_3__0 )*
            {
             before(grammarAccess.getLayoutAccess().getGroup_3_3()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:850:1: ( rule__Layout__Group_3_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:850:2: rule__Layout__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3_3__0_in_rule__Layout__Group_3__3__Impl1680);
            	    rule__Layout__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getLayoutAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_3__3__Impl"


    // $ANTLR start "rule__Layout__Group_3__4"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:860:1: rule__Layout__Group_3__4 : rule__Layout__Group_3__4__Impl ;
    public final void rule__Layout__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:864:1: ( rule__Layout__Group_3__4__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:865:2: rule__Layout__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3__4__Impl_in_rule__Layout__Group_3__41711);
            rule__Layout__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_3__4"


    // $ANTLR start "rule__Layout__Group_3__4__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:871:1: rule__Layout__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Layout__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:875:1: ( ( '}' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:876:1: ( '}' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:876:1: ( '}' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:877:1: '}'
            {
             before(grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Layout__Group_3__4__Impl1739); 
             after(grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_3__4__Impl"


    // $ANTLR start "rule__Layout__Group_3_3__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:900:1: rule__Layout__Group_3_3__0 : rule__Layout__Group_3_3__0__Impl rule__Layout__Group_3_3__1 ;
    public final void rule__Layout__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:904:1: ( rule__Layout__Group_3_3__0__Impl rule__Layout__Group_3_3__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:905:2: rule__Layout__Group_3_3__0__Impl rule__Layout__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3_3__0__Impl_in_rule__Layout__Group_3_3__01780);
            rule__Layout__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3_3__1_in_rule__Layout__Group_3_3__01783);
            rule__Layout__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_3_3__0"


    // $ANTLR start "rule__Layout__Group_3_3__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:912:1: rule__Layout__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Layout__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:916:1: ( ( ',' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:917:1: ( ',' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:917:1: ( ',' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:918:1: ','
            {
             before(grammarAccess.getLayoutAccess().getCommaKeyword_3_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Layout__Group_3_3__0__Impl1811); 
             after(grammarAccess.getLayoutAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_3_3__0__Impl"


    // $ANTLR start "rule__Layout__Group_3_3__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:931:1: rule__Layout__Group_3_3__1 : rule__Layout__Group_3_3__1__Impl ;
    public final void rule__Layout__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:935:1: ( rule__Layout__Group_3_3__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:936:2: rule__Layout__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3_3__1__Impl_in_rule__Layout__Group_3_3__11842);
            rule__Layout__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_3_3__1"


    // $ANTLR start "rule__Layout__Group_3_3__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:942:1: rule__Layout__Group_3_3__1__Impl : ( ( rule__Layout__LayersAssignment_3_3_1 ) ) ;
    public final void rule__Layout__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:946:1: ( ( ( rule__Layout__LayersAssignment_3_3_1 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:947:1: ( ( rule__Layout__LayersAssignment_3_3_1 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:947:1: ( ( rule__Layout__LayersAssignment_3_3_1 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:948:1: ( rule__Layout__LayersAssignment_3_3_1 )
            {
             before(grammarAccess.getLayoutAccess().getLayersAssignment_3_3_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:949:1: ( rule__Layout__LayersAssignment_3_3_1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:949:2: rule__Layout__LayersAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__LayersAssignment_3_3_1_in_rule__Layout__Group_3_3__1__Impl1869);
            rule__Layout__LayersAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getLayersAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_3_3__1__Impl"


    // $ANTLR start "rule__Layers_Impl__Group__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:963:1: rule__Layers_Impl__Group__0 : rule__Layers_Impl__Group__0__Impl rule__Layers_Impl__Group__1 ;
    public final void rule__Layers_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:967:1: ( rule__Layers_Impl__Group__0__Impl rule__Layers_Impl__Group__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:968:2: rule__Layers_Impl__Group__0__Impl rule__Layers_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group__0__Impl_in_rule__Layers_Impl__Group__01903);
            rule__Layers_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group__1_in_rule__Layers_Impl__Group__01906);
            rule__Layers_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group__0"


    // $ANTLR start "rule__Layers_Impl__Group__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:975:1: rule__Layers_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Layers_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:979:1: ( ( () ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:980:1: ( () )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:980:1: ( () )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:981:1: ()
            {
             before(grammarAccess.getLayers_ImplAccess().getLayersAction_0()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:982:1: ()
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:984:1: 
            {
            }

             after(grammarAccess.getLayers_ImplAccess().getLayersAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group__0__Impl"


    // $ANTLR start "rule__Layers_Impl__Group__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:994:1: rule__Layers_Impl__Group__1 : rule__Layers_Impl__Group__1__Impl rule__Layers_Impl__Group__2 ;
    public final void rule__Layers_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:998:1: ( rule__Layers_Impl__Group__1__Impl rule__Layers_Impl__Group__2 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:999:2: rule__Layers_Impl__Group__1__Impl rule__Layers_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group__1__Impl_in_rule__Layers_Impl__Group__11964);
            rule__Layers_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group__2_in_rule__Layers_Impl__Group__11967);
            rule__Layers_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group__1"


    // $ANTLR start "rule__Layers_Impl__Group__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1006:1: rule__Layers_Impl__Group__1__Impl : ( ( rule__Layers_Impl__ResizableAssignment_1 )? ) ;
    public final void rule__Layers_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1010:1: ( ( ( rule__Layers_Impl__ResizableAssignment_1 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1011:1: ( ( rule__Layers_Impl__ResizableAssignment_1 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1011:1: ( ( rule__Layers_Impl__ResizableAssignment_1 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1012:1: ( rule__Layers_Impl__ResizableAssignment_1 )?
            {
             before(grammarAccess.getLayers_ImplAccess().getResizableAssignment_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1013:1: ( rule__Layers_Impl__ResizableAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==31) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1013:2: rule__Layers_Impl__ResizableAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__ResizableAssignment_1_in_rule__Layers_Impl__Group__1__Impl1994);
                    rule__Layers_Impl__ResizableAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayers_ImplAccess().getResizableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group__1__Impl"


    // $ANTLR start "rule__Layers_Impl__Group__2"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1023:1: rule__Layers_Impl__Group__2 : rule__Layers_Impl__Group__2__Impl rule__Layers_Impl__Group__3 ;
    public final void rule__Layers_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1027:1: ( rule__Layers_Impl__Group__2__Impl rule__Layers_Impl__Group__3 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1028:2: rule__Layers_Impl__Group__2__Impl rule__Layers_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group__2__Impl_in_rule__Layers_Impl__Group__22025);
            rule__Layers_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group__3_in_rule__Layers_Impl__Group__22028);
            rule__Layers_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group__2"


    // $ANTLR start "rule__Layers_Impl__Group__2__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1035:1: rule__Layers_Impl__Group__2__Impl : ( 'Layers' ) ;
    public final void rule__Layers_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1039:1: ( ( 'Layers' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1040:1: ( 'Layers' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1040:1: ( 'Layers' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1041:1: 'Layers'
            {
             before(grammarAccess.getLayers_ImplAccess().getLayersKeyword_2()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Layers_Impl__Group__2__Impl2056); 
             after(grammarAccess.getLayers_ImplAccess().getLayersKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group__2__Impl"


    // $ANTLR start "rule__Layers_Impl__Group__3"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1054:1: rule__Layers_Impl__Group__3 : rule__Layers_Impl__Group__3__Impl rule__Layers_Impl__Group__4 ;
    public final void rule__Layers_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1058:1: ( rule__Layers_Impl__Group__3__Impl rule__Layers_Impl__Group__4 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1059:2: rule__Layers_Impl__Group__3__Impl rule__Layers_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group__3__Impl_in_rule__Layers_Impl__Group__32087);
            rule__Layers_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group__4_in_rule__Layers_Impl__Group__32090);
            rule__Layers_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group__3"


    // $ANTLR start "rule__Layers_Impl__Group__3__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1066:1: rule__Layers_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__Layers_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1070:1: ( ( '{' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1071:1: ( '{' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1071:1: ( '{' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1072:1: '{'
            {
             before(grammarAccess.getLayers_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Layers_Impl__Group__3__Impl2118); 
             after(grammarAccess.getLayers_ImplAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group__3__Impl"


    // $ANTLR start "rule__Layers_Impl__Group__4"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1085:1: rule__Layers_Impl__Group__4 : rule__Layers_Impl__Group__4__Impl rule__Layers_Impl__Group__5 ;
    public final void rule__Layers_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1089:1: ( rule__Layers_Impl__Group__4__Impl rule__Layers_Impl__Group__5 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1090:2: rule__Layers_Impl__Group__4__Impl rule__Layers_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group__4__Impl_in_rule__Layers_Impl__Group__42149);
            rule__Layers_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group__5_in_rule__Layers_Impl__Group__42152);
            rule__Layers_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group__4"


    // $ANTLR start "rule__Layers_Impl__Group__4__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1097:1: rule__Layers_Impl__Group__4__Impl : ( ( rule__Layers_Impl__Group_4__0 )? ) ;
    public final void rule__Layers_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1101:1: ( ( ( rule__Layers_Impl__Group_4__0 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1102:1: ( ( rule__Layers_Impl__Group_4__0 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1102:1: ( ( rule__Layers_Impl__Group_4__0 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1103:1: ( rule__Layers_Impl__Group_4__0 )?
            {
             before(grammarAccess.getLayers_ImplAccess().getGroup_4()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1104:1: ( rule__Layers_Impl__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1104:2: rule__Layers_Impl__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group_4__0_in_rule__Layers_Impl__Group__4__Impl2179);
                    rule__Layers_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayers_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group__4__Impl"


    // $ANTLR start "rule__Layers_Impl__Group__5"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1114:1: rule__Layers_Impl__Group__5 : rule__Layers_Impl__Group__5__Impl rule__Layers_Impl__Group__6 ;
    public final void rule__Layers_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1118:1: ( rule__Layers_Impl__Group__5__Impl rule__Layers_Impl__Group__6 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1119:2: rule__Layers_Impl__Group__5__Impl rule__Layers_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group__5__Impl_in_rule__Layers_Impl__Group__52210);
            rule__Layers_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group__6_in_rule__Layers_Impl__Group__52213);
            rule__Layers_Impl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group__5"


    // $ANTLR start "rule__Layers_Impl__Group__5__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1126:1: rule__Layers_Impl__Group__5__Impl : ( ( rule__Layers_Impl__Group_5__0 )? ) ;
    public final void rule__Layers_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1130:1: ( ( ( rule__Layers_Impl__Group_5__0 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1131:1: ( ( rule__Layers_Impl__Group_5__0 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1131:1: ( ( rule__Layers_Impl__Group_5__0 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1132:1: ( rule__Layers_Impl__Group_5__0 )?
            {
             before(grammarAccess.getLayers_ImplAccess().getGroup_5()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1133:1: ( rule__Layers_Impl__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1133:2: rule__Layers_Impl__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group_5__0_in_rule__Layers_Impl__Group__5__Impl2240);
                    rule__Layers_Impl__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayers_ImplAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group__5__Impl"


    // $ANTLR start "rule__Layers_Impl__Group__6"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1143:1: rule__Layers_Impl__Group__6 : rule__Layers_Impl__Group__6__Impl rule__Layers_Impl__Group__7 ;
    public final void rule__Layers_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1147:1: ( rule__Layers_Impl__Group__6__Impl rule__Layers_Impl__Group__7 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1148:2: rule__Layers_Impl__Group__6__Impl rule__Layers_Impl__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group__6__Impl_in_rule__Layers_Impl__Group__62271);
            rule__Layers_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group__7_in_rule__Layers_Impl__Group__62274);
            rule__Layers_Impl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group__6"


    // $ANTLR start "rule__Layers_Impl__Group__6__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1155:1: rule__Layers_Impl__Group__6__Impl : ( ( rule__Layers_Impl__Group_6__0 )? ) ;
    public final void rule__Layers_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1159:1: ( ( ( rule__Layers_Impl__Group_6__0 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1160:1: ( ( rule__Layers_Impl__Group_6__0 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1160:1: ( ( rule__Layers_Impl__Group_6__0 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1161:1: ( rule__Layers_Impl__Group_6__0 )?
            {
             before(grammarAccess.getLayers_ImplAccess().getGroup_6()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1162:1: ( rule__Layers_Impl__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1162:2: rule__Layers_Impl__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group_6__0_in_rule__Layers_Impl__Group__6__Impl2301);
                    rule__Layers_Impl__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayers_ImplAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group__6__Impl"


    // $ANTLR start "rule__Layers_Impl__Group__7"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1172:1: rule__Layers_Impl__Group__7 : rule__Layers_Impl__Group__7__Impl rule__Layers_Impl__Group__8 ;
    public final void rule__Layers_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1176:1: ( rule__Layers_Impl__Group__7__Impl rule__Layers_Impl__Group__8 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1177:2: rule__Layers_Impl__Group__7__Impl rule__Layers_Impl__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group__7__Impl_in_rule__Layers_Impl__Group__72332);
            rule__Layers_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group__8_in_rule__Layers_Impl__Group__72335);
            rule__Layers_Impl__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group__7"


    // $ANTLR start "rule__Layers_Impl__Group__7__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1184:1: rule__Layers_Impl__Group__7__Impl : ( ( rule__Layers_Impl__Group_7__0 )? ) ;
    public final void rule__Layers_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1188:1: ( ( ( rule__Layers_Impl__Group_7__0 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1189:1: ( ( rule__Layers_Impl__Group_7__0 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1189:1: ( ( rule__Layers_Impl__Group_7__0 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1190:1: ( rule__Layers_Impl__Group_7__0 )?
            {
             before(grammarAccess.getLayers_ImplAccess().getGroup_7()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1191:1: ( rule__Layers_Impl__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1191:2: rule__Layers_Impl__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group_7__0_in_rule__Layers_Impl__Group__7__Impl2362);
                    rule__Layers_Impl__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayers_ImplAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group__7__Impl"


    // $ANTLR start "rule__Layers_Impl__Group__8"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1201:1: rule__Layers_Impl__Group__8 : rule__Layers_Impl__Group__8__Impl ;
    public final void rule__Layers_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1205:1: ( rule__Layers_Impl__Group__8__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1206:2: rule__Layers_Impl__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group__8__Impl_in_rule__Layers_Impl__Group__82393);
            rule__Layers_Impl__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group__8"


    // $ANTLR start "rule__Layers_Impl__Group__8__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1212:1: rule__Layers_Impl__Group__8__Impl : ( '}' ) ;
    public final void rule__Layers_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1216:1: ( ( '}' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1217:1: ( '}' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1217:1: ( '}' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1218:1: '}'
            {
             before(grammarAccess.getLayers_ImplAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Layers_Impl__Group__8__Impl2421); 
             after(grammarAccess.getLayers_ImplAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group__8__Impl"


    // $ANTLR start "rule__Layers_Impl__Group_4__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1249:1: rule__Layers_Impl__Group_4__0 : rule__Layers_Impl__Group_4__0__Impl rule__Layers_Impl__Group_4__1 ;
    public final void rule__Layers_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1253:1: ( rule__Layers_Impl__Group_4__0__Impl rule__Layers_Impl__Group_4__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1254:2: rule__Layers_Impl__Group_4__0__Impl rule__Layers_Impl__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group_4__0__Impl_in_rule__Layers_Impl__Group_4__02470);
            rule__Layers_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group_4__1_in_rule__Layers_Impl__Group_4__02473);
            rule__Layers_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group_4__0"


    // $ANTLR start "rule__Layers_Impl__Group_4__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1261:1: rule__Layers_Impl__Group_4__0__Impl : ( 'style' ) ;
    public final void rule__Layers_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1265:1: ( ( 'style' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1266:1: ( 'style' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1266:1: ( 'style' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1267:1: 'style'
            {
             before(grammarAccess.getLayers_ImplAccess().getStyleKeyword_4_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Layers_Impl__Group_4__0__Impl2501); 
             after(grammarAccess.getLayers_ImplAccess().getStyleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__Layers_Impl__Group_4__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1280:1: rule__Layers_Impl__Group_4__1 : rule__Layers_Impl__Group_4__1__Impl ;
    public final void rule__Layers_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1284:1: ( rule__Layers_Impl__Group_4__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1285:2: rule__Layers_Impl__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group_4__1__Impl_in_rule__Layers_Impl__Group_4__12532);
            rule__Layers_Impl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group_4__1"


    // $ANTLR start "rule__Layers_Impl__Group_4__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1291:1: rule__Layers_Impl__Group_4__1__Impl : ( ( rule__Layers_Impl__StyleAssignment_4_1 ) ) ;
    public final void rule__Layers_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1295:1: ( ( ( rule__Layers_Impl__StyleAssignment_4_1 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1296:1: ( ( rule__Layers_Impl__StyleAssignment_4_1 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1296:1: ( ( rule__Layers_Impl__StyleAssignment_4_1 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1297:1: ( rule__Layers_Impl__StyleAssignment_4_1 )
            {
             before(grammarAccess.getLayers_ImplAccess().getStyleAssignment_4_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1298:1: ( rule__Layers_Impl__StyleAssignment_4_1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1298:2: rule__Layers_Impl__StyleAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__StyleAssignment_4_1_in_rule__Layers_Impl__Group_4__1__Impl2559);
            rule__Layers_Impl__StyleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLayers_ImplAccess().getStyleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__Layers_Impl__Group_5__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1312:1: rule__Layers_Impl__Group_5__0 : rule__Layers_Impl__Group_5__0__Impl rule__Layers_Impl__Group_5__1 ;
    public final void rule__Layers_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1316:1: ( rule__Layers_Impl__Group_5__0__Impl rule__Layers_Impl__Group_5__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1317:2: rule__Layers_Impl__Group_5__0__Impl rule__Layers_Impl__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group_5__0__Impl_in_rule__Layers_Impl__Group_5__02593);
            rule__Layers_Impl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group_5__1_in_rule__Layers_Impl__Group_5__02596);
            rule__Layers_Impl__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group_5__0"


    // $ANTLR start "rule__Layers_Impl__Group_5__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1324:1: rule__Layers_Impl__Group_5__0__Impl : ( 'position' ) ;
    public final void rule__Layers_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1328:1: ( ( 'position' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1329:1: ( 'position' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1329:1: ( 'position' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1330:1: 'position'
            {
             before(grammarAccess.getLayers_ImplAccess().getPositionKeyword_5_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Layers_Impl__Group_5__0__Impl2624); 
             after(grammarAccess.getLayers_ImplAccess().getPositionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group_5__0__Impl"


    // $ANTLR start "rule__Layers_Impl__Group_5__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1343:1: rule__Layers_Impl__Group_5__1 : rule__Layers_Impl__Group_5__1__Impl ;
    public final void rule__Layers_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1347:1: ( rule__Layers_Impl__Group_5__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1348:2: rule__Layers_Impl__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group_5__1__Impl_in_rule__Layers_Impl__Group_5__12655);
            rule__Layers_Impl__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group_5__1"


    // $ANTLR start "rule__Layers_Impl__Group_5__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1354:1: rule__Layers_Impl__Group_5__1__Impl : ( ( rule__Layers_Impl__PositionAssignment_5_1 ) ) ;
    public final void rule__Layers_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1358:1: ( ( ( rule__Layers_Impl__PositionAssignment_5_1 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1359:1: ( ( rule__Layers_Impl__PositionAssignment_5_1 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1359:1: ( ( rule__Layers_Impl__PositionAssignment_5_1 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1360:1: ( rule__Layers_Impl__PositionAssignment_5_1 )
            {
             before(grammarAccess.getLayers_ImplAccess().getPositionAssignment_5_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1361:1: ( rule__Layers_Impl__PositionAssignment_5_1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1361:2: rule__Layers_Impl__PositionAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__PositionAssignment_5_1_in_rule__Layers_Impl__Group_5__1__Impl2682);
            rule__Layers_Impl__PositionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLayers_ImplAccess().getPositionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group_5__1__Impl"


    // $ANTLR start "rule__Layers_Impl__Group_6__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1375:1: rule__Layers_Impl__Group_6__0 : rule__Layers_Impl__Group_6__0__Impl rule__Layers_Impl__Group_6__1 ;
    public final void rule__Layers_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1379:1: ( rule__Layers_Impl__Group_6__0__Impl rule__Layers_Impl__Group_6__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1380:2: rule__Layers_Impl__Group_6__0__Impl rule__Layers_Impl__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group_6__0__Impl_in_rule__Layers_Impl__Group_6__02716);
            rule__Layers_Impl__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group_6__1_in_rule__Layers_Impl__Group_6__02719);
            rule__Layers_Impl__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group_6__0"


    // $ANTLR start "rule__Layers_Impl__Group_6__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1387:1: rule__Layers_Impl__Group_6__0__Impl : ( 'minSize' ) ;
    public final void rule__Layers_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1391:1: ( ( 'minSize' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1392:1: ( 'minSize' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1392:1: ( 'minSize' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1393:1: 'minSize'
            {
             before(grammarAccess.getLayers_ImplAccess().getMinSizeKeyword_6_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Layers_Impl__Group_6__0__Impl2747); 
             after(grammarAccess.getLayers_ImplAccess().getMinSizeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group_6__0__Impl"


    // $ANTLR start "rule__Layers_Impl__Group_6__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1406:1: rule__Layers_Impl__Group_6__1 : rule__Layers_Impl__Group_6__1__Impl ;
    public final void rule__Layers_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1410:1: ( rule__Layers_Impl__Group_6__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1411:2: rule__Layers_Impl__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group_6__1__Impl_in_rule__Layers_Impl__Group_6__12778);
            rule__Layers_Impl__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group_6__1"


    // $ANTLR start "rule__Layers_Impl__Group_6__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1417:1: rule__Layers_Impl__Group_6__1__Impl : ( ( rule__Layers_Impl__MinSizeAssignment_6_1 ) ) ;
    public final void rule__Layers_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1421:1: ( ( ( rule__Layers_Impl__MinSizeAssignment_6_1 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1422:1: ( ( rule__Layers_Impl__MinSizeAssignment_6_1 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1422:1: ( ( rule__Layers_Impl__MinSizeAssignment_6_1 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1423:1: ( rule__Layers_Impl__MinSizeAssignment_6_1 )
            {
             before(grammarAccess.getLayers_ImplAccess().getMinSizeAssignment_6_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1424:1: ( rule__Layers_Impl__MinSizeAssignment_6_1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1424:2: rule__Layers_Impl__MinSizeAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__MinSizeAssignment_6_1_in_rule__Layers_Impl__Group_6__1__Impl2805);
            rule__Layers_Impl__MinSizeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLayers_ImplAccess().getMinSizeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group_6__1__Impl"


    // $ANTLR start "rule__Layers_Impl__Group_7__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1438:1: rule__Layers_Impl__Group_7__0 : rule__Layers_Impl__Group_7__0__Impl rule__Layers_Impl__Group_7__1 ;
    public final void rule__Layers_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1442:1: ( rule__Layers_Impl__Group_7__0__Impl rule__Layers_Impl__Group_7__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1443:2: rule__Layers_Impl__Group_7__0__Impl rule__Layers_Impl__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group_7__0__Impl_in_rule__Layers_Impl__Group_7__02839);
            rule__Layers_Impl__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group_7__1_in_rule__Layers_Impl__Group_7__02842);
            rule__Layers_Impl__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group_7__0"


    // $ANTLR start "rule__Layers_Impl__Group_7__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1450:1: rule__Layers_Impl__Group_7__0__Impl : ( 'maxSize' ) ;
    public final void rule__Layers_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1454:1: ( ( 'maxSize' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1455:1: ( 'maxSize' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1455:1: ( 'maxSize' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1456:1: 'maxSize'
            {
             before(grammarAccess.getLayers_ImplAccess().getMaxSizeKeyword_7_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Layers_Impl__Group_7__0__Impl2870); 
             after(grammarAccess.getLayers_ImplAccess().getMaxSizeKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group_7__0__Impl"


    // $ANTLR start "rule__Layers_Impl__Group_7__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1469:1: rule__Layers_Impl__Group_7__1 : rule__Layers_Impl__Group_7__1__Impl ;
    public final void rule__Layers_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1473:1: ( rule__Layers_Impl__Group_7__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1474:2: rule__Layers_Impl__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__Group_7__1__Impl_in_rule__Layers_Impl__Group_7__12901);
            rule__Layers_Impl__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group_7__1"


    // $ANTLR start "rule__Layers_Impl__Group_7__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1480:1: rule__Layers_Impl__Group_7__1__Impl : ( ( rule__Layers_Impl__MaxSizeAssignment_7_1 ) ) ;
    public final void rule__Layers_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1484:1: ( ( ( rule__Layers_Impl__MaxSizeAssignment_7_1 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1485:1: ( ( rule__Layers_Impl__MaxSizeAssignment_7_1 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1485:1: ( ( rule__Layers_Impl__MaxSizeAssignment_7_1 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1486:1: ( rule__Layers_Impl__MaxSizeAssignment_7_1 )
            {
             before(grammarAccess.getLayers_ImplAccess().getMaxSizeAssignment_7_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1487:1: ( rule__Layers_Impl__MaxSizeAssignment_7_1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1487:2: rule__Layers_Impl__MaxSizeAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layers_Impl__MaxSizeAssignment_7_1_in_rule__Layers_Impl__Group_7__1__Impl2928);
            rule__Layers_Impl__MaxSizeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getLayers_ImplAccess().getMaxSizeAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__Group_7__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1501:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1505:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1506:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__02962);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__02965);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1513:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1517:1: ( ( ( '-' )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1518:1: ( ( '-' )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1518:1: ( ( '-' )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1519:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1520:1: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1521:2: '-'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__EInt__Group__0__Impl2994); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1532:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1536:1: ( rule__EInt__Group__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1537:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13027);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1543:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1547:1: ( ( RULE_INT ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1548:1: ( RULE_INT )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1548:1: ( RULE_INT )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1549:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3054); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Horizontal__Group__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1564:1: rule__Horizontal__Group__0 : rule__Horizontal__Group__0__Impl rule__Horizontal__Group__1 ;
    public final void rule__Horizontal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1568:1: ( rule__Horizontal__Group__0__Impl rule__Horizontal__Group__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1569:2: rule__Horizontal__Group__0__Impl rule__Horizontal__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group__0__Impl_in_rule__Horizontal__Group__03087);
            rule__Horizontal__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group__1_in_rule__Horizontal__Group__03090);
            rule__Horizontal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__0"


    // $ANTLR start "rule__Horizontal__Group__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1576:1: rule__Horizontal__Group__0__Impl : ( () ) ;
    public final void rule__Horizontal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1580:1: ( ( () ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1581:1: ( () )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1581:1: ( () )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1582:1: ()
            {
             before(grammarAccess.getHorizontalAccess().getHorizontalAction_0()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1583:1: ()
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1585:1: 
            {
            }

             after(grammarAccess.getHorizontalAccess().getHorizontalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__0__Impl"


    // $ANTLR start "rule__Horizontal__Group__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1595:1: rule__Horizontal__Group__1 : rule__Horizontal__Group__1__Impl rule__Horizontal__Group__2 ;
    public final void rule__Horizontal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1599:1: ( rule__Horizontal__Group__1__Impl rule__Horizontal__Group__2 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1600:2: rule__Horizontal__Group__1__Impl rule__Horizontal__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group__1__Impl_in_rule__Horizontal__Group__13148);
            rule__Horizontal__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group__2_in_rule__Horizontal__Group__13151);
            rule__Horizontal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__1"


    // $ANTLR start "rule__Horizontal__Group__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1607:1: rule__Horizontal__Group__1__Impl : ( ( rule__Horizontal__ResizableAssignment_1 )? ) ;
    public final void rule__Horizontal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1611:1: ( ( ( rule__Horizontal__ResizableAssignment_1 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1612:1: ( ( rule__Horizontal__ResizableAssignment_1 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1612:1: ( ( rule__Horizontal__ResizableAssignment_1 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1613:1: ( rule__Horizontal__ResizableAssignment_1 )?
            {
             before(grammarAccess.getHorizontalAccess().getResizableAssignment_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1614:1: ( rule__Horizontal__ResizableAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1614:2: rule__Horizontal__ResizableAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Horizontal__ResizableAssignment_1_in_rule__Horizontal__Group__1__Impl3178);
                    rule__Horizontal__ResizableAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHorizontalAccess().getResizableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__1__Impl"


    // $ANTLR start "rule__Horizontal__Group__2"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1624:1: rule__Horizontal__Group__2 : rule__Horizontal__Group__2__Impl rule__Horizontal__Group__3 ;
    public final void rule__Horizontal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1628:1: ( rule__Horizontal__Group__2__Impl rule__Horizontal__Group__3 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1629:2: rule__Horizontal__Group__2__Impl rule__Horizontal__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group__2__Impl_in_rule__Horizontal__Group__23209);
            rule__Horizontal__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group__3_in_rule__Horizontal__Group__23212);
            rule__Horizontal__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__2"


    // $ANTLR start "rule__Horizontal__Group__2__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1636:1: rule__Horizontal__Group__2__Impl : ( 'Horizontal' ) ;
    public final void rule__Horizontal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1640:1: ( ( 'Horizontal' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1641:1: ( 'Horizontal' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1641:1: ( 'Horizontal' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1642:1: 'Horizontal'
            {
             before(grammarAccess.getHorizontalAccess().getHorizontalKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Horizontal__Group__2__Impl3240); 
             after(grammarAccess.getHorizontalAccess().getHorizontalKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__2__Impl"


    // $ANTLR start "rule__Horizontal__Group__3"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1655:1: rule__Horizontal__Group__3 : rule__Horizontal__Group__3__Impl rule__Horizontal__Group__4 ;
    public final void rule__Horizontal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1659:1: ( rule__Horizontal__Group__3__Impl rule__Horizontal__Group__4 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1660:2: rule__Horizontal__Group__3__Impl rule__Horizontal__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group__3__Impl_in_rule__Horizontal__Group__33271);
            rule__Horizontal__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group__4_in_rule__Horizontal__Group__33274);
            rule__Horizontal__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__3"


    // $ANTLR start "rule__Horizontal__Group__3__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1667:1: rule__Horizontal__Group__3__Impl : ( '{' ) ;
    public final void rule__Horizontal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1671:1: ( ( '{' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1672:1: ( '{' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1672:1: ( '{' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1673:1: '{'
            {
             before(grammarAccess.getHorizontalAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Horizontal__Group__3__Impl3302); 
             after(grammarAccess.getHorizontalAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__3__Impl"


    // $ANTLR start "rule__Horizontal__Group__4"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1686:1: rule__Horizontal__Group__4 : rule__Horizontal__Group__4__Impl rule__Horizontal__Group__5 ;
    public final void rule__Horizontal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1690:1: ( rule__Horizontal__Group__4__Impl rule__Horizontal__Group__5 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1691:2: rule__Horizontal__Group__4__Impl rule__Horizontal__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group__4__Impl_in_rule__Horizontal__Group__43333);
            rule__Horizontal__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group__5_in_rule__Horizontal__Group__43336);
            rule__Horizontal__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__4"


    // $ANTLR start "rule__Horizontal__Group__4__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1698:1: rule__Horizontal__Group__4__Impl : ( ( rule__Horizontal__Group_4__0 )? ) ;
    public final void rule__Horizontal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1702:1: ( ( ( rule__Horizontal__Group_4__0 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1703:1: ( ( rule__Horizontal__Group_4__0 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1703:1: ( ( rule__Horizontal__Group_4__0 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1704:1: ( rule__Horizontal__Group_4__0 )?
            {
             before(grammarAccess.getHorizontalAccess().getGroup_4()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1705:1: ( rule__Horizontal__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1705:2: rule__Horizontal__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group_4__0_in_rule__Horizontal__Group__4__Impl3363);
                    rule__Horizontal__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHorizontalAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__4__Impl"


    // $ANTLR start "rule__Horizontal__Group__5"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1715:1: rule__Horizontal__Group__5 : rule__Horizontal__Group__5__Impl rule__Horizontal__Group__6 ;
    public final void rule__Horizontal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1719:1: ( rule__Horizontal__Group__5__Impl rule__Horizontal__Group__6 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1720:2: rule__Horizontal__Group__5__Impl rule__Horizontal__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group__5__Impl_in_rule__Horizontal__Group__53394);
            rule__Horizontal__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group__6_in_rule__Horizontal__Group__53397);
            rule__Horizontal__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__5"


    // $ANTLR start "rule__Horizontal__Group__5__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1727:1: rule__Horizontal__Group__5__Impl : ( ( rule__Horizontal__Group_5__0 )? ) ;
    public final void rule__Horizontal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1731:1: ( ( ( rule__Horizontal__Group_5__0 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1732:1: ( ( rule__Horizontal__Group_5__0 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1732:1: ( ( rule__Horizontal__Group_5__0 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1733:1: ( rule__Horizontal__Group_5__0 )?
            {
             before(grammarAccess.getHorizontalAccess().getGroup_5()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1734:1: ( rule__Horizontal__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1734:2: rule__Horizontal__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group_5__0_in_rule__Horizontal__Group__5__Impl3424);
                    rule__Horizontal__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHorizontalAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__5__Impl"


    // $ANTLR start "rule__Horizontal__Group__6"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1744:1: rule__Horizontal__Group__6 : rule__Horizontal__Group__6__Impl rule__Horizontal__Group__7 ;
    public final void rule__Horizontal__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1748:1: ( rule__Horizontal__Group__6__Impl rule__Horizontal__Group__7 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1749:2: rule__Horizontal__Group__6__Impl rule__Horizontal__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group__6__Impl_in_rule__Horizontal__Group__63455);
            rule__Horizontal__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group__7_in_rule__Horizontal__Group__63458);
            rule__Horizontal__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__6"


    // $ANTLR start "rule__Horizontal__Group__6__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1756:1: rule__Horizontal__Group__6__Impl : ( ( rule__Horizontal__Group_6__0 )? ) ;
    public final void rule__Horizontal__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1760:1: ( ( ( rule__Horizontal__Group_6__0 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1761:1: ( ( rule__Horizontal__Group_6__0 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1761:1: ( ( rule__Horizontal__Group_6__0 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1762:1: ( rule__Horizontal__Group_6__0 )?
            {
             before(grammarAccess.getHorizontalAccess().getGroup_6()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1763:1: ( rule__Horizontal__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1763:2: rule__Horizontal__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group_6__0_in_rule__Horizontal__Group__6__Impl3485);
                    rule__Horizontal__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHorizontalAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__6__Impl"


    // $ANTLR start "rule__Horizontal__Group__7"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1773:1: rule__Horizontal__Group__7 : rule__Horizontal__Group__7__Impl rule__Horizontal__Group__8 ;
    public final void rule__Horizontal__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1777:1: ( rule__Horizontal__Group__7__Impl rule__Horizontal__Group__8 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1778:2: rule__Horizontal__Group__7__Impl rule__Horizontal__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group__7__Impl_in_rule__Horizontal__Group__73516);
            rule__Horizontal__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group__8_in_rule__Horizontal__Group__73519);
            rule__Horizontal__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__7"


    // $ANTLR start "rule__Horizontal__Group__7__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1785:1: rule__Horizontal__Group__7__Impl : ( ( rule__Horizontal__Group_7__0 )? ) ;
    public final void rule__Horizontal__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1789:1: ( ( ( rule__Horizontal__Group_7__0 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1790:1: ( ( rule__Horizontal__Group_7__0 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1790:1: ( ( rule__Horizontal__Group_7__0 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1791:1: ( rule__Horizontal__Group_7__0 )?
            {
             before(grammarAccess.getHorizontalAccess().getGroup_7()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1792:1: ( rule__Horizontal__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1792:2: rule__Horizontal__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group_7__0_in_rule__Horizontal__Group__7__Impl3546);
                    rule__Horizontal__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHorizontalAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__7__Impl"


    // $ANTLR start "rule__Horizontal__Group__8"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1802:1: rule__Horizontal__Group__8 : rule__Horizontal__Group__8__Impl rule__Horizontal__Group__9 ;
    public final void rule__Horizontal__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1806:1: ( rule__Horizontal__Group__8__Impl rule__Horizontal__Group__9 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1807:2: rule__Horizontal__Group__8__Impl rule__Horizontal__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group__8__Impl_in_rule__Horizontal__Group__83577);
            rule__Horizontal__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group__9_in_rule__Horizontal__Group__83580);
            rule__Horizontal__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__8"


    // $ANTLR start "rule__Horizontal__Group__8__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1814:1: rule__Horizontal__Group__8__Impl : ( ( rule__Horizontal__Group_8__0 )? ) ;
    public final void rule__Horizontal__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1818:1: ( ( ( rule__Horizontal__Group_8__0 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1819:1: ( ( rule__Horizontal__Group_8__0 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1819:1: ( ( rule__Horizontal__Group_8__0 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1820:1: ( rule__Horizontal__Group_8__0 )?
            {
             before(grammarAccess.getHorizontalAccess().getGroup_8()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1821:1: ( rule__Horizontal__Group_8__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1821:2: rule__Horizontal__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group_8__0_in_rule__Horizontal__Group__8__Impl3607);
                    rule__Horizontal__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHorizontalAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__8__Impl"


    // $ANTLR start "rule__Horizontal__Group__9"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1831:1: rule__Horizontal__Group__9 : rule__Horizontal__Group__9__Impl ;
    public final void rule__Horizontal__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1835:1: ( rule__Horizontal__Group__9__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1836:2: rule__Horizontal__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group__9__Impl_in_rule__Horizontal__Group__93638);
            rule__Horizontal__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__9"


    // $ANTLR start "rule__Horizontal__Group__9__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1842:1: rule__Horizontal__Group__9__Impl : ( '}' ) ;
    public final void rule__Horizontal__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1846:1: ( ( '}' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1847:1: ( '}' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1847:1: ( '}' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1848:1: '}'
            {
             before(grammarAccess.getHorizontalAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Horizontal__Group__9__Impl3666); 
             after(grammarAccess.getHorizontalAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__9__Impl"


    // $ANTLR start "rule__Horizontal__Group_4__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1881:1: rule__Horizontal__Group_4__0 : rule__Horizontal__Group_4__0__Impl rule__Horizontal__Group_4__1 ;
    public final void rule__Horizontal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1885:1: ( rule__Horizontal__Group_4__0__Impl rule__Horizontal__Group_4__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1886:2: rule__Horizontal__Group_4__0__Impl rule__Horizontal__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group_4__0__Impl_in_rule__Horizontal__Group_4__03717);
            rule__Horizontal__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group_4__1_in_rule__Horizontal__Group_4__03720);
            rule__Horizontal__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group_4__0"


    // $ANTLR start "rule__Horizontal__Group_4__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1893:1: rule__Horizontal__Group_4__0__Impl : ( 'style' ) ;
    public final void rule__Horizontal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1897:1: ( ( 'style' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1898:1: ( 'style' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1898:1: ( 'style' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1899:1: 'style'
            {
             before(grammarAccess.getHorizontalAccess().getStyleKeyword_4_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Horizontal__Group_4__0__Impl3748); 
             after(grammarAccess.getHorizontalAccess().getStyleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group_4__0__Impl"


    // $ANTLR start "rule__Horizontal__Group_4__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1912:1: rule__Horizontal__Group_4__1 : rule__Horizontal__Group_4__1__Impl ;
    public final void rule__Horizontal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1916:1: ( rule__Horizontal__Group_4__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1917:2: rule__Horizontal__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group_4__1__Impl_in_rule__Horizontal__Group_4__13779);
            rule__Horizontal__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group_4__1"


    // $ANTLR start "rule__Horizontal__Group_4__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1923:1: rule__Horizontal__Group_4__1__Impl : ( ( rule__Horizontal__StyleAssignment_4_1 ) ) ;
    public final void rule__Horizontal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1927:1: ( ( ( rule__Horizontal__StyleAssignment_4_1 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1928:1: ( ( rule__Horizontal__StyleAssignment_4_1 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1928:1: ( ( rule__Horizontal__StyleAssignment_4_1 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1929:1: ( rule__Horizontal__StyleAssignment_4_1 )
            {
             before(grammarAccess.getHorizontalAccess().getStyleAssignment_4_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1930:1: ( rule__Horizontal__StyleAssignment_4_1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1930:2: rule__Horizontal__StyleAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__StyleAssignment_4_1_in_rule__Horizontal__Group_4__1__Impl3806);
            rule__Horizontal__StyleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getHorizontalAccess().getStyleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group_4__1__Impl"


    // $ANTLR start "rule__Horizontal__Group_5__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1944:1: rule__Horizontal__Group_5__0 : rule__Horizontal__Group_5__0__Impl rule__Horizontal__Group_5__1 ;
    public final void rule__Horizontal__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1948:1: ( rule__Horizontal__Group_5__0__Impl rule__Horizontal__Group_5__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1949:2: rule__Horizontal__Group_5__0__Impl rule__Horizontal__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group_5__0__Impl_in_rule__Horizontal__Group_5__03840);
            rule__Horizontal__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group_5__1_in_rule__Horizontal__Group_5__03843);
            rule__Horizontal__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group_5__0"


    // $ANTLR start "rule__Horizontal__Group_5__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1956:1: rule__Horizontal__Group_5__0__Impl : ( 'position' ) ;
    public final void rule__Horizontal__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1960:1: ( ( 'position' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1961:1: ( 'position' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1961:1: ( 'position' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1962:1: 'position'
            {
             before(grammarAccess.getHorizontalAccess().getPositionKeyword_5_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Horizontal__Group_5__0__Impl3871); 
             after(grammarAccess.getHorizontalAccess().getPositionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group_5__0__Impl"


    // $ANTLR start "rule__Horizontal__Group_5__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1975:1: rule__Horizontal__Group_5__1 : rule__Horizontal__Group_5__1__Impl ;
    public final void rule__Horizontal__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1979:1: ( rule__Horizontal__Group_5__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1980:2: rule__Horizontal__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group_5__1__Impl_in_rule__Horizontal__Group_5__13902);
            rule__Horizontal__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group_5__1"


    // $ANTLR start "rule__Horizontal__Group_5__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1986:1: rule__Horizontal__Group_5__1__Impl : ( ( rule__Horizontal__PositionAssignment_5_1 ) ) ;
    public final void rule__Horizontal__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1990:1: ( ( ( rule__Horizontal__PositionAssignment_5_1 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1991:1: ( ( rule__Horizontal__PositionAssignment_5_1 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1991:1: ( ( rule__Horizontal__PositionAssignment_5_1 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1992:1: ( rule__Horizontal__PositionAssignment_5_1 )
            {
             before(grammarAccess.getHorizontalAccess().getPositionAssignment_5_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1993:1: ( rule__Horizontal__PositionAssignment_5_1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:1993:2: rule__Horizontal__PositionAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__PositionAssignment_5_1_in_rule__Horizontal__Group_5__1__Impl3929);
            rule__Horizontal__PositionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getHorizontalAccess().getPositionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group_5__1__Impl"


    // $ANTLR start "rule__Horizontal__Group_6__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2007:1: rule__Horizontal__Group_6__0 : rule__Horizontal__Group_6__0__Impl rule__Horizontal__Group_6__1 ;
    public final void rule__Horizontal__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2011:1: ( rule__Horizontal__Group_6__0__Impl rule__Horizontal__Group_6__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2012:2: rule__Horizontal__Group_6__0__Impl rule__Horizontal__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group_6__0__Impl_in_rule__Horizontal__Group_6__03963);
            rule__Horizontal__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group_6__1_in_rule__Horizontal__Group_6__03966);
            rule__Horizontal__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group_6__0"


    // $ANTLR start "rule__Horizontal__Group_6__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2019:1: rule__Horizontal__Group_6__0__Impl : ( 'minSize' ) ;
    public final void rule__Horizontal__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2023:1: ( ( 'minSize' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2024:1: ( 'minSize' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2024:1: ( 'minSize' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2025:1: 'minSize'
            {
             before(grammarAccess.getHorizontalAccess().getMinSizeKeyword_6_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Horizontal__Group_6__0__Impl3994); 
             after(grammarAccess.getHorizontalAccess().getMinSizeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group_6__0__Impl"


    // $ANTLR start "rule__Horizontal__Group_6__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2038:1: rule__Horizontal__Group_6__1 : rule__Horizontal__Group_6__1__Impl ;
    public final void rule__Horizontal__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2042:1: ( rule__Horizontal__Group_6__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2043:2: rule__Horizontal__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group_6__1__Impl_in_rule__Horizontal__Group_6__14025);
            rule__Horizontal__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group_6__1"


    // $ANTLR start "rule__Horizontal__Group_6__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2049:1: rule__Horizontal__Group_6__1__Impl : ( ( rule__Horizontal__MinSizeAssignment_6_1 ) ) ;
    public final void rule__Horizontal__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2053:1: ( ( ( rule__Horizontal__MinSizeAssignment_6_1 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2054:1: ( ( rule__Horizontal__MinSizeAssignment_6_1 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2054:1: ( ( rule__Horizontal__MinSizeAssignment_6_1 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2055:1: ( rule__Horizontal__MinSizeAssignment_6_1 )
            {
             before(grammarAccess.getHorizontalAccess().getMinSizeAssignment_6_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2056:1: ( rule__Horizontal__MinSizeAssignment_6_1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2056:2: rule__Horizontal__MinSizeAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__MinSizeAssignment_6_1_in_rule__Horizontal__Group_6__1__Impl4052);
            rule__Horizontal__MinSizeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getHorizontalAccess().getMinSizeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group_6__1__Impl"


    // $ANTLR start "rule__Horizontal__Group_7__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2070:1: rule__Horizontal__Group_7__0 : rule__Horizontal__Group_7__0__Impl rule__Horizontal__Group_7__1 ;
    public final void rule__Horizontal__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2074:1: ( rule__Horizontal__Group_7__0__Impl rule__Horizontal__Group_7__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2075:2: rule__Horizontal__Group_7__0__Impl rule__Horizontal__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group_7__0__Impl_in_rule__Horizontal__Group_7__04086);
            rule__Horizontal__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group_7__1_in_rule__Horizontal__Group_7__04089);
            rule__Horizontal__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group_7__0"


    // $ANTLR start "rule__Horizontal__Group_7__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2082:1: rule__Horizontal__Group_7__0__Impl : ( 'maxSize' ) ;
    public final void rule__Horizontal__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2086:1: ( ( 'maxSize' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2087:1: ( 'maxSize' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2087:1: ( 'maxSize' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2088:1: 'maxSize'
            {
             before(grammarAccess.getHorizontalAccess().getMaxSizeKeyword_7_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Horizontal__Group_7__0__Impl4117); 
             after(grammarAccess.getHorizontalAccess().getMaxSizeKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group_7__0__Impl"


    // $ANTLR start "rule__Horizontal__Group_7__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2101:1: rule__Horizontal__Group_7__1 : rule__Horizontal__Group_7__1__Impl ;
    public final void rule__Horizontal__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2105:1: ( rule__Horizontal__Group_7__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2106:2: rule__Horizontal__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group_7__1__Impl_in_rule__Horizontal__Group_7__14148);
            rule__Horizontal__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group_7__1"


    // $ANTLR start "rule__Horizontal__Group_7__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2112:1: rule__Horizontal__Group_7__1__Impl : ( ( rule__Horizontal__MaxSizeAssignment_7_1 ) ) ;
    public final void rule__Horizontal__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2116:1: ( ( ( rule__Horizontal__MaxSizeAssignment_7_1 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2117:1: ( ( rule__Horizontal__MaxSizeAssignment_7_1 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2117:1: ( ( rule__Horizontal__MaxSizeAssignment_7_1 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2118:1: ( rule__Horizontal__MaxSizeAssignment_7_1 )
            {
             before(grammarAccess.getHorizontalAccess().getMaxSizeAssignment_7_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2119:1: ( rule__Horizontal__MaxSizeAssignment_7_1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2119:2: rule__Horizontal__MaxSizeAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__MaxSizeAssignment_7_1_in_rule__Horizontal__Group_7__1__Impl4175);
            rule__Horizontal__MaxSizeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getHorizontalAccess().getMaxSizeAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group_7__1__Impl"


    // $ANTLR start "rule__Horizontal__Group_8__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2133:1: rule__Horizontal__Group_8__0 : rule__Horizontal__Group_8__0__Impl rule__Horizontal__Group_8__1 ;
    public final void rule__Horizontal__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2137:1: ( rule__Horizontal__Group_8__0__Impl rule__Horizontal__Group_8__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2138:2: rule__Horizontal__Group_8__0__Impl rule__Horizontal__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group_8__0__Impl_in_rule__Horizontal__Group_8__04209);
            rule__Horizontal__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group_8__1_in_rule__Horizontal__Group_8__04212);
            rule__Horizontal__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group_8__0"


    // $ANTLR start "rule__Horizontal__Group_8__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2145:1: rule__Horizontal__Group_8__0__Impl : ( 'height' ) ;
    public final void rule__Horizontal__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2149:1: ( ( 'height' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2150:1: ( 'height' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2150:1: ( 'height' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2151:1: 'height'
            {
             before(grammarAccess.getHorizontalAccess().getHeightKeyword_8_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Horizontal__Group_8__0__Impl4240); 
             after(grammarAccess.getHorizontalAccess().getHeightKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group_8__0__Impl"


    // $ANTLR start "rule__Horizontal__Group_8__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2164:1: rule__Horizontal__Group_8__1 : rule__Horizontal__Group_8__1__Impl ;
    public final void rule__Horizontal__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2168:1: ( rule__Horizontal__Group_8__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2169:2: rule__Horizontal__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__Group_8__1__Impl_in_rule__Horizontal__Group_8__14271);
            rule__Horizontal__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group_8__1"


    // $ANTLR start "rule__Horizontal__Group_8__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2175:1: rule__Horizontal__Group_8__1__Impl : ( ( rule__Horizontal__HeightAssignment_8_1 ) ) ;
    public final void rule__Horizontal__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2179:1: ( ( ( rule__Horizontal__HeightAssignment_8_1 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2180:1: ( ( rule__Horizontal__HeightAssignment_8_1 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2180:1: ( ( rule__Horizontal__HeightAssignment_8_1 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2181:1: ( rule__Horizontal__HeightAssignment_8_1 )
            {
             before(grammarAccess.getHorizontalAccess().getHeightAssignment_8_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2182:1: ( rule__Horizontal__HeightAssignment_8_1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2182:2: rule__Horizontal__HeightAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Horizontal__HeightAssignment_8_1_in_rule__Horizontal__Group_8__1__Impl4298);
            rule__Horizontal__HeightAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getHorizontalAccess().getHeightAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group_8__1__Impl"


    // $ANTLR start "rule__Vertical__Group__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2196:1: rule__Vertical__Group__0 : rule__Vertical__Group__0__Impl rule__Vertical__Group__1 ;
    public final void rule__Vertical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2200:1: ( rule__Vertical__Group__0__Impl rule__Vertical__Group__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2201:2: rule__Vertical__Group__0__Impl rule__Vertical__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group__0__Impl_in_rule__Vertical__Group__04332);
            rule__Vertical__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group__1_in_rule__Vertical__Group__04335);
            rule__Vertical__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__0"


    // $ANTLR start "rule__Vertical__Group__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2208:1: rule__Vertical__Group__0__Impl : ( () ) ;
    public final void rule__Vertical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2212:1: ( ( () ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2213:1: ( () )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2213:1: ( () )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2214:1: ()
            {
             before(grammarAccess.getVerticalAccess().getVerticalAction_0()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2215:1: ()
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2217:1: 
            {
            }

             after(grammarAccess.getVerticalAccess().getVerticalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__0__Impl"


    // $ANTLR start "rule__Vertical__Group__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2227:1: rule__Vertical__Group__1 : rule__Vertical__Group__1__Impl rule__Vertical__Group__2 ;
    public final void rule__Vertical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2231:1: ( rule__Vertical__Group__1__Impl rule__Vertical__Group__2 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2232:2: rule__Vertical__Group__1__Impl rule__Vertical__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group__1__Impl_in_rule__Vertical__Group__14393);
            rule__Vertical__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group__2_in_rule__Vertical__Group__14396);
            rule__Vertical__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__1"


    // $ANTLR start "rule__Vertical__Group__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2239:1: rule__Vertical__Group__1__Impl : ( ( rule__Vertical__ResizableAssignment_1 )? ) ;
    public final void rule__Vertical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2243:1: ( ( ( rule__Vertical__ResizableAssignment_1 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2244:1: ( ( rule__Vertical__ResizableAssignment_1 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2244:1: ( ( rule__Vertical__ResizableAssignment_1 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2245:1: ( rule__Vertical__ResizableAssignment_1 )?
            {
             before(grammarAccess.getVerticalAccess().getResizableAssignment_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2246:1: ( rule__Vertical__ResizableAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2246:2: rule__Vertical__ResizableAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Vertical__ResizableAssignment_1_in_rule__Vertical__Group__1__Impl4423);
                    rule__Vertical__ResizableAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVerticalAccess().getResizableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__1__Impl"


    // $ANTLR start "rule__Vertical__Group__2"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2256:1: rule__Vertical__Group__2 : rule__Vertical__Group__2__Impl rule__Vertical__Group__3 ;
    public final void rule__Vertical__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2260:1: ( rule__Vertical__Group__2__Impl rule__Vertical__Group__3 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2261:2: rule__Vertical__Group__2__Impl rule__Vertical__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group__2__Impl_in_rule__Vertical__Group__24454);
            rule__Vertical__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group__3_in_rule__Vertical__Group__24457);
            rule__Vertical__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__2"


    // $ANTLR start "rule__Vertical__Group__2__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2268:1: rule__Vertical__Group__2__Impl : ( 'Vertical' ) ;
    public final void rule__Vertical__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2272:1: ( ( 'Vertical' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2273:1: ( 'Vertical' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2273:1: ( 'Vertical' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2274:1: 'Vertical'
            {
             before(grammarAccess.getVerticalAccess().getVerticalKeyword_2()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Vertical__Group__2__Impl4485); 
             after(grammarAccess.getVerticalAccess().getVerticalKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__2__Impl"


    // $ANTLR start "rule__Vertical__Group__3"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2287:1: rule__Vertical__Group__3 : rule__Vertical__Group__3__Impl rule__Vertical__Group__4 ;
    public final void rule__Vertical__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2291:1: ( rule__Vertical__Group__3__Impl rule__Vertical__Group__4 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2292:2: rule__Vertical__Group__3__Impl rule__Vertical__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group__3__Impl_in_rule__Vertical__Group__34516);
            rule__Vertical__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group__4_in_rule__Vertical__Group__34519);
            rule__Vertical__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__3"


    // $ANTLR start "rule__Vertical__Group__3__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2299:1: rule__Vertical__Group__3__Impl : ( '{' ) ;
    public final void rule__Vertical__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2303:1: ( ( '{' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2304:1: ( '{' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2304:1: ( '{' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2305:1: '{'
            {
             before(grammarAccess.getVerticalAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Vertical__Group__3__Impl4547); 
             after(grammarAccess.getVerticalAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__3__Impl"


    // $ANTLR start "rule__Vertical__Group__4"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2318:1: rule__Vertical__Group__4 : rule__Vertical__Group__4__Impl rule__Vertical__Group__5 ;
    public final void rule__Vertical__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2322:1: ( rule__Vertical__Group__4__Impl rule__Vertical__Group__5 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2323:2: rule__Vertical__Group__4__Impl rule__Vertical__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group__4__Impl_in_rule__Vertical__Group__44578);
            rule__Vertical__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group__5_in_rule__Vertical__Group__44581);
            rule__Vertical__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__4"


    // $ANTLR start "rule__Vertical__Group__4__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2330:1: rule__Vertical__Group__4__Impl : ( ( rule__Vertical__Group_4__0 )? ) ;
    public final void rule__Vertical__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2334:1: ( ( ( rule__Vertical__Group_4__0 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2335:1: ( ( rule__Vertical__Group_4__0 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2335:1: ( ( rule__Vertical__Group_4__0 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2336:1: ( rule__Vertical__Group_4__0 )?
            {
             before(grammarAccess.getVerticalAccess().getGroup_4()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2337:1: ( rule__Vertical__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2337:2: rule__Vertical__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group_4__0_in_rule__Vertical__Group__4__Impl4608);
                    rule__Vertical__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVerticalAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__4__Impl"


    // $ANTLR start "rule__Vertical__Group__5"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2347:1: rule__Vertical__Group__5 : rule__Vertical__Group__5__Impl rule__Vertical__Group__6 ;
    public final void rule__Vertical__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2351:1: ( rule__Vertical__Group__5__Impl rule__Vertical__Group__6 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2352:2: rule__Vertical__Group__5__Impl rule__Vertical__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group__5__Impl_in_rule__Vertical__Group__54639);
            rule__Vertical__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group__6_in_rule__Vertical__Group__54642);
            rule__Vertical__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__5"


    // $ANTLR start "rule__Vertical__Group__5__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2359:1: rule__Vertical__Group__5__Impl : ( ( rule__Vertical__Group_5__0 )? ) ;
    public final void rule__Vertical__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2363:1: ( ( ( rule__Vertical__Group_5__0 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2364:1: ( ( rule__Vertical__Group_5__0 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2364:1: ( ( rule__Vertical__Group_5__0 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2365:1: ( rule__Vertical__Group_5__0 )?
            {
             before(grammarAccess.getVerticalAccess().getGroup_5()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2366:1: ( rule__Vertical__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2366:2: rule__Vertical__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group_5__0_in_rule__Vertical__Group__5__Impl4669);
                    rule__Vertical__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVerticalAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__5__Impl"


    // $ANTLR start "rule__Vertical__Group__6"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2376:1: rule__Vertical__Group__6 : rule__Vertical__Group__6__Impl rule__Vertical__Group__7 ;
    public final void rule__Vertical__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2380:1: ( rule__Vertical__Group__6__Impl rule__Vertical__Group__7 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2381:2: rule__Vertical__Group__6__Impl rule__Vertical__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group__6__Impl_in_rule__Vertical__Group__64700);
            rule__Vertical__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group__7_in_rule__Vertical__Group__64703);
            rule__Vertical__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__6"


    // $ANTLR start "rule__Vertical__Group__6__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2388:1: rule__Vertical__Group__6__Impl : ( ( rule__Vertical__Group_6__0 )? ) ;
    public final void rule__Vertical__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2392:1: ( ( ( rule__Vertical__Group_6__0 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2393:1: ( ( rule__Vertical__Group_6__0 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2393:1: ( ( rule__Vertical__Group_6__0 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2394:1: ( rule__Vertical__Group_6__0 )?
            {
             before(grammarAccess.getVerticalAccess().getGroup_6()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2395:1: ( rule__Vertical__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2395:2: rule__Vertical__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group_6__0_in_rule__Vertical__Group__6__Impl4730);
                    rule__Vertical__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVerticalAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__6__Impl"


    // $ANTLR start "rule__Vertical__Group__7"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2405:1: rule__Vertical__Group__7 : rule__Vertical__Group__7__Impl rule__Vertical__Group__8 ;
    public final void rule__Vertical__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2409:1: ( rule__Vertical__Group__7__Impl rule__Vertical__Group__8 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2410:2: rule__Vertical__Group__7__Impl rule__Vertical__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group__7__Impl_in_rule__Vertical__Group__74761);
            rule__Vertical__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group__8_in_rule__Vertical__Group__74764);
            rule__Vertical__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__7"


    // $ANTLR start "rule__Vertical__Group__7__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2417:1: rule__Vertical__Group__7__Impl : ( ( rule__Vertical__Group_7__0 )? ) ;
    public final void rule__Vertical__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2421:1: ( ( ( rule__Vertical__Group_7__0 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2422:1: ( ( rule__Vertical__Group_7__0 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2422:1: ( ( rule__Vertical__Group_7__0 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2423:1: ( rule__Vertical__Group_7__0 )?
            {
             before(grammarAccess.getVerticalAccess().getGroup_7()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2424:1: ( rule__Vertical__Group_7__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2424:2: rule__Vertical__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group_7__0_in_rule__Vertical__Group__7__Impl4791);
                    rule__Vertical__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVerticalAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__7__Impl"


    // $ANTLR start "rule__Vertical__Group__8"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2434:1: rule__Vertical__Group__8 : rule__Vertical__Group__8__Impl rule__Vertical__Group__9 ;
    public final void rule__Vertical__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2438:1: ( rule__Vertical__Group__8__Impl rule__Vertical__Group__9 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2439:2: rule__Vertical__Group__8__Impl rule__Vertical__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group__8__Impl_in_rule__Vertical__Group__84822);
            rule__Vertical__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group__9_in_rule__Vertical__Group__84825);
            rule__Vertical__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__8"


    // $ANTLR start "rule__Vertical__Group__8__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2446:1: rule__Vertical__Group__8__Impl : ( ( rule__Vertical__Group_8__0 )? ) ;
    public final void rule__Vertical__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2450:1: ( ( ( rule__Vertical__Group_8__0 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2451:1: ( ( rule__Vertical__Group_8__0 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2451:1: ( ( rule__Vertical__Group_8__0 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2452:1: ( rule__Vertical__Group_8__0 )?
            {
             before(grammarAccess.getVerticalAccess().getGroup_8()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2453:1: ( rule__Vertical__Group_8__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2453:2: rule__Vertical__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group_8__0_in_rule__Vertical__Group__8__Impl4852);
                    rule__Vertical__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVerticalAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__8__Impl"


    // $ANTLR start "rule__Vertical__Group__9"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2463:1: rule__Vertical__Group__9 : rule__Vertical__Group__9__Impl ;
    public final void rule__Vertical__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2467:1: ( rule__Vertical__Group__9__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2468:2: rule__Vertical__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group__9__Impl_in_rule__Vertical__Group__94883);
            rule__Vertical__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__9"


    // $ANTLR start "rule__Vertical__Group__9__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2474:1: rule__Vertical__Group__9__Impl : ( '}' ) ;
    public final void rule__Vertical__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2478:1: ( ( '}' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2479:1: ( '}' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2479:1: ( '}' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2480:1: '}'
            {
             before(grammarAccess.getVerticalAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Vertical__Group__9__Impl4911); 
             after(grammarAccess.getVerticalAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__9__Impl"


    // $ANTLR start "rule__Vertical__Group_4__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2513:1: rule__Vertical__Group_4__0 : rule__Vertical__Group_4__0__Impl rule__Vertical__Group_4__1 ;
    public final void rule__Vertical__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2517:1: ( rule__Vertical__Group_4__0__Impl rule__Vertical__Group_4__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2518:2: rule__Vertical__Group_4__0__Impl rule__Vertical__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group_4__0__Impl_in_rule__Vertical__Group_4__04962);
            rule__Vertical__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group_4__1_in_rule__Vertical__Group_4__04965);
            rule__Vertical__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group_4__0"


    // $ANTLR start "rule__Vertical__Group_4__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2525:1: rule__Vertical__Group_4__0__Impl : ( 'style' ) ;
    public final void rule__Vertical__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2529:1: ( ( 'style' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2530:1: ( 'style' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2530:1: ( 'style' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2531:1: 'style'
            {
             before(grammarAccess.getVerticalAccess().getStyleKeyword_4_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Vertical__Group_4__0__Impl4993); 
             after(grammarAccess.getVerticalAccess().getStyleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group_4__0__Impl"


    // $ANTLR start "rule__Vertical__Group_4__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2544:1: rule__Vertical__Group_4__1 : rule__Vertical__Group_4__1__Impl ;
    public final void rule__Vertical__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2548:1: ( rule__Vertical__Group_4__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2549:2: rule__Vertical__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group_4__1__Impl_in_rule__Vertical__Group_4__15024);
            rule__Vertical__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group_4__1"


    // $ANTLR start "rule__Vertical__Group_4__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2555:1: rule__Vertical__Group_4__1__Impl : ( ( rule__Vertical__StyleAssignment_4_1 ) ) ;
    public final void rule__Vertical__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2559:1: ( ( ( rule__Vertical__StyleAssignment_4_1 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2560:1: ( ( rule__Vertical__StyleAssignment_4_1 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2560:1: ( ( rule__Vertical__StyleAssignment_4_1 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2561:1: ( rule__Vertical__StyleAssignment_4_1 )
            {
             before(grammarAccess.getVerticalAccess().getStyleAssignment_4_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2562:1: ( rule__Vertical__StyleAssignment_4_1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2562:2: rule__Vertical__StyleAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__StyleAssignment_4_1_in_rule__Vertical__Group_4__1__Impl5051);
            rule__Vertical__StyleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVerticalAccess().getStyleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group_4__1__Impl"


    // $ANTLR start "rule__Vertical__Group_5__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2576:1: rule__Vertical__Group_5__0 : rule__Vertical__Group_5__0__Impl rule__Vertical__Group_5__1 ;
    public final void rule__Vertical__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2580:1: ( rule__Vertical__Group_5__0__Impl rule__Vertical__Group_5__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2581:2: rule__Vertical__Group_5__0__Impl rule__Vertical__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group_5__0__Impl_in_rule__Vertical__Group_5__05085);
            rule__Vertical__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group_5__1_in_rule__Vertical__Group_5__05088);
            rule__Vertical__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group_5__0"


    // $ANTLR start "rule__Vertical__Group_5__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2588:1: rule__Vertical__Group_5__0__Impl : ( 'position' ) ;
    public final void rule__Vertical__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2592:1: ( ( 'position' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2593:1: ( 'position' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2593:1: ( 'position' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2594:1: 'position'
            {
             before(grammarAccess.getVerticalAccess().getPositionKeyword_5_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Vertical__Group_5__0__Impl5116); 
             after(grammarAccess.getVerticalAccess().getPositionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group_5__0__Impl"


    // $ANTLR start "rule__Vertical__Group_5__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2607:1: rule__Vertical__Group_5__1 : rule__Vertical__Group_5__1__Impl ;
    public final void rule__Vertical__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2611:1: ( rule__Vertical__Group_5__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2612:2: rule__Vertical__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group_5__1__Impl_in_rule__Vertical__Group_5__15147);
            rule__Vertical__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group_5__1"


    // $ANTLR start "rule__Vertical__Group_5__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2618:1: rule__Vertical__Group_5__1__Impl : ( ( rule__Vertical__PositionAssignment_5_1 ) ) ;
    public final void rule__Vertical__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2622:1: ( ( ( rule__Vertical__PositionAssignment_5_1 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2623:1: ( ( rule__Vertical__PositionAssignment_5_1 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2623:1: ( ( rule__Vertical__PositionAssignment_5_1 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2624:1: ( rule__Vertical__PositionAssignment_5_1 )
            {
             before(grammarAccess.getVerticalAccess().getPositionAssignment_5_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2625:1: ( rule__Vertical__PositionAssignment_5_1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2625:2: rule__Vertical__PositionAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__PositionAssignment_5_1_in_rule__Vertical__Group_5__1__Impl5174);
            rule__Vertical__PositionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getVerticalAccess().getPositionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group_5__1__Impl"


    // $ANTLR start "rule__Vertical__Group_6__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2639:1: rule__Vertical__Group_6__0 : rule__Vertical__Group_6__0__Impl rule__Vertical__Group_6__1 ;
    public final void rule__Vertical__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2643:1: ( rule__Vertical__Group_6__0__Impl rule__Vertical__Group_6__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2644:2: rule__Vertical__Group_6__0__Impl rule__Vertical__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group_6__0__Impl_in_rule__Vertical__Group_6__05208);
            rule__Vertical__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group_6__1_in_rule__Vertical__Group_6__05211);
            rule__Vertical__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group_6__0"


    // $ANTLR start "rule__Vertical__Group_6__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2651:1: rule__Vertical__Group_6__0__Impl : ( 'minSize' ) ;
    public final void rule__Vertical__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2655:1: ( ( 'minSize' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2656:1: ( 'minSize' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2656:1: ( 'minSize' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2657:1: 'minSize'
            {
             before(grammarAccess.getVerticalAccess().getMinSizeKeyword_6_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Vertical__Group_6__0__Impl5239); 
             after(grammarAccess.getVerticalAccess().getMinSizeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group_6__0__Impl"


    // $ANTLR start "rule__Vertical__Group_6__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2670:1: rule__Vertical__Group_6__1 : rule__Vertical__Group_6__1__Impl ;
    public final void rule__Vertical__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2674:1: ( rule__Vertical__Group_6__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2675:2: rule__Vertical__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group_6__1__Impl_in_rule__Vertical__Group_6__15270);
            rule__Vertical__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group_6__1"


    // $ANTLR start "rule__Vertical__Group_6__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2681:1: rule__Vertical__Group_6__1__Impl : ( ( rule__Vertical__MinSizeAssignment_6_1 ) ) ;
    public final void rule__Vertical__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2685:1: ( ( ( rule__Vertical__MinSizeAssignment_6_1 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2686:1: ( ( rule__Vertical__MinSizeAssignment_6_1 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2686:1: ( ( rule__Vertical__MinSizeAssignment_6_1 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2687:1: ( rule__Vertical__MinSizeAssignment_6_1 )
            {
             before(grammarAccess.getVerticalAccess().getMinSizeAssignment_6_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2688:1: ( rule__Vertical__MinSizeAssignment_6_1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2688:2: rule__Vertical__MinSizeAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__MinSizeAssignment_6_1_in_rule__Vertical__Group_6__1__Impl5297);
            rule__Vertical__MinSizeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getVerticalAccess().getMinSizeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group_6__1__Impl"


    // $ANTLR start "rule__Vertical__Group_7__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2702:1: rule__Vertical__Group_7__0 : rule__Vertical__Group_7__0__Impl rule__Vertical__Group_7__1 ;
    public final void rule__Vertical__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2706:1: ( rule__Vertical__Group_7__0__Impl rule__Vertical__Group_7__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2707:2: rule__Vertical__Group_7__0__Impl rule__Vertical__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group_7__0__Impl_in_rule__Vertical__Group_7__05331);
            rule__Vertical__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group_7__1_in_rule__Vertical__Group_7__05334);
            rule__Vertical__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group_7__0"


    // $ANTLR start "rule__Vertical__Group_7__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2714:1: rule__Vertical__Group_7__0__Impl : ( 'maxSize' ) ;
    public final void rule__Vertical__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2718:1: ( ( 'maxSize' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2719:1: ( 'maxSize' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2719:1: ( 'maxSize' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2720:1: 'maxSize'
            {
             before(grammarAccess.getVerticalAccess().getMaxSizeKeyword_7_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Vertical__Group_7__0__Impl5362); 
             after(grammarAccess.getVerticalAccess().getMaxSizeKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group_7__0__Impl"


    // $ANTLR start "rule__Vertical__Group_7__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2733:1: rule__Vertical__Group_7__1 : rule__Vertical__Group_7__1__Impl ;
    public final void rule__Vertical__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2737:1: ( rule__Vertical__Group_7__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2738:2: rule__Vertical__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group_7__1__Impl_in_rule__Vertical__Group_7__15393);
            rule__Vertical__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group_7__1"


    // $ANTLR start "rule__Vertical__Group_7__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2744:1: rule__Vertical__Group_7__1__Impl : ( ( rule__Vertical__MaxSizeAssignment_7_1 ) ) ;
    public final void rule__Vertical__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2748:1: ( ( ( rule__Vertical__MaxSizeAssignment_7_1 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2749:1: ( ( rule__Vertical__MaxSizeAssignment_7_1 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2749:1: ( ( rule__Vertical__MaxSizeAssignment_7_1 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2750:1: ( rule__Vertical__MaxSizeAssignment_7_1 )
            {
             before(grammarAccess.getVerticalAccess().getMaxSizeAssignment_7_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2751:1: ( rule__Vertical__MaxSizeAssignment_7_1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2751:2: rule__Vertical__MaxSizeAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__MaxSizeAssignment_7_1_in_rule__Vertical__Group_7__1__Impl5420);
            rule__Vertical__MaxSizeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getVerticalAccess().getMaxSizeAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group_7__1__Impl"


    // $ANTLR start "rule__Vertical__Group_8__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2765:1: rule__Vertical__Group_8__0 : rule__Vertical__Group_8__0__Impl rule__Vertical__Group_8__1 ;
    public final void rule__Vertical__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2769:1: ( rule__Vertical__Group_8__0__Impl rule__Vertical__Group_8__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2770:2: rule__Vertical__Group_8__0__Impl rule__Vertical__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group_8__0__Impl_in_rule__Vertical__Group_8__05454);
            rule__Vertical__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group_8__1_in_rule__Vertical__Group_8__05457);
            rule__Vertical__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group_8__0"


    // $ANTLR start "rule__Vertical__Group_8__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2777:1: rule__Vertical__Group_8__0__Impl : ( 'width' ) ;
    public final void rule__Vertical__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2781:1: ( ( 'width' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2782:1: ( 'width' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2782:1: ( 'width' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2783:1: 'width'
            {
             before(grammarAccess.getVerticalAccess().getWidthKeyword_8_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Vertical__Group_8__0__Impl5485); 
             after(grammarAccess.getVerticalAccess().getWidthKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group_8__0__Impl"


    // $ANTLR start "rule__Vertical__Group_8__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2796:1: rule__Vertical__Group_8__1 : rule__Vertical__Group_8__1__Impl ;
    public final void rule__Vertical__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2800:1: ( rule__Vertical__Group_8__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2801:2: rule__Vertical__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__Group_8__1__Impl_in_rule__Vertical__Group_8__15516);
            rule__Vertical__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group_8__1"


    // $ANTLR start "rule__Vertical__Group_8__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2807:1: rule__Vertical__Group_8__1__Impl : ( ( rule__Vertical__WidthAssignment_8_1 ) ) ;
    public final void rule__Vertical__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2811:1: ( ( ( rule__Vertical__WidthAssignment_8_1 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2812:1: ( ( rule__Vertical__WidthAssignment_8_1 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2812:1: ( ( rule__Vertical__WidthAssignment_8_1 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2813:1: ( rule__Vertical__WidthAssignment_8_1 )
            {
             before(grammarAccess.getVerticalAccess().getWidthAssignment_8_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2814:1: ( rule__Vertical__WidthAssignment_8_1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2814:2: rule__Vertical__WidthAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vertical__WidthAssignment_8_1_in_rule__Vertical__Group_8__1__Impl5543);
            rule__Vertical__WidthAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getVerticalAccess().getWidthAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group_8__1__Impl"


    // $ANTLR start "rule__Content__Group__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2828:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2832:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2833:2: rule__Content__Group__0__Impl rule__Content__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__0__Impl_in_rule__Content__Group__05577);
            rule__Content__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__1_in_rule__Content__Group__05580);
            rule__Content__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__0"


    // $ANTLR start "rule__Content__Group__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2840:1: rule__Content__Group__0__Impl : ( () ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2844:1: ( ( () ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2845:1: ( () )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2845:1: ( () )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2846:1: ()
            {
             before(grammarAccess.getContentAccess().getContentAction_0()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2847:1: ()
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2849:1: 
            {
            }

             after(grammarAccess.getContentAccess().getContentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__0__Impl"


    // $ANTLR start "rule__Content__Group__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2859:1: rule__Content__Group__1 : rule__Content__Group__1__Impl rule__Content__Group__2 ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2863:1: ( rule__Content__Group__1__Impl rule__Content__Group__2 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2864:2: rule__Content__Group__1__Impl rule__Content__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__1__Impl_in_rule__Content__Group__15638);
            rule__Content__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__2_in_rule__Content__Group__15641);
            rule__Content__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__1"


    // $ANTLR start "rule__Content__Group__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2871:1: rule__Content__Group__1__Impl : ( ( rule__Content__ResizableAssignment_1 )? ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2875:1: ( ( ( rule__Content__ResizableAssignment_1 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2876:1: ( ( rule__Content__ResizableAssignment_1 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2876:1: ( ( rule__Content__ResizableAssignment_1 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2877:1: ( rule__Content__ResizableAssignment_1 )?
            {
             before(grammarAccess.getContentAccess().getResizableAssignment_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2878:1: ( rule__Content__ResizableAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2878:2: rule__Content__ResizableAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Content__ResizableAssignment_1_in_rule__Content__Group__1__Impl5668);
                    rule__Content__ResizableAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentAccess().getResizableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__1__Impl"


    // $ANTLR start "rule__Content__Group__2"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2888:1: rule__Content__Group__2 : rule__Content__Group__2__Impl rule__Content__Group__3 ;
    public final void rule__Content__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2892:1: ( rule__Content__Group__2__Impl rule__Content__Group__3 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2893:2: rule__Content__Group__2__Impl rule__Content__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__2__Impl_in_rule__Content__Group__25699);
            rule__Content__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__3_in_rule__Content__Group__25702);
            rule__Content__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__2"


    // $ANTLR start "rule__Content__Group__2__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2900:1: rule__Content__Group__2__Impl : ( 'Content' ) ;
    public final void rule__Content__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2904:1: ( ( 'Content' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2905:1: ( 'Content' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2905:1: ( 'Content' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2906:1: 'Content'
            {
             before(grammarAccess.getContentAccess().getContentKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Content__Group__2__Impl5730); 
             after(grammarAccess.getContentAccess().getContentKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__2__Impl"


    // $ANTLR start "rule__Content__Group__3"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2919:1: rule__Content__Group__3 : rule__Content__Group__3__Impl rule__Content__Group__4 ;
    public final void rule__Content__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2923:1: ( rule__Content__Group__3__Impl rule__Content__Group__4 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2924:2: rule__Content__Group__3__Impl rule__Content__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__3__Impl_in_rule__Content__Group__35761);
            rule__Content__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__4_in_rule__Content__Group__35764);
            rule__Content__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__3"


    // $ANTLR start "rule__Content__Group__3__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2931:1: rule__Content__Group__3__Impl : ( '{' ) ;
    public final void rule__Content__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2935:1: ( ( '{' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2936:1: ( '{' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2936:1: ( '{' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2937:1: '{'
            {
             before(grammarAccess.getContentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Content__Group__3__Impl5792); 
             after(grammarAccess.getContentAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__3__Impl"


    // $ANTLR start "rule__Content__Group__4"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2950:1: rule__Content__Group__4 : rule__Content__Group__4__Impl rule__Content__Group__5 ;
    public final void rule__Content__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2954:1: ( rule__Content__Group__4__Impl rule__Content__Group__5 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2955:2: rule__Content__Group__4__Impl rule__Content__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__4__Impl_in_rule__Content__Group__45823);
            rule__Content__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__5_in_rule__Content__Group__45826);
            rule__Content__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__4"


    // $ANTLR start "rule__Content__Group__4__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2962:1: rule__Content__Group__4__Impl : ( ( rule__Content__Group_4__0 )? ) ;
    public final void rule__Content__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2966:1: ( ( ( rule__Content__Group_4__0 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2967:1: ( ( rule__Content__Group_4__0 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2967:1: ( ( rule__Content__Group_4__0 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2968:1: ( rule__Content__Group_4__0 )?
            {
             before(grammarAccess.getContentAccess().getGroup_4()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2969:1: ( rule__Content__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2969:2: rule__Content__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Content__Group_4__0_in_rule__Content__Group__4__Impl5853);
                    rule__Content__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__4__Impl"


    // $ANTLR start "rule__Content__Group__5"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2979:1: rule__Content__Group__5 : rule__Content__Group__5__Impl rule__Content__Group__6 ;
    public final void rule__Content__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2983:1: ( rule__Content__Group__5__Impl rule__Content__Group__6 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2984:2: rule__Content__Group__5__Impl rule__Content__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__5__Impl_in_rule__Content__Group__55884);
            rule__Content__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__6_in_rule__Content__Group__55887);
            rule__Content__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__5"


    // $ANTLR start "rule__Content__Group__5__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2991:1: rule__Content__Group__5__Impl : ( ( rule__Content__Group_5__0 )? ) ;
    public final void rule__Content__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2995:1: ( ( ( rule__Content__Group_5__0 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2996:1: ( ( rule__Content__Group_5__0 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2996:1: ( ( rule__Content__Group_5__0 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2997:1: ( rule__Content__Group_5__0 )?
            {
             before(grammarAccess.getContentAccess().getGroup_5()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2998:1: ( rule__Content__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:2998:2: rule__Content__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Content__Group_5__0_in_rule__Content__Group__5__Impl5914);
                    rule__Content__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__5__Impl"


    // $ANTLR start "rule__Content__Group__6"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3008:1: rule__Content__Group__6 : rule__Content__Group__6__Impl rule__Content__Group__7 ;
    public final void rule__Content__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3012:1: ( rule__Content__Group__6__Impl rule__Content__Group__7 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3013:2: rule__Content__Group__6__Impl rule__Content__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__6__Impl_in_rule__Content__Group__65945);
            rule__Content__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__7_in_rule__Content__Group__65948);
            rule__Content__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__6"


    // $ANTLR start "rule__Content__Group__6__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3020:1: rule__Content__Group__6__Impl : ( ( rule__Content__Group_6__0 )? ) ;
    public final void rule__Content__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3024:1: ( ( ( rule__Content__Group_6__0 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3025:1: ( ( rule__Content__Group_6__0 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3025:1: ( ( rule__Content__Group_6__0 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3026:1: ( rule__Content__Group_6__0 )?
            {
             before(grammarAccess.getContentAccess().getGroup_6()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3027:1: ( rule__Content__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3027:2: rule__Content__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Content__Group_6__0_in_rule__Content__Group__6__Impl5975);
                    rule__Content__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__6__Impl"


    // $ANTLR start "rule__Content__Group__7"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3037:1: rule__Content__Group__7 : rule__Content__Group__7__Impl rule__Content__Group__8 ;
    public final void rule__Content__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3041:1: ( rule__Content__Group__7__Impl rule__Content__Group__8 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3042:2: rule__Content__Group__7__Impl rule__Content__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__7__Impl_in_rule__Content__Group__76006);
            rule__Content__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__8_in_rule__Content__Group__76009);
            rule__Content__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__7"


    // $ANTLR start "rule__Content__Group__7__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3049:1: rule__Content__Group__7__Impl : ( ( rule__Content__Group_7__0 )? ) ;
    public final void rule__Content__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3053:1: ( ( ( rule__Content__Group_7__0 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3054:1: ( ( rule__Content__Group_7__0 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3054:1: ( ( rule__Content__Group_7__0 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3055:1: ( rule__Content__Group_7__0 )?
            {
             before(grammarAccess.getContentAccess().getGroup_7()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3056:1: ( rule__Content__Group_7__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3056:2: rule__Content__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Content__Group_7__0_in_rule__Content__Group__7__Impl6036);
                    rule__Content__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__7__Impl"


    // $ANTLR start "rule__Content__Group__8"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3066:1: rule__Content__Group__8 : rule__Content__Group__8__Impl rule__Content__Group__9 ;
    public final void rule__Content__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3070:1: ( rule__Content__Group__8__Impl rule__Content__Group__9 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3071:2: rule__Content__Group__8__Impl rule__Content__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__8__Impl_in_rule__Content__Group__86067);
            rule__Content__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__9_in_rule__Content__Group__86070);
            rule__Content__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__8"


    // $ANTLR start "rule__Content__Group__8__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3078:1: rule__Content__Group__8__Impl : ( ( rule__Content__Group_8__0 )? ) ;
    public final void rule__Content__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3082:1: ( ( ( rule__Content__Group_8__0 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3083:1: ( ( rule__Content__Group_8__0 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3083:1: ( ( rule__Content__Group_8__0 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3084:1: ( rule__Content__Group_8__0 )?
            {
             before(grammarAccess.getContentAccess().getGroup_8()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3085:1: ( rule__Content__Group_8__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==27) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3085:2: rule__Content__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Content__Group_8__0_in_rule__Content__Group__8__Impl6097);
                    rule__Content__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__8__Impl"


    // $ANTLR start "rule__Content__Group__9"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3095:1: rule__Content__Group__9 : rule__Content__Group__9__Impl rule__Content__Group__10 ;
    public final void rule__Content__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3099:1: ( rule__Content__Group__9__Impl rule__Content__Group__10 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3100:2: rule__Content__Group__9__Impl rule__Content__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__9__Impl_in_rule__Content__Group__96128);
            rule__Content__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__10_in_rule__Content__Group__96131);
            rule__Content__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__9"


    // $ANTLR start "rule__Content__Group__9__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3107:1: rule__Content__Group__9__Impl : ( ( rule__Content__Group_9__0 )? ) ;
    public final void rule__Content__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3111:1: ( ( ( rule__Content__Group_9__0 )? ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3112:1: ( ( rule__Content__Group_9__0 )? )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3112:1: ( ( rule__Content__Group_9__0 )? )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3113:1: ( rule__Content__Group_9__0 )?
            {
             before(grammarAccess.getContentAccess().getGroup_9()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3114:1: ( rule__Content__Group_9__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3114:2: rule__Content__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Content__Group_9__0_in_rule__Content__Group__9__Impl6158);
                    rule__Content__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__9__Impl"


    // $ANTLR start "rule__Content__Group__10"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3124:1: rule__Content__Group__10 : rule__Content__Group__10__Impl ;
    public final void rule__Content__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3128:1: ( rule__Content__Group__10__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3129:2: rule__Content__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__10__Impl_in_rule__Content__Group__106189);
            rule__Content__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__10"


    // $ANTLR start "rule__Content__Group__10__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3135:1: rule__Content__Group__10__Impl : ( '}' ) ;
    public final void rule__Content__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3139:1: ( ( '}' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3140:1: ( '}' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3140:1: ( '}' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3141:1: '}'
            {
             before(grammarAccess.getContentAccess().getRightCurlyBracketKeyword_10()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Content__Group__10__Impl6217); 
             after(grammarAccess.getContentAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__10__Impl"


    // $ANTLR start "rule__Content__Group_4__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3176:1: rule__Content__Group_4__0 : rule__Content__Group_4__0__Impl rule__Content__Group_4__1 ;
    public final void rule__Content__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3180:1: ( rule__Content__Group_4__0__Impl rule__Content__Group_4__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3181:2: rule__Content__Group_4__0__Impl rule__Content__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group_4__0__Impl_in_rule__Content__Group_4__06270);
            rule__Content__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group_4__1_in_rule__Content__Group_4__06273);
            rule__Content__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_4__0"


    // $ANTLR start "rule__Content__Group_4__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3188:1: rule__Content__Group_4__0__Impl : ( 'style' ) ;
    public final void rule__Content__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3192:1: ( ( 'style' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3193:1: ( 'style' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3193:1: ( 'style' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3194:1: 'style'
            {
             before(grammarAccess.getContentAccess().getStyleKeyword_4_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Content__Group_4__0__Impl6301); 
             after(grammarAccess.getContentAccess().getStyleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_4__0__Impl"


    // $ANTLR start "rule__Content__Group_4__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3207:1: rule__Content__Group_4__1 : rule__Content__Group_4__1__Impl ;
    public final void rule__Content__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3211:1: ( rule__Content__Group_4__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3212:2: rule__Content__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group_4__1__Impl_in_rule__Content__Group_4__16332);
            rule__Content__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_4__1"


    // $ANTLR start "rule__Content__Group_4__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3218:1: rule__Content__Group_4__1__Impl : ( ( rule__Content__StyleAssignment_4_1 ) ) ;
    public final void rule__Content__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3222:1: ( ( ( rule__Content__StyleAssignment_4_1 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3223:1: ( ( rule__Content__StyleAssignment_4_1 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3223:1: ( ( rule__Content__StyleAssignment_4_1 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3224:1: ( rule__Content__StyleAssignment_4_1 )
            {
             before(grammarAccess.getContentAccess().getStyleAssignment_4_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3225:1: ( rule__Content__StyleAssignment_4_1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3225:2: rule__Content__StyleAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__StyleAssignment_4_1_in_rule__Content__Group_4__1__Impl6359);
            rule__Content__StyleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getStyleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_4__1__Impl"


    // $ANTLR start "rule__Content__Group_5__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3239:1: rule__Content__Group_5__0 : rule__Content__Group_5__0__Impl rule__Content__Group_5__1 ;
    public final void rule__Content__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3243:1: ( rule__Content__Group_5__0__Impl rule__Content__Group_5__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3244:2: rule__Content__Group_5__0__Impl rule__Content__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group_5__0__Impl_in_rule__Content__Group_5__06393);
            rule__Content__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group_5__1_in_rule__Content__Group_5__06396);
            rule__Content__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_5__0"


    // $ANTLR start "rule__Content__Group_5__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3251:1: rule__Content__Group_5__0__Impl : ( 'position' ) ;
    public final void rule__Content__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3255:1: ( ( 'position' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3256:1: ( 'position' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3256:1: ( 'position' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3257:1: 'position'
            {
             before(grammarAccess.getContentAccess().getPositionKeyword_5_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Content__Group_5__0__Impl6424); 
             after(grammarAccess.getContentAccess().getPositionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_5__0__Impl"


    // $ANTLR start "rule__Content__Group_5__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3270:1: rule__Content__Group_5__1 : rule__Content__Group_5__1__Impl ;
    public final void rule__Content__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3274:1: ( rule__Content__Group_5__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3275:2: rule__Content__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group_5__1__Impl_in_rule__Content__Group_5__16455);
            rule__Content__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_5__1"


    // $ANTLR start "rule__Content__Group_5__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3281:1: rule__Content__Group_5__1__Impl : ( ( rule__Content__PositionAssignment_5_1 ) ) ;
    public final void rule__Content__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3285:1: ( ( ( rule__Content__PositionAssignment_5_1 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3286:1: ( ( rule__Content__PositionAssignment_5_1 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3286:1: ( ( rule__Content__PositionAssignment_5_1 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3287:1: ( rule__Content__PositionAssignment_5_1 )
            {
             before(grammarAccess.getContentAccess().getPositionAssignment_5_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3288:1: ( rule__Content__PositionAssignment_5_1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3288:2: rule__Content__PositionAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__PositionAssignment_5_1_in_rule__Content__Group_5__1__Impl6482);
            rule__Content__PositionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getPositionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_5__1__Impl"


    // $ANTLR start "rule__Content__Group_6__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3302:1: rule__Content__Group_6__0 : rule__Content__Group_6__0__Impl rule__Content__Group_6__1 ;
    public final void rule__Content__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3306:1: ( rule__Content__Group_6__0__Impl rule__Content__Group_6__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3307:2: rule__Content__Group_6__0__Impl rule__Content__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group_6__0__Impl_in_rule__Content__Group_6__06516);
            rule__Content__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group_6__1_in_rule__Content__Group_6__06519);
            rule__Content__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_6__0"


    // $ANTLR start "rule__Content__Group_6__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3314:1: rule__Content__Group_6__0__Impl : ( 'minSize' ) ;
    public final void rule__Content__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3318:1: ( ( 'minSize' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3319:1: ( 'minSize' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3319:1: ( 'minSize' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3320:1: 'minSize'
            {
             before(grammarAccess.getContentAccess().getMinSizeKeyword_6_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Content__Group_6__0__Impl6547); 
             after(grammarAccess.getContentAccess().getMinSizeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_6__0__Impl"


    // $ANTLR start "rule__Content__Group_6__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3333:1: rule__Content__Group_6__1 : rule__Content__Group_6__1__Impl ;
    public final void rule__Content__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3337:1: ( rule__Content__Group_6__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3338:2: rule__Content__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group_6__1__Impl_in_rule__Content__Group_6__16578);
            rule__Content__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_6__1"


    // $ANTLR start "rule__Content__Group_6__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3344:1: rule__Content__Group_6__1__Impl : ( ( rule__Content__MinSizeAssignment_6_1 ) ) ;
    public final void rule__Content__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3348:1: ( ( ( rule__Content__MinSizeAssignment_6_1 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3349:1: ( ( rule__Content__MinSizeAssignment_6_1 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3349:1: ( ( rule__Content__MinSizeAssignment_6_1 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3350:1: ( rule__Content__MinSizeAssignment_6_1 )
            {
             before(grammarAccess.getContentAccess().getMinSizeAssignment_6_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3351:1: ( rule__Content__MinSizeAssignment_6_1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3351:2: rule__Content__MinSizeAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__MinSizeAssignment_6_1_in_rule__Content__Group_6__1__Impl6605);
            rule__Content__MinSizeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getMinSizeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_6__1__Impl"


    // $ANTLR start "rule__Content__Group_7__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3365:1: rule__Content__Group_7__0 : rule__Content__Group_7__0__Impl rule__Content__Group_7__1 ;
    public final void rule__Content__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3369:1: ( rule__Content__Group_7__0__Impl rule__Content__Group_7__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3370:2: rule__Content__Group_7__0__Impl rule__Content__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group_7__0__Impl_in_rule__Content__Group_7__06639);
            rule__Content__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group_7__1_in_rule__Content__Group_7__06642);
            rule__Content__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_7__0"


    // $ANTLR start "rule__Content__Group_7__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3377:1: rule__Content__Group_7__0__Impl : ( 'maxSize' ) ;
    public final void rule__Content__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3381:1: ( ( 'maxSize' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3382:1: ( 'maxSize' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3382:1: ( 'maxSize' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3383:1: 'maxSize'
            {
             before(grammarAccess.getContentAccess().getMaxSizeKeyword_7_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Content__Group_7__0__Impl6670); 
             after(grammarAccess.getContentAccess().getMaxSizeKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_7__0__Impl"


    // $ANTLR start "rule__Content__Group_7__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3396:1: rule__Content__Group_7__1 : rule__Content__Group_7__1__Impl ;
    public final void rule__Content__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3400:1: ( rule__Content__Group_7__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3401:2: rule__Content__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group_7__1__Impl_in_rule__Content__Group_7__16701);
            rule__Content__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_7__1"


    // $ANTLR start "rule__Content__Group_7__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3407:1: rule__Content__Group_7__1__Impl : ( ( rule__Content__MaxSizeAssignment_7_1 ) ) ;
    public final void rule__Content__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3411:1: ( ( ( rule__Content__MaxSizeAssignment_7_1 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3412:1: ( ( rule__Content__MaxSizeAssignment_7_1 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3412:1: ( ( rule__Content__MaxSizeAssignment_7_1 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3413:1: ( rule__Content__MaxSizeAssignment_7_1 )
            {
             before(grammarAccess.getContentAccess().getMaxSizeAssignment_7_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3414:1: ( rule__Content__MaxSizeAssignment_7_1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3414:2: rule__Content__MaxSizeAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__MaxSizeAssignment_7_1_in_rule__Content__Group_7__1__Impl6728);
            rule__Content__MaxSizeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getMaxSizeAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_7__1__Impl"


    // $ANTLR start "rule__Content__Group_8__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3428:1: rule__Content__Group_8__0 : rule__Content__Group_8__0__Impl rule__Content__Group_8__1 ;
    public final void rule__Content__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3432:1: ( rule__Content__Group_8__0__Impl rule__Content__Group_8__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3433:2: rule__Content__Group_8__0__Impl rule__Content__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group_8__0__Impl_in_rule__Content__Group_8__06762);
            rule__Content__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group_8__1_in_rule__Content__Group_8__06765);
            rule__Content__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_8__0"


    // $ANTLR start "rule__Content__Group_8__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3440:1: rule__Content__Group_8__0__Impl : ( 'height' ) ;
    public final void rule__Content__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3444:1: ( ( 'height' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3445:1: ( 'height' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3445:1: ( 'height' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3446:1: 'height'
            {
             before(grammarAccess.getContentAccess().getHeightKeyword_8_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Content__Group_8__0__Impl6793); 
             after(grammarAccess.getContentAccess().getHeightKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_8__0__Impl"


    // $ANTLR start "rule__Content__Group_8__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3459:1: rule__Content__Group_8__1 : rule__Content__Group_8__1__Impl ;
    public final void rule__Content__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3463:1: ( rule__Content__Group_8__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3464:2: rule__Content__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group_8__1__Impl_in_rule__Content__Group_8__16824);
            rule__Content__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_8__1"


    // $ANTLR start "rule__Content__Group_8__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3470:1: rule__Content__Group_8__1__Impl : ( ( rule__Content__HeightAssignment_8_1 ) ) ;
    public final void rule__Content__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3474:1: ( ( ( rule__Content__HeightAssignment_8_1 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3475:1: ( ( rule__Content__HeightAssignment_8_1 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3475:1: ( ( rule__Content__HeightAssignment_8_1 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3476:1: ( rule__Content__HeightAssignment_8_1 )
            {
             before(grammarAccess.getContentAccess().getHeightAssignment_8_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3477:1: ( rule__Content__HeightAssignment_8_1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3477:2: rule__Content__HeightAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__HeightAssignment_8_1_in_rule__Content__Group_8__1__Impl6851);
            rule__Content__HeightAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getHeightAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_8__1__Impl"


    // $ANTLR start "rule__Content__Group_9__0"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3491:1: rule__Content__Group_9__0 : rule__Content__Group_9__0__Impl rule__Content__Group_9__1 ;
    public final void rule__Content__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3495:1: ( rule__Content__Group_9__0__Impl rule__Content__Group_9__1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3496:2: rule__Content__Group_9__0__Impl rule__Content__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group_9__0__Impl_in_rule__Content__Group_9__06885);
            rule__Content__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group_9__1_in_rule__Content__Group_9__06888);
            rule__Content__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_9__0"


    // $ANTLR start "rule__Content__Group_9__0__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3503:1: rule__Content__Group_9__0__Impl : ( 'width' ) ;
    public final void rule__Content__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3507:1: ( ( 'width' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3508:1: ( 'width' )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3508:1: ( 'width' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3509:1: 'width'
            {
             before(grammarAccess.getContentAccess().getWidthKeyword_9_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Content__Group_9__0__Impl6916); 
             after(grammarAccess.getContentAccess().getWidthKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_9__0__Impl"


    // $ANTLR start "rule__Content__Group_9__1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3522:1: rule__Content__Group_9__1 : rule__Content__Group_9__1__Impl ;
    public final void rule__Content__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3526:1: ( rule__Content__Group_9__1__Impl )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3527:2: rule__Content__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group_9__1__Impl_in_rule__Content__Group_9__16947);
            rule__Content__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_9__1"


    // $ANTLR start "rule__Content__Group_9__1__Impl"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3533:1: rule__Content__Group_9__1__Impl : ( ( rule__Content__WidthAssignment_9_1 ) ) ;
    public final void rule__Content__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3537:1: ( ( ( rule__Content__WidthAssignment_9_1 ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3538:1: ( ( rule__Content__WidthAssignment_9_1 ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3538:1: ( ( rule__Content__WidthAssignment_9_1 ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3539:1: ( rule__Content__WidthAssignment_9_1 )
            {
             before(grammarAccess.getContentAccess().getWidthAssignment_9_1()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3540:1: ( rule__Content__WidthAssignment_9_1 )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3540:2: rule__Content__WidthAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__WidthAssignment_9_1_in_rule__Content__Group_9__1__Impl6974);
            rule__Content__WidthAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getWidthAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_9__1__Impl"


    // $ANTLR start "rule__Page__LayoutAssignment_3"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3555:1: rule__Page__LayoutAssignment_3 : ( ruleLayout ) ;
    public final void rule__Page__LayoutAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3559:1: ( ( ruleLayout ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3560:1: ( ruleLayout )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3560:1: ( ruleLayout )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3561:1: ruleLayout
            {
             before(grammarAccess.getPageAccess().getLayoutLayoutParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_rule__Page__LayoutAssignment_37013);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getPageAccess().getLayoutLayoutParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__LayoutAssignment_3"


    // $ANTLR start "rule__Layout__LayersAssignment_3_2"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3570:1: rule__Layout__LayersAssignment_3_2 : ( ruleLayers ) ;
    public final void rule__Layout__LayersAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3574:1: ( ( ruleLayers ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3575:1: ( ruleLayers )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3575:1: ( ruleLayers )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3576:1: ruleLayers
            {
             before(grammarAccess.getLayoutAccess().getLayersLayersParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayers_in_rule__Layout__LayersAssignment_3_27044);
            ruleLayers();

            state._fsp--;

             after(grammarAccess.getLayoutAccess().getLayersLayersParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__LayersAssignment_3_2"


    // $ANTLR start "rule__Layout__LayersAssignment_3_3_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3585:1: rule__Layout__LayersAssignment_3_3_1 : ( ruleLayers ) ;
    public final void rule__Layout__LayersAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3589:1: ( ( ruleLayers ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3590:1: ( ruleLayers )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3590:1: ( ruleLayers )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3591:1: ruleLayers
            {
             before(grammarAccess.getLayoutAccess().getLayersLayersParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayers_in_rule__Layout__LayersAssignment_3_3_17075);
            ruleLayers();

            state._fsp--;

             after(grammarAccess.getLayoutAccess().getLayersLayersParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__LayersAssignment_3_3_1"


    // $ANTLR start "rule__Layers_Impl__ResizableAssignment_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3600:1: rule__Layers_Impl__ResizableAssignment_1 : ( ( 'resizable' ) ) ;
    public final void rule__Layers_Impl__ResizableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3604:1: ( ( ( 'resizable' ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3605:1: ( ( 'resizable' ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3605:1: ( ( 'resizable' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3606:1: ( 'resizable' )
            {
             before(grammarAccess.getLayers_ImplAccess().getResizableResizableKeyword_1_0()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3607:1: ( 'resizable' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3608:1: 'resizable'
            {
             before(grammarAccess.getLayers_ImplAccess().getResizableResizableKeyword_1_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Layers_Impl__ResizableAssignment_17111); 
             after(grammarAccess.getLayers_ImplAccess().getResizableResizableKeyword_1_0()); 

            }

             after(grammarAccess.getLayers_ImplAccess().getResizableResizableKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__ResizableAssignment_1"


    // $ANTLR start "rule__Layers_Impl__StyleAssignment_4_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3623:1: rule__Layers_Impl__StyleAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Layers_Impl__StyleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3627:1: ( ( ruleEString ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3628:1: ( ruleEString )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3628:1: ( ruleEString )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3629:1: ruleEString
            {
             before(grammarAccess.getLayers_ImplAccess().getStyleEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Layers_Impl__StyleAssignment_4_17150);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLayers_ImplAccess().getStyleEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__StyleAssignment_4_1"


    // $ANTLR start "rule__Layers_Impl__PositionAssignment_5_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3638:1: rule__Layers_Impl__PositionAssignment_5_1 : ( ruleLayoutPosition ) ;
    public final void rule__Layers_Impl__PositionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3642:1: ( ( ruleLayoutPosition ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3643:1: ( ruleLayoutPosition )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3643:1: ( ruleLayoutPosition )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3644:1: ruleLayoutPosition
            {
             before(grammarAccess.getLayers_ImplAccess().getPositionLayoutPositionEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayoutPosition_in_rule__Layers_Impl__PositionAssignment_5_17181);
            ruleLayoutPosition();

            state._fsp--;

             after(grammarAccess.getLayers_ImplAccess().getPositionLayoutPositionEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__PositionAssignment_5_1"


    // $ANTLR start "rule__Layers_Impl__MinSizeAssignment_6_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3653:1: rule__Layers_Impl__MinSizeAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Layers_Impl__MinSizeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3657:1: ( ( ruleEInt ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3658:1: ( ruleEInt )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3658:1: ( ruleEInt )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3659:1: ruleEInt
            {
             before(grammarAccess.getLayers_ImplAccess().getMinSizeEIntParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Layers_Impl__MinSizeAssignment_6_17212);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getLayers_ImplAccess().getMinSizeEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__MinSizeAssignment_6_1"


    // $ANTLR start "rule__Layers_Impl__MaxSizeAssignment_7_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3668:1: rule__Layers_Impl__MaxSizeAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__Layers_Impl__MaxSizeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3672:1: ( ( ruleEInt ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3673:1: ( ruleEInt )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3673:1: ( ruleEInt )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3674:1: ruleEInt
            {
             before(grammarAccess.getLayers_ImplAccess().getMaxSizeEIntParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Layers_Impl__MaxSizeAssignment_7_17243);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getLayers_ImplAccess().getMaxSizeEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layers_Impl__MaxSizeAssignment_7_1"


    // $ANTLR start "rule__Horizontal__ResizableAssignment_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3683:1: rule__Horizontal__ResizableAssignment_1 : ( ( 'resizable' ) ) ;
    public final void rule__Horizontal__ResizableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3687:1: ( ( ( 'resizable' ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3688:1: ( ( 'resizable' ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3688:1: ( ( 'resizable' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3689:1: ( 'resizable' )
            {
             before(grammarAccess.getHorizontalAccess().getResizableResizableKeyword_1_0()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3690:1: ( 'resizable' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3691:1: 'resizable'
            {
             before(grammarAccess.getHorizontalAccess().getResizableResizableKeyword_1_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Horizontal__ResizableAssignment_17279); 
             after(grammarAccess.getHorizontalAccess().getResizableResizableKeyword_1_0()); 

            }

             after(grammarAccess.getHorizontalAccess().getResizableResizableKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__ResizableAssignment_1"


    // $ANTLR start "rule__Horizontal__StyleAssignment_4_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3706:1: rule__Horizontal__StyleAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Horizontal__StyleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3710:1: ( ( ruleEString ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3711:1: ( ruleEString )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3711:1: ( ruleEString )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3712:1: ruleEString
            {
             before(grammarAccess.getHorizontalAccess().getStyleEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Horizontal__StyleAssignment_4_17318);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHorizontalAccess().getStyleEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__StyleAssignment_4_1"


    // $ANTLR start "rule__Horizontal__PositionAssignment_5_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3721:1: rule__Horizontal__PositionAssignment_5_1 : ( ruleLayoutPosition ) ;
    public final void rule__Horizontal__PositionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3725:1: ( ( ruleLayoutPosition ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3726:1: ( ruleLayoutPosition )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3726:1: ( ruleLayoutPosition )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3727:1: ruleLayoutPosition
            {
             before(grammarAccess.getHorizontalAccess().getPositionLayoutPositionEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayoutPosition_in_rule__Horizontal__PositionAssignment_5_17349);
            ruleLayoutPosition();

            state._fsp--;

             after(grammarAccess.getHorizontalAccess().getPositionLayoutPositionEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__PositionAssignment_5_1"


    // $ANTLR start "rule__Horizontal__MinSizeAssignment_6_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3736:1: rule__Horizontal__MinSizeAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Horizontal__MinSizeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3740:1: ( ( ruleEInt ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3741:1: ( ruleEInt )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3741:1: ( ruleEInt )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3742:1: ruleEInt
            {
             before(grammarAccess.getHorizontalAccess().getMinSizeEIntParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Horizontal__MinSizeAssignment_6_17380);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getHorizontalAccess().getMinSizeEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__MinSizeAssignment_6_1"


    // $ANTLR start "rule__Horizontal__MaxSizeAssignment_7_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3751:1: rule__Horizontal__MaxSizeAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__Horizontal__MaxSizeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3755:1: ( ( ruleEInt ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3756:1: ( ruleEInt )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3756:1: ( ruleEInt )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3757:1: ruleEInt
            {
             before(grammarAccess.getHorizontalAccess().getMaxSizeEIntParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Horizontal__MaxSizeAssignment_7_17411);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getHorizontalAccess().getMaxSizeEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__MaxSizeAssignment_7_1"


    // $ANTLR start "rule__Horizontal__HeightAssignment_8_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3766:1: rule__Horizontal__HeightAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__Horizontal__HeightAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3770:1: ( ( ruleEInt ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3771:1: ( ruleEInt )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3771:1: ( ruleEInt )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3772:1: ruleEInt
            {
             before(grammarAccess.getHorizontalAccess().getHeightEIntParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Horizontal__HeightAssignment_8_17442);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getHorizontalAccess().getHeightEIntParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__HeightAssignment_8_1"


    // $ANTLR start "rule__Vertical__ResizableAssignment_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3781:1: rule__Vertical__ResizableAssignment_1 : ( ( 'resizable' ) ) ;
    public final void rule__Vertical__ResizableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3785:1: ( ( ( 'resizable' ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3786:1: ( ( 'resizable' ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3786:1: ( ( 'resizable' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3787:1: ( 'resizable' )
            {
             before(grammarAccess.getVerticalAccess().getResizableResizableKeyword_1_0()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3788:1: ( 'resizable' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3789:1: 'resizable'
            {
             before(grammarAccess.getVerticalAccess().getResizableResizableKeyword_1_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Vertical__ResizableAssignment_17478); 
             after(grammarAccess.getVerticalAccess().getResizableResizableKeyword_1_0()); 

            }

             after(grammarAccess.getVerticalAccess().getResizableResizableKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__ResizableAssignment_1"


    // $ANTLR start "rule__Vertical__StyleAssignment_4_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3804:1: rule__Vertical__StyleAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Vertical__StyleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3808:1: ( ( ruleEString ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3809:1: ( ruleEString )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3809:1: ( ruleEString )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3810:1: ruleEString
            {
             before(grammarAccess.getVerticalAccess().getStyleEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Vertical__StyleAssignment_4_17517);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVerticalAccess().getStyleEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__StyleAssignment_4_1"


    // $ANTLR start "rule__Vertical__PositionAssignment_5_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3819:1: rule__Vertical__PositionAssignment_5_1 : ( ruleLayoutPosition ) ;
    public final void rule__Vertical__PositionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3823:1: ( ( ruleLayoutPosition ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3824:1: ( ruleLayoutPosition )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3824:1: ( ruleLayoutPosition )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3825:1: ruleLayoutPosition
            {
             before(grammarAccess.getVerticalAccess().getPositionLayoutPositionEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayoutPosition_in_rule__Vertical__PositionAssignment_5_17548);
            ruleLayoutPosition();

            state._fsp--;

             after(grammarAccess.getVerticalAccess().getPositionLayoutPositionEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__PositionAssignment_5_1"


    // $ANTLR start "rule__Vertical__MinSizeAssignment_6_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3834:1: rule__Vertical__MinSizeAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Vertical__MinSizeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3838:1: ( ( ruleEInt ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3839:1: ( ruleEInt )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3839:1: ( ruleEInt )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3840:1: ruleEInt
            {
             before(grammarAccess.getVerticalAccess().getMinSizeEIntParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Vertical__MinSizeAssignment_6_17579);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getVerticalAccess().getMinSizeEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__MinSizeAssignment_6_1"


    // $ANTLR start "rule__Vertical__MaxSizeAssignment_7_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3849:1: rule__Vertical__MaxSizeAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__Vertical__MaxSizeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3853:1: ( ( ruleEInt ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3854:1: ( ruleEInt )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3854:1: ( ruleEInt )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3855:1: ruleEInt
            {
             before(grammarAccess.getVerticalAccess().getMaxSizeEIntParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Vertical__MaxSizeAssignment_7_17610);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getVerticalAccess().getMaxSizeEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__MaxSizeAssignment_7_1"


    // $ANTLR start "rule__Vertical__WidthAssignment_8_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3864:1: rule__Vertical__WidthAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__Vertical__WidthAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3868:1: ( ( ruleEInt ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3869:1: ( ruleEInt )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3869:1: ( ruleEInt )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3870:1: ruleEInt
            {
             before(grammarAccess.getVerticalAccess().getWidthEIntParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Vertical__WidthAssignment_8_17641);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getVerticalAccess().getWidthEIntParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__WidthAssignment_8_1"


    // $ANTLR start "rule__Content__ResizableAssignment_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3879:1: rule__Content__ResizableAssignment_1 : ( ( 'resizable' ) ) ;
    public final void rule__Content__ResizableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3883:1: ( ( ( 'resizable' ) ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3884:1: ( ( 'resizable' ) )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3884:1: ( ( 'resizable' ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3885:1: ( 'resizable' )
            {
             before(grammarAccess.getContentAccess().getResizableResizableKeyword_1_0()); 
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3886:1: ( 'resizable' )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3887:1: 'resizable'
            {
             before(grammarAccess.getContentAccess().getResizableResizableKeyword_1_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Content__ResizableAssignment_17677); 
             after(grammarAccess.getContentAccess().getResizableResizableKeyword_1_0()); 

            }

             after(grammarAccess.getContentAccess().getResizableResizableKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__ResizableAssignment_1"


    // $ANTLR start "rule__Content__StyleAssignment_4_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3902:1: rule__Content__StyleAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Content__StyleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3906:1: ( ( ruleEString ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3907:1: ( ruleEString )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3907:1: ( ruleEString )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3908:1: ruleEString
            {
             before(grammarAccess.getContentAccess().getStyleEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Content__StyleAssignment_4_17716);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContentAccess().getStyleEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__StyleAssignment_4_1"


    // $ANTLR start "rule__Content__PositionAssignment_5_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3917:1: rule__Content__PositionAssignment_5_1 : ( ruleLayoutPosition ) ;
    public final void rule__Content__PositionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3921:1: ( ( ruleLayoutPosition ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3922:1: ( ruleLayoutPosition )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3922:1: ( ruleLayoutPosition )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3923:1: ruleLayoutPosition
            {
             before(grammarAccess.getContentAccess().getPositionLayoutPositionEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayoutPosition_in_rule__Content__PositionAssignment_5_17747);
            ruleLayoutPosition();

            state._fsp--;

             after(grammarAccess.getContentAccess().getPositionLayoutPositionEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__PositionAssignment_5_1"


    // $ANTLR start "rule__Content__MinSizeAssignment_6_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3932:1: rule__Content__MinSizeAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Content__MinSizeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3936:1: ( ( ruleEInt ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3937:1: ( ruleEInt )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3937:1: ( ruleEInt )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3938:1: ruleEInt
            {
             before(grammarAccess.getContentAccess().getMinSizeEIntParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Content__MinSizeAssignment_6_17778);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getContentAccess().getMinSizeEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__MinSizeAssignment_6_1"


    // $ANTLR start "rule__Content__MaxSizeAssignment_7_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3947:1: rule__Content__MaxSizeAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__Content__MaxSizeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3951:1: ( ( ruleEInt ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3952:1: ( ruleEInt )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3952:1: ( ruleEInt )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3953:1: ruleEInt
            {
             before(grammarAccess.getContentAccess().getMaxSizeEIntParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Content__MaxSizeAssignment_7_17809);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getContentAccess().getMaxSizeEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__MaxSizeAssignment_7_1"


    // $ANTLR start "rule__Content__HeightAssignment_8_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3962:1: rule__Content__HeightAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__Content__HeightAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3966:1: ( ( ruleEInt ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3967:1: ( ruleEInt )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3967:1: ( ruleEInt )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3968:1: ruleEInt
            {
             before(grammarAccess.getContentAccess().getHeightEIntParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Content__HeightAssignment_8_17840);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getContentAccess().getHeightEIntParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__HeightAssignment_8_1"


    // $ANTLR start "rule__Content__WidthAssignment_9_1"
    // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3977:1: rule__Content__WidthAssignment_9_1 : ( ruleEInt ) ;
    public final void rule__Content__WidthAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3981:1: ( ( ruleEInt ) )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3982:1: ( ruleEInt )
            {
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3982:1: ( ruleEInt )
            // ../com.dsleng.etool.xtext.presentation.view.ui/src-gen/com/dsleng/etool/xtext/presentation/view/ui/contentassist/antlr/internal/InternalViewDsl.g:3983:1: ruleEInt
            {
             before(grammarAccess.getContentAccess().getWidthEIntParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Content__WidthAssignment_9_17871);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getContentAccess().getWidthEIntParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__WidthAssignment_9_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulePage_in_entryRulePage61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePage68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__0_in_rulePage94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayers_in_entryRuleLayers121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLayers128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers__Alternatives_in_ruleLayers154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLayout188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__0_in_ruleLayout214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayers_Impl_in_entryRuleLayers_Impl241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLayers_Impl248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group__0_in_ruleLayers_Impl274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHorizontal_in_entryRuleHorizontal423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHorizontal430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group__0_in_ruleHorizontal456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVertical_in_entryRuleVertical483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVertical490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group__0_in_ruleVertical516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_entryRuleContent543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContent550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__0_in_ruleContent576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LayoutPosition__Alternatives_in_ruleLayoutPosition613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayers_Impl_in_rule__Layers__Alternatives648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHorizontal_in_rule__Layers__Alternatives665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVertical_in_rule__Layers__Alternatives682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_rule__Layers__Alternatives699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__LayoutPosition__Alternatives782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__LayoutPosition__Alternatives803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__0836 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__0839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Page__Group__0__Impl867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__1898 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__1901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Page__Group__1__Impl929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__2960 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__2963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Page__Group__2__Impl991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__31022 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__31025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__LayoutAssignment_3_in_rule__Page__Group__3__Impl1052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__41082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Page__Group__4__Impl1110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__0__Impl_in_rule__Layout__Group__01151 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Layout__Group__1_in_rule__Layout__Group__01154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__1__Impl_in_rule__Layout__Group__11212 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Layout__Group__2_in_rule__Layout__Group__11215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Layout__Group__1__Impl1243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__2__Impl_in_rule__Layout__Group__21274 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_rule__Layout__Group__3_in_rule__Layout__Group__21277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Layout__Group__2__Impl1305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__3__Impl_in_rule__Layout__Group__31336 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_rule__Layout__Group__4_in_rule__Layout__Group__31339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_3__0_in_rule__Layout__Group__3__Impl1366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__4__Impl_in_rule__Layout__Group__41397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Layout__Group__4__Impl1425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_3__0__Impl_in_rule__Layout__Group_3__01466 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Layout__Group_3__1_in_rule__Layout__Group_3__01469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Layout__Group_3__0__Impl1497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_3__1__Impl_in_rule__Layout__Group_3__11528 = new BitSet(new long[]{0x00000000D4100000L});
        public static final BitSet FOLLOW_rule__Layout__Group_3__2_in_rule__Layout__Group_3__11531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Layout__Group_3__1__Impl1559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_3__2__Impl_in_rule__Layout__Group_3__21590 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_rule__Layout__Group_3__3_in_rule__Layout__Group_3__21593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__LayersAssignment_3_2_in_rule__Layout__Group_3__2__Impl1620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_3__3__Impl_in_rule__Layout__Group_3__31650 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_rule__Layout__Group_3__4_in_rule__Layout__Group_3__31653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_3_3__0_in_rule__Layout__Group_3__3__Impl1680 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Layout__Group_3__4__Impl_in_rule__Layout__Group_3__41711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Layout__Group_3__4__Impl1739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_3_3__0__Impl_in_rule__Layout__Group_3_3__01780 = new BitSet(new long[]{0x00000000D4100000L});
        public static final BitSet FOLLOW_rule__Layout__Group_3_3__1_in_rule__Layout__Group_3_3__01783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Layout__Group_3_3__0__Impl1811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_3_3__1__Impl_in_rule__Layout__Group_3_3__11842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__LayersAssignment_3_3_1_in_rule__Layout__Group_3_3__1__Impl1869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group__0__Impl_in_rule__Layers_Impl__Group__01903 = new BitSet(new long[]{0x0000000080100000L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group__1_in_rule__Layers_Impl__Group__01906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group__1__Impl_in_rule__Layers_Impl__Group__11964 = new BitSet(new long[]{0x0000000080100000L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group__2_in_rule__Layers_Impl__Group__11967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__ResizableAssignment_1_in_rule__Layers_Impl__Group__1__Impl1994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group__2__Impl_in_rule__Layers_Impl__Group__22025 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group__3_in_rule__Layers_Impl__Group__22028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Layers_Impl__Group__2__Impl2056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group__3__Impl_in_rule__Layers_Impl__Group__32087 = new BitSet(new long[]{0x0000000001E10000L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group__4_in_rule__Layers_Impl__Group__32090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Layers_Impl__Group__3__Impl2118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group__4__Impl_in_rule__Layers_Impl__Group__42149 = new BitSet(new long[]{0x0000000001E10000L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group__5_in_rule__Layers_Impl__Group__42152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group_4__0_in_rule__Layers_Impl__Group__4__Impl2179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group__5__Impl_in_rule__Layers_Impl__Group__52210 = new BitSet(new long[]{0x0000000001E10000L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group__6_in_rule__Layers_Impl__Group__52213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group_5__0_in_rule__Layers_Impl__Group__5__Impl2240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group__6__Impl_in_rule__Layers_Impl__Group__62271 = new BitSet(new long[]{0x0000000001E10000L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group__7_in_rule__Layers_Impl__Group__62274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group_6__0_in_rule__Layers_Impl__Group__6__Impl2301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group__7__Impl_in_rule__Layers_Impl__Group__72332 = new BitSet(new long[]{0x0000000001E10000L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group__8_in_rule__Layers_Impl__Group__72335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group_7__0_in_rule__Layers_Impl__Group__7__Impl2362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group__8__Impl_in_rule__Layers_Impl__Group__82393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Layers_Impl__Group__8__Impl2421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group_4__0__Impl_in_rule__Layers_Impl__Group_4__02470 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group_4__1_in_rule__Layers_Impl__Group_4__02473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Layers_Impl__Group_4__0__Impl2501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group_4__1__Impl_in_rule__Layers_Impl__Group_4__12532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__StyleAssignment_4_1_in_rule__Layers_Impl__Group_4__1__Impl2559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group_5__0__Impl_in_rule__Layers_Impl__Group_5__02593 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group_5__1_in_rule__Layers_Impl__Group_5__02596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Layers_Impl__Group_5__0__Impl2624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group_5__1__Impl_in_rule__Layers_Impl__Group_5__12655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__PositionAssignment_5_1_in_rule__Layers_Impl__Group_5__1__Impl2682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group_6__0__Impl_in_rule__Layers_Impl__Group_6__02716 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group_6__1_in_rule__Layers_Impl__Group_6__02719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Layers_Impl__Group_6__0__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group_6__1__Impl_in_rule__Layers_Impl__Group_6__12778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__MinSizeAssignment_6_1_in_rule__Layers_Impl__Group_6__1__Impl2805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group_7__0__Impl_in_rule__Layers_Impl__Group_7__02839 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group_7__1_in_rule__Layers_Impl__Group_7__02842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Layers_Impl__Group_7__0__Impl2870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__Group_7__1__Impl_in_rule__Layers_Impl__Group_7__12901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layers_Impl__MaxSizeAssignment_7_1_in_rule__Layers_Impl__Group_7__1__Impl2928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__02962 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__02965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__EInt__Group__0__Impl2994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group__0__Impl_in_rule__Horizontal__Group__03087 = new BitSet(new long[]{0x0000000084000000L});
        public static final BitSet FOLLOW_rule__Horizontal__Group__1_in_rule__Horizontal__Group__03090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group__1__Impl_in_rule__Horizontal__Group__13148 = new BitSet(new long[]{0x0000000084000000L});
        public static final BitSet FOLLOW_rule__Horizontal__Group__2_in_rule__Horizontal__Group__13151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__ResizableAssignment_1_in_rule__Horizontal__Group__1__Impl3178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group__2__Impl_in_rule__Horizontal__Group__23209 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Horizontal__Group__3_in_rule__Horizontal__Group__23212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Horizontal__Group__2__Impl3240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group__3__Impl_in_rule__Horizontal__Group__33271 = new BitSet(new long[]{0x0000000009E10000L});
        public static final BitSet FOLLOW_rule__Horizontal__Group__4_in_rule__Horizontal__Group__33274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Horizontal__Group__3__Impl3302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group__4__Impl_in_rule__Horizontal__Group__43333 = new BitSet(new long[]{0x0000000009E10000L});
        public static final BitSet FOLLOW_rule__Horizontal__Group__5_in_rule__Horizontal__Group__43336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group_4__0_in_rule__Horizontal__Group__4__Impl3363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group__5__Impl_in_rule__Horizontal__Group__53394 = new BitSet(new long[]{0x0000000009E10000L});
        public static final BitSet FOLLOW_rule__Horizontal__Group__6_in_rule__Horizontal__Group__53397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group_5__0_in_rule__Horizontal__Group__5__Impl3424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group__6__Impl_in_rule__Horizontal__Group__63455 = new BitSet(new long[]{0x0000000009E10000L});
        public static final BitSet FOLLOW_rule__Horizontal__Group__7_in_rule__Horizontal__Group__63458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group_6__0_in_rule__Horizontal__Group__6__Impl3485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group__7__Impl_in_rule__Horizontal__Group__73516 = new BitSet(new long[]{0x0000000009E10000L});
        public static final BitSet FOLLOW_rule__Horizontal__Group__8_in_rule__Horizontal__Group__73519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group_7__0_in_rule__Horizontal__Group__7__Impl3546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group__8__Impl_in_rule__Horizontal__Group__83577 = new BitSet(new long[]{0x0000000009E10000L});
        public static final BitSet FOLLOW_rule__Horizontal__Group__9_in_rule__Horizontal__Group__83580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group_8__0_in_rule__Horizontal__Group__8__Impl3607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group__9__Impl_in_rule__Horizontal__Group__93638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Horizontal__Group__9__Impl3666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group_4__0__Impl_in_rule__Horizontal__Group_4__03717 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Horizontal__Group_4__1_in_rule__Horizontal__Group_4__03720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Horizontal__Group_4__0__Impl3748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group_4__1__Impl_in_rule__Horizontal__Group_4__13779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__StyleAssignment_4_1_in_rule__Horizontal__Group_4__1__Impl3806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group_5__0__Impl_in_rule__Horizontal__Group_5__03840 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__Horizontal__Group_5__1_in_rule__Horizontal__Group_5__03843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Horizontal__Group_5__0__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group_5__1__Impl_in_rule__Horizontal__Group_5__13902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__PositionAssignment_5_1_in_rule__Horizontal__Group_5__1__Impl3929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group_6__0__Impl_in_rule__Horizontal__Group_6__03963 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_rule__Horizontal__Group_6__1_in_rule__Horizontal__Group_6__03966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Horizontal__Group_6__0__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group_6__1__Impl_in_rule__Horizontal__Group_6__14025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__MinSizeAssignment_6_1_in_rule__Horizontal__Group_6__1__Impl4052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group_7__0__Impl_in_rule__Horizontal__Group_7__04086 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_rule__Horizontal__Group_7__1_in_rule__Horizontal__Group_7__04089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Horizontal__Group_7__0__Impl4117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group_7__1__Impl_in_rule__Horizontal__Group_7__14148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__MaxSizeAssignment_7_1_in_rule__Horizontal__Group_7__1__Impl4175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group_8__0__Impl_in_rule__Horizontal__Group_8__04209 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_rule__Horizontal__Group_8__1_in_rule__Horizontal__Group_8__04212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Horizontal__Group_8__0__Impl4240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__Group_8__1__Impl_in_rule__Horizontal__Group_8__14271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Horizontal__HeightAssignment_8_1_in_rule__Horizontal__Group_8__1__Impl4298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group__0__Impl_in_rule__Vertical__Group__04332 = new BitSet(new long[]{0x0000000090000000L});
        public static final BitSet FOLLOW_rule__Vertical__Group__1_in_rule__Vertical__Group__04335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group__1__Impl_in_rule__Vertical__Group__14393 = new BitSet(new long[]{0x0000000090000000L});
        public static final BitSet FOLLOW_rule__Vertical__Group__2_in_rule__Vertical__Group__14396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__ResizableAssignment_1_in_rule__Vertical__Group__1__Impl4423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group__2__Impl_in_rule__Vertical__Group__24454 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Vertical__Group__3_in_rule__Vertical__Group__24457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Vertical__Group__2__Impl4485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group__3__Impl_in_rule__Vertical__Group__34516 = new BitSet(new long[]{0x0000000021E10000L});
        public static final BitSet FOLLOW_rule__Vertical__Group__4_in_rule__Vertical__Group__34519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Vertical__Group__3__Impl4547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group__4__Impl_in_rule__Vertical__Group__44578 = new BitSet(new long[]{0x0000000021E10000L});
        public static final BitSet FOLLOW_rule__Vertical__Group__5_in_rule__Vertical__Group__44581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group_4__0_in_rule__Vertical__Group__4__Impl4608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group__5__Impl_in_rule__Vertical__Group__54639 = new BitSet(new long[]{0x0000000021E10000L});
        public static final BitSet FOLLOW_rule__Vertical__Group__6_in_rule__Vertical__Group__54642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group_5__0_in_rule__Vertical__Group__5__Impl4669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group__6__Impl_in_rule__Vertical__Group__64700 = new BitSet(new long[]{0x0000000021E10000L});
        public static final BitSet FOLLOW_rule__Vertical__Group__7_in_rule__Vertical__Group__64703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group_6__0_in_rule__Vertical__Group__6__Impl4730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group__7__Impl_in_rule__Vertical__Group__74761 = new BitSet(new long[]{0x0000000021E10000L});
        public static final BitSet FOLLOW_rule__Vertical__Group__8_in_rule__Vertical__Group__74764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group_7__0_in_rule__Vertical__Group__7__Impl4791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group__8__Impl_in_rule__Vertical__Group__84822 = new BitSet(new long[]{0x0000000021E10000L});
        public static final BitSet FOLLOW_rule__Vertical__Group__9_in_rule__Vertical__Group__84825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group_8__0_in_rule__Vertical__Group__8__Impl4852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group__9__Impl_in_rule__Vertical__Group__94883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Vertical__Group__9__Impl4911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group_4__0__Impl_in_rule__Vertical__Group_4__04962 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Vertical__Group_4__1_in_rule__Vertical__Group_4__04965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Vertical__Group_4__0__Impl4993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group_4__1__Impl_in_rule__Vertical__Group_4__15024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__StyleAssignment_4_1_in_rule__Vertical__Group_4__1__Impl5051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group_5__0__Impl_in_rule__Vertical__Group_5__05085 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__Vertical__Group_5__1_in_rule__Vertical__Group_5__05088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Vertical__Group_5__0__Impl5116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group_5__1__Impl_in_rule__Vertical__Group_5__15147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__PositionAssignment_5_1_in_rule__Vertical__Group_5__1__Impl5174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group_6__0__Impl_in_rule__Vertical__Group_6__05208 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_rule__Vertical__Group_6__1_in_rule__Vertical__Group_6__05211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Vertical__Group_6__0__Impl5239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group_6__1__Impl_in_rule__Vertical__Group_6__15270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__MinSizeAssignment_6_1_in_rule__Vertical__Group_6__1__Impl5297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group_7__0__Impl_in_rule__Vertical__Group_7__05331 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_rule__Vertical__Group_7__1_in_rule__Vertical__Group_7__05334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Vertical__Group_7__0__Impl5362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group_7__1__Impl_in_rule__Vertical__Group_7__15393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__MaxSizeAssignment_7_1_in_rule__Vertical__Group_7__1__Impl5420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group_8__0__Impl_in_rule__Vertical__Group_8__05454 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_rule__Vertical__Group_8__1_in_rule__Vertical__Group_8__05457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Vertical__Group_8__0__Impl5485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__Group_8__1__Impl_in_rule__Vertical__Group_8__15516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vertical__WidthAssignment_8_1_in_rule__Vertical__Group_8__1__Impl5543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__0__Impl_in_rule__Content__Group__05577 = new BitSet(new long[]{0x00000000D4100000L});
        public static final BitSet FOLLOW_rule__Content__Group__1_in_rule__Content__Group__05580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__1__Impl_in_rule__Content__Group__15638 = new BitSet(new long[]{0x00000000D4100000L});
        public static final BitSet FOLLOW_rule__Content__Group__2_in_rule__Content__Group__15641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__ResizableAssignment_1_in_rule__Content__Group__1__Impl5668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__2__Impl_in_rule__Content__Group__25699 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Content__Group__3_in_rule__Content__Group__25702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Content__Group__2__Impl5730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__3__Impl_in_rule__Content__Group__35761 = new BitSet(new long[]{0x0000000029E10000L});
        public static final BitSet FOLLOW_rule__Content__Group__4_in_rule__Content__Group__35764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Content__Group__3__Impl5792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__4__Impl_in_rule__Content__Group__45823 = new BitSet(new long[]{0x0000000029E10000L});
        public static final BitSet FOLLOW_rule__Content__Group__5_in_rule__Content__Group__45826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group_4__0_in_rule__Content__Group__4__Impl5853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__5__Impl_in_rule__Content__Group__55884 = new BitSet(new long[]{0x0000000029E10000L});
        public static final BitSet FOLLOW_rule__Content__Group__6_in_rule__Content__Group__55887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group_5__0_in_rule__Content__Group__5__Impl5914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__6__Impl_in_rule__Content__Group__65945 = new BitSet(new long[]{0x0000000029E10000L});
        public static final BitSet FOLLOW_rule__Content__Group__7_in_rule__Content__Group__65948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group_6__0_in_rule__Content__Group__6__Impl5975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__7__Impl_in_rule__Content__Group__76006 = new BitSet(new long[]{0x0000000029E10000L});
        public static final BitSet FOLLOW_rule__Content__Group__8_in_rule__Content__Group__76009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group_7__0_in_rule__Content__Group__7__Impl6036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__8__Impl_in_rule__Content__Group__86067 = new BitSet(new long[]{0x0000000029E10000L});
        public static final BitSet FOLLOW_rule__Content__Group__9_in_rule__Content__Group__86070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group_8__0_in_rule__Content__Group__8__Impl6097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__9__Impl_in_rule__Content__Group__96128 = new BitSet(new long[]{0x0000000029E10000L});
        public static final BitSet FOLLOW_rule__Content__Group__10_in_rule__Content__Group__96131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group_9__0_in_rule__Content__Group__9__Impl6158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__10__Impl_in_rule__Content__Group__106189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Content__Group__10__Impl6217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group_4__0__Impl_in_rule__Content__Group_4__06270 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Content__Group_4__1_in_rule__Content__Group_4__06273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Content__Group_4__0__Impl6301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group_4__1__Impl_in_rule__Content__Group_4__16332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__StyleAssignment_4_1_in_rule__Content__Group_4__1__Impl6359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group_5__0__Impl_in_rule__Content__Group_5__06393 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__Content__Group_5__1_in_rule__Content__Group_5__06396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Content__Group_5__0__Impl6424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group_5__1__Impl_in_rule__Content__Group_5__16455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__PositionAssignment_5_1_in_rule__Content__Group_5__1__Impl6482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group_6__0__Impl_in_rule__Content__Group_6__06516 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_rule__Content__Group_6__1_in_rule__Content__Group_6__06519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Content__Group_6__0__Impl6547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group_6__1__Impl_in_rule__Content__Group_6__16578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__MinSizeAssignment_6_1_in_rule__Content__Group_6__1__Impl6605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group_7__0__Impl_in_rule__Content__Group_7__06639 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_rule__Content__Group_7__1_in_rule__Content__Group_7__06642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Content__Group_7__0__Impl6670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group_7__1__Impl_in_rule__Content__Group_7__16701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__MaxSizeAssignment_7_1_in_rule__Content__Group_7__1__Impl6728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group_8__0__Impl_in_rule__Content__Group_8__06762 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_rule__Content__Group_8__1_in_rule__Content__Group_8__06765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Content__Group_8__0__Impl6793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group_8__1__Impl_in_rule__Content__Group_8__16824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__HeightAssignment_8_1_in_rule__Content__Group_8__1__Impl6851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group_9__0__Impl_in_rule__Content__Group_9__06885 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_rule__Content__Group_9__1_in_rule__Content__Group_9__06888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Content__Group_9__0__Impl6916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group_9__1__Impl_in_rule__Content__Group_9__16947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__WidthAssignment_9_1_in_rule__Content__Group_9__1__Impl6974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_rule__Page__LayoutAssignment_37013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayers_in_rule__Layout__LayersAssignment_3_27044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayers_in_rule__Layout__LayersAssignment_3_3_17075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Layers_Impl__ResizableAssignment_17111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Layers_Impl__StyleAssignment_4_17150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayoutPosition_in_rule__Layers_Impl__PositionAssignment_5_17181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Layers_Impl__MinSizeAssignment_6_17212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Layers_Impl__MaxSizeAssignment_7_17243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Horizontal__ResizableAssignment_17279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Horizontal__StyleAssignment_4_17318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayoutPosition_in_rule__Horizontal__PositionAssignment_5_17349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Horizontal__MinSizeAssignment_6_17380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Horizontal__MaxSizeAssignment_7_17411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Horizontal__HeightAssignment_8_17442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Vertical__ResizableAssignment_17478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Vertical__StyleAssignment_4_17517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayoutPosition_in_rule__Vertical__PositionAssignment_5_17548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Vertical__MinSizeAssignment_6_17579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Vertical__MaxSizeAssignment_7_17610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Vertical__WidthAssignment_8_17641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Content__ResizableAssignment_17677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Content__StyleAssignment_4_17716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayoutPosition_in_rule__Content__PositionAssignment_5_17747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Content__MinSizeAssignment_6_17778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Content__MaxSizeAssignment_7_17809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Content__HeightAssignment_8_17840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Content__WidthAssignment_9_17871 = new BitSet(new long[]{0x0000000000000002L});
    }


}