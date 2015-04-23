
  package gen;
  public class X_Gen46 {
  		@com.google.inject.Inject
  		public X_Gen46(X_Gen47 x_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  