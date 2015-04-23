
  package gen;
  public class X_Gen83 {
  		@com.google.inject.Inject
  		public X_Gen83(X_Gen84 x_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  