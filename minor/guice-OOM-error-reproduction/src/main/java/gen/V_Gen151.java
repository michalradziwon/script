
  package gen;
  public class V_Gen151 {
  		@com.google.inject.Inject
  		public V_Gen151(V_Gen152 v_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  