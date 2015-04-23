
  package gen;
  public class L_Gen116 {
  		@com.google.inject.Inject
  		public L_Gen116(L_Gen117 l_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  