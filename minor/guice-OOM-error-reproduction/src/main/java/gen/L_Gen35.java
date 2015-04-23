
  package gen;
  public class L_Gen35 {
  		@com.google.inject.Inject
  		public L_Gen35(L_Gen36 l_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  