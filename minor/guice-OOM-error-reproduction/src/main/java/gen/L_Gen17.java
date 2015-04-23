
  package gen;
  public class L_Gen17 {
  		@com.google.inject.Inject
  		public L_Gen17(L_Gen18 l_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  