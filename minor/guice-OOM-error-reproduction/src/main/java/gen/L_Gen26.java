
  package gen;
  public class L_Gen26 {
  		@com.google.inject.Inject
  		public L_Gen26(L_Gen27 l_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  