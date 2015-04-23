
  package gen;
  public class V_Gen152 {
  		@com.google.inject.Inject
  		public V_Gen152(V_Gen153 v_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  