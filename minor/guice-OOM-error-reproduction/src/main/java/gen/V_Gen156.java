
  package gen;
  public class V_Gen156 {
  		@com.google.inject.Inject
  		public V_Gen156(V_Gen157 v_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  