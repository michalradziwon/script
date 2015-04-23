
  package gen;
  public class L_Gen92 {
  		@com.google.inject.Inject
  		public L_Gen92(L_Gen93 l_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  