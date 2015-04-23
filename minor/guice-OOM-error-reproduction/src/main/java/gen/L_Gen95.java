
  package gen;
  public class L_Gen95 {
  		@com.google.inject.Inject
  		public L_Gen95(L_Gen96 l_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  