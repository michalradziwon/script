
  package gen;
  public class L_Gen87 {
  		@com.google.inject.Inject
  		public L_Gen87(L_Gen88 l_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  