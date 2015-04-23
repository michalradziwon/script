
  package gen;
  public class L_Gen100 {
  		@com.google.inject.Inject
  		public L_Gen100(L_Gen101 l_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  