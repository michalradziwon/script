
  package gen;
  public class X_Gen133 {
  		@com.google.inject.Inject
  		public X_Gen133(X_Gen134 x_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  