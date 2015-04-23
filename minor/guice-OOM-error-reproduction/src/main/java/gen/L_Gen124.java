
  package gen;
  public class L_Gen124 {
  		@com.google.inject.Inject
  		public L_Gen124(L_Gen125 l_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  