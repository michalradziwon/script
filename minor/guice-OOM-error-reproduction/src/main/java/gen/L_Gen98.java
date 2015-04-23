
  package gen;
  public class L_Gen98 {
  		@com.google.inject.Inject
  		public L_Gen98(L_Gen99 l_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  