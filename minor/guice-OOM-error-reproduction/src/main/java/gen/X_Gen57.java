
  package gen;
  public class X_Gen57 {
  		@com.google.inject.Inject
  		public X_Gen57(X_Gen58 x_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  