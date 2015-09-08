package com.dsleng.etool.xtext.view.ui.contentassist.antlr.internal; 

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
import com.dsleng.etool.xtext.view.services.ViewDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalViewDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FLY'", "'SUPERPOWER'", "'FIRE'", "'ICE'", "'hero'", "'can'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalViewDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalViewDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalViewDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g"; }


     
     	private ViewDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ViewDSLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleHeros"
    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:60:1: entryRuleHeros : ruleHeros EOF ;
    public final void entryRuleHeros() throws RecognitionException {
        try {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:61:1: ( ruleHeros EOF )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:62:1: ruleHeros EOF
            {
             before(grammarAccess.getHerosRule()); 
            pushFollow(FOLLOW_ruleHeros_in_entryRuleHeros61);
            ruleHeros();

            state._fsp--;

             after(grammarAccess.getHerosRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeros68); 

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
    // $ANTLR end "entryRuleHeros"


    // $ANTLR start "ruleHeros"
    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:69:1: ruleHeros : ( ( rule__Heros__HerosAssignment )* ) ;
    public final void ruleHeros() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:73:2: ( ( ( rule__Heros__HerosAssignment )* ) )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:74:1: ( ( rule__Heros__HerosAssignment )* )
            {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:74:1: ( ( rule__Heros__HerosAssignment )* )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:75:1: ( rule__Heros__HerosAssignment )*
            {
             before(grammarAccess.getHerosAccess().getHerosAssignment()); 
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:76:1: ( rule__Heros__HerosAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:76:2: rule__Heros__HerosAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Heros__HerosAssignment_in_ruleHeros94);
            	    rule__Heros__HerosAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getHerosAccess().getHerosAssignment()); 

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
    // $ANTLR end "ruleHeros"


    // $ANTLR start "entryRuleSuperHero"
    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:88:1: entryRuleSuperHero : ruleSuperHero EOF ;
    public final void entryRuleSuperHero() throws RecognitionException {
        try {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:89:1: ( ruleSuperHero EOF )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:90:1: ruleSuperHero EOF
            {
             before(grammarAccess.getSuperHeroRule()); 
            pushFollow(FOLLOW_ruleSuperHero_in_entryRuleSuperHero122);
            ruleSuperHero();

            state._fsp--;

             after(grammarAccess.getSuperHeroRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuperHero129); 

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
    // $ANTLR end "entryRuleSuperHero"


    // $ANTLR start "ruleSuperHero"
    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:97:1: ruleSuperHero : ( ( rule__SuperHero__Group__0 ) ) ;
    public final void ruleSuperHero() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:101:2: ( ( ( rule__SuperHero__Group__0 ) ) )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:102:1: ( ( rule__SuperHero__Group__0 ) )
            {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:102:1: ( ( rule__SuperHero__Group__0 ) )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:103:1: ( rule__SuperHero__Group__0 )
            {
             before(grammarAccess.getSuperHeroAccess().getGroup()); 
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:104:1: ( rule__SuperHero__Group__0 )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:104:2: rule__SuperHero__Group__0
            {
            pushFollow(FOLLOW_rule__SuperHero__Group__0_in_ruleSuperHero155);
            rule__SuperHero__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSuperHeroAccess().getGroup()); 

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
    // $ANTLR end "ruleSuperHero"


    // $ANTLR start "ruleAbility"
    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:117:1: ruleAbility : ( ( rule__Ability__Alternatives ) ) ;
    public final void ruleAbility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:121:1: ( ( ( rule__Ability__Alternatives ) ) )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:122:1: ( ( rule__Ability__Alternatives ) )
            {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:122:1: ( ( rule__Ability__Alternatives ) )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:123:1: ( rule__Ability__Alternatives )
            {
             before(grammarAccess.getAbilityAccess().getAlternatives()); 
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:124:1: ( rule__Ability__Alternatives )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:124:2: rule__Ability__Alternatives
            {
            pushFollow(FOLLOW_rule__Ability__Alternatives_in_ruleAbility192);
            rule__Ability__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbilityAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbility"


    // $ANTLR start "rule__Ability__Alternatives"
    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:135:1: rule__Ability__Alternatives : ( ( ( 'FLY' ) ) | ( ( 'SUPERPOWER' ) ) | ( ( 'FIRE' ) ) | ( ( 'ICE' ) ) );
    public final void rule__Ability__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:139:1: ( ( ( 'FLY' ) ) | ( ( 'SUPERPOWER' ) ) | ( ( 'FIRE' ) ) | ( ( 'ICE' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:140:1: ( ( 'FLY' ) )
                    {
                    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:140:1: ( ( 'FLY' ) )
                    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:141:1: ( 'FLY' )
                    {
                     before(grammarAccess.getAbilityAccess().getFLYEnumLiteralDeclaration_0()); 
                    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:142:1: ( 'FLY' )
                    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:142:3: 'FLY'
                    {
                    match(input,11,FOLLOW_11_in_rule__Ability__Alternatives228); 

                    }

                     after(grammarAccess.getAbilityAccess().getFLYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:147:6: ( ( 'SUPERPOWER' ) )
                    {
                    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:147:6: ( ( 'SUPERPOWER' ) )
                    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:148:1: ( 'SUPERPOWER' )
                    {
                     before(grammarAccess.getAbilityAccess().getSUPERPOWEREnumLiteralDeclaration_1()); 
                    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:149:1: ( 'SUPERPOWER' )
                    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:149:3: 'SUPERPOWER'
                    {
                    match(input,12,FOLLOW_12_in_rule__Ability__Alternatives249); 

                    }

                     after(grammarAccess.getAbilityAccess().getSUPERPOWEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:154:6: ( ( 'FIRE' ) )
                    {
                    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:154:6: ( ( 'FIRE' ) )
                    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:155:1: ( 'FIRE' )
                    {
                     before(grammarAccess.getAbilityAccess().getFIREEnumLiteralDeclaration_2()); 
                    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:156:1: ( 'FIRE' )
                    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:156:3: 'FIRE'
                    {
                    match(input,13,FOLLOW_13_in_rule__Ability__Alternatives270); 

                    }

                     after(grammarAccess.getAbilityAccess().getFIREEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:161:6: ( ( 'ICE' ) )
                    {
                    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:161:6: ( ( 'ICE' ) )
                    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:162:1: ( 'ICE' )
                    {
                     before(grammarAccess.getAbilityAccess().getICEEnumLiteralDeclaration_3()); 
                    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:163:1: ( 'ICE' )
                    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:163:3: 'ICE'
                    {
                    match(input,14,FOLLOW_14_in_rule__Ability__Alternatives291); 

                    }

                     after(grammarAccess.getAbilityAccess().getICEEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Ability__Alternatives"


    // $ANTLR start "rule__SuperHero__Group__0"
    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:175:1: rule__SuperHero__Group__0 : rule__SuperHero__Group__0__Impl rule__SuperHero__Group__1 ;
    public final void rule__SuperHero__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:179:1: ( rule__SuperHero__Group__0__Impl rule__SuperHero__Group__1 )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:180:2: rule__SuperHero__Group__0__Impl rule__SuperHero__Group__1
            {
            pushFollow(FOLLOW_rule__SuperHero__Group__0__Impl_in_rule__SuperHero__Group__0324);
            rule__SuperHero__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SuperHero__Group__1_in_rule__SuperHero__Group__0327);
            rule__SuperHero__Group__1();

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
    // $ANTLR end "rule__SuperHero__Group__0"


    // $ANTLR start "rule__SuperHero__Group__0__Impl"
    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:187:1: rule__SuperHero__Group__0__Impl : ( 'hero' ) ;
    public final void rule__SuperHero__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:191:1: ( ( 'hero' ) )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:192:1: ( 'hero' )
            {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:192:1: ( 'hero' )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:193:1: 'hero'
            {
             before(grammarAccess.getSuperHeroAccess().getHeroKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__SuperHero__Group__0__Impl355); 
             after(grammarAccess.getSuperHeroAccess().getHeroKeyword_0()); 

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
    // $ANTLR end "rule__SuperHero__Group__0__Impl"


    // $ANTLR start "rule__SuperHero__Group__1"
    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:206:1: rule__SuperHero__Group__1 : rule__SuperHero__Group__1__Impl rule__SuperHero__Group__2 ;
    public final void rule__SuperHero__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:210:1: ( rule__SuperHero__Group__1__Impl rule__SuperHero__Group__2 )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:211:2: rule__SuperHero__Group__1__Impl rule__SuperHero__Group__2
            {
            pushFollow(FOLLOW_rule__SuperHero__Group__1__Impl_in_rule__SuperHero__Group__1386);
            rule__SuperHero__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SuperHero__Group__2_in_rule__SuperHero__Group__1389);
            rule__SuperHero__Group__2();

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
    // $ANTLR end "rule__SuperHero__Group__1"


    // $ANTLR start "rule__SuperHero__Group__1__Impl"
    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:218:1: rule__SuperHero__Group__1__Impl : ( ( rule__SuperHero__NameAssignment_1 ) ) ;
    public final void rule__SuperHero__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:222:1: ( ( ( rule__SuperHero__NameAssignment_1 ) ) )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:223:1: ( ( rule__SuperHero__NameAssignment_1 ) )
            {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:223:1: ( ( rule__SuperHero__NameAssignment_1 ) )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:224:1: ( rule__SuperHero__NameAssignment_1 )
            {
             before(grammarAccess.getSuperHeroAccess().getNameAssignment_1()); 
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:225:1: ( rule__SuperHero__NameAssignment_1 )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:225:2: rule__SuperHero__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SuperHero__NameAssignment_1_in_rule__SuperHero__Group__1__Impl416);
            rule__SuperHero__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSuperHeroAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SuperHero__Group__1__Impl"


    // $ANTLR start "rule__SuperHero__Group__2"
    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:235:1: rule__SuperHero__Group__2 : rule__SuperHero__Group__2__Impl rule__SuperHero__Group__3 ;
    public final void rule__SuperHero__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:239:1: ( rule__SuperHero__Group__2__Impl rule__SuperHero__Group__3 )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:240:2: rule__SuperHero__Group__2__Impl rule__SuperHero__Group__3
            {
            pushFollow(FOLLOW_rule__SuperHero__Group__2__Impl_in_rule__SuperHero__Group__2446);
            rule__SuperHero__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SuperHero__Group__3_in_rule__SuperHero__Group__2449);
            rule__SuperHero__Group__3();

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
    // $ANTLR end "rule__SuperHero__Group__2"


    // $ANTLR start "rule__SuperHero__Group__2__Impl"
    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:247:1: rule__SuperHero__Group__2__Impl : ( 'can' ) ;
    public final void rule__SuperHero__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:251:1: ( ( 'can' ) )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:252:1: ( 'can' )
            {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:252:1: ( 'can' )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:253:1: 'can'
            {
             before(grammarAccess.getSuperHeroAccess().getCanKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__SuperHero__Group__2__Impl477); 
             after(grammarAccess.getSuperHeroAccess().getCanKeyword_2()); 

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
    // $ANTLR end "rule__SuperHero__Group__2__Impl"


    // $ANTLR start "rule__SuperHero__Group__3"
    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:266:1: rule__SuperHero__Group__3 : rule__SuperHero__Group__3__Impl ;
    public final void rule__SuperHero__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:270:1: ( rule__SuperHero__Group__3__Impl )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:271:2: rule__SuperHero__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SuperHero__Group__3__Impl_in_rule__SuperHero__Group__3508);
            rule__SuperHero__Group__3__Impl();

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
    // $ANTLR end "rule__SuperHero__Group__3"


    // $ANTLR start "rule__SuperHero__Group__3__Impl"
    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:277:1: rule__SuperHero__Group__3__Impl : ( ( rule__SuperHero__AbilitiesAssignment_3 ) ) ;
    public final void rule__SuperHero__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:281:1: ( ( ( rule__SuperHero__AbilitiesAssignment_3 ) ) )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:282:1: ( ( rule__SuperHero__AbilitiesAssignment_3 ) )
            {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:282:1: ( ( rule__SuperHero__AbilitiesAssignment_3 ) )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:283:1: ( rule__SuperHero__AbilitiesAssignment_3 )
            {
             before(grammarAccess.getSuperHeroAccess().getAbilitiesAssignment_3()); 
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:284:1: ( rule__SuperHero__AbilitiesAssignment_3 )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:284:2: rule__SuperHero__AbilitiesAssignment_3
            {
            pushFollow(FOLLOW_rule__SuperHero__AbilitiesAssignment_3_in_rule__SuperHero__Group__3__Impl535);
            rule__SuperHero__AbilitiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSuperHeroAccess().getAbilitiesAssignment_3()); 

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
    // $ANTLR end "rule__SuperHero__Group__3__Impl"


    // $ANTLR start "rule__Heros__HerosAssignment"
    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:303:1: rule__Heros__HerosAssignment : ( ruleSuperHero ) ;
    public final void rule__Heros__HerosAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:307:1: ( ( ruleSuperHero ) )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:308:1: ( ruleSuperHero )
            {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:308:1: ( ruleSuperHero )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:309:1: ruleSuperHero
            {
             before(grammarAccess.getHerosAccess().getHerosSuperHeroParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSuperHero_in_rule__Heros__HerosAssignment578);
            ruleSuperHero();

            state._fsp--;

             after(grammarAccess.getHerosAccess().getHerosSuperHeroParserRuleCall_0()); 

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
    // $ANTLR end "rule__Heros__HerosAssignment"


    // $ANTLR start "rule__SuperHero__NameAssignment_1"
    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:318:1: rule__SuperHero__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SuperHero__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:322:1: ( ( RULE_ID ) )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:323:1: ( RULE_ID )
            {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:323:1: ( RULE_ID )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:324:1: RULE_ID
            {
             before(grammarAccess.getSuperHeroAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SuperHero__NameAssignment_1609); 
             after(grammarAccess.getSuperHeroAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SuperHero__NameAssignment_1"


    // $ANTLR start "rule__SuperHero__AbilitiesAssignment_3"
    // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:333:1: rule__SuperHero__AbilitiesAssignment_3 : ( ruleAbility ) ;
    public final void rule__SuperHero__AbilitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:337:1: ( ( ruleAbility ) )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:338:1: ( ruleAbility )
            {
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:338:1: ( ruleAbility )
            // ../com.dsleng.etool.xtext.view.ui/src-gen/com/dsleng/etool/xtext/view/ui/contentassist/antlr/internal/InternalViewDSL.g:339:1: ruleAbility
            {
             before(grammarAccess.getSuperHeroAccess().getAbilitiesAbilityEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAbility_in_rule__SuperHero__AbilitiesAssignment_3640);
            ruleAbility();

            state._fsp--;

             after(grammarAccess.getSuperHeroAccess().getAbilitiesAbilityEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__SuperHero__AbilitiesAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleHeros_in_entryRuleHeros61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeros68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heros__HerosAssignment_in_ruleHeros94 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleSuperHero_in_entryRuleSuperHero122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuperHero129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SuperHero__Group__0_in_ruleSuperHero155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ability__Alternatives_in_ruleAbility192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Ability__Alternatives228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Ability__Alternatives249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Ability__Alternatives270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Ability__Alternatives291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SuperHero__Group__0__Impl_in_rule__SuperHero__Group__0324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SuperHero__Group__1_in_rule__SuperHero__Group__0327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SuperHero__Group__0__Impl355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SuperHero__Group__1__Impl_in_rule__SuperHero__Group__1386 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SuperHero__Group__2_in_rule__SuperHero__Group__1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SuperHero__NameAssignment_1_in_rule__SuperHero__Group__1__Impl416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SuperHero__Group__2__Impl_in_rule__SuperHero__Group__2446 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__SuperHero__Group__3_in_rule__SuperHero__Group__2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SuperHero__Group__2__Impl477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SuperHero__Group__3__Impl_in_rule__SuperHero__Group__3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SuperHero__AbilitiesAssignment_3_in_rule__SuperHero__Group__3__Impl535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperHero_in_rule__Heros__HerosAssignment578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SuperHero__NameAssignment_1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbility_in_rule__SuperHero__AbilitiesAssignment_3640 = new BitSet(new long[]{0x0000000000000002L});

}