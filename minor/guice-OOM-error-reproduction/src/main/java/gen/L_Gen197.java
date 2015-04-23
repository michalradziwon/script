
  package gen;
  public class L_Gen197 {
  		@com.google.inject.Inject
  		public L_Gen197(L_Gen198 l_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  