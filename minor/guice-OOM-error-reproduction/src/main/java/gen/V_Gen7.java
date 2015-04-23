
  package gen;
  public class V_Gen7 {
  		@com.google.inject.Inject
  		public V_Gen7(V_Gen8 v_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  