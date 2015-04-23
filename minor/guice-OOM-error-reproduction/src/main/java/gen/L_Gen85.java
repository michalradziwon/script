
  package gen;
  public class L_Gen85 {
  		@com.google.inject.Inject
  		public L_Gen85(L_Gen86 l_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  