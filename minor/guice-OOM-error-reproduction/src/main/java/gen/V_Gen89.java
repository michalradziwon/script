
  package gen;
  public class V_Gen89 {
  		@com.google.inject.Inject
  		public V_Gen89(V_Gen90 v_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  