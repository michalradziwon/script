
  package gen;
  public class V_Gen190 {
  		@com.google.inject.Inject
  		public V_Gen190(V_Gen191 v_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  