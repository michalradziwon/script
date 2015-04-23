
  package gen;
  public class V_Gen29 {
  		@com.google.inject.Inject
  		public V_Gen29(V_Gen30 v_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  