
  package gen;
  public class L_Gen162 {
  		@com.google.inject.Inject
  		public L_Gen162(L_Gen163 l_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  