
  package gen;
  public class V_Gen126 {
  		@com.google.inject.Inject
  		public V_Gen126(V_Gen127 v_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  