
  package gen;
  public class L_Gen86 {
  		@com.google.inject.Inject
  		public L_Gen86(L_Gen87 l_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  