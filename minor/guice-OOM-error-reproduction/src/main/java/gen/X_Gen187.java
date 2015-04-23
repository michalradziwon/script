
  package gen;
  public class X_Gen187 {
  		@com.google.inject.Inject
  		public X_Gen187(X_Gen188 x_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  