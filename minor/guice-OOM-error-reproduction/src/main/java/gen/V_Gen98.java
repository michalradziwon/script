
  package gen;
  public class V_Gen98 {
  		@com.google.inject.Inject
  		public V_Gen98(V_Gen99 v_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  