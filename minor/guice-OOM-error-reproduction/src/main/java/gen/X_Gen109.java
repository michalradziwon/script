
  package gen;
  public class X_Gen109 {
  		@com.google.inject.Inject
  		public X_Gen109(X_Gen110 x_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  