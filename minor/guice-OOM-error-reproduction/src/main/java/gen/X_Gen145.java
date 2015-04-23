
  package gen;
  public class X_Gen145 {
  		@com.google.inject.Inject
  		public X_Gen145(X_Gen146 x_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  