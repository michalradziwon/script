
  package gen;
  public class L_Gen186 {
  		@com.google.inject.Inject
  		public L_Gen186(L_Gen187 l_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  