
  package gen;
  public class X_Gen130 {
  		@com.google.inject.Inject
  		public X_Gen130(X_Gen131 x_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  