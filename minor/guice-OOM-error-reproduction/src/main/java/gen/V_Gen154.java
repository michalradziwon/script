
  package gen;
  public class V_Gen154 {
  		@com.google.inject.Inject
  		public V_Gen154(V_Gen155 v_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  