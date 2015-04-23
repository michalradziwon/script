
  package gen;
  public class X_Gen76 {
  		@com.google.inject.Inject
  		public X_Gen76(X_Gen77 x_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  