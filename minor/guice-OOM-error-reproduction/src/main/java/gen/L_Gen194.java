
  package gen;
  public class L_Gen194 {
  		@com.google.inject.Inject
  		public L_Gen194(L_Gen195 l_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  