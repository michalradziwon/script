
  package gen;
  public class V_Gen91 {
  		@com.google.inject.Inject
  		public V_Gen91(V_Gen92 v_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  