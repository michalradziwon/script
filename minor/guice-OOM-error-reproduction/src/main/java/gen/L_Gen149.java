
  package gen;
  public class L_Gen149 {
  		@com.google.inject.Inject
  		public L_Gen149(L_Gen150 l_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  