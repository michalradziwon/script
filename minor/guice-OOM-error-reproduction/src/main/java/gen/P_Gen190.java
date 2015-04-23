
  package gen;
  public class P_Gen190 {
  		@com.google.inject.Inject
  		public P_Gen190(P_Gen191 p_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  