
  package gen;
  public class V_Gen8 {
  		@com.google.inject.Inject
  		public V_Gen8(V_Gen9 v_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  