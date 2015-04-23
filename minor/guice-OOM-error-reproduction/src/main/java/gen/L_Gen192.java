
  package gen;
  public class L_Gen192 {
  		@com.google.inject.Inject
  		public L_Gen192(L_Gen193 l_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  