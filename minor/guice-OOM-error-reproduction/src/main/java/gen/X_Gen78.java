
  package gen;
  public class X_Gen78 {
  		@com.google.inject.Inject
  		public X_Gen78(X_Gen79 x_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  