
  package gen;
  public class P_Gen98 {
  		@com.google.inject.Inject
  		public P_Gen98(P_Gen99 p_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  