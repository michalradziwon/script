
  package gen;
  public class L_Gen113 {
  		@com.google.inject.Inject
  		public L_Gen113(L_Gen114 l_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  