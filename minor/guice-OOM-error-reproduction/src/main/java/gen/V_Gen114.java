
  package gen;
  public class V_Gen114 {
  		@com.google.inject.Inject
  		public V_Gen114(V_Gen115 v_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  