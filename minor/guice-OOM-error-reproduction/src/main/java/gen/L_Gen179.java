
  package gen;
  public class L_Gen179 {
  		@com.google.inject.Inject
  		public L_Gen179(L_Gen180 l_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  