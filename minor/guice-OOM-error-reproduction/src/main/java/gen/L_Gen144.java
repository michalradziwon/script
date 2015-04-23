
  package gen;
  public class L_Gen144 {
  		@com.google.inject.Inject
  		public L_Gen144(L_Gen145 l_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  