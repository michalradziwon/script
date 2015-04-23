
  package gen;
  public class V_Gen162 {
  		@com.google.inject.Inject
  		public V_Gen162(V_Gen163 v_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  