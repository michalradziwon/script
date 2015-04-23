
  package gen;
  public class L_Gen117 {
  		@com.google.inject.Inject
  		public L_Gen117(L_Gen118 l_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  