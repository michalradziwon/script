
  package gen;
  public class V_Gen167 {
  		@com.google.inject.Inject
  		public V_Gen167(V_Gen168 v_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  