
  package gen;
  public class V_Gen155 {
  		@com.google.inject.Inject
  		public V_Gen155(V_Gen156 v_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  