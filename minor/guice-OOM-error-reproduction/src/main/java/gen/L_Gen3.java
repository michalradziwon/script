
  package gen;
  public class L_Gen3 {
  		@com.google.inject.Inject
  		public L_Gen3(L_Gen4 l_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  