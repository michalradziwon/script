
  package gen;
  public class X_Gen182 {
  		@com.google.inject.Inject
  		public X_Gen182(X_Gen183 x_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  