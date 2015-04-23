
  package gen;
  public class L_Gen7 {
  		@com.google.inject.Inject
  		public L_Gen7(L_Gen8 l_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  