
  package gen;
  public class L_Gen93 {
  		@com.google.inject.Inject
  		public L_Gen93(L_Gen94 l_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  