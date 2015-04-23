
  package gen;
  public class V_Gen34 {
  		@com.google.inject.Inject
  		public V_Gen34(V_Gen35 v_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  