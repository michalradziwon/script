
  package gen;
  public class X_Gen131 {
  		@com.google.inject.Inject
  		public X_Gen131(X_Gen132 x_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  