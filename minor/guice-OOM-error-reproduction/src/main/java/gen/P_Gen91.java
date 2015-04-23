
  package gen;
  public class P_Gen91 {
  		@com.google.inject.Inject
  		public P_Gen91(P_Gen92 p_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  