
  package gen;
  public class X_Gen74 {
  		@com.google.inject.Inject
  		public X_Gen74(X_Gen75 x_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  