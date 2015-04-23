
  package gen;
  public class V_Gen158 {
  		@com.google.inject.Inject
  		public V_Gen158(V_Gen159 v_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  