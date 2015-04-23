
  package gen;
  public class L_Gen55 {
  		@com.google.inject.Inject
  		public L_Gen55(L_Gen56 l_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  