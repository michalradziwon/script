
  package gen;
  public class V_Gen38 {
  		@com.google.inject.Inject
  		public V_Gen38(V_Gen39 v_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  