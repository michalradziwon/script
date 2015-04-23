
  package gen;
  public class L_Gen70 {
  		@com.google.inject.Inject
  		public L_Gen70(L_Gen71 l_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  