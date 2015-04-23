
  package gen;
  public class H_Gen190 {
  		@com.google.inject.Inject
  		public H_Gen190(H_Gen191 h_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  