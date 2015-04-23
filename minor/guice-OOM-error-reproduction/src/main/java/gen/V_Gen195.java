
  package gen;
  public class V_Gen195 {
  		@com.google.inject.Inject
  		public V_Gen195(V_Gen196 v_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  