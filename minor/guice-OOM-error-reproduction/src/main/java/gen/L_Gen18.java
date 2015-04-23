
  package gen;
  public class L_Gen18 {
  		@com.google.inject.Inject
  		public L_Gen18(L_Gen19 l_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  