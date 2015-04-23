
  package gen;
  public class V_Gen18 {
  		@com.google.inject.Inject
  		public V_Gen18(V_Gen19 v_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  