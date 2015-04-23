
  package gen;
  public class V_Gen137 {
  		@com.google.inject.Inject
  		public V_Gen137(V_Gen138 v_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  