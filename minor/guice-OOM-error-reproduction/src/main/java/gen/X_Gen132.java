
  package gen;
  public class X_Gen132 {
  		@com.google.inject.Inject
  		public X_Gen132(X_Gen133 x_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  