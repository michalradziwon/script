
  package gen;
  public class V_Gen43 {
  		@com.google.inject.Inject
  		public V_Gen43(V_Gen44 v_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  