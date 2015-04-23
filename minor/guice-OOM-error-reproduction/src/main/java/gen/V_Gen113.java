
  package gen;
  public class V_Gen113 {
  		@com.google.inject.Inject
  		public V_Gen113(V_Gen114 v_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  