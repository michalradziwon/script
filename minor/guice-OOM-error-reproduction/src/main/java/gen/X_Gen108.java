
  package gen;
  public class X_Gen108 {
  		@com.google.inject.Inject
  		public X_Gen108(X_Gen109 x_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  