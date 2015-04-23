
  package gen;
  public class X_Gen77 {
  		@com.google.inject.Inject
  		public X_Gen77(X_Gen78 x_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  