package com.dsleng.etool.semantic.map.ui.contentassist.antlr.internal; 

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
import com.dsleng.etool.semantic.map.services.SemanticmapDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSemanticmapDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SemanticMapping for'", "'{'", "'}'", "'Ecore:'", "':'", "'key:'", "'value:'", "'import'", "'as'", "'.'", "'element'", "'mapsTo'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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
    public String getGrammarFileName() { return "../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g"; }


     
     	private SemanticmapDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SemanticmapDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSemanticMapping"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:60:1: entryRuleSemanticMapping : ruleSemanticMapping EOF ;
    public final void entryRuleSemanticMapping() throws RecognitionException {
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:61:1: ( ruleSemanticMapping EOF )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:62:1: ruleSemanticMapping EOF
            {
             before(grammarAccess.getSemanticMappingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSemanticMapping_in_entryRuleSemanticMapping61);
            ruleSemanticMapping();

            state._fsp--;

             after(grammarAccess.getSemanticMappingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSemanticMapping68); 

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
    // $ANTLR end "entryRuleSemanticMapping"


    // $ANTLR start "ruleSemanticMapping"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:69:1: ruleSemanticMapping : ( ( rule__SemanticMapping__Group__0 ) ) ;
    public final void ruleSemanticMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:73:2: ( ( ( rule__SemanticMapping__Group__0 ) ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:74:1: ( ( rule__SemanticMapping__Group__0 ) )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:74:1: ( ( rule__SemanticMapping__Group__0 ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:75:1: ( rule__SemanticMapping__Group__0 )
            {
             before(grammarAccess.getSemanticMappingAccess().getGroup()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:76:1: ( rule__SemanticMapping__Group__0 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:76:2: rule__SemanticMapping__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SemanticMapping__Group__0_in_ruleSemanticMapping94);
            rule__SemanticMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSemanticMappingAccess().getGroup()); 

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
    // $ANTLR end "ruleSemanticMapping"


    // $ANTLR start "entryRuleMappings"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:88:1: entryRuleMappings : ruleMappings EOF ;
    public final void entryRuleMappings() throws RecognitionException {
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:89:1: ( ruleMappings EOF )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:90:1: ruleMappings EOF
            {
             before(grammarAccess.getMappingsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMappings_in_entryRuleMappings121);
            ruleMappings();

            state._fsp--;

             after(grammarAccess.getMappingsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMappings128); 

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
    // $ANTLR end "entryRuleMappings"


    // $ANTLR start "ruleMappings"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:97:1: ruleMappings : ( ( rule__Mappings__Group__0 ) ) ;
    public final void ruleMappings() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:101:2: ( ( ( rule__Mappings__Group__0 ) ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:102:1: ( ( rule__Mappings__Group__0 ) )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:102:1: ( ( rule__Mappings__Group__0 ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:103:1: ( rule__Mappings__Group__0 )
            {
             before(grammarAccess.getMappingsAccess().getGroup()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:104:1: ( rule__Mappings__Group__0 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:104:2: rule__Mappings__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mappings__Group__0_in_ruleMappings154);
            rule__Mappings__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingsAccess().getGroup()); 

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
    // $ANTLR end "ruleMappings"


    // $ANTLR start "entryRuleImport"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:116:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:117:1: ( ruleImport EOF )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:118:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImport_in_entryRuleImport181);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImport188); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:125:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:129:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:130:1: ( ( rule__Import__Group__0 ) )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:130:1: ( ( rule__Import__Group__0 ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:131:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:132:1: ( rule__Import__Group__0 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:132:2: rule__Import__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Import__Group__0_in_ruleImport214);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleLClass"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:144:1: entryRuleLClass : ruleLClass EOF ;
    public final void entryRuleLClass() throws RecognitionException {
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:145:1: ( ruleLClass EOF )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:146:1: ruleLClass EOF
            {
             before(grammarAccess.getLClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLClass_in_entryRuleLClass241);
            ruleLClass();

            state._fsp--;

             after(grammarAccess.getLClassRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLClass248); 

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
    // $ANTLR end "entryRuleLClass"


    // $ANTLR start "ruleLClass"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:153:1: ruleLClass : ( ( rule__LClass__Group__0 ) ) ;
    public final void ruleLClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:157:2: ( ( ( rule__LClass__Group__0 ) ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:158:1: ( ( rule__LClass__Group__0 ) )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:158:1: ( ( rule__LClass__Group__0 ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:159:1: ( rule__LClass__Group__0 )
            {
             before(grammarAccess.getLClassAccess().getGroup()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:160:1: ( rule__LClass__Group__0 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:160:2: rule__LClass__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LClass__Group__0_in_ruleLClass274);
            rule__LClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLClassAccess().getGroup()); 

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
    // $ANTLR end "ruleLClass"


    // $ANTLR start "entryRuleElement"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:172:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:173:1: ( ruleElement EOF )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:174:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_entryRuleElement301);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement308); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:181:1: ruleElement : ( ( rule__Element__Group__0 ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:185:2: ( ( ( rule__Element__Group__0 ) ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:186:1: ( ( rule__Element__Group__0 ) )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:186:1: ( ( rule__Element__Group__0 ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:187:1: ( rule__Element__Group__0 )
            {
             before(grammarAccess.getElementAccess().getGroup()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:188:1: ( rule__Element__Group__0 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:188:2: rule__Element__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element__Group__0_in_ruleElement334);
            rule__Element__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getGroup()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleFQN"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:200:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:201:1: ( ruleFQN EOF )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:202:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_entryRuleFQN361);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFQN368); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:209:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:213:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:214:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:214:1: ( ( rule__FQN__Group__0 ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:215:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:216:1: ( rule__FQN__Group__0 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:216:2: rule__FQN__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FQN__Group__0_in_ruleFQN394);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "rule__SemanticMapping__Group__0"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:230:1: rule__SemanticMapping__Group__0 : rule__SemanticMapping__Group__0__Impl rule__SemanticMapping__Group__1 ;
    public final void rule__SemanticMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:234:1: ( rule__SemanticMapping__Group__0__Impl rule__SemanticMapping__Group__1 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:235:2: rule__SemanticMapping__Group__0__Impl rule__SemanticMapping__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SemanticMapping__Group__0__Impl_in_rule__SemanticMapping__Group__0428);
            rule__SemanticMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SemanticMapping__Group__1_in_rule__SemanticMapping__Group__0431);
            rule__SemanticMapping__Group__1();

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
    // $ANTLR end "rule__SemanticMapping__Group__0"


    // $ANTLR start "rule__SemanticMapping__Group__0__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:242:1: rule__SemanticMapping__Group__0__Impl : ( ( rule__SemanticMapping__EnameAssignment_0 ) ) ;
    public final void rule__SemanticMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:246:1: ( ( ( rule__SemanticMapping__EnameAssignment_0 ) ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:247:1: ( ( rule__SemanticMapping__EnameAssignment_0 ) )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:247:1: ( ( rule__SemanticMapping__EnameAssignment_0 ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:248:1: ( rule__SemanticMapping__EnameAssignment_0 )
            {
             before(grammarAccess.getSemanticMappingAccess().getEnameAssignment_0()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:249:1: ( rule__SemanticMapping__EnameAssignment_0 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:249:2: rule__SemanticMapping__EnameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SemanticMapping__EnameAssignment_0_in_rule__SemanticMapping__Group__0__Impl458);
            rule__SemanticMapping__EnameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSemanticMappingAccess().getEnameAssignment_0()); 

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
    // $ANTLR end "rule__SemanticMapping__Group__0__Impl"


    // $ANTLR start "rule__SemanticMapping__Group__1"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:259:1: rule__SemanticMapping__Group__1 : rule__SemanticMapping__Group__1__Impl rule__SemanticMapping__Group__2 ;
    public final void rule__SemanticMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:263:1: ( rule__SemanticMapping__Group__1__Impl rule__SemanticMapping__Group__2 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:264:2: rule__SemanticMapping__Group__1__Impl rule__SemanticMapping__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SemanticMapping__Group__1__Impl_in_rule__SemanticMapping__Group__1488);
            rule__SemanticMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SemanticMapping__Group__2_in_rule__SemanticMapping__Group__1491);
            rule__SemanticMapping__Group__2();

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
    // $ANTLR end "rule__SemanticMapping__Group__1"


    // $ANTLR start "rule__SemanticMapping__Group__1__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:271:1: rule__SemanticMapping__Group__1__Impl : ( 'SemanticMapping for' ) ;
    public final void rule__SemanticMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:275:1: ( ( 'SemanticMapping for' ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:276:1: ( 'SemanticMapping for' )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:276:1: ( 'SemanticMapping for' )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:277:1: 'SemanticMapping for'
            {
             before(grammarAccess.getSemanticMappingAccess().getSemanticMappingForKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__SemanticMapping__Group__1__Impl519); 
             after(grammarAccess.getSemanticMappingAccess().getSemanticMappingForKeyword_1()); 

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
    // $ANTLR end "rule__SemanticMapping__Group__1__Impl"


    // $ANTLR start "rule__SemanticMapping__Group__2"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:290:1: rule__SemanticMapping__Group__2 : rule__SemanticMapping__Group__2__Impl rule__SemanticMapping__Group__3 ;
    public final void rule__SemanticMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:294:1: ( rule__SemanticMapping__Group__2__Impl rule__SemanticMapping__Group__3 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:295:2: rule__SemanticMapping__Group__2__Impl rule__SemanticMapping__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SemanticMapping__Group__2__Impl_in_rule__SemanticMapping__Group__2550);
            rule__SemanticMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SemanticMapping__Group__3_in_rule__SemanticMapping__Group__2553);
            rule__SemanticMapping__Group__3();

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
    // $ANTLR end "rule__SemanticMapping__Group__2"


    // $ANTLR start "rule__SemanticMapping__Group__2__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:302:1: rule__SemanticMapping__Group__2__Impl : ( ( rule__SemanticMapping__NameAssignment_2 ) ) ;
    public final void rule__SemanticMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:306:1: ( ( ( rule__SemanticMapping__NameAssignment_2 ) ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:307:1: ( ( rule__SemanticMapping__NameAssignment_2 ) )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:307:1: ( ( rule__SemanticMapping__NameAssignment_2 ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:308:1: ( rule__SemanticMapping__NameAssignment_2 )
            {
             before(grammarAccess.getSemanticMappingAccess().getNameAssignment_2()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:309:1: ( rule__SemanticMapping__NameAssignment_2 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:309:2: rule__SemanticMapping__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SemanticMapping__NameAssignment_2_in_rule__SemanticMapping__Group__2__Impl580);
            rule__SemanticMapping__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSemanticMappingAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__SemanticMapping__Group__2__Impl"


    // $ANTLR start "rule__SemanticMapping__Group__3"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:319:1: rule__SemanticMapping__Group__3 : rule__SemanticMapping__Group__3__Impl rule__SemanticMapping__Group__4 ;
    public final void rule__SemanticMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:323:1: ( rule__SemanticMapping__Group__3__Impl rule__SemanticMapping__Group__4 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:324:2: rule__SemanticMapping__Group__3__Impl rule__SemanticMapping__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SemanticMapping__Group__3__Impl_in_rule__SemanticMapping__Group__3610);
            rule__SemanticMapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SemanticMapping__Group__4_in_rule__SemanticMapping__Group__3613);
            rule__SemanticMapping__Group__4();

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
    // $ANTLR end "rule__SemanticMapping__Group__3"


    // $ANTLR start "rule__SemanticMapping__Group__3__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:331:1: rule__SemanticMapping__Group__3__Impl : ( '{' ) ;
    public final void rule__SemanticMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:335:1: ( ( '{' ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:336:1: ( '{' )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:336:1: ( '{' )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:337:1: '{'
            {
             before(grammarAccess.getSemanticMappingAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__SemanticMapping__Group__3__Impl641); 
             after(grammarAccess.getSemanticMappingAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__SemanticMapping__Group__3__Impl"


    // $ANTLR start "rule__SemanticMapping__Group__4"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:350:1: rule__SemanticMapping__Group__4 : rule__SemanticMapping__Group__4__Impl rule__SemanticMapping__Group__5 ;
    public final void rule__SemanticMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:354:1: ( rule__SemanticMapping__Group__4__Impl rule__SemanticMapping__Group__5 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:355:2: rule__SemanticMapping__Group__4__Impl rule__SemanticMapping__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SemanticMapping__Group__4__Impl_in_rule__SemanticMapping__Group__4672);
            rule__SemanticMapping__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SemanticMapping__Group__5_in_rule__SemanticMapping__Group__4675);
            rule__SemanticMapping__Group__5();

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
    // $ANTLR end "rule__SemanticMapping__Group__4"


    // $ANTLR start "rule__SemanticMapping__Group__4__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:362:1: rule__SemanticMapping__Group__4__Impl : ( ( rule__SemanticMapping__MappingAssignment_4 )* ) ;
    public final void rule__SemanticMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:366:1: ( ( ( rule__SemanticMapping__MappingAssignment_4 )* ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:367:1: ( ( rule__SemanticMapping__MappingAssignment_4 )* )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:367:1: ( ( rule__SemanticMapping__MappingAssignment_4 )* )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:368:1: ( rule__SemanticMapping__MappingAssignment_4 )*
            {
             before(grammarAccess.getSemanticMappingAccess().getMappingAssignment_4()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:369:1: ( rule__SemanticMapping__MappingAssignment_4 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:369:2: rule__SemanticMapping__MappingAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SemanticMapping__MappingAssignment_4_in_rule__SemanticMapping__Group__4__Impl702);
            	    rule__SemanticMapping__MappingAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSemanticMappingAccess().getMappingAssignment_4()); 

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
    // $ANTLR end "rule__SemanticMapping__Group__4__Impl"


    // $ANTLR start "rule__SemanticMapping__Group__5"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:379:1: rule__SemanticMapping__Group__5 : rule__SemanticMapping__Group__5__Impl rule__SemanticMapping__Group__6 ;
    public final void rule__SemanticMapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:383:1: ( rule__SemanticMapping__Group__5__Impl rule__SemanticMapping__Group__6 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:384:2: rule__SemanticMapping__Group__5__Impl rule__SemanticMapping__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__SemanticMapping__Group__5__Impl_in_rule__SemanticMapping__Group__5733);
            rule__SemanticMapping__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SemanticMapping__Group__6_in_rule__SemanticMapping__Group__5736);
            rule__SemanticMapping__Group__6();

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
    // $ANTLR end "rule__SemanticMapping__Group__5"


    // $ANTLR start "rule__SemanticMapping__Group__5__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:391:1: rule__SemanticMapping__Group__5__Impl : ( '}' ) ;
    public final void rule__SemanticMapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:395:1: ( ( '}' ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:396:1: ( '}' )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:396:1: ( '}' )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:397:1: '}'
            {
             before(grammarAccess.getSemanticMappingAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__SemanticMapping__Group__5__Impl764); 
             after(grammarAccess.getSemanticMappingAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__SemanticMapping__Group__5__Impl"


    // $ANTLR start "rule__SemanticMapping__Group__6"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:410:1: rule__SemanticMapping__Group__6 : rule__SemanticMapping__Group__6__Impl ;
    public final void rule__SemanticMapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:414:1: ( rule__SemanticMapping__Group__6__Impl )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:415:2: rule__SemanticMapping__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SemanticMapping__Group__6__Impl_in_rule__SemanticMapping__Group__6795);
            rule__SemanticMapping__Group__6__Impl();

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
    // $ANTLR end "rule__SemanticMapping__Group__6"


    // $ANTLR start "rule__SemanticMapping__Group__6__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:421:1: rule__SemanticMapping__Group__6__Impl : ( ( rule__SemanticMapping__ElAssignment_6 ) ) ;
    public final void rule__SemanticMapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:425:1: ( ( ( rule__SemanticMapping__ElAssignment_6 ) ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:426:1: ( ( rule__SemanticMapping__ElAssignment_6 ) )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:426:1: ( ( rule__SemanticMapping__ElAssignment_6 ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:427:1: ( rule__SemanticMapping__ElAssignment_6 )
            {
             before(grammarAccess.getSemanticMappingAccess().getElAssignment_6()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:428:1: ( rule__SemanticMapping__ElAssignment_6 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:428:2: rule__SemanticMapping__ElAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__SemanticMapping__ElAssignment_6_in_rule__SemanticMapping__Group__6__Impl822);
            rule__SemanticMapping__ElAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSemanticMappingAccess().getElAssignment_6()); 

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
    // $ANTLR end "rule__SemanticMapping__Group__6__Impl"


    // $ANTLR start "rule__Mappings__Group__0"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:452:1: rule__Mappings__Group__0 : rule__Mappings__Group__0__Impl rule__Mappings__Group__1 ;
    public final void rule__Mappings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:456:1: ( rule__Mappings__Group__0__Impl rule__Mappings__Group__1 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:457:2: rule__Mappings__Group__0__Impl rule__Mappings__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mappings__Group__0__Impl_in_rule__Mappings__Group__0866);
            rule__Mappings__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mappings__Group__1_in_rule__Mappings__Group__0869);
            rule__Mappings__Group__1();

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
    // $ANTLR end "rule__Mappings__Group__0"


    // $ANTLR start "rule__Mappings__Group__0__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:464:1: rule__Mappings__Group__0__Impl : ( 'Ecore:' ) ;
    public final void rule__Mappings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:468:1: ( ( 'Ecore:' ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:469:1: ( 'Ecore:' )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:469:1: ( 'Ecore:' )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:470:1: 'Ecore:'
            {
             before(grammarAccess.getMappingsAccess().getEcoreKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Mappings__Group__0__Impl897); 
             after(grammarAccess.getMappingsAccess().getEcoreKeyword_0()); 

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
    // $ANTLR end "rule__Mappings__Group__0__Impl"


    // $ANTLR start "rule__Mappings__Group__1"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:483:1: rule__Mappings__Group__1 : rule__Mappings__Group__1__Impl rule__Mappings__Group__2 ;
    public final void rule__Mappings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:487:1: ( rule__Mappings__Group__1__Impl rule__Mappings__Group__2 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:488:2: rule__Mappings__Group__1__Impl rule__Mappings__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mappings__Group__1__Impl_in_rule__Mappings__Group__1928);
            rule__Mappings__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mappings__Group__2_in_rule__Mappings__Group__1931);
            rule__Mappings__Group__2();

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
    // $ANTLR end "rule__Mappings__Group__1"


    // $ANTLR start "rule__Mappings__Group__1__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:495:1: rule__Mappings__Group__1__Impl : ( ruleLClass ) ;
    public final void rule__Mappings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:499:1: ( ( ruleLClass ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:500:1: ( ruleLClass )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:500:1: ( ruleLClass )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:501:1: ruleLClass
            {
             before(grammarAccess.getMappingsAccess().getLClassParserRuleCall_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleLClass_in_rule__Mappings__Group__1__Impl958);
            ruleLClass();

            state._fsp--;

             after(grammarAccess.getMappingsAccess().getLClassParserRuleCall_1()); 

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
    // $ANTLR end "rule__Mappings__Group__1__Impl"


    // $ANTLR start "rule__Mappings__Group__2"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:512:1: rule__Mappings__Group__2 : rule__Mappings__Group__2__Impl rule__Mappings__Group__3 ;
    public final void rule__Mappings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:516:1: ( rule__Mappings__Group__2__Impl rule__Mappings__Group__3 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:517:2: rule__Mappings__Group__2__Impl rule__Mappings__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mappings__Group__2__Impl_in_rule__Mappings__Group__2987);
            rule__Mappings__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mappings__Group__3_in_rule__Mappings__Group__2990);
            rule__Mappings__Group__3();

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
    // $ANTLR end "rule__Mappings__Group__2"


    // $ANTLR start "rule__Mappings__Group__2__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:524:1: rule__Mappings__Group__2__Impl : ( ':' ) ;
    public final void rule__Mappings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:528:1: ( ( ':' ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:529:1: ( ':' )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:529:1: ( ':' )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:530:1: ':'
            {
             before(grammarAccess.getMappingsAccess().getColonKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Mappings__Group__2__Impl1018); 
             after(grammarAccess.getMappingsAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Mappings__Group__2__Impl"


    // $ANTLR start "rule__Mappings__Group__3"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:543:1: rule__Mappings__Group__3 : rule__Mappings__Group__3__Impl rule__Mappings__Group__4 ;
    public final void rule__Mappings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:547:1: ( rule__Mappings__Group__3__Impl rule__Mappings__Group__4 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:548:2: rule__Mappings__Group__3__Impl rule__Mappings__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mappings__Group__3__Impl_in_rule__Mappings__Group__31049);
            rule__Mappings__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mappings__Group__4_in_rule__Mappings__Group__31052);
            rule__Mappings__Group__4();

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
    // $ANTLR end "rule__Mappings__Group__3"


    // $ANTLR start "rule__Mappings__Group__3__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:555:1: rule__Mappings__Group__3__Impl : ( 'key:' ) ;
    public final void rule__Mappings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:559:1: ( ( 'key:' ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:560:1: ( 'key:' )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:560:1: ( 'key:' )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:561:1: 'key:'
            {
             before(grammarAccess.getMappingsAccess().getKeyKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Mappings__Group__3__Impl1080); 
             after(grammarAccess.getMappingsAccess().getKeyKeyword_3()); 

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
    // $ANTLR end "rule__Mappings__Group__3__Impl"


    // $ANTLR start "rule__Mappings__Group__4"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:574:1: rule__Mappings__Group__4 : rule__Mappings__Group__4__Impl rule__Mappings__Group__5 ;
    public final void rule__Mappings__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:578:1: ( rule__Mappings__Group__4__Impl rule__Mappings__Group__5 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:579:2: rule__Mappings__Group__4__Impl rule__Mappings__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mappings__Group__4__Impl_in_rule__Mappings__Group__41111);
            rule__Mappings__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mappings__Group__5_in_rule__Mappings__Group__41114);
            rule__Mappings__Group__5();

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
    // $ANTLR end "rule__Mappings__Group__4"


    // $ANTLR start "rule__Mappings__Group__4__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:586:1: rule__Mappings__Group__4__Impl : ( ( rule__Mappings__NameAssignment_4 ) ) ;
    public final void rule__Mappings__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:590:1: ( ( ( rule__Mappings__NameAssignment_4 ) ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:591:1: ( ( rule__Mappings__NameAssignment_4 ) )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:591:1: ( ( rule__Mappings__NameAssignment_4 ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:592:1: ( rule__Mappings__NameAssignment_4 )
            {
             before(grammarAccess.getMappingsAccess().getNameAssignment_4()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:593:1: ( rule__Mappings__NameAssignment_4 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:593:2: rule__Mappings__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mappings__NameAssignment_4_in_rule__Mappings__Group__4__Impl1141);
            rule__Mappings__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMappingsAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__Mappings__Group__4__Impl"


    // $ANTLR start "rule__Mappings__Group__5"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:603:1: rule__Mappings__Group__5 : rule__Mappings__Group__5__Impl rule__Mappings__Group__6 ;
    public final void rule__Mappings__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:607:1: ( rule__Mappings__Group__5__Impl rule__Mappings__Group__6 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:608:2: rule__Mappings__Group__5__Impl rule__Mappings__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mappings__Group__5__Impl_in_rule__Mappings__Group__51171);
            rule__Mappings__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mappings__Group__6_in_rule__Mappings__Group__51174);
            rule__Mappings__Group__6();

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
    // $ANTLR end "rule__Mappings__Group__5"


    // $ANTLR start "rule__Mappings__Group__5__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:615:1: rule__Mappings__Group__5__Impl : ( ':' ) ;
    public final void rule__Mappings__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:619:1: ( ( ':' ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:620:1: ( ':' )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:620:1: ( ':' )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:621:1: ':'
            {
             before(grammarAccess.getMappingsAccess().getColonKeyword_5()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Mappings__Group__5__Impl1202); 
             after(grammarAccess.getMappingsAccess().getColonKeyword_5()); 

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
    // $ANTLR end "rule__Mappings__Group__5__Impl"


    // $ANTLR start "rule__Mappings__Group__6"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:634:1: rule__Mappings__Group__6 : rule__Mappings__Group__6__Impl rule__Mappings__Group__7 ;
    public final void rule__Mappings__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:638:1: ( rule__Mappings__Group__6__Impl rule__Mappings__Group__7 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:639:2: rule__Mappings__Group__6__Impl rule__Mappings__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mappings__Group__6__Impl_in_rule__Mappings__Group__61233);
            rule__Mappings__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mappings__Group__7_in_rule__Mappings__Group__61236);
            rule__Mappings__Group__7();

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
    // $ANTLR end "rule__Mappings__Group__6"


    // $ANTLR start "rule__Mappings__Group__6__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:646:1: rule__Mappings__Group__6__Impl : ( 'value:' ) ;
    public final void rule__Mappings__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:650:1: ( ( 'value:' ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:651:1: ( 'value:' )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:651:1: ( 'value:' )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:652:1: 'value:'
            {
             before(grammarAccess.getMappingsAccess().getValueKeyword_6()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Mappings__Group__6__Impl1264); 
             after(grammarAccess.getMappingsAccess().getValueKeyword_6()); 

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
    // $ANTLR end "rule__Mappings__Group__6__Impl"


    // $ANTLR start "rule__Mappings__Group__7"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:665:1: rule__Mappings__Group__7 : rule__Mappings__Group__7__Impl rule__Mappings__Group__8 ;
    public final void rule__Mappings__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:669:1: ( rule__Mappings__Group__7__Impl rule__Mappings__Group__8 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:670:2: rule__Mappings__Group__7__Impl rule__Mappings__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mappings__Group__7__Impl_in_rule__Mappings__Group__71295);
            rule__Mappings__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mappings__Group__8_in_rule__Mappings__Group__71298);
            rule__Mappings__Group__8();

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
    // $ANTLR end "rule__Mappings__Group__7"


    // $ANTLR start "rule__Mappings__Group__7__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:677:1: rule__Mappings__Group__7__Impl : ( '{' ) ;
    public final void rule__Mappings__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:681:1: ( ( '{' ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:682:1: ( '{' )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:682:1: ( '{' )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:683:1: '{'
            {
             before(grammarAccess.getMappingsAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Mappings__Group__7__Impl1326); 
             after(grammarAccess.getMappingsAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Mappings__Group__7__Impl"


    // $ANTLR start "rule__Mappings__Group__8"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:696:1: rule__Mappings__Group__8 : rule__Mappings__Group__8__Impl rule__Mappings__Group__9 ;
    public final void rule__Mappings__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:700:1: ( rule__Mappings__Group__8__Impl rule__Mappings__Group__9 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:701:2: rule__Mappings__Group__8__Impl rule__Mappings__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mappings__Group__8__Impl_in_rule__Mappings__Group__81357);
            rule__Mappings__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mappings__Group__9_in_rule__Mappings__Group__81360);
            rule__Mappings__Group__9();

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
    // $ANTLR end "rule__Mappings__Group__8"


    // $ANTLR start "rule__Mappings__Group__8__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:708:1: rule__Mappings__Group__8__Impl : ( ( rule__Mappings__ValueAssignment_8 ) ) ;
    public final void rule__Mappings__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:712:1: ( ( ( rule__Mappings__ValueAssignment_8 ) ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:713:1: ( ( rule__Mappings__ValueAssignment_8 ) )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:713:1: ( ( rule__Mappings__ValueAssignment_8 ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:714:1: ( rule__Mappings__ValueAssignment_8 )
            {
             before(grammarAccess.getMappingsAccess().getValueAssignment_8()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:715:1: ( rule__Mappings__ValueAssignment_8 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:715:2: rule__Mappings__ValueAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mappings__ValueAssignment_8_in_rule__Mappings__Group__8__Impl1387);
            rule__Mappings__ValueAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMappingsAccess().getValueAssignment_8()); 

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
    // $ANTLR end "rule__Mappings__Group__8__Impl"


    // $ANTLR start "rule__Mappings__Group__9"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:725:1: rule__Mappings__Group__9 : rule__Mappings__Group__9__Impl ;
    public final void rule__Mappings__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:729:1: ( rule__Mappings__Group__9__Impl )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:730:2: rule__Mappings__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mappings__Group__9__Impl_in_rule__Mappings__Group__91417);
            rule__Mappings__Group__9__Impl();

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
    // $ANTLR end "rule__Mappings__Group__9"


    // $ANTLR start "rule__Mappings__Group__9__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:736:1: rule__Mappings__Group__9__Impl : ( '}' ) ;
    public final void rule__Mappings__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:740:1: ( ( '}' ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:741:1: ( '}' )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:741:1: ( '}' )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:742:1: '}'
            {
             before(grammarAccess.getMappingsAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Mappings__Group__9__Impl1445); 
             after(grammarAccess.getMappingsAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Mappings__Group__9__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:775:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:779:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:780:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01496);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01499);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:787:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:791:1: ( ( 'import' ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:792:1: ( 'import' )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:792:1: ( 'import' )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:793:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Import__Group__0__Impl1527); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:806:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:810:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:811:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11558);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Import__Group__2_in_rule__Import__Group__11561);
            rule__Import__Group__2();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:818:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:822:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:823:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:823:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:824:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:825:1: ( rule__Import__ImportURIAssignment_1 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:825:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1588);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:835:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:839:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:840:2: rule__Import__Group__2__Impl rule__Import__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__21618);
            rule__Import__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Import__Group__3_in_rule__Import__Group__21621);
            rule__Import__Group__3();

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
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:847:1: rule__Import__Group__2__Impl : ( 'as' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:851:1: ( ( 'as' ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:852:1: ( 'as' )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:852:1: ( 'as' )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:853:1: 'as'
            {
             before(grammarAccess.getImportAccess().getAsKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Import__Group__2__Impl1649); 
             after(grammarAccess.getImportAccess().getAsKeyword_2()); 

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
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__3"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:866:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:870:1: ( rule__Import__Group__3__Impl )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:871:2: rule__Import__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Import__Group__3__Impl_in_rule__Import__Group__31680);
            rule__Import__Group__3__Impl();

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
    // $ANTLR end "rule__Import__Group__3"


    // $ANTLR start "rule__Import__Group__3__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:877:1: rule__Import__Group__3__Impl : ( ( rule__Import__NameAssignment_3 ) ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:881:1: ( ( ( rule__Import__NameAssignment_3 ) ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:882:1: ( ( rule__Import__NameAssignment_3 ) )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:882:1: ( ( rule__Import__NameAssignment_3 ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:883:1: ( rule__Import__NameAssignment_3 )
            {
             before(grammarAccess.getImportAccess().getNameAssignment_3()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:884:1: ( rule__Import__NameAssignment_3 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:884:2: rule__Import__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Import__NameAssignment_3_in_rule__Import__Group__3__Impl1707);
            rule__Import__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Import__Group__3__Impl"


    // $ANTLR start "rule__LClass__Group__0"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:902:1: rule__LClass__Group__0 : rule__LClass__Group__0__Impl rule__LClass__Group__1 ;
    public final void rule__LClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:906:1: ( rule__LClass__Group__0__Impl rule__LClass__Group__1 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:907:2: rule__LClass__Group__0__Impl rule__LClass__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LClass__Group__0__Impl_in_rule__LClass__Group__01745);
            rule__LClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LClass__Group__1_in_rule__LClass__Group__01748);
            rule__LClass__Group__1();

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
    // $ANTLR end "rule__LClass__Group__0"


    // $ANTLR start "rule__LClass__Group__0__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:914:1: rule__LClass__Group__0__Impl : ( ( rule__LClass__EcoreTypesAssignment_0 ) ) ;
    public final void rule__LClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:918:1: ( ( ( rule__LClass__EcoreTypesAssignment_0 ) ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:919:1: ( ( rule__LClass__EcoreTypesAssignment_0 ) )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:919:1: ( ( rule__LClass__EcoreTypesAssignment_0 ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:920:1: ( rule__LClass__EcoreTypesAssignment_0 )
            {
             before(grammarAccess.getLClassAccess().getEcoreTypesAssignment_0()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:921:1: ( rule__LClass__EcoreTypesAssignment_0 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:921:2: rule__LClass__EcoreTypesAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LClass__EcoreTypesAssignment_0_in_rule__LClass__Group__0__Impl1775);
            rule__LClass__EcoreTypesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLClassAccess().getEcoreTypesAssignment_0()); 

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
    // $ANTLR end "rule__LClass__Group__0__Impl"


    // $ANTLR start "rule__LClass__Group__1"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:931:1: rule__LClass__Group__1 : rule__LClass__Group__1__Impl rule__LClass__Group__2 ;
    public final void rule__LClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:935:1: ( rule__LClass__Group__1__Impl rule__LClass__Group__2 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:936:2: rule__LClass__Group__1__Impl rule__LClass__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LClass__Group__1__Impl_in_rule__LClass__Group__11805);
            rule__LClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LClass__Group__2_in_rule__LClass__Group__11808);
            rule__LClass__Group__2();

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
    // $ANTLR end "rule__LClass__Group__1"


    // $ANTLR start "rule__LClass__Group__1__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:943:1: rule__LClass__Group__1__Impl : ( '.' ) ;
    public final void rule__LClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:947:1: ( ( '.' ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:948:1: ( '.' )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:948:1: ( '.' )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:949:1: '.'
            {
             before(grammarAccess.getLClassAccess().getFullStopKeyword_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__LClass__Group__1__Impl1836); 
             after(grammarAccess.getLClassAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__LClass__Group__1__Impl"


    // $ANTLR start "rule__LClass__Group__2"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:962:1: rule__LClass__Group__2 : rule__LClass__Group__2__Impl ;
    public final void rule__LClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:966:1: ( rule__LClass__Group__2__Impl )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:967:2: rule__LClass__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LClass__Group__2__Impl_in_rule__LClass__Group__21867);
            rule__LClass__Group__2__Impl();

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
    // $ANTLR end "rule__LClass__Group__2"


    // $ANTLR start "rule__LClass__Group__2__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:973:1: rule__LClass__Group__2__Impl : ( ( rule__LClass__ObjAssignment_2 ) ) ;
    public final void rule__LClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:977:1: ( ( ( rule__LClass__ObjAssignment_2 ) ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:978:1: ( ( rule__LClass__ObjAssignment_2 ) )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:978:1: ( ( rule__LClass__ObjAssignment_2 ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:979:1: ( rule__LClass__ObjAssignment_2 )
            {
             before(grammarAccess.getLClassAccess().getObjAssignment_2()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:980:1: ( rule__LClass__ObjAssignment_2 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:980:2: rule__LClass__ObjAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LClass__ObjAssignment_2_in_rule__LClass__Group__2__Impl1894);
            rule__LClass__ObjAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLClassAccess().getObjAssignment_2()); 

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
    // $ANTLR end "rule__LClass__Group__2__Impl"


    // $ANTLR start "rule__Element__Group__0"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:996:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1000:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1001:2: rule__Element__Group__0__Impl rule__Element__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element__Group__0__Impl_in_rule__Element__Group__01930);
            rule__Element__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element__Group__1_in_rule__Element__Group__01933);
            rule__Element__Group__1();

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
    // $ANTLR end "rule__Element__Group__0"


    // $ANTLR start "rule__Element__Group__0__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1008:1: rule__Element__Group__0__Impl : ( 'element' ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1012:1: ( ( 'element' ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1013:1: ( 'element' )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1013:1: ( 'element' )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1014:1: 'element'
            {
             before(grammarAccess.getElementAccess().getElementKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Element__Group__0__Impl1961); 
             after(grammarAccess.getElementAccess().getElementKeyword_0()); 

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
    // $ANTLR end "rule__Element__Group__0__Impl"


    // $ANTLR start "rule__Element__Group__1"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1027:1: rule__Element__Group__1 : rule__Element__Group__1__Impl rule__Element__Group__2 ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1031:1: ( rule__Element__Group__1__Impl rule__Element__Group__2 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1032:2: rule__Element__Group__1__Impl rule__Element__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element__Group__1__Impl_in_rule__Element__Group__11992);
            rule__Element__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element__Group__2_in_rule__Element__Group__11995);
            rule__Element__Group__2();

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
    // $ANTLR end "rule__Element__Group__1"


    // $ANTLR start "rule__Element__Group__1__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1039:1: rule__Element__Group__1__Impl : ( ( rule__Element__NameAssignment_1 ) ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1043:1: ( ( ( rule__Element__NameAssignment_1 ) ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1044:1: ( ( rule__Element__NameAssignment_1 ) )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1044:1: ( ( rule__Element__NameAssignment_1 ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1045:1: ( rule__Element__NameAssignment_1 )
            {
             before(grammarAccess.getElementAccess().getNameAssignment_1()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1046:1: ( rule__Element__NameAssignment_1 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1046:2: rule__Element__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element__NameAssignment_1_in_rule__Element__Group__1__Impl2022);
            rule__Element__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Element__Group__1__Impl"


    // $ANTLR start "rule__Element__Group__2"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1056:1: rule__Element__Group__2 : rule__Element__Group__2__Impl rule__Element__Group__3 ;
    public final void rule__Element__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1060:1: ( rule__Element__Group__2__Impl rule__Element__Group__3 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1061:2: rule__Element__Group__2__Impl rule__Element__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element__Group__2__Impl_in_rule__Element__Group__22052);
            rule__Element__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element__Group__3_in_rule__Element__Group__22055);
            rule__Element__Group__3();

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
    // $ANTLR end "rule__Element__Group__2"


    // $ANTLR start "rule__Element__Group__2__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1068:1: rule__Element__Group__2__Impl : ( 'mapsTo' ) ;
    public final void rule__Element__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1072:1: ( ( 'mapsTo' ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1073:1: ( 'mapsTo' )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1073:1: ( 'mapsTo' )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1074:1: 'mapsTo'
            {
             before(grammarAccess.getElementAccess().getMapsToKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Element__Group__2__Impl2083); 
             after(grammarAccess.getElementAccess().getMapsToKeyword_2()); 

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
    // $ANTLR end "rule__Element__Group__2__Impl"


    // $ANTLR start "rule__Element__Group__3"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1087:1: rule__Element__Group__3 : rule__Element__Group__3__Impl ;
    public final void rule__Element__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1091:1: ( rule__Element__Group__3__Impl )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1092:2: rule__Element__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element__Group__3__Impl_in_rule__Element__Group__32114);
            rule__Element__Group__3__Impl();

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
    // $ANTLR end "rule__Element__Group__3"


    // $ANTLR start "rule__Element__Group__3__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1098:1: rule__Element__Group__3__Impl : ( ( rule__Element__RefAssignment_3 ) ) ;
    public final void rule__Element__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1102:1: ( ( ( rule__Element__RefAssignment_3 ) ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1103:1: ( ( rule__Element__RefAssignment_3 ) )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1103:1: ( ( rule__Element__RefAssignment_3 ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1104:1: ( rule__Element__RefAssignment_3 )
            {
             before(grammarAccess.getElementAccess().getRefAssignment_3()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1105:1: ( rule__Element__RefAssignment_3 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1105:2: rule__Element__RefAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element__RefAssignment_3_in_rule__Element__Group__3__Impl2141);
            rule__Element__RefAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getRefAssignment_3()); 

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
    // $ANTLR end "rule__Element__Group__3__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1123:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1127:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1128:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__02179);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__02182);
            rule__FQN__Group__1();

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
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1135:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1139:1: ( ( RULE_ID ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1140:1: ( RULE_ID )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1140:1: ( RULE_ID )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1141:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl2209); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1152:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1156:1: ( rule__FQN__Group__1__Impl )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1157:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__12238);
            rule__FQN__Group__1__Impl();

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
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1163:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1167:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1168:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1168:1: ( ( rule__FQN__Group_1__0 )* )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1169:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1170:1: ( rule__FQN__Group_1__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1170:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl2265);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1184:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1188:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1189:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__02300);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__02303);
            rule__FQN__Group_1__1();

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
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1196:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1200:1: ( ( '.' ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1201:1: ( '.' )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1201:1: ( '.' )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1202:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__FQN__Group_1__0__Impl2331); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1215:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1219:1: ( rule__FQN__Group_1__1__Impl )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1220:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__12362);
            rule__FQN__Group_1__1__Impl();

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
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1226:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1230:1: ( ( RULE_ID ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1231:1: ( RULE_ID )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1231:1: ( RULE_ID )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1232:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl2389); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__SemanticMapping__EnameAssignment_0"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1248:1: rule__SemanticMapping__EnameAssignment_0 : ( ruleImport ) ;
    public final void rule__SemanticMapping__EnameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1252:1: ( ( ruleImport ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1253:1: ( ruleImport )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1253:1: ( ruleImport )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1254:1: ruleImport
            {
             before(grammarAccess.getSemanticMappingAccess().getEnameImportParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleImport_in_rule__SemanticMapping__EnameAssignment_02427);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getSemanticMappingAccess().getEnameImportParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__SemanticMapping__EnameAssignment_0"


    // $ANTLR start "rule__SemanticMapping__NameAssignment_2"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1263:1: rule__SemanticMapping__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SemanticMapping__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1267:1: ( ( RULE_STRING ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1268:1: ( RULE_STRING )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1268:1: ( RULE_STRING )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1269:1: RULE_STRING
            {
             before(grammarAccess.getSemanticMappingAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__SemanticMapping__NameAssignment_22458); 
             after(grammarAccess.getSemanticMappingAccess().getNameSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__SemanticMapping__NameAssignment_2"


    // $ANTLR start "rule__SemanticMapping__MappingAssignment_4"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1278:1: rule__SemanticMapping__MappingAssignment_4 : ( ruleMappings ) ;
    public final void rule__SemanticMapping__MappingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1282:1: ( ( ruleMappings ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1283:1: ( ruleMappings )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1283:1: ( ruleMappings )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1284:1: ruleMappings
            {
             before(grammarAccess.getSemanticMappingAccess().getMappingMappingsParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMappings_in_rule__SemanticMapping__MappingAssignment_42489);
            ruleMappings();

            state._fsp--;

             after(grammarAccess.getSemanticMappingAccess().getMappingMappingsParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SemanticMapping__MappingAssignment_4"


    // $ANTLR start "rule__SemanticMapping__ElAssignment_6"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1293:1: rule__SemanticMapping__ElAssignment_6 : ( ruleElement ) ;
    public final void rule__SemanticMapping__ElAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1297:1: ( ( ruleElement ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1298:1: ( ruleElement )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1298:1: ( ruleElement )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1299:1: ruleElement
            {
             before(grammarAccess.getSemanticMappingAccess().getElElementParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_rule__SemanticMapping__ElAssignment_62520);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getSemanticMappingAccess().getElElementParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__SemanticMapping__ElAssignment_6"


    // $ANTLR start "rule__Mappings__NameAssignment_4"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1308:1: rule__Mappings__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Mappings__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1312:1: ( ( RULE_STRING ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1313:1: ( RULE_STRING )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1313:1: ( RULE_STRING )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1314:1: RULE_STRING
            {
             before(grammarAccess.getMappingsAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Mappings__NameAssignment_42551); 
             after(grammarAccess.getMappingsAccess().getNameSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Mappings__NameAssignment_4"


    // $ANTLR start "rule__Mappings__ValueAssignment_8"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1323:1: rule__Mappings__ValueAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Mappings__ValueAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1327:1: ( ( RULE_STRING ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1328:1: ( RULE_STRING )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1328:1: ( RULE_STRING )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1329:1: RULE_STRING
            {
             before(grammarAccess.getMappingsAccess().getValueSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Mappings__ValueAssignment_82582); 
             after(grammarAccess.getMappingsAccess().getValueSTRINGTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__Mappings__ValueAssignment_8"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1338:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1342:1: ( ( RULE_STRING ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1343:1: ( RULE_STRING )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1343:1: ( RULE_STRING )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1344:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_12613); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__Import__NameAssignment_3"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1353:1: rule__Import__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Import__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1357:1: ( ( RULE_ID ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1358:1: ( RULE_ID )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1358:1: ( RULE_ID )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1359:1: RULE_ID
            {
             before(grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Import__NameAssignment_32644); 
             after(grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Import__NameAssignment_3"


    // $ANTLR start "rule__LClass__EcoreTypesAssignment_0"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1368:1: rule__LClass__EcoreTypesAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__LClass__EcoreTypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1372:1: ( ( ( RULE_ID ) ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1373:1: ( ( RULE_ID ) )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1373:1: ( ( RULE_ID ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1374:1: ( RULE_ID )
            {
             before(grammarAccess.getLClassAccess().getEcoreTypesImportCrossReference_0_0()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1375:1: ( RULE_ID )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1376:1: RULE_ID
            {
             before(grammarAccess.getLClassAccess().getEcoreTypesImportIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__LClass__EcoreTypesAssignment_02679); 
             after(grammarAccess.getLClassAccess().getEcoreTypesImportIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getLClassAccess().getEcoreTypesImportCrossReference_0_0()); 

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
    // $ANTLR end "rule__LClass__EcoreTypesAssignment_0"


    // $ANTLR start "rule__LClass__ObjAssignment_2"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1387:1: rule__LClass__ObjAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__LClass__ObjAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1391:1: ( ( ( RULE_ID ) ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1392:1: ( ( RULE_ID ) )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1392:1: ( ( RULE_ID ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1393:1: ( RULE_ID )
            {
             before(grammarAccess.getLClassAccess().getObjEClassCrossReference_2_0()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1394:1: ( RULE_ID )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1395:1: RULE_ID
            {
             before(grammarAccess.getLClassAccess().getObjEClassIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__LClass__ObjAssignment_22718); 
             after(grammarAccess.getLClassAccess().getObjEClassIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getLClassAccess().getObjEClassCrossReference_2_0()); 

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
    // $ANTLR end "rule__LClass__ObjAssignment_2"


    // $ANTLR start "rule__Element__NameAssignment_1"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1406:1: rule__Element__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Element__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1410:1: ( ( RULE_ID ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1411:1: ( RULE_ID )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1411:1: ( RULE_ID )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1412:1: RULE_ID
            {
             before(grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Element__NameAssignment_12753); 
             after(grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Element__NameAssignment_1"


    // $ANTLR start "rule__Element__RefAssignment_3"
    // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1421:1: rule__Element__RefAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__Element__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1425:1: ( ( ( ruleFQN ) ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1426:1: ( ( ruleFQN ) )
            {
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1426:1: ( ( ruleFQN ) )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1427:1: ( ruleFQN )
            {
             before(grammarAccess.getElementAccess().getRefEClassCrossReference_3_0()); 
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1428:1: ( ruleFQN )
            // ../com.dsleng.etool.semantic.map.ui/src-gen/com/dsleng/etool/semantic/map/ui/contentassist/antlr/internal/InternalSemanticmapDsl.g:1429:1: ruleFQN
            {
             before(grammarAccess.getElementAccess().getRefEClassFQNParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_rule__Element__RefAssignment_32788);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getElementAccess().getRefEClassFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getElementAccess().getRefEClassCrossReference_3_0()); 

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
    // $ANTLR end "rule__Element__RefAssignment_3"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSemanticMapping_in_entryRuleSemanticMapping61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSemanticMapping68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SemanticMapping__Group__0_in_ruleSemanticMapping94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMappings_in_entryRuleMappings121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMappings128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mappings__Group__0_in_ruleMappings154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImport_in_entryRuleImport181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImport188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLClass_in_entryRuleLClass241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLClass248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LClass__Group__0_in_ruleLClass274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_entryRuleElement301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element__Group__0_in_ruleElement334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFQN368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SemanticMapping__Group__0__Impl_in_rule__SemanticMapping__Group__0428 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__SemanticMapping__Group__1_in_rule__SemanticMapping__Group__0431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SemanticMapping__EnameAssignment_0_in_rule__SemanticMapping__Group__0__Impl458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SemanticMapping__Group__1__Impl_in_rule__SemanticMapping__Group__1488 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__SemanticMapping__Group__2_in_rule__SemanticMapping__Group__1491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__SemanticMapping__Group__1__Impl519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SemanticMapping__Group__2__Impl_in_rule__SemanticMapping__Group__2550 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__SemanticMapping__Group__3_in_rule__SemanticMapping__Group__2553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SemanticMapping__NameAssignment_2_in_rule__SemanticMapping__Group__2__Impl580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SemanticMapping__Group__3__Impl_in_rule__SemanticMapping__Group__3610 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__SemanticMapping__Group__4_in_rule__SemanticMapping__Group__3613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__SemanticMapping__Group__3__Impl641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SemanticMapping__Group__4__Impl_in_rule__SemanticMapping__Group__4672 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__SemanticMapping__Group__5_in_rule__SemanticMapping__Group__4675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SemanticMapping__MappingAssignment_4_in_rule__SemanticMapping__Group__4__Impl702 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__SemanticMapping__Group__5__Impl_in_rule__SemanticMapping__Group__5733 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__SemanticMapping__Group__6_in_rule__SemanticMapping__Group__5736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__SemanticMapping__Group__5__Impl764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SemanticMapping__Group__6__Impl_in_rule__SemanticMapping__Group__6795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SemanticMapping__ElAssignment_6_in_rule__SemanticMapping__Group__6__Impl822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mappings__Group__0__Impl_in_rule__Mappings__Group__0866 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Mappings__Group__1_in_rule__Mappings__Group__0869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Mappings__Group__0__Impl897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mappings__Group__1__Impl_in_rule__Mappings__Group__1928 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Mappings__Group__2_in_rule__Mappings__Group__1931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLClass_in_rule__Mappings__Group__1__Impl958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mappings__Group__2__Impl_in_rule__Mappings__Group__2987 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Mappings__Group__3_in_rule__Mappings__Group__2990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Mappings__Group__2__Impl1018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mappings__Group__3__Impl_in_rule__Mappings__Group__31049 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Mappings__Group__4_in_rule__Mappings__Group__31052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Mappings__Group__3__Impl1080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mappings__Group__4__Impl_in_rule__Mappings__Group__41111 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Mappings__Group__5_in_rule__Mappings__Group__41114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mappings__NameAssignment_4_in_rule__Mappings__Group__4__Impl1141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mappings__Group__5__Impl_in_rule__Mappings__Group__51171 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Mappings__Group__6_in_rule__Mappings__Group__51174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Mappings__Group__5__Impl1202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mappings__Group__6__Impl_in_rule__Mappings__Group__61233 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Mappings__Group__7_in_rule__Mappings__Group__61236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Mappings__Group__6__Impl1264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mappings__Group__7__Impl_in_rule__Mappings__Group__71295 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Mappings__Group__8_in_rule__Mappings__Group__71298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Mappings__Group__7__Impl1326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mappings__Group__8__Impl_in_rule__Mappings__Group__81357 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Mappings__Group__9_in_rule__Mappings__Group__81360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mappings__ValueAssignment_8_in_rule__Mappings__Group__8__Impl1387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mappings__Group__9__Impl_in_rule__Mappings__Group__91417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Mappings__Group__9__Impl1445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01496 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Import__Group__0__Impl1527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11558 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__11561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__21618 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Import__Group__3_in_rule__Import__Group__21621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Import__Group__2__Impl1649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Import__Group__3__Impl_in_rule__Import__Group__31680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Import__NameAssignment_3_in_rule__Import__Group__3__Impl1707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LClass__Group__0__Impl_in_rule__LClass__Group__01745 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__LClass__Group__1_in_rule__LClass__Group__01748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LClass__EcoreTypesAssignment_0_in_rule__LClass__Group__0__Impl1775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LClass__Group__1__Impl_in_rule__LClass__Group__11805 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__LClass__Group__2_in_rule__LClass__Group__11808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__LClass__Group__1__Impl1836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LClass__Group__2__Impl_in_rule__LClass__Group__21867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LClass__ObjAssignment_2_in_rule__LClass__Group__2__Impl1894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element__Group__0__Impl_in_rule__Element__Group__01930 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Element__Group__1_in_rule__Element__Group__01933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Element__Group__0__Impl1961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element__Group__1__Impl_in_rule__Element__Group__11992 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Element__Group__2_in_rule__Element__Group__11995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element__NameAssignment_1_in_rule__Element__Group__1__Impl2022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element__Group__2__Impl_in_rule__Element__Group__22052 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Element__Group__3_in_rule__Element__Group__22055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Element__Group__2__Impl2083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element__Group__3__Impl_in_rule__Element__Group__32114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element__RefAssignment_3_in_rule__Element__Group__3__Impl2141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__02179 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__02182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl2209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__12238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl2265 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__02300 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__02303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__FQN__Group_1__0__Impl2331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__12362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl2389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImport_in_rule__SemanticMapping__EnameAssignment_02427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__SemanticMapping__NameAssignment_22458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMappings_in_rule__SemanticMapping__MappingAssignment_42489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_rule__SemanticMapping__ElAssignment_62520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Mappings__NameAssignment_42551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Mappings__ValueAssignment_82582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_12613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Import__NameAssignment_32644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__LClass__EcoreTypesAssignment_02679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__LClass__ObjAssignment_22718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Element__NameAssignment_12753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFQN_in_rule__Element__RefAssignment_32788 = new BitSet(new long[]{0x0000000000000002L});
    }


}