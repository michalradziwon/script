
  package gen;
  public class L_Gen181 {
  		@com.google.inject.Inject
  		public L_Gen181(L_Gen182 l_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  