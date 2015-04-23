
  package gen;
  public class X_Gen190 {
  		@com.google.inject.Inject
  		public X_Gen190(X_Gen191 x_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  