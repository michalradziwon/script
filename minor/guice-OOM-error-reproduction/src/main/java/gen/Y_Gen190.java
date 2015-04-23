
  package gen;
  public class Y_Gen190 {
  		@com.google.inject.Inject
  		public Y_Gen190(Y_Gen191 y_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  