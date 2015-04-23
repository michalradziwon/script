
  package gen;
  public class V_Gen186 {
  		@com.google.inject.Inject
  		public V_Gen186(V_Gen187 v_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  