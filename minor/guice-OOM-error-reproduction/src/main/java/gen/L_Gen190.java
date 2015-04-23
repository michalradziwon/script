
  package gen;
  public class L_Gen190 {
  		@com.google.inject.Inject
  		public L_Gen190(L_Gen191 l_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  