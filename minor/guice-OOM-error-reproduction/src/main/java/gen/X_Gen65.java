
  package gen;
  public class X_Gen65 {
  		@com.google.inject.Inject
  		public X_Gen65(X_Gen66 x_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  