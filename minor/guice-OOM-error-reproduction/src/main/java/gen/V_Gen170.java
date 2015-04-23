
  package gen;
  public class V_Gen170 {
  		@com.google.inject.Inject
  		public V_Gen170(V_Gen171 v_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  