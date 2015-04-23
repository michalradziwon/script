
  package gen;
  public class X_Gen75 {
  		@com.google.inject.Inject
  		public X_Gen75(X_Gen76 x_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  