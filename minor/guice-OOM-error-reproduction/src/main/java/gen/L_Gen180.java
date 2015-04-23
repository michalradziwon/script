
  package gen;
  public class L_Gen180 {
  		@com.google.inject.Inject
  		public L_Gen180(L_Gen181 l_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  