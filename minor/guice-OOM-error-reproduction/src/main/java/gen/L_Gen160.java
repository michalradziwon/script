
  package gen;
  public class L_Gen160 {
  		@com.google.inject.Inject
  		public L_Gen160(L_Gen161 l_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  