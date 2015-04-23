
  package gen;
  public class V_Gen171 {
  		@com.google.inject.Inject
  		public V_Gen171(V_Gen172 v_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  