
  package gen;
  public class X_Gen56 {
  		@com.google.inject.Inject
  		public X_Gen56(X_Gen57 x_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  