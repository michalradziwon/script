
  package gen;
  public class O_Gen190 {
  		@com.google.inject.Inject
  		public O_Gen190(O_Gen191 o_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  