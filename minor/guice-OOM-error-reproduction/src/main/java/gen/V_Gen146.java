
  package gen;
  public class V_Gen146 {
  		@com.google.inject.Inject
  		public V_Gen146(V_Gen147 v_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  