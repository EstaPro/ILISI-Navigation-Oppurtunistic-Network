// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/BAROUCH_SHIP/Desktop/Authentification-Silhouette/conf/routes
// @DATE:Fri Mar 15 03:16:52 CET 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSignInController SignInController = new controllers.ReverseSignInController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSocialAuthController SocialAuthController = new controllers.ReverseSocialAuthController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseResetPasswordController ResetPasswordController = new controllers.ReverseResetPasswordController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplicationController ApplicationController = new controllers.ReverseApplicationController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseActivateAccountController ActivateAccountController = new controllers.ReverseActivateAccountController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseForgotPasswordController ForgotPasswordController = new controllers.ReverseForgotPasswordController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseChangePasswordController ChangePasswordController = new controllers.ReverseChangePasswordController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSignUpController SignUpController = new controllers.ReverseSignUpController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSignInController SignInController = new controllers.javascript.ReverseSignInController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSocialAuthController SocialAuthController = new controllers.javascript.ReverseSocialAuthController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseResetPasswordController ResetPasswordController = new controllers.javascript.ReverseResetPasswordController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplicationController ApplicationController = new controllers.javascript.ReverseApplicationController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseActivateAccountController ActivateAccountController = new controllers.javascript.ReverseActivateAccountController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseForgotPasswordController ForgotPasswordController = new controllers.javascript.ReverseForgotPasswordController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseChangePasswordController ChangePasswordController = new controllers.javascript.ReverseChangePasswordController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSignUpController SignUpController = new controllers.javascript.ReverseSignUpController(RoutesPrefix.byNamePrefix());
  }

}
