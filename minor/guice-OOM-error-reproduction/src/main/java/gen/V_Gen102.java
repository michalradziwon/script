
  package gen;
  public class V_Gen102 {
  		@com.google.inject.Inject
  		public V_Gen102(V_Gen103 v_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  