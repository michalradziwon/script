
  package gen;
  public class V_Gen54 {
  		@com.google.inject.Inject
  		public V_Gen54(V_Gen55 v_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  