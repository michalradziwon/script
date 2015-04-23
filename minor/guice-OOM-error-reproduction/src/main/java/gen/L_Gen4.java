
  package gen;
  public class L_Gen4 {
  		@com.google.inject.Inject
  		public L_Gen4(L_Gen5 l_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  