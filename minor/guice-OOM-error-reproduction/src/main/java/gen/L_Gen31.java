
  package gen;
  public class L_Gen31 {
  		@com.google.inject.Inject
  		public L_Gen31(L_Gen32 l_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  