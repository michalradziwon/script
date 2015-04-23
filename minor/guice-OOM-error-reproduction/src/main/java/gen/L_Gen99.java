
  package gen;
  public class L_Gen99 {
  		@com.google.inject.Inject
  		public L_Gen99(L_Gen100 l_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  